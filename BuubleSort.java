import java.util.*;
class functions{
	void sort(int arr[]){
		int i,j,temp=0;
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
	}
}

class BuubleSort{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		functions f=new functions();
		System.out.println("Enter the Array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.println("enter the element");
			arr[i]=sc.nextInt();
		}
		System.out.println("************The sorted Array Element is**********");
		f.sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}

