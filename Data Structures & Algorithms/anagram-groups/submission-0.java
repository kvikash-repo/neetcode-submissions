class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }

        Map<String,List<String>> mapList = new HashMap<>();

        for(String s : strs){
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sortedKey = new String(charArr);

            mapList.putIfAbsent(sortedKey,new ArrayList<>());
            mapList.get(sortedKey).add(s);
        }

        return new ArrayList<>(mapList.values());
        
    }
}
