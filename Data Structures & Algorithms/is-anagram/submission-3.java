class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
         return false;}

        Map<String,Integer> charMap = new HashMap<>();
        Map<String,Integer> secondMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            String ch1 = String.valueOf(s.charAt(i));
            String ch2 = String.valueOf(t.charAt(i));
            if(charMap.containsKey(ch1)){
                charMap.put(ch1, charMap.get(ch1)+1);
            }else{
                charMap.put(ch1, 1);
            }
            if(secondMap.containsKey(ch2)){
                secondMap.put(ch2, secondMap.get(ch2)+1);
            }else{
                secondMap.put(ch2, 1);
            }
        }
        if(charMap.equals(secondMap))
            return true;
        else
            return false;

    }
}
