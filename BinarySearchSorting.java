import java.util.*;
class function{
	public void sorting(int arr[]){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]>=arr[j+1]){
					int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
				}
			}
		}
	}
	public void binarySearch(int arr[],int key){
		int first=0,last=arr.length-1;
		int mid=(first+last)/2;
		while(first<=last){
			if(arr[mid]==key){
				int m=mid+1;
				System.out.println("\n "+key+"found at position"+m);
				break;
			}
			else if(arr[mid]>key){
				last=mid-1;
			}
			else
				first=mid+1;
			mid=(first+last)/2;
		}
		if(first>last){
			System.out.println("\n element not found");
		}
	}
}

class BinarySearchSorting{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		function f=new function();
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr1[]=new int[size];
		for(int i=0;i<size;i++){
			arr1[i]=sc.nextInt();
		}
		System.out.print("enter the number to be searched");
		int serach=sc.nextInt();
		f.sorting(arr1);
		System.out.println("sorted arrays are");
		for(int i=0;i<size;i++)
			System.out.print(arr1[i]+" ");
		f.binarySearch(arr1,serach);
	}
}


/* 

you can use also this recursion method
public class solution {
    private static int binarySearch(int input[],int element,int si,int ei){
      int mid= (si+ei)/2;
        if(ei<si)
            return -1;
        if(input[mid]==element)
            return mid;
        if(input[mid]>element)
            return binarySearch(input,element,si,mid-1);
        else
            return binarySearch(input,element,mid+1,ei);
    }


	// element - number to be searched
	public static int binarySearch(int input[], int element) {
        return binarySearch(input,element,0,input.length-1);
		// Write your code here

	}
}
*/
