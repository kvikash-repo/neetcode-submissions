class Solution {
    public boolean isPalindrome(String s) {
        char[] ca = s.toCharArray();
        int len = s.length();
        int j = len-1;
        for(int i=0;i<len/2;){
            if(!isAlphaNumeric(ca[i])){
                i++;
                continue;
            }
            if(!isAlphaNumeric(ca[j])){
                j--;
                continue;
            }
            if(Character.toLowerCase(ca[i]) != Character.toLowerCase(ca[j]))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public boolean isAlphaNumeric(char ch){
               int ascii = (int) ch;
        if((48<=ascii && ascii<=57) || (65<=ascii && ascii<=90) || (97<=ascii && ascii<=122))
            return true;
        else
            return false;
    }
}
