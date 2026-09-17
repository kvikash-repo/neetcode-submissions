class Solution {

    public String encode(List<String> strs) {
        StringBuilder enString = new StringBuilder();

        for(String s: strs){
            enString  = enString.append(s.length()+"#"+s); 
        }
        return enString.toString();

    }   

    public List<String> decode(String str) {
        List<String> dlist = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int slash = str.indexOf('#', i);
            int len = Integer.parseInt(str.substring(i, slash));
            dlist.add(str.substring(slash + 1, slash + 1 + len));
            i = slash + 1 + len;
        }
        return dlist;
    }
}