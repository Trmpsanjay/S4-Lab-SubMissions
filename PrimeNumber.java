import java.util.*;
public class PrimeNumber{
	public static void main(String[] args) {
		
	

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter start limit of the array");

	int start=sc.nextInt();
	System.out.println("Enter last limit of the array");

	int last=sc.nextInt();
	int count=0;

	for(int i=start;i<=last;i++){
		int flag=0;
		for(int j=2;j<i;j++){
			if(i%j==0){	
				flag=1;
				break;
			}
		}

		if(flag==0)
			System.out.println(i);
		}
	}
}
