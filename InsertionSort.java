import java.util.*;
class functions{
	void insertionSort(int arr[]){
		for(int i=1;i<arr.length;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;

		}
	}

}
class InsertionSort{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		functions f=new functions();
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr1[]=new int[size];
		for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
		}
		System.out.println("*************Sorted Arrays Are************");
		f.insertionSort(arr1);
		for(int i=0;i<arr1.length;i++)
			System.out.print(arr1[i]+" ");
	}
}
