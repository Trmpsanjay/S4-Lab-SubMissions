import java.util.*;

class Polynomial
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the highest degree of 1st polynomial");
		int a=sc.nextInt();
		int arr1[]=new int[30];
		for(int i=0; i<=a; i++)
		{
			System.out.println("enter the coefficient of x^"+(a-i)+":");
			arr1[i]=sc.nextInt();
		}
		System.out.println("enter the highest degree of 2nd polynomial");
		int b=sc.nextInt();
		int arr2[]=new int[30];

		for(int i=0; i<=b; i++)
		{
			System.out.println("enter the coefficient of x^"+(b-i)+":");
			arr2[i]=sc.nextInt();
		}
		int max=(a>b)?a:b;
		max=max+1;
		int arr3[]=new int[max];
		int c;
		if(a>b)
		{
			 c=a-b;
			for(int i=0;i<c;i++)
				arr3[i]=arr1[i];
			for(int i=c,j=0; i<max; i++,j++)
			{
				arr3[i]=arr1[i]+arr2[j];
			}
		}
		else
		{
			c=b-a;
			for(int i=0;i<c;i++)
				arr3[i]=arr2[i];
			for(int i=c,j=0;i<max;i++,j++)
			{
				arr3[i]=arr1[j]+arr2[i];
			}
		}
		System.out.println("ans is:");
		max=max-1;
		for(int i=0;i<=max;i++)
		{
			System.out.print(arr3[i]);
			if(i==max)
				System.out.print("x^"+(max-i));
			else
			System.out.print("x^"+(max-i)+" + ");
		}
		}
	}






