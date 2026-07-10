class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        char [] chars;
        for(String str : strs){
            chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if(anagrams.containsKey(key)){
               anagrams.get(key).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
               anagrams.put(key, list);
            }
        }

        return new ArrayList<>(anagrams.values());

    }
}
