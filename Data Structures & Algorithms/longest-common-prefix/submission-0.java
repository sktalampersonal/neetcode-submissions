class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        //checking if the string array is not empty or not null
        if (strs.length==0 || strs==null) return "";

        String prefix = strs[0];

        for(int i=1; i<strs.length;i++){

            while(strs[i].indexOf(prefix)!=0){

                prefix=prefix.substring(0,prefix.length()-1);

                if (prefix.length()==0)
                    return "";
            }
        }

        return prefix;
    }
}