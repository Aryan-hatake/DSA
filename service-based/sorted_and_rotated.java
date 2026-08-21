class sorted_and_rotated {
    public static void main(String[] args) {

        // This counter tracks how many times we see a "drop" in the array.
        // A "drop" = a place where the current element is SMALLER than the previous one.
        // Example: [3, 4, 5, 1, 2] → drop happens between 5 and 1  (only 1 drop → valid rotation)
        // Example: [3, 1, 4, 2, 5] → drops happen at multiple places → NOT a sorted+rotated array
        int unsortedDetected = 0;

        int[] nums = {3, 4, 5, 1, 2};

        // Start from index 1 and compare each element with the one before it
        for (int i = 1; i < nums.length; i++) {

            // If current element < previous element, we found a "drop"
            // This means the sorted order was broken at this point
            if (nums[i] < nums[i - 1]) {
                unsortedDetected++;
            }
        }

        // ── Rule 1 ───────────────────────────────────────────────────────────
        // If there are MORE than 1 drop, the array cannot be a sorted+rotated array
        // Example: [3, 1, 4, 2, 5] has 2 drops — definitely not valid
        if (unsortedDetected > 1) System.out.println(false);;

        // ── Rule 2 ───────────────────────────────────────────────────────────
        // If there is exactly 1 drop, we need one more check:
        // In a properly rotated sorted array, the last element must be <= the first element
        // because the array "wraps around".
        // Example: [3, 4, 5, 1, 2] → first=3, last=2 → last < first → VALID ✓
        // Example: [2, 3, 1, 4, 5] → first=2, last=5 → last > first → INVALID ✗
        //          (only one drop at index 2, but the wrap-around condition fails)
        if (unsortedDetected == 1 && nums[0] < nums[nums.length - 1]) System.out.println(false);;

        // If we reach here, the array is either:
        //   • Already fully sorted (0 drops, and the wrap-around condition is fine), OR
        //   • A sorted array that has been rotated exactly once (1 drop, last <= first)
        System.out.println(true);;
    }
}