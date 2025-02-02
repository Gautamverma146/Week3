public class QuickSortProductPrices {

    public static void main(String[] args) {
        // Array of product prices
        int[] productPrices = {700, 200, 500, 300, 100, 600};

        // Display original product prices
        System.out.println("Original Product Prices:");
        printArray(productPrices);

        // Sort the array using Quick Sort
        quickSort(productPrices, 0, productPrices.length - 1);

        // Display sorted product prices
        System.out.println("\nSorted Product Prices:");
        printArray(productPrices);
    }

    // Quick Sort function
    public static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(prices, low, high);

            // Recursively apply Quick Sort to the left and right partitions
            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    
    public static int partition(int[] prices, int low, int high) {
        int pivot = prices[high]; // Choosing the last element as the pivot
        int i = low - 1;

        // Move elements smaller than the pivot to the left
        for (int j = low; j < high; j++) {
            if (prices[j] < pivot) {
                i++;
                // Swap prices[i] and prices[j]
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // Swap the pivot element to its correct position
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }


    public static void printArray(int[] arr) {
        for (int price : arr) {
            System.out.print(price + " ");
        }
        System.out.println();
    }
}
