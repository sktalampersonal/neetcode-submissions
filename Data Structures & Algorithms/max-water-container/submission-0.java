class Solution {
    public int maxArea(int[] heights) {

        int left,right, maxArea;
        left=maxArea=0;
        right=heights.length-1;

        while(left<right){

            int width=right-left;

            int minHeight= Math.min(heights[left],heights[right]);

            int currentArea= minHeight*width;

            maxArea=Math.max(maxArea,currentArea);

            if(heights[left]<heights[right])
                left++;
            else
                right--;
        }
        
        return maxArea;
    }
}
