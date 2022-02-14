class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        if (target < nums[low]) return low;
        if (target > nums[high]) return high + 1;
        
        while (low <= high) {
            int center = (low + high) >>> 1;
            if (nums[center] == target) return center;
            if (high - low == 1 && nums[high] > target && nums[low] < target) return high;
            if (nums[center] < target){
                low = center + 1;
            }
            if (nums[center] > target){ 
                high = center - 1;
            }
        }
        return low;
    }
}