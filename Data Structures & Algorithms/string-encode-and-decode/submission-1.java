class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodeString = new StringBuilder();
        for(String s: strs){
            encodeString.append(s.length()).append('#').append(s);
        }
        return encodeString.toString();

    }

//    "5#hello5#World"
    public List<String> decode(String str) {
        List<String> response = new ArrayList<>();
        int i =0;
        while(i < str.length()){
          int j=i;
          while(str.charAt(j)!='#'){
            j++;
          }
          int length = Integer.parseInt(str.substring(i, j));
          i = j+1;
          j = i+length;
          response.add(str.substring(i,j));
          i=j;
        }

        return response;
    }
}
