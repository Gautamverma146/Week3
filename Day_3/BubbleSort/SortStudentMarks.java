public class SortStudentMarks {

    // Main method where execution starts
    public static void main(String[] args) {
        // Initialize the array of student marks
        int[] studentsMarks = {64, 33, 95, 78};

        // Call the bubbleSort method to sort the marks
        bubbleSort(studentsMarks);

        // Call the printSortedArray method to display the sorted marks
        printSortedArray(studentsMarks);
    }

    // Bubble Sort method to sort the student marks in ascending order
    public static void bubbleSort(int[] stdMarks) {
        // Outer loop for multiple passes
        for (int i = 0; i < stdMarks.length - 1; i++) {
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < stdMarks.length - 1 - i; j++) {
                // If the current element is greater than the next, swap them
                if (stdMarks[j] > stdMarks[j + 1]) {
                    // Swap logic
                    int temp = stdMarks[j];
                    stdMarks[j] = stdMarks[j + 1];
                    stdMarks[j + 1] = temp;
                }
            }
        }
    }

    // Method to print the sorted array of student marks
    public static void printSortedArray(int[] marks) {
        // Loop through each element of the array and print it
        for (int i = 0; i < marks.length; i++) {
            // Print each mark followed by a space
            System.out.print(marks[i] + " ");
        }
    }
}
