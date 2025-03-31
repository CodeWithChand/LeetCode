
class ListNode{
    int val;
    ListNode next;

    public ListNode() {}
    public ListNode(int val) {this.val = val;}
    public ListNode(int val, ListNode next) {this.val = val;this.next = next;}
}

class mergeTwoSortedList {
    public ListNode mergeLogic(ListNode l1,ListNode l2)
    {
        ListNode dummy= new ListNode(0);
        ListNode curr = dummy;
        while(l1!=null && l2!=null)
        {
            if(l1.val<l2.val)
            {
                curr.next=l1;
                l1=l1.next;
            }
            else
            {
                curr.next=l2;
                l2=l2.next;
            }
            curr=curr.next;
        }
        curr.next=l1!=null ? l1:l2;
        return dummy.next;
    }
    public static void main (String[] args)
    {
        ListNode l1=new ListNode(1,new ListNode(3,new ListNode(5)));
        ListNode l2=new ListNode(4,new ListNode(6,new ListNode(8)));

        mergeTwoSortedList mergeObj=new mergeTwoSortedList();
        ListNode mergedList=mergeObj.mergeLogic(l1,l2);
        while(mergedList != null)
        {
            System.out.println(mergedList.val +", ");
            mergedList=mergedList.next;
        }

    }
}
