class Solution {
    public int removeDuplicatesFromSortedArray(int[] nums) {

        // We use TWO pointers:
        // 'left' points to the last position of a confirmed unique element
        // 'right' scans ahead looking for the next new (different) element
        int left = 0;
        int right = 1;

        // Keep going until 'right' goes past the end of the array
        while (right < nums.length) {

            // Check if the element at 'right' is different from the element at 'left'
            // AND since the array is sorted, right element must be greater than left
            // This means we found a new unique element!
            if (nums[left] != nums[right] && nums[left] < nums[right]) {

                // Place the new unique element right after the current last unique position
                // i.e., swap nums[left+1] with nums[right]
                int swapIndex = left + 1;
                int temp = nums[swapIndex];
                nums[swapIndex] = nums[right];
                nums[right] = temp;

                // Move 'left' forward — our unique section just grew by one
                left = swapIndex;
            }

            // Always move 'right' forward to check the next element
            right++;
        }

        // 'left' is currently at the index of the last unique element (0-based)
        // So the total count of unique elements = left + 1
        // We return ++left which is the same as (left + 1)
        return ++left;
    }
}