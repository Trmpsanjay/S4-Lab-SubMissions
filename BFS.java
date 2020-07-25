import java.util.Scanner;


class QueueEmptyException extends Exception{
    
}

class Node{
    //Data Member
    int data ;
    Node next;
    
    //Constructor
    Node(int data){
        this.data = data;
    }
}

class QueueUsingLL{
    // creating variable for  storing address of start element
    Node start = null;
    Node last = null;
    
    // creating function for enQueueing
    
    public void enQueue(int data){
        Node newNode = new  Node(data);
        
        // checking if start is null then make the newnode as first element
        if(start==null){
            start =newNode;
            last = newNode;
        }
        // if start is not null enqueue element in last position and update last
        else{
            last.next = newNode ;
            last = newNode;
        }
    }
    
    // creating function for dequeueing
    
    public int deQueue() throws QueueEmptyException{
        int temp ;
        //checking if start null through QueueEmpty Exception
        if(start==null){
            QueueEmptyException e = new QueueEmptyException();
            throw e;
        }
        
        else{
            //copy data to return
            temp = start.data;
            // if only one element
            if(start.next==null)
                start =  last = null;
            else
                start = start.next;
        }
        return temp;
    }
     public boolean isEmpty(){
         return start==null;
     }
     public void print(){
        if(start == null){
            System.out.println("QueueEmpty");
        }else{
            Node ptr = start;
            while(ptr!=null){
                System.out.print(ptr.data+" ");
                ptr = ptr.next;
            }
        }
     }
}


public class BFS {
    
    public static void printBFS(int graph[][],boolean visited[], int sv){
        // creating queue to enqueue the vertices
        QueueUsingLL q = new QueueUsingLL();
        // queueing first vertex so that by dequeueing it we can enqueu rest of the vertices
       	q.enQueue(sv);
        //marking that visited;
        visited[sv] = true;
        
        // printing and enqueue their adjacent adges until queue is empty
        while(!q.isEmpty()){
            int front ;
            try{
                front = q.deQueue();
            }
            catch(QueueEmptyException e){
                return;
            }
            System.out.print(front+" ");
            for(int i=0;i<graph.length;i++){
                if(graph[front][i]==1 && !visited[i]){
                    q.enQueue(i);
                    visited[i] = true;
                }
            }
        }
    }
    public static void  BFS(int graph[][]){
        boolean visited[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                printBFS(graph,visited,i);
            }
        }
    }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.println("Enter No of Vertex : ");
		int V = s.nextInt();
        System.out.println("Enter No of edges : ");
		int E = s.nextInt();
        //creating matrix  fo storing edges
        
        int graph[][] = new int[V][V];
        
        // storing  egdges
        for(int i =0;i<E;i++){
            System.out.println("Enter starting Vertex : ");
            int sv = s.nextInt();
            System.out.println("Enter ending  Vertex : ");
            int ev = s.nextInt();
            graph[sv][ev] = 1;
            graph[ev][sv] = 1;
        }
        System.out.println("BFS Traversal are : ");
        // calling Function
        BFS(graph);
        
	}
}