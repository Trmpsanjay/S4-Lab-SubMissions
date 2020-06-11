import java.util.*;

public class MatrixMultiplication
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		int arr1[][]=new int[10][10];
		int arr2[][]=new int[10][10];
		int arr3[][]=new int[10][10];

		System.out.println("Enter the order of first matrix");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
			arr1[i][j]=sc.nextInt();
			}
		}

		System.out.println("Enter the order of second matrix");
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
			arr2[i][j]=sc.nextInt();
			}
		}


		if(c1==r2)
		{
			System.out.println("Multiplication is possible");
			System.out.println("Multiplication is");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c2;j++)
				{
					arr3[i][j]=0;
					for(int k=0;k<r2;k++)
					{
						arr3[i][j]=arr3[i][j]+arr1[i][k]*arr2[k][j];
					}
				}
			}

		}

		else
		{
			System.out.println("Multiplication Not Possible");
		}

		System.out.println("The elements are ");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}



	}
}
