import java.util.List;
import java.util.ArrayList;

public class CombinationSum {
    List<List<Integer>> res;

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList();
        backtrack(nums, target,cur,0);
        return res;


    }

    public void backtrack(int[] nums,int target,List<Integer> cur,int i) {
        if(target == 0){
            res.add(new ArrayList(cur));
            return;
        }

        if(target < 0 || i >= nums.length){
            return;
        }

        cur.add(nums[i]);
        backtrack(nums, target - nums[i], cur, i);
        cur.remove(cur.size() - 1);
        backtrack(nums,target,cur,i+1);
    }
}

