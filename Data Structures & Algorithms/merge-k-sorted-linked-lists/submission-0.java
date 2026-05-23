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
    public ListNode mergeKLists(ListNode[] lists) {
        int n=lists.length;
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<n;i++){
            ListNode temp=lists[i];
            while(temp!=null){
                li.add(temp.val);
                temp=temp.next;
            }
        }

        Collections.sort(li);
        ListNode head=new ListNode(0);
        ListNode temp=head; 
        for(int i=0;i<li.size();i++){
           ListNode newNode=new ListNode(li.get(i));
           temp.next=newNode;
           temp=newNode;
        }
        return head.next;
    }
}