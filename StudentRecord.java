import java.util.*;
class node{
	int roll;
	int age;
	String name;
	int marks;
	node next;
	node(String n,int r,int m,int a){
		name=n;
		roll=r;
		marks=m;
		age=a;
	}
}

class functions{
	node start;
	node last;
	
	void insert_student_record(String name1,int r1,int m1,int a1){
		node ptr;
		ptr=start;
		node newnode= new node(name1,r1,m1,a1);
		if(start==null){
			start=newnode;
			last=newnode;
			newnode.next=null;
		}
		else{
			while(ptr!=null){
				if(ptr==start&&ptr.next==null)
				{
					if(ptr.roll>=r1)
					{
						newnode.next=ptr.next;
						start=newnode;
						break;
					}
					else
					{
						ptr.next=newnode;
						newnode.next=null;
						break;
					}
				}
				else
				{
					if(ptr.roll<r1 && ptr.next.roll>=r1)
					{
						newnode.next=ptr.next;
						ptr.next=newnode;
						break;
					}
					if(ptr.next==null)
					{
						ptr.next=newnode;
						newnode.next=null;
						break;
					}
				}
				ptr=ptr.next;
	
			}
			
		}

	}

	void delete_student_record(int roll1){
		node ptr;
		ptr=start;
		if(ptr==null)
			System.out.println("no record available to delete");
		else{
			while(ptr!=null){
				if(ptr.roll==roll1)
					break;
				else
					ptr=ptr.next;
			}
		}
		if(ptr==null)
			System.out.println("roll number not found");
		else
			ptr.next=ptr.next.next;
	}

	void display_student_record(){
		node ptr;
		ptr=start;
		if(ptr==null)
			System.out.println("No records available to display");
		else{
			while(ptr!=null){
				System.out.print(ptr.roll+"    ");
				System.out.print(ptr.name+"    ");
				System.out.print(ptr.marks+"    ");
				System.out.println(ptr.age+"    ");
				ptr=ptr.next;

			}
		}
	}
			

}
public class StudentRecord{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		functions f=new functions();
		int choice;
		do{
			System.out.println("\n \n \n1.Add Record \n 2.Delete Record \n 3.Display Record");
			choice=sc.nextInt();
			switch(choice){
				case 1: System.out.println("Enter Roll Number of the Student");
						int stu_roll=sc.nextInt();
						System.out.println("Enter Name of the Student");
						sc.nextLine();
						String stu_name=sc.nextLine();

						System.out.println("Enter marks of the Student");
						int stu_marks=sc.nextInt();
						System.out.println("Enter age of the Student");
						int stu_age=sc.nextInt();
						f.insert_student_record(stu_name,stu_roll,stu_marks,stu_age);
						break;
				case 2: System.out.println("Enter rool number to be deleted");
						int stu_roll1=sc.nextInt();
						f.delete_student_record(stu_roll1);
						break;
				case 3: System.out.println("***********************Student Details**************************");
						//System.out.println("***********************Student Details**************************");
						//System.out.println("***********************Student Details**************************");
						f.display_student_record();
						break;
				default:

			}

		}
		while(choice<4);
	}
}
