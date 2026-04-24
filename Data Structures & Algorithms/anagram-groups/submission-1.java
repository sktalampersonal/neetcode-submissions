class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs.length==0 || strs==null) return new ArrayList<>();

        HashMap<String,List<String>> result = new HashMap<>();

        for(String s: strs){

            //creating keys for unique(by sorting them) anagram values
            char[] charArray=s.toCharArray();
            // Arrays.sort(charArray);
            // String key= new String(charArray);

            //character set array for lower case characters
            int[] countArray = new int[26];
            for(char c: charArray){
                countArray[c-'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for(int value: countArray){
                sb.append("#");
                sb.append(value);
            }

            String key = sb.toString();

            //putting the key if not present
            result.putIfAbsent(key, new ArrayList<String>());

            //adding list of anagram against the unique keys
            result.get(key).add(s);
        }

        return new ArrayList<>(result.values());
    }
}
