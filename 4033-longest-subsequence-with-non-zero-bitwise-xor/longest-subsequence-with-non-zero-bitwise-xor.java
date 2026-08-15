class Solution {
    public int longestSubsequence(int[] nums) {
        int len = nums.length;
        int [] zero = new int [len];
        Arrays.fill(zero,0);
        if (Arrays.equals(nums,zero)){
            return 0;
        }
        int x  = 0;
        for (int num : nums){
            x ^= num;
        }
        return (x!=0) ? len : len-1;
    }
}