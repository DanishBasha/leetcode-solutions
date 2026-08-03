class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        while(start<=end){
            char cF = s.charAt(start);
            char cE = s.charAt(end);
            if(!Character.isLetterOrDigit(cF)) {
                start++;
            }else if (!Character.isLetterOrDigit(cE)){
                end--;
            }else {
                if(Character.toLowerCase(cF) != Character.toLowerCase(cE)){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}