/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class mergelists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        while(list1 !=null && list2!=null) {
            if(list1.val < list2.val){
                current.next = list1;
                list1 = list1.next;
            } 
            else {
                current.next = list2; 
                list2 = list2.next;
            }
            current = current.next;
        }

        if(list1 != null) current.next = list1;
        if(list2 != null) current.next = list2;
        return dummy.next;
    }
}

//in main
//mergelists m = new mergelists();
//ListNode list1 = new ListNode(3);
//list1.next = ListNode(5);
//ListNode list2 = new ListNode(3);
//System.out.println(m.mergeTwoLists(list1, list2));
