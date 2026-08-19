public class second_larget {
    public static void main(String[] args) {

        // Example array — we want to find the 1st and 2nd largest values
        int[] arr = {1, 2, 3, 4, 5};

        // ── STEP 1: Find the largest element ────────────────────────────────

        // Start with the smallest possible integer so ANY array value will
        // beat it on the very first comparison
        int max = Integer.MIN_VALUE;

        // This flag tracks whether every element in the array is the same.
        // If all elements are identical (e.g. {3,3,3}), there is no second largest.
        boolean identicalEle = true;

        for (int i = 0; i < arr.length; i++) {

            // If the current element is bigger than 'max', it becomes the new max
            if (arr[i] > max) {
                max = arr[i];
            }

            // From the second element onward, check if this element differs from the previous one.
            // If even one pair of neighbours differs, the array is NOT fully identical.
            if (i > 0 && arr[i] != arr[i - 1]) {
                identicalEle = false;
            }
        }

        // ── STEP 2: Find the second largest element ──────────────────────────

        // Again start with the smallest possible integer
        int secondMax = Integer.MIN_VALUE;

        for (int value : arr) {
            // We want a value that is:
            //   • strictly less than the largest  (so it's NOT the max itself)
            //   • strictly greater than the current secondMax (so we pick the best candidate)
            if (value < max && value > secondMax) {
                secondMax = value;
            }
        }

        // ── STEP 3: Handle edge case & print results ─────────────────────────

        // If all elements were the same, a second largest does not exist
        if (identicalEle) {
            System.out.println("Second largest element does not exist.");
            return;
        }

        // Print the results
        System.out.println("Largest element: " + max);
        System.out.println("Second largest element: " + secondMax);
    }
}
