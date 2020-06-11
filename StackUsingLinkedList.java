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
	void push(int p){
		node newnode=new node(p);
		if(start==null){
			start=newnode;
			last=newnode;
		}
		else{
			newnode.next=start;
			start=newnode;
		}
	}
	void pop(){
		if(start==null)
			System.out.println("STACK UNDERFLOW");
		else
			start=start.next;
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
public class StackUsingLinkedList{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		functions f=new functions();			
		int choice;
		do{
			System.out.println("\n \n \n  1.Push \n 2.Pop \n 3.Display");
			choice=sc.nextInt();
			switch(choice){
				case 1:	System.out.println("Enter the element to be push");
						int key=sc.nextInt();
						f.push(key);
						break;
				case 2:	f.pop();
						break;	
				case 3:	f.display();
						break;
				default : 
			}
		}
		while(choice<4);
	}
}
