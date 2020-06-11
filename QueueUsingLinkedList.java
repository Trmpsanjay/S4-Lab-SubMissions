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
	void push(int k){
		node newnode=new node(k);
		if(start==null){
			start=newnode;
			last=newnode;
		}
		else{
			last.next=newnode;
			last=newnode;
		}
	}
	void pop(){
		if(start==null)
			System.out.println("Queue is Empty !!");
		else
			start=start.next;
	}
	void display(){
		node ptr;
		ptr=start;
		if(ptr==null)
			System.out.println("Queue is Empty !!");
		while(ptr!=null){
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
			
		}
	}
}
public class QueueUsingLinkedList{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		functions f=new functions();
		int choice;
		do{
			System.out.println("\n \n 1.Push \n 2.Pop \n 3.Display");
			choice=sc.nextInt();
			switch(choice){
				case 1: System.out.println("Enter the element");
						int element=sc.nextInt();
						f.push(element);
						break;
				case 2:	f.pop();
						break;
				case 3: f.display();
						break;
				default:
			}
		}
		while(choice<4);
	}
}
