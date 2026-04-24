class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> result = new HashMap<>();

        for(String s: strs){

            //creating keys for unique(by sorting them) anagram values
            char[] charArray=s.toCharArray();
            Arrays.sort(charArray);
            String key= new String(charArray);

            //putting the key if not present
            result.putIfAbsent(key, new ArrayList<String>());

            //adding list of anagram against the unique keys
            result.get(key).add(s);
        }

        return new ArrayList<>(result.values());
    }
}
