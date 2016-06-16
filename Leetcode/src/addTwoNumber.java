/** You are given two linked lists representing two non-negative numbers. 
	The digits are stored in reverse order and each of their nodes contain a single digit. 
	Add the two numbers and return it as a linked list.

	Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
	Output: 7 -> 0 -> 8
	
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class addTwoNumber {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode x = new ListNode(0);
        ListNode before = x;
        ListNode head = x;
        
        head.next = x;
        
        while(null != l1 && null != l2 ){
            
            x.val = l1.val + l2.val;
            
            x.next = new ListNode(x.val/10);
            x.val = x.val%10;
            
            before = x;
            x = x.next;
            
            l1 = l1.next;
            l2 = l2.next;
        }
        
        ListNode rest;
        
        if(l1 == null){
            rest = l2;
        }else{
            rest = l1;
        }
        
        while(rest != null){
            x.val = rest.val;
            
            x.next = new ListNode(x.val/10);
            x.val = x.val%10;
            before = x;
            x = x.next;
        }
        
        if(before.next != null && before.next.val == 0){
            before.next = null;
        }
        
        return head;
    }
}