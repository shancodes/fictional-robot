import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {


            //--------------BinarySearch1
           /* int[] nums = { 3, 4, 5, 1, 2};
            BinarySearch1 bin = new BinarySearch1();
            bin.findMin(nums);*/

        //---------------Hash Set and Tree Set
       /* HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(5);

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(3);
        ts.add(5);
        ts.add(7);

        System.out.print("Elements from HashSet : ");
        for(int n : hs) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.print("Elements from TreeSet : ");
        for(int m : ts) {
            System.out.print(m + " ");

        }
        System.out.print(ts.last());

*/
    //----------------Longest Substring Without repeating character
       /* String s = "abcdefghnabc";
        LongestSubstringWithoutRepeatingCharacter longsubs = new LongestSubstringWithoutRepeatingCharacter();
        int res = longsubs.lengthOfLongestSubstring(s);
        System.out.print(res);*/



    //------------LongestRepeatingCharacterReplacement
   /* String s = "XYYXYZ";
    int k = 2;
    LongestRepeatingCharacterReplacement subs = new LongestRepeatingCharacterReplacement();
    int result = subs.characterReplacement(s,k);
    System.out.println(result);*/

        //-------------ThreeSum
       /* int[] arr = {5,0,1,2,-1,-4};
        ThreeSum three = new ThreeSum();
        three.threeSum(arr);*/

        //-------ContainerWithMostWater
        /*int[] arr = {1,7,2,5,4,7,3,6};
        ContainerWithMostWater area = new ContainerWithMostWater();
        int result = area.maxArea(arr);
        System.out.println(result);*/

        //---------Find Minimum In Rotated Sorted Array
       /* int[] arr = {3,4,5,6,1,2};
        FindMinimumInRotatedSortingArray minelement = new FindMinimumInRotatedSortingArray();
        int result = minelement.findMin(arr);
        System.out.println(result);*/

        //--------Search In Rotated Sorted Array
//        int[] arr = {4,5,6,7,0,1,2};
//        int target = 0;
//        SearchInRotatedSortedArray searchelement = new SearchInRotatedSortedArray();
//        int result = searchelement.search(arr,target);
//        System.out.println(result);

        //-------Island Problem
        char[][] grid = { {'0','1','1','1','0'},{'0','1','0','1','0'},{'1','1','0','0','0'},{'0','0','1','0','1'}};
        IslandProblem island = new IslandProblem();
        int number = island.numIslands(grid);
        System.out.println(number);








        //--------------Data Structures
           /* ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
            int[] arr = { 1, 2, 3, 4 };
            ListNode list1 = BuildlinkedList(arr);
            ListNode res = reverseLinkedList.reverseList(list1);
            PrintList(res);*/

           /* MergeTwoSortedLinkedLists mergeTwoSortedLinkedLists = new MergeTwoSortedLinkedLists();
            int[] arr1 = {1,2,3};
            int[] arr2 = {1,4,5,6};
            ListNode list1 = BuildlinkedList(arr1);
            ListNode list2 = BuildlinkedList(arr2);
            ListNode res = mergeTwoSortedLinkedLists.mergeTwoLists(list1,list2);
            PrintList(res);*/


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
