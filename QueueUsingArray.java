import java.util.*;
class QueueUsingArray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int front=-1,rear=-1,choice;
		System.out.println("Enter the size of the Queue");
		int size=sc.nextInt();
		int arr[]=new int[size];
		do{
			System.out.println("\n \n \n1.InQueue\n 2.Dequeue \n 3.Display");
			choice=sc.nextInt();
			switch(choice){
				case 1: System.out.println("\nEnter the Element to be Queued");
						int que=sc.nextInt();
						if(front==-1 && rear==-1){
							front=rear=0;
							arr[rear]=que;
						}
						else if(front==(rear+1)%size){
							System.out.println("Queue is Full!");
						}
						else{
							rear=(rear+1)%size;
							arr[rear]=que;
						}
						break;
				case 2: if(front==-1 && rear==-1){
						System.out.println("Queue is Empty!");
						}
						else if(front==rear)
							front=rear=-1;
						else
							front=(front+1)%size;
						break;
				case 3: int i=front;
						while(i!=rear){
							System.out.print(arr[i]+" ");
							i=(i+1)%size;
						}
						System.out.print(arr[i]);
				default:

			}
		}
		while(choice<4);
	}
}
