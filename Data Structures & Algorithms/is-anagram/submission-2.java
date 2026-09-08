class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
         return false;}

        Map<String,Integer> charMap = new HashMap<>();
        Map<String,Integer> secondMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            String ch = String.valueOf(s.charAt(i));
            if(charMap.containsKey(ch)){
                charMap.put(ch, charMap.get(ch)+1);
            }else{
                charMap.put(ch, 1);
            }
        }
        for(int i=0;i<t.length();i++){
            String ch = String.valueOf(t.charAt(i));
            if(secondMap.containsKey(ch)){
                secondMap.put(ch, secondMap.get(ch)+1);
            }else{
                secondMap.put(ch, 1);
            }
        }
        if(charMap.equals(secondMap))
            return true;
        else
            return false;

    }
}
