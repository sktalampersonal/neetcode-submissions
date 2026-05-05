class Solution {
    public void rotate(int[] nums, int k) {

        int n=nums.length;
        k=k%n;

        if(k==0) return;

        reverseArray(nums,0,n-1);

        reverseArray(nums,0,k-1);

        reverseArray(nums,k,n-1);
    }

    private void reverseArray(int[] nums, int left, int right){

        while(left<right){

            nums[left]=nums[left]+nums[right];
            nums[right]=nums[left]-nums[right];
            nums[left]=nums[left]-nums[right];

            left++;
            right--;
        }
    }
}