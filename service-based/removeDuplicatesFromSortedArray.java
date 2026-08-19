class Solution {
    public int removeDuplicatesFromSortedArray(int[] nums) {
         int left = 0;
         int right = 1;

         while(right<nums.length){
            
            if(nums[left]!=nums[right] && nums[left] < nums[right]){
                     int swapIndex = left + 1;
                     int temp = nums[swapIndex];
                     nums[swapIndex] = nums[right];
                     nums[right] = temp;

                     left = swapIndex;
            }

            right++;

         }
         return ++left;
    }
}