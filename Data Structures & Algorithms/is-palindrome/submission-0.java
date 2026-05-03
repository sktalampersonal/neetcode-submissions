class Solution {
    public boolean isPalindrome(String s) {
        int i,j;
        i=0;
        j=s.length()-1;
        while(i<=j){

            char lChar = s.charAt(i);
            char rChar = s.charAt(j);

            if(!Character.isLetterOrDigit(lChar)){
                i++;
                continue;
            }
            else if(!Character.isLetterOrDigit(rChar))
            {
                j--;
                continue;
            }
            else{
                if(Character.toLowerCase(lChar)
                    !=Character.toLowerCase(rChar)){
                        return false;
                    }     
            }  
            i++;
            j--; 
        }
        return true;
    }
}
