class Solution {
    public int majorityElement(int[] nums) {
        //Boyer Moore Algorithm
        int count, number;
        count=number=0;

        for(int n: nums){
            //checking the value of count is inititaed or not
            if(count==0){
                number = n;
            }

            count = (number==n)?++count:--count;
        }

        return number;
    }
}