public class SortExamScores {

    // Main method - Entry point of the program
    public static void main(String[] args) {
        // Initialize an array of exam scores
        int[] examScore = {78, 55, 88, 98};

        // Print the array before sorting
        printArray(examScore);

        // Call the selectionSort method to sort the exam scores
        selectionSort(examScore);

        // Print the array after sorting
        printArray(examScore);
    }

    // Method to perform Selection Sort on the array of exam scores
    public static void selectionSort(int[] scores) {
        // Outer loop for iterating through the array
        for (int i = 0; i < scores.length - 1; i++) {
            // Assume the current position as the smallest
            int small = i;

            // Inner loop to find the smallest element in the unsorted part
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[small] > scores[j]) {
                    // Update the smallest element index if a smaller value is found
                    small = j;
                }
            }

            // Swap the found smallest element with the current position
            int temp = scores[small];
            scores[small] = scores[i];
            scores[i] = temp;
        }
    }

    // Method to print the array of exam scores
    public static void printArray(int[] arr) {
        System.out.println("\nArray: ");
        // Loop through the array and print each element
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // For newline after printing the array
    }
}
