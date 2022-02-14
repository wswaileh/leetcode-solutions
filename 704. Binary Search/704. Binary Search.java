class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        if (target < nums[left]) return -1;
        if (target > nums[right]) return -1;
        
        while (left <= right) {
            if (nums[left] == target) return left;
            if (nums[right] == target) return right;
            int center = (left + right) / 2;
            if (nums[center] == target) return center;
            
            if (nums[center] > target) {
                right = center - 1;    
            }  else if (nums[center] < target) {
                left = center + 1;
            }
        }
        return -1;
    }
}