class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
          // Step 1: Create HashMap
        Map<String,List<String>>map  = new HashMap<>();

        // Step 2: Loop through each word
        for(String word:strs){
            char[] chars = word.toCharArray();

            Arrays.sort(chars);
            String key = new String(chars);

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(word);



        }
        return new ArrayList<>(map.values());
        //GPT -->REF

        
    }
}