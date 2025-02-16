public class FindMinimumInRotatedSortingArray {

    //int[] arr = {3,4,5,6,1,2};
    public int findMin(int[] nums) {

        //Brute Force - Found by me
       /* int minimum = nums[0];
        int l, r;
        if(nums.length != 0 && nums.length > 1) {
            l = 0;  r = 1;
            while(l < r && r < nums.length) {
                if (nums[l] < nums[r]) {
                    minimum = nums[l];
                    r++;
                } else if (nums[l] > nums[r]) {
                    minimum = nums[r];
                    l = r;
                    r++;
                }

            }
        }
        return minimum;*/


        // Using Binary Search
        int l = 0, r = nums.length - 1;
        int res = nums[0];

        while(l <= r) {
            if(nums[l] < nums[r]) {
                res = Math.min(res, nums[l]);
                break;
            }

            int m = l + (r - l) / 2;
            res = Math.min(res, nums[m]);
            if(nums[m] >= nums[l]) {
                l = m + 1;
            }
            else {
                r = m - 1;
            }

        }
        return res;



    }
}
