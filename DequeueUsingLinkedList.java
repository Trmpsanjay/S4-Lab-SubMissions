import java.util.*;
class node{
	int data;
	node next;
	node(int d){
		data=d;
	}
}

class functions{
	node start;
	node last;
	void enQueueFirst(int x){
		node newnode=new node(x);
		if(start==null){
			start=newnode;
			last=newnode;
			newnode.next=null;
		}
		else{
			newnode.next=start;
			start=newnode;
		}
	}
	void enQueueLast(int y){
		node newnode=new node(y);
		if(start==null){
			start=newnode;
			last=newnode;
			newnode.next=null;
		}
		else{
			last.next=newnode;
			last=newnode;
		}
	}
	void deQueuefirst(){
		if(start==null)
			System.out.println("Dequeue is Empty !!!");
		else
			start=start.next;
	}
	void deQueueLast(){
		node ptr;
		ptr=start;
		if(start==null)
			System.out.println("Dequeue is Empty !!!");
		else if(ptr.next==null){
			start=null;
			last=null;
		}
		else{
			while(ptr.next.next!=null){
				ptr=ptr.next;
			}
			ptr.next=null;
			last=ptr;
		}
	}
	void display(){
		node ptr;
		ptr=start;
		while(ptr!=null){
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
	}
}

public class DequeueUsingLinkedList{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		functions f=new functions();
		int choice;
		do{
			System.out.print("\n \n \n 1.enQueueFirst \n 2.enQueueLast\n 3.deQueuefirst");
			System.out.print("\n 4.deQueueLast \n 5.Display");
			choice=sc.nextInt();
			switch(choice){
				case 1: System.out.println("Enter the Number");
						int enque=sc.nextInt();
						f.enQueueFirst(enque);
						break;
				case 2: System.out.println("Enter the Number");
						int en=sc.nextInt();
						f.enQueueLast(en);
						break;
				case 3: f.deQueuefirst();
						break;
				case 4: f.deQueueLast();
						break;
				case 5: f.display();
						break;
				default:
			}

		}
		while(choice<6);
	}
}
