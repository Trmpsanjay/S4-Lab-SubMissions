import java.util.Scanner;
class Node
{
 int data;
 Node next;
 Node()
 {
data=0;
next=null;
 }

public void setData(int d)
{
data=d;
}

public int getData()
{

	return data;
}
 
 public void setNext(Node n)
 {
next=n;

 }

public Node getNext()
{

	return next;
}

}

class LinkList
{
 Node start;
 int size;
LinkList()
{
start=null;
size=0;	
}



public void insertAtFirst(int k)
{

Node n=new Node();
n.setData(k);
if(start==null)
{

start=n;
}
else
{
n.setNext(start);
start=n;
}
size++;
}


public void insertAtLast(int k)
{
Node t;
Node n=new Node();
n.setData(k);
if(start==null)
{

start=n;

}
else
{
t=start;
for(int i=1;i<size;i++)
{
t=t.getNext();
}
t.setNext(n);
}
size++;
}
public void insertAtPos(int k,int p)
{

Node t;
Node n=new Node();
n.setData(k);
if(p==1)
{  insertAtFirst(k);   }
else if(p==size+1)
    { insertAtLast(k); }	

else if(p>1 && p<size)
{
t=start;
for(int i=1;i<p-1;i++)
   { t=t.getNext(); }
size++;
n.setNext(t.getNext());
t.setNext(n);
}
else
System.out.println("Invalid position");
}


public void deleteFirst()
{

if(start==null)
	System.out.println("List Is Empty");
else
{
start=start.getNext();
size--;
}



}
public void deleteLast()
{
	Node t;
	t=start;
	if(size==1)
		{ start=null;}
	else{
for(int i=1;i<size-1;i++)
{
t=t.getNext();
}
t.next=null;
}
size--;
}

public void deletePos(int p)
{
	Node t,t2;
if(start==null)
{System.out.println("List is Empty");}
else 
{
           if(p==1)
	                  { deleteFirst();     }
           else if(p==size)
	          {    deleteLast();}
            else if(p>1 && p<size)
               {
                t=start;
                 for(int i=0;i<p-1;i++)
                  { t=t.getNext(); }
                t2=t.getNext();
                t=t2.getNext();
              size--;
               }	
               else
               	{  System.out.println("Invalid Position");}
}
}

public void display()
{
	Node t;
if(start==null)
	{   System.out.println("List Is Empty");}
else
{
	t=start;
for(int i=0;i<size;i++)
{
System.out.println(t.data);
t=t.getNext();
}
}
}
}

public class SingllyLinkList
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
LinkList List=new LinkList();


while(true )
{



System.out.println("Menu");
System.out.println("1.Insert At Begening");
System.out.println("2.Insert At Position");
System.out.println("3.Insert at Last");
System.out.println("4.Delete First ");
System.out.println("5.Delete Last");
System.out.println("6.Delete From  Position ");
System.out.println("7.Display");
System.out.println("8.Exit");


System.out.println("Enter Choice ");
int ch=sc.nextInt();

switch(ch)
{

case 1 :
System.out.println("Enter a No");
int a=sc.nextInt();
List.insertAtFirst(a);
break;
case 2 :
System.out.println("Enter a No");
int b=sc.nextInt();
System.out.println("Position");
int c=sc.nextInt();
List.insertAtPos(b,c);
break;

case 3:
System.out.println("Enter a No");
int d=sc.nextInt();
List.insertAtLast(d);
break;

case 4 :
List.deleteFirst(); 
break;
case 5:
List.deleteLast(); 
break;

case 6 :
System.out.println("Enter position ");
int p=sc.nextInt();
 List.deletePos(p);
 break;
 case 7 :
 List.display();
 break;
 case  8 : 
 System.exit(0);
 default :System.out.println("Invalid Choice ");

}

}
}
}
