package com.tit.week03day06GautamRunTimeAnalysis.Problem01.SearchingTarget;

public class SearchTargetInALargeDataset {
    public static void main(String[] args) {
        int[] dataSet = new int[100];
        int[] mediumDataSet = new int[1000];
        int[] largeDataSet = new int[100000];
        int targetForSmallDataSet = 99;
        int targetForMediumDataSet = 999;
        int targetForLargeDataSet = 99999;

        // Initialize datasets
        for (int i = 0; i < dataSet.length; i++) {
            dataSet[i] = i + 1;
        }
        for (int i = 0; i < mediumDataSet.length; i++) {
            mediumDataSet[i] = i + 1;
        }
        for (int i = 0; i < largeDataSet.length; i++) {
            largeDataSet[i] = i + 1;
        }

        // Perform and compare searches
        System.out.println("Small Dataset:");
        compareSearches(dataSet, targetForSmallDataSet);

        System.out.println("\nMedium Dataset:");
        compareSearches(mediumDataSet, targetForMediumDataSet);

        System.out.println("\nLarge Dataset:");
        compareSearches(largeDataSet, targetForLargeDataSet);
    }
// method  to compare linear search and binrary search
    private static void compareSearches(int[] dataSet, int target) {
        // Linear Search
        long linearTimeStart = System.nanoTime();
        int linearIndex = linearSearch(dataSet, target);
        long linearTimeEnd = System.nanoTime();
        System.out.println("Linear Search Time: " + (linearTimeEnd - linearTimeStart)/1000_000.0 + " ms");
        System.out.println("Linear Search Result: Index " + linearIndex);

        // Binary Search
        long binaryStart = System.nanoTime();
        int binaryIndex = binarySearch(dataSet, target);
        long binaryEnd = System.nanoTime();
        System.out.println("Binary Search Time: " + (binaryEnd - binaryStart)/1000_000.0 + " ms");
        System.out.println("Binary Search Result: Index " + binaryIndex);
    }
   // search index through linear search approach
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
          //Method to search index through binary search approach
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
