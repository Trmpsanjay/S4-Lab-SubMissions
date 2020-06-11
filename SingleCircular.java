import java.util.*;
class node{
	int data;
	node next;
	node(int d){
		data=d;
	}
}
class functions{
	node next;
	node start;
	node last;
	void insertfirst(int k){
		node newnode=new node(k);
		if(start==null){
			start=newnode;
			last=newnode;
			last.next=start;
		}
		else{
			newnode.next=start;
			start=newnode;
			last.next=start;
		}
	}
	void insertlast(int k){
		node newnode=new node(k);
		if(start==null){
			start=newnode;
			newnode.next=last;
			last=newnode;
		}
		else{
			last.next=newnode;
			newnode.next=start;
			last=newnode;
		}
	}
	void insertatposition(int key,int d){
		node newnode=new node(d);
		node ptr;
		ptr=start;
		while(ptr!=null){
			if(ptr.data==key)
				break;
			else
				ptr=ptr.next;
		}
		if(ptr==null)
			System.out.println("Key is not in Linked List");
		else{
			newnode.next=ptr.next;
			ptr.next=newnode;
		}
	}
	void deletefirst(){
		node ptr;
		ptr=start;
		if(start==null)
			System.out.println("Linked List is Empty");
		else{
			start=start.next;
		}
	}
	void deletelast(int size1){
		node ptr;
		ptr=start;
		for(int i=1;i<size1-1;i++)
			ptr=ptr.next;
		ptr.next=start;
		last=ptr;
	}
	void deleteatposition(int key){
		node ptr;
		ptr=start;
		while(ptr.data!=key)
			ptr=ptr.next;
		if(ptr==null)
			System.out.println("Key not Found");
		else
			ptr.next=ptr.next.next;

	}
	void display(){
		node ptr;
		ptr=start;
		System.out.print(ptr.data+" ");
		ptr=ptr.next;
		while(ptr!=start){
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
	}

}
public class SigleCircular{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		functions f=new functions();
		int choice;
		int size=0;
		do{
			System.out.println("\n \n \n 1.Insert At First \n 2.Insert At Last");
			System.out.println("3.Insert At Position \n 4. Delete First");
			System.out.println("5.Delete Last \n 6. Delete At Position \n 7.Display");
			choice=sc.nextInt();
			switch(choice){
				case 1: System.out.println("Enter element to be Inserted");
						int d=sc.nextInt();
						f.insertfirst(d);
						size++;
						break;
				case 2:	System.out.println("Enter Element to be inserted");
						int p=sc.nextInt();
						f.insertlast(p);
						size++;
						break;
				case 3: System.out.println("Enter the key");
						int q=sc.nextInt();
						System.out.println("Enter the element to be inserted");
						int r=sc.nextInt();
						f.insertatposition(q,r);
						size++;
						break;
				case 4: f.deletefirst();
						size--;
						break;
				case 5: f.deletelast(size);
						size--;
						break;
				case 6: System.out.println("Enter Key");
						int c=sc.nextInt();
						f.deleteatposition(c);
						size--;
						break;
				case 7: System.out.println("Elements are");
						f.display();
						break;
				default :
			}
		}
		while(choice<8);
	}
}
