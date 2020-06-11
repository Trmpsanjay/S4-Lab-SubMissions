import java.util.*;
class Functions{
	public static void merge(int input[], int si, int ei){
		int mid=(si+ei)/2;
		int ans[]=new int[ei-si+1];
		int i=si;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=ei){
			if(input[i]<input[j]){
				ans[k]=input[i];
				i++;
				k++;
			}
			else{
				ans[k]=input[j];
				j++;
				k++;
			}
		}
		while(i<=mid){
			ans[k]=input[i];
			i++;
			k++;
		}
		while(j<=ei){
			ans[k]=input[j];
			j++;
			k++;
		}
		for(int index=0;index<ans.length;index++){
			input[si+index]=ans[index];
		}
	}

	public static void mergeSort(int input[], int si, int ei){
		if(si>=ei)
			return;
		int mid=(si+ei)/2;
		mergeSort(input,si,mid);
		mergeSort(input,mid+1,ei);
		merge(input,si,ei);
	}

}
class MergeSortUsingRecursion{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Functions f=new  Functions();
		System.out.println("Enter the size of the Array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("***********Entered Array***********");
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
		f.mergeSort(arr,0,arr.length-1);
		System.out.println("\n*************Sorted Array**********");
		for(int i=0;i<size;i++){
			System.out.print(arr[i]+" ");
		}
	}
}


