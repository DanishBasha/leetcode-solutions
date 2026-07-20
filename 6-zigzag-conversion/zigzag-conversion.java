class Solution {
    private int currIndex = 0;
    public String convert(String s, int numRows) {
      StringBuilder sb = new StringBuilder();
      if(s.length()==1 || numRows == 1){
        return s;
      }
      for (int row = 0;row<numRows;row++){
          currIndex = row;
          if (row == 0 || row == numRows-1){
           while (currIndex<s.length()){
             sb.append(s.charAt(currIndex));
             currIndex += 2*numRows -2; 
           }
          }
          else {
            int itr = 1;
           while (currIndex<s.length()){
             if (itr == 1){
             sb.append(s.charAt(currIndex));
             currIndex += 2*numRows -(row+1)*2;
             itr++;
             } else {
                sb.append(s.charAt(currIndex));
               currIndex += 2*row;
               itr = 1;
             }
              
           }
          }
      }
      return sb.toString();
    }
}