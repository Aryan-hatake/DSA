class largest_ele {
    public static void main(String[] args) {

        // We have an array of integers
        int[] arr = {1, 2, 3, 4, 5};

        // Start by assuming the largest value is 0
        // We'll update this as we scan through the array
        int max = 0;

        // 'i' is our index — it points to the current element we're checking
        int i = 0;

        // Keep looping until we've looked at every element in the array
        while (i < arr.length) {

            // If the current element is bigger than what we think is the max,
            // update 'max' to this new bigger value
            if (arr[i] > max) {
                max = arr[i];
            }

            // Move to the next element
            i++;
        }

        // After checking all elements, 'max' holds the largest value
        System.out.print(max);
    }
}
