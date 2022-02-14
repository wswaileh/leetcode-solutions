class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;
        int curr = nums.length - 1;
        while (start <= end){
            if (Math.abs(nums[start]) > Math.abs(nums[end])) {
                ans[curr] = nums[start] * nums[start];
                curr--;
                start++;
            } else {
                ans[curr] = nums[end] * nums[end];
                curr--;
                end--;
            }
            
        }
        return ans;
    }
}