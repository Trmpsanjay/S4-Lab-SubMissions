/***********

public static void main(String[] args) throws StackEmptyException {
      		Scanner s = new Scanner(System.in);

		Stack<Integer> st = new Stack<Integer>();

		int choice = s.nextInt();
		int input;

		while (choice !=-1) {
			if(choice == 1) {
				input = s.nextInt();
				st.push(input);
			}
			else if(choice == 2) {
				try {
					System.out.println(st.pop());
				} catch (StackEmptyException e) {
					System.out.println(-1);
				}
			}
			else if(choice == 3) {
				try {
					System.out.println(st.top());
				} catch (StackEmptyException e) {
					System.out.println(-1);
				}
			}
			else if(choice == 4) {
				System.out.println(st.size());
			}
			else if(choice == 5) {
				System.out.println(st.isEmpty());
			}
			choice = s.nextInt();
		}
    }


class Node<T> {
	T data;
	Node<T> next;

	public Node(T data) {
		this.data = data;
	}
}

************/
class StackEmptyException extends Exception{
    
}

public class Stack<T> {
    private int size;
    private Node<T> head;
	
	public Stack() {
        size=0;
        head=null;
        

	}
	
	public int size() {
        return size;

	}
	
	public void push(T data) {
        Node<T> newNode = new Node<T>(data);
        if(head == null)
            head = newNode;
        else{
            newNode.next = head;
            head = newNode;
        }
        size++;
        

	}
	
	public boolean isEmpty() {
        return (head==null);

	}
	
	public T pop() throws StackEmptyException {
        T temp;
        if(head == null){
            StackEmptyException e= new StackEmptyException();
            throw e;
        }
        else{
            temp=head.data;
            head = head.next;
            size--;
        }
        
        return temp;

	}
	
	public T top() throws StackEmptyException {
        if(head == null){
            StackEmptyException e= new StackEmptyException();
            throw e;
        }
        else{
            return head.data;
        }
        

	}
}
