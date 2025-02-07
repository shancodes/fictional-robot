//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {


            //--------------BinarySearch1
           /* int[] nums = { 3, 4, 5, 1, 2};
            BinarySearch1 bin = new BinarySearch1();
            bin.findMin(nums);*/



            //--------------Data Structures
            ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
            int[] arr = { 1, 2, 3, 4 };
            ListNode list1 = BuildlinkedList(arr);
            ListNode res = reverseLinkedList.reverseList(list1);
            PrintList(res);





        }

    //Building LinkedList
    public static ListNode BuildlinkedList(int[] arr)
    {
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        for(int i =1; i< arr.length;i++)
        {
            ListNode l1 = new ListNode(arr[i]);
            temp.next = l1;
            temp = temp.next;
        }
        return head;
    }

    //Printing Linked List
    public static void PrintList(ListNode l1)
    {
        while (l1 != null) {
            System.out.println(l1.val);
            l1 = l1.next;

        }
    }


}
