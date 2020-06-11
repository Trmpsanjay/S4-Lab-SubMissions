public class MergeSortLinkedList {
    
    private static LinkedListNode<Integer> findmid(LinkedListNode<Integer> head) {
        if(head==null)
            return head;
        LinkedListNode<Integer> slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
        // LinkedListNode<Integer> slow = head;
        // LinkedListNode<Integer> fast = head;
        // if(head.next==null)
        //     return head;
        // while( fast != null){
        //     if(fast.next.next == null){
        //         //slow =slow.next;
        //         break;
        //     }
        //     else{
        //         slow = slow.next;
        //         fast=fast.next.next;
        //     }
        // }
        // return slow;
    }
    
    private static LinkedListNode<Integer> merge(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        LinkedListNode<Integer> t1 = head1;
        LinkedListNode<Integer> t2 = head2;
        LinkedListNode<Integer> headNew = null;
        LinkedListNode<Integer> tailNew = null;
        int count = 0;
        while( t1 != null && t2 != null){
            count++;
            if( t1.data < t2.data ){
                if(count==1){
                    headNew=t1;
                	tailNew = t1;
                	t1 = t1.next;
                }
                else{
                    tailNew.next = t1;
                    tailNew = t1;
                    t1=t1.next;
                }
            }
            else{
                if(count==1){
                    headNew=t2;
                	tailNew=t2;
                	t2= t2.next;
                }
                else{
                    tailNew.next = t2;
                    tailNew = t2;
                    t2 = t2.next;
                }
            }
        }
        if( t1 != null){
            tailNew.next = t1;
        }
        if( t2 != null){
            tailNew.next = t2;
        }
        return headNew;
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		
	}
    private static  LinkedListNode<Integer> lastNode(LinkedListNode<Integer> head){
        while(head.next != null)
            head=head.next;
        return head;
    }
//     public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head ,LinkedListNode<Integer> mid) {
//      if(head==null)
//          return head;
//         if(head.next == null)
//             return head;
        
//         LinkedListNode<Integer> firstHalf = mergeSort(head,mid);
//         LinkedListNode<Integer> last = lastNode(mid);
//         LinkedListNode<Integer> secondHalf = mergeSort(mid.next,last);
//         LinkedListNode<Integer> merge1 = merge(firstHalf,secondHalf);
//             return merge1;
//     }
// 		// write your code here

// 	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
//        	LinkedListNode<Integer> mid1= middel(head);
//     	LinkedListNode<Integer> ans= mergeSort(head,mid1);
//         return ans;
// 		// write your code here

	// } 
public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
        if(head==null)
            return head;
        if(head.next==null)
            return head;
        LinkedListNode<Integer> midNode=findmid(head);
        LinkedListNode<Integer> h2=midNode.next;
        midNode.next=null;
        LinkedListNode<Integer> part1=mergeSort(head);
        LinkedListNode<Integer> part2=mergeSort(h2);
        LinkedListNode<Integer> mergedList=merge(part1,part2);
        return mergedList;
        
        }

}
