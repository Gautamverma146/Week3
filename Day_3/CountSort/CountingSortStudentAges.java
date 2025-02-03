public class CountingSortStudentAges {

    public static void main(String[] args) {
        // Array of student ages ranging from 10 to 18
        int[] studentAges = {12, 15, 10, 14, 13, 15, 18, 17, 12, 14};

        System.out.println("Original Student Ages:");
        printArray(studentAges);

        // Sort the ages using Counting Sort
        countingSort(studentAges, 10, 18);

        System.out.println("\nSorted Student Ages:");
        printArray(studentAges);
    }

    // Count Sort function
    public static void countingSort(int[] arr, int minAge, int maxAge) {
        int range = maxAge - minAge + 1;

        // count array to store the frequency of each age
        int[] count = new int[range];

        //  Count the occurrences of each element
        for (int age : arr) {
            count[age - minAge]++;
        }

        //  Compute cumulative frequencies
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Step 4: Place elements in their correct positions in the output array
        int[] sortedArray = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int age = arr[i];
            sortedArray[count[age - minAge] - 1] = age;
            count[age - minAge]--;
        }


        System.arraycopy(sortedArray, 0, arr, 0, arr.length);
    }


    public static void printArray(int[] arr) {
        for (int age : arr) {
            System.out.print(age + " ");
        }
        System.out.println();
    }
}
