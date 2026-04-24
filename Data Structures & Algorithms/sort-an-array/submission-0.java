class Solution {
    
    public int[] sortArray(int[] nums) {

        int n=nums.length;

        for(int i=n/2-1;i>=0;i--){
            heapify(nums,n,i);
        }

        for(int i=n-1;i>0;i--){

            nums[i]=nums[i]+nums[0];   
            nums[0]=nums[i]-nums[0];
            nums[i]=nums[i]-nums[0];

            heapify(nums,i,0);
        }

       return nums; 
    }

    public void heapify(int[] nums, int n, int i){

        int root=i;
        int left=2*i+1;
        int right=2*i+2;

        if(left<n && nums[left]>nums[root]){
            root=left;
        }

        if(right<n && nums[right]>nums[root]){
            root=right;
        }

        if(root!=i){

            nums[i]=nums[i]+nums[root];   
            nums[root]=nums[i]-nums[root];
            nums[i]=nums[i]-nums[root];

            heapify(nums,n,root);
        }
    }
}