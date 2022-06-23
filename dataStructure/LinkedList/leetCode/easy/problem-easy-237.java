/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 * Write a function to delete a node in a singly-linked list. 
 * You will not be given access to the head of the list, 
 * instead you will be given access to the node to be deleted directly.
 */
class Solution {
    public void deleteNode(ListNode node) {
        if((node != null) && (node.next != null)){
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
