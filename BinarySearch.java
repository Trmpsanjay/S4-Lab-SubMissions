import java.util.*;

class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
	}
}

class BinarySearchTree {
    BinaryTreeNode<Integer> root;
    
    //search  helper function
    private  boolean search(BinaryTreeNode<Integer> root , int data){
        // base case
        if(root==null)
            return false;
        
        // base case 2 : if number is present
        if(root.data==data){
            return true;
        }
        // recursive calling based on root data
        else if(root.data>data){
            return search(root.left,data);
        }
        else{
            return search(root.right,data);
        }
    }
    // search main function
    public  boolean search(int data){
       return search(root,data);
    }
    
    //insert helper function;
    
   private BinaryTreeNode<Integer> insertData(int data, BinaryTreeNode<Integer> root) {
		if (root == null) {
			BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(data);
			return newNode;
		}
		if (root.data > data) {
			root.left = insertData(data, root.left);
		} else {
			root.right = insertData(data, root.right);
		}
		return root;
	}
     public  void insertData(int data){
         root=insertData(data,root);
     }
    
    private BinaryTreeNode<Integer> deleteData(int data,BinaryTreeNode<Integer> root){
        //base case
        if(root==null)
            return null;
        if (data < root.data) {
			root.left = deleteData(data, root.left);
			return root;
		} else if (data > root.data) {
			root.right = deleteData(data, root.right);
			return root;
		} else {
			if (root.left == null && root.right == null) {
				return null;
			} else if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			} else {
				BinaryTreeNode<Integer> minNode = root.right;
				while (minNode.left != null) {
					minNode = minNode.left;
				}
				root.data = minNode.data;
				root.right = deleteData(minNode.data, root.right);
				return root;
			}
        }
    }
    
    public void deleteData(int data) {
		root = deleteData(data, root);
	}
    private void printTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		String toBePrinted = root.data + ":";
		if (root.left != null) {
			toBePrinted += "L:" + root.left.data + ",";
		}
		
		if (root.right != null) {
			toBePrinted += "R:" + root.right.data;
		}
		System.out.println(toBePrinted);
		printTree(root.left);
		printTree(root.right);
	}
	
	public void printTree() {
		printTree(root);
	}
	private void preOrder1(BinaryTreeNode<Integer> root){
		if(root==null)
			return;
		System.out.print(root.data+" ");
		preOrder1(root.left);
		preOrder1(root.right);
	}
	public void preOrder(){
		preOrder1(root);
	}
}
public class BinarySearch{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BinarySearchTree bst = new BinarySearchTree();
		System.out.println("Enter Your Choice");
		
		int choice=0;
		do{
			System.out.print("1.Insert \n 2.Search \n 3.Delete \n 4 .Print \n Anyother Key To Stop\n");
			choice = sc.nextInt();
			switch(choice){
				case 1: System.out.println("Enter the data for inserting");
						int data = sc.nextInt();
						bst.insertData(data);
						break;
				case 2: System.out.println("Enter the data for serach");
						int data1 = sc.nextInt();
						boolean result = bst.search(data1);
						if(result)
							System.out.println(data1+" Found");
						else
							System.out.println(data1+" not  Found");
						break;
				case 3: System.out.println("Enter the data for deleting");
						int data2 = sc.nextInt();
						boolean result1 = bst.search(data2);
						if(result1){
							bst.deleteData(data2);
							System.out.println(data2+" Found and deletef");
						}
						else
							System.out.println(data2+" not  Found so can't deleted");
				
						break;
				case 4: bst.preOrder();
						break;

			}
		}
		while(choice<5);

		
	}
}
