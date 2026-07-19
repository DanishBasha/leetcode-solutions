class Solution {
    public int numSubarrayWithLessSum(int [] nums,int goal){
        int sum = 0;
        int left = 0;
        int right = 0;
        int count = 0;
        while (right<nums.length){
            if (goal< 0) return 0;
            sum += nums[right];
            while (sum > goal){
                sum = sum - nums[left];
                left = left+1;
            }
            count = count + (right-left+1);
            right = right+1;
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
      return numSubarrayWithLessSum(nums,goal)-numSubarrayWithLessSum(nums,goal-1);
    }
}