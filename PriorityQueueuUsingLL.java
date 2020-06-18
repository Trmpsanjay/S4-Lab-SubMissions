import java.util.Scanner;

class Node{
	// Declaring data member
	int data;
	int priority;
	Node next;
	// creating constructor
	Node(int data ,int priority){
		this.data = data;
		this.priority = priority; 
	}
}

class Functions{
	Node head=null;
	public void enQueue(int data ,int priority){
		Node newNode = new Node(data,priority);
		// if empty then head will point it
		//edge casee

		if(head == null){
			head = newNode;
		}
		else if(head.priority<=priority){
			newNode.next = head;
			head = newNode;
		}
		// if not empty find appropriate place and link it
		else{
			Node ptr;
			ptr = head;
			Node prev = head ;
			while(ptr != null){
				if(ptr.priority>=priority)
					break;
				else{
					prev = ptr;
					ptr = ptr.next;
				 }
			}
			// store the address of next elements in temp variable  for further linking
			Node temp = prev.next;
			// link newnode in prev next
			prev.next = newNode;
			// now link the broken link to newnode
			newNode.next = temp;
			
		}
	}

	public void deQueueGivenPriority(int priority){
		// if Queue is empty display appropriate msg
		if(head == null){
			System.out.println("Queue is Empty !");
		}
		// search for that priority and delete
		else{
			Node ptr = head;
			Node prev = head;
			while(ptr != null){
				if(ptr.priority == priority){
					prev.next = ptr.next;
					break;
				}
				else{
					prev = ptr;
					ptr = ptr.next;
				}
			}
		}
		// edge case

	}

	public void deQueue(){
		 // if empty display appropriate msg
		if(head == null){
			System.out.println("Queue is Empty !");
		}
		else
			head = head.next;
	}

	public void display(){
		// if empty display appropriate msg
		System.out.println("********************Priority Queue Elements ! *******************");
		if(head == null){
			System.out.println("Queue is Empty !");
		}
		else{
			Node ptr = head;
			while(ptr != null){
				System.out.println(ptr.priority+"\t \t "+ptr.data);
				ptr = ptr.next;
			}
		}

	}
}


public class PriorityQueueuUsingLL{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Functions f = new Functions();
		int choice ;
		do{
			System.out.println("1.enQueue \n 2. deQueue \n 3.deQueue with given priority \n 4.Display");
			choice = sc.nextInt();
			switch(choice){
				case 1: System.out.println("Enter data");
						int data = sc.nextInt();
						System.out.println("Enter priority");
						int priority = sc.nextInt();
						f.enQueue(data,priority);
						break;
				case 2: f.deQueue();
						break;
				case 3: System.out.println("Enter priority");
						int prty = sc.nextInt();
						f.deQueueGivenPriority(prty);
						break;
				case 4: f.display();
						break;
			}
		}
	while(choice<5);

	}

}
