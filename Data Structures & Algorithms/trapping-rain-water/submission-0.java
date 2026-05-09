class Solution {
    public int trap(int[] height) {
        
        int left,leftMax,right,rightMax,totalWater;
        left=leftMax=rightMax=totalWater=0;
        right=height.length-1;

        while(left<right){

            if(height[left]<height[right]){

                if(height[left]<leftMax){
                    totalWater=totalWater+leftMax-height[left];
                }
                else{
                    leftMax=height[left];
                }
                left++;
            }
            else{

                if(height[right]<rightMax){
                    totalWater=totalWater+rightMax-height[right];
                }
                else{
                    rightMax=height[right];
                }
                right--;
            }
        }
        
        return totalWater;
    }
}
