public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        //Brute Force added by me
        /*int index = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                index = i;
                break;
            }
            else {
                index = -1;
            }
        }
        return index;*/

        //Binary Search
        int l = 0; int r = nums.length - 1;

            while(l < r) {
                int m = (l + r) / 2;
                if(nums[m] > nums[r]) {
                    l = m + 1;
                } else {
                    r = m;
                }
            }

            int result = binarySearch(nums,target,0, l - 1);

            if(result != -1) {
                return result;
            }
            return binarySearch(nums, target, l, nums.length - 1);
        }

        public int binarySearch(int[] nums, int target, int left, int right) {
            while(left <= right) {
                int mid = ( left + right )/2;
                if(nums[mid] == target) {
                    return mid;
                } else if(nums[mid] < target) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }

            return -1;
        }
    }

