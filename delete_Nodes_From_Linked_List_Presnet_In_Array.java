import java.util.*;
public class delete_Nodes_From_Linked_List_Presnet_In_Array {
    
    static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
        this.val = val;
        this.next = null;
        }
    }

    public ListNode modifiedList(int[] nums, ListNode head){
        Set<Integer> valuesToRemove = new HashSet<>();
        for(int num : nums){
            valuesToRemove.add(num);
        }

        // When we have to remove the head
        while(head != null && valuesToRemove.contains(head.val)){
            head = head.next;
        }

        // When the head is null
        if(head == null){
            return null;
        }

        // The actual current shifting
        ListNode current = head;
        while(current.next != null){
            if(valuesToRemove.contains(current.next.val)){
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    } 
}
