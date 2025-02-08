package com.tit.week03day06GautamRunTimeAnalysis.Problem02;
//importing Arrays & Random
import java.util.Arrays;
import java.util.Random;
//Main class
public class SortingLargeDataEfficiently {
    //Main method
    public static void main(String[] args) {
// creating data sets
        int[] smallDataSet = generateDataSets(1000);
        int[] mediumDataSet = generateDataSets(10000);
        int[] largeDataSet = generateDataSets(1000000);
        System.out.println("Small data Set: ");
        compareSortings(smallDataSet);
        System.out.println("Medium Data set: ");
        compareSortings(mediumDataSet);
        System.out.println("large data set:");
        compareSortings(largeDataSet);


    }
         //method to create data set randomly
    private static int[] generateDataSets(int size) {
        int[] dataSet = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            dataSet[i] = random.nextInt(1_000_000);
        }
        return dataSet;
    }
// method for compareing sorting methods
    public static void compareSortings(int[] dataset) {
        int[] copyForBubble = Arrays.copyOf(dataset, dataset.length);
        int[] copyForMerge = Arrays.copyOf(dataset, dataset.length);
        int[] copyForQuick = Arrays.copyOf(dataset,dataset.length);
        //bubble sort in large data set it may take more than 1 hour
        long bubbleStart = System.nanoTime();
        bubbleSort(copyForBubble);
        long bubbleEnd = System.nanoTime();
        System.out.println("Bubble sort time: " + (bubbleEnd - bubbleStart) / 1_000_000.0 + " ms");
        long mergeStart = System.nanoTime();
        mergeSort(copyForMerge, 0, dataset.length - 1);
        long mergeEnd = System.nanoTime();
        System.out.println("merge sort time: " + (mergeEnd - mergeStart) / 1_000_000.0 + " ms");
        long quickStart = System.nanoTime();
        quickSort(copyForQuick,0, dataset.length-1);
        long quickEnd = System.nanoTime();
        System.out.println("Quick sort Time: "+ (quickEnd-quickStart)/1000_000.0 + " ms");
    }
// method to sort using bubble sort
    private static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
// sorting using merge sort algorithm
    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }
// method to merge each element
    public static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        int i = 0;
        int j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }

    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;
    return i + 1;


    }}

