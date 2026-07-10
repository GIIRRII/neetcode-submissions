class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        char [] chars;
        for(String str : strs){
            chars = str.toCharArray();
            Arrays.sort(chars);
            if(anagrams.containsKey(String.valueOf(chars))){
               List<String> lists =  anagrams.get(String.valueOf(chars));
               lists.add(str);
               anagrams.put(String.valueOf(chars), lists);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
               anagrams.put(String.valueOf(chars), list);
            }
        }

        return new ArrayList<>(anagrams.values());

    }
}
