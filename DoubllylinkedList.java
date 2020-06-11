import java.util.*;
class node{
	int data;
	node next;
	node previous;
	node(int k){
		data=k;
	}
}
class functions{
	node start;
	node last;
	void insertfirst(int p){
		node newnode=new node(p);
		if(start==null){
			start=newnode;
			last=newnode;
			newnode.next=null;
			newnode.previous=null;
		}
		else{
			newnode.next=start;
			newnode.previous=null;
			start.previous=newnode;
			start=newnode;
		}
	}
    void insertlast(int k){
		node newnode=new node(k);
		if(last==null){
			start=newnode;
			last=newnode;
			newnode.next=null;
			newnode.previous=null;
		}
		else{
			last.next=newnode;
			newnode.previous=last;
			newnode.next=null;
			last=newnode;
			
		}
	}
		 void insertatposition(int key, int k){
			node newnode=new node(k);
			node ptr;
			ptr=start;
			while(ptr!=null){
				if(ptr.data==key)
					break;
				else
					ptr=ptr.next;
			}
			if(ptr==null)
			{
				System.out.println("Key is not in Linked List");
			}
			else{
				newnode.previous=ptr;
				newnode.next=ptr.next;
				ptr.next.previous=newnode;
				ptr.next=newnode;
			}
		}
		void deletefirst(){
			if(start==null)
				System.out.println("List is Empty");
			else{
				start.next.previous=null;
				start=start.next;
			}
		}
		void deletelast(){
			if(last==null)
				System.out.println("Linked List is Empty");
			else{
				last.previous.next=null;
				last=last.previous;
			}
		}
		void deleteatposition(int key){
			node ptr;
			ptr=start;
			while(ptr.data!=key)
				ptr=ptr.next;
			if(ptr==null)
				System.out.println("Key not found in the linked list");
			else{
				ptr.previous.next=ptr.next;
				ptr.next.previous=ptr.previous;
			}
		}
		void traverse(){
			node ptr;
			ptr=start;
			while(ptr!=null){
				System.out.print(ptr.data+"  ");
				ptr=ptr.next;
			}
		}
		void traverseback(){
			node ptr;
			ptr=last;
			while(ptr!=start){
				if(ptr==start)
					System.out.print(ptr.data);
				else{
					System.out.print(ptr.data+"->");
					ptr=ptr.previous;
				}
			}
			System.out.print(start.data);
		}

}

public class DoubllylinkedList{
	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		functions f=new functions();
		do{
			System.out.print("\n  \n \n \n 1.Insert at First \n 2.Insert at Last \n 3.Insert at Position \n");
			System.out.print("4.Delete First \n 5.Delete Last \n 6.Delete at Position \n 7.Display \n 8.traverseback \n");
			choice=sc.nextInt();
			switch(choice){
				case 1:	System.out.println("Enter the value to be inserted");
						int v=sc.nextInt();
						f.insertfirst(v);
						break;
				case 2:	System.out.println("Enter the value to be inserted");
						int m=sc.nextInt();
						f.insertlast(m);
						break;
				case 3:	System.out.println("Enter the value to be inserted");
						int n=sc.nextInt();
						System.out.println("Enter the key");
						int o=sc.nextInt();
						f.insertatposition(o,n);
						break;
				case 4:	f.deletefirst();
						break;
				case 5:	f.deletelast();
						break;
				case 6:	System.out.println("Enter the key");
						int p=sc.nextInt();
						f.deleteatposition(p);
						break;
				case 7:	f.traverse();
						break;
				case 8: f.traverseback();
						break;
				default : System.out.println("Invalid Option");
			}
		}
		while(choice<9);
		
	}
}
