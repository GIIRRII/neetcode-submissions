class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> frequencyS  = new HashMap<>();
        Map<Character, Integer> frequencyT  = new HashMap<>();
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        if(s.equals(t)){
            return true;
        } else if(s.length() != t.length()){
            return false;
        }
        for(int i=0; i<sChar.length; i++){
            frequencyS.put(sChar[i], frequencyS.getOrDefault(sChar[i], 0)+1);
        }

        for(int i=0; i<tChar.length; i++){
            frequencyT.put(tChar[i], frequencyT.getOrDefault(tChar[i], 0)+1);
        }

        for(char ch : sChar){
            if(!frequencyS.get(ch).equals(frequencyT.get(ch))){
                return false;
            }
        }

        return true;
    }
}
