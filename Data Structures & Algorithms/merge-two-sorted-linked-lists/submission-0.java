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

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> li=new ArrayList<>();
        ListNode temp=list1;
        while(temp!=null){
            li.add(temp.val);
            temp=temp.next;
        }
        temp=list2;
        while(temp!=null){
            li.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(li);

        ListNode head=new ListNode(0);
        temp=head;
        for(int i=0;i<li.size();i++){
           ListNode newNode=new ListNode(li.get(i));
           temp.next=newNode;
           temp=newNode;
        }
        return head.next;
    }
}