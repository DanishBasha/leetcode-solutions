class Solution {
    public boolean isPalindrome(int x) {
     int newNum = 0;
     int copy = x;
     if (x<0) return false;
     while(copy>0){
        newNum = newNum*10 + copy%10;
        copy = copy/10;
     }
     return (x == newNum);   
    }
}
