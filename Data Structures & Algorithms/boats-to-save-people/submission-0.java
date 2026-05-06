class Solution {
    public int numRescueBoats(int[] people, int limit) {

        int left, boats, right;
        left=boats=0;
        right=people.length-1;

        Arrays.sort(people);

        while(left<=right){

            if(people[left]+people[right]<=limit)
                left++;

            right--;
            boats++;
        }

        return boats;
    }
}