class Solution {
    public String minWindow(String s, String t) {

        if(s.length()<t.length())
            return "";

        int[] tFreq= new int[126];
        for(int c: t.toCharArray()){
            tFreq[c]++;
        }

        int[] windowFreq= new int[126];
        int need=0;
        int have=0;

        //unique characters requirements
        for(int c: tFreq){
            if(c>0)
                need++;
        }

        int left=0;
        int minLength=Integer.MAX_VALUE;
        int startIndex=0;

        for(int right=0; right<s.length();right++){

                char c= s.charAt(right);
                windowFreq[c]++;

                if(tFreq[c]>0 && tFreq[c]==windowFreq[c]){
                    have++;
                }

                while(need==have){

                    if(right-left+1<minLength){
                        minLength=right-left+1;
                        startIndex=left;
                    }

                    //shrinking from left
                    char leftChar=s.charAt(left);
                    windowFreq[leftChar]--;

                    if(tFreq[leftChar]>0 
                        && windowFreq[leftChar]<tFreq[leftChar]){

                        have--;
                    }
                    
                    left++;
                }
        }

        return minLength==Integer.MAX_VALUE?""
                    :s.substring(startIndex,startIndex+minLength);
    }
}
