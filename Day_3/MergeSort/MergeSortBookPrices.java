public class MergeSortBookPrices {

    public static void main(String[] args) {
        // Array of book prices
        int[] bookPrices = {300, 150, 450, 200, 100, 500};

        System.out.println("Original Book Prices:");
        printArray(bookPrices);

        // Sort the array using Merge Sort
        mergeSort(bookPrices, 0, bookPrices.length - 1);

        System.out.println("\nSorted Book Prices:");
        printArray(bookPrices);
    }

    // Recursive Merge Sort method
    public static void mergeSort(int[] prices, int left, int right) {
        if (left < right) {
            // Find the middle index
            int mid = left + (right - left) / 2;

            // Recursively sort the left half
            mergeSort(prices, left, mid);

            // Recursively sort the right half
            mergeSort(prices, mid + 1, right);

            // Merge the sorted halves
            merge(prices, left, mid, right);
        }
    }

    // Merge function to combine sorted halves
    public static void merge(int[] prices, int left, int mid, int right) {
        // Sizes of the two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays to hold the sorted elements
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = prices[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = prices[mid + 1 + j];
        }

        // Merge the temporary arrays back into the original array
        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                prices[k] = leftArray[i];
                i++;
            } else {
                prices[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray, if any
        while (i < n1) {
            prices[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray, if any
        while (j < n2) {
            prices[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Utility method to print the array
    public static void printArray(int[] arr) {
        for (int price : arr) {
            System.out.print(price + " ");
        }
        System.out.println();
    }
}
