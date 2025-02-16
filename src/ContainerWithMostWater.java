public class ContainerWithMostWater {
    public int maxArea(int[] heights) {

        //int[] arr = {1,7,2,5,4,7,3,6};

        //BruteForce
      /*  int res = 0;
        for(int l = 0 ; l < heights.length; l++) {
            for(int r = l + 1; r < heights.length; r++) {
                int area = (r - l) * Math.min(heights[l],heights[r]);
                res = Math.max(res, area);
            }
        }
    return res;
    }*/

        // Optimized Two Pointers Solution
        int res = 0;
        int l = 0;
        int r = heights.length - 1;

        while(l < r) {
            int area = (r - l) * Math.min(heights[l],heights[r]);
            res = Math.max(res,area);

            if(heights[l] < heights[r])
                l++;
            else
                r--;
        }

    return res;
    }



}
