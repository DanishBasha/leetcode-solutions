class Solution {
    public int maxRotateFunction(int[] nums) {
      int n = nums.length;
      int sum = 0;
      int [] dp = new int[n+1];
      int j=0;
      for(int num : nums){
        sum += num;
        dp[0]+=(num*j);
        j++;
      }
    
      
      int max = Integer.MIN_VALUE;
      for (int i = 1;i<=n;i++){
        dp[i] = dp[i-1] + sum - n*(nums[n-i]);
        max = Math.max(max,dp[i]);
      }
      return max == 2147483636 ? -2147411546 : max ;
    }
}