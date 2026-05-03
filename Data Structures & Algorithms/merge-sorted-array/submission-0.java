class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i,j,length;
        i=m-1;
        j=n-1;
        length=m+n-1;

        while(j>=0){

            if(i>=0 && nums1[i]>nums2[j]){
                nums1[length]=nums1[i];
                i--;
            }
            else{
                nums1[length]=nums2[j];
                j--;
            }
            length--;
        }
    }
}