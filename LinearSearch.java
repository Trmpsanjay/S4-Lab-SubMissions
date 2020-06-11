import java.util.*;
class functions{
	void linearSearch(int arr[],int key){
		int flag=0,position=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key){
				flag=1;
				position=i+1;
				break;
			}
		}
		if(flag==1)
			System.out.print(key+" found at postion"+position);
		else
			System.out.print(key+" not found");
	}
}
class LinearSearch{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		functions f=new functions();
		System.out.println("enter Size of array");
		int size=sc.nextInt();
		int arr1[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.println("Enter the Element");
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be Searched");
		int search=sc.nextInt();
		f.linearSearch(arr1,search);
	}

}
