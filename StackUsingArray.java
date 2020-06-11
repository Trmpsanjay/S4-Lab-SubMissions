public class StackUsingArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//functions f=new functions();
		int top=-1;
		int choice;
		System.out.println("Enter the max limit of STACK");
		int limit=sc.nextInt();
		int stack[]=new int[limit];
		do{
			System.out.println("\n \n \n \n 1.Pop \n 2.Push \n 3.Display");
			choice=sc.nextInt();
			switch(choice){
				case 1:	if(top==-1)
							System.out.println("STACK Underflow");
						else
							top--;
						break;
				case 2:	System.out.println("Enter the to be inserted");
						int item=sc.nextInt();
						if(top==limit-1)
							System.out.println("STACK Overflow");
						else{
							top++;
							stack[top]=item;	
						}
						break;
				case 3: System.out.println("STACK elements are");
						for(int i=top;i>=0;i--)
							System.out.print(stack[i]+" ");
						break;
				default : 
			}

		}
		while(choice<4);
	}	
}
