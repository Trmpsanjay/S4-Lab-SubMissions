import java.util.*;
 class DequeueUsingArray{
 	public static void main(String[] args) {
 		Scanner sc=new Scanner(System.in);
 		System.out.println("Enter the size of the Dequeque ? ");
 		int size=sc.nextInt();
 		int deque[]=new int[size];
 		int choice,front=-1,rear=-1;
 		do{
 			System.out.print("\n \n 1.EnqueueFront \n 2.EnqueueRear \n 3.DequeueFront \n 4.DequeueRear \n 5.Display");
 			choice=sc.nextInt();
 			switch(choice){
 				case 1: System.out.println("Enter the element");
 						int x=sc.nextInt();
 						if(front==(rear+1)%size)
 							System.out.println("Dequeue is Full !");
 						else if(front==-1 && rear==-1){
 							front=rear=0;
 							deque[front]=x;
 						}
 						else if(front==0){
 							front=size-1;
 							deque[front]=x;
 						}
 						else{
 							front--;
 							deque[front]=x;
 						}
 						break;
 				case 2: System.out.println("Enter the element");
 						int x_rear=sc.nextInt();
 						if(front==(rear+1)%size)
 							System.out.println("Dequeue is Full !");
 						else if(front==-1 && rear==-1){
 							front=rear=0;
 							deque[rear]=x_rear;
 						}
 						else if(rear==size-1){
 							rear=0;
 							deque[rear]=x_rear;
 						}
 						else{
 							rear=rear+1;
 							deque[rear]=x_rear;
 						}
 						break;
 				case 3: if(front==-1 && rear==-1)
 							System.out.println("Dequeue is Empty !!");
 						else if(front==rear)
 							front=rear=-1;
 						else if(front==size-1)
 							front=0;
 						else
 							front=front+1;
 						break;
 				case 4: if(front==-1 && rear==-1)
 							System.out.println("Dequeue is Empty !!!");
 						else if(front==rear)
 							front=rear=-1;
 						else if(rear==0)
 							rear=size-1;
 						else
 							rear=rear-1;
 						break;
 				case 5: int i=front;
 						if(i==-1)
 							System.out.println("DeQueue is Empty !!");
 						else{
	 						System.out.println("**************Elements*********************");
	 						while(i!=rear){
	 							System.out.print(deque[i]+" ");
	 							i=(i+1)%size;
	 						}
	 						System.out.print(deque[i]);
	 						break;
	 					}
 				default :
 			}
 		}
 		while(choice<6);

 	}
 }
