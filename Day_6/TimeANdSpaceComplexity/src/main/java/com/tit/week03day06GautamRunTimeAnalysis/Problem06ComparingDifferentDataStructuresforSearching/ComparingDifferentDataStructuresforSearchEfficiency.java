package com.tit.week03day06GautamRunTimeAnalysis.Problem06ComparingDifferentDataStructuresforSearching;
//In This Question I used Oops concept for better presentation with real life problems

import java.util.*;

public class ComparingDifferentDataStructuresforSearchEfficiency {
    //main method
    public static void main(String[] args) {
        int dataSize = 1_000_000;
        int searchElement = 999_999;

        // Instantiate DataSearchManager to manage and encapsulate search operations
        DataSearchManager searchManager = new DataSearchManager(dataSize);

        System.out.println("Comparing Data Structure Search Performance:\n");

        // Array Search
        searchManager.performSearch(SearchType.ARRAY, searchElement);

        // HashSet Search
        searchManager.performSearch(SearchType.HASHSET, searchElement);

        // TreeSet Search
        searchManager.performSearch(SearchType.TREESET, searchElement);
    }
}

// Enum for search types
enum SearchType {
    ARRAY, HASHSET, TREESET
}

// Encapsulation of search operations in a class
class DataSearchManager {
    private final int[] dataset;
    private final HashSet<Integer> hashSet;
    private final TreeSet<Integer> treeSet;

    public DataSearchManager(int size) {
        dataset = generateDataset(size);
        hashSet = new HashSet<>();
        treeSet = new TreeSet<>();
        initializeDataStructures();
    }

    private int[] generateDataset(int size) {
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = i;
        }
        return data;
    }

    private void initializeDataStructures() {
        for (int num : dataset) {
            hashSet.add(num);
            treeSet.add(num);
        }
    }

    public void performSearch(SearchType searchType, int element) {
        switch (searchType) {
            case ARRAY -> searchInArray(element);
            case HASHSET -> searchInHashSet(element);
            case TREESET -> searchInTreeSet(element);
        }
    }

    private void searchInArray(int element) {
        long startTime = System.nanoTime();
        boolean found = false;
        for (int num : dataset) {
            if (num == element) {
                found = true;
                break;
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Array Search Time: " + (endTime - startTime) / 1_000_000.0 + " ms");
    }

    private void searchInHashSet(int element) {
        long startTime = System.nanoTime();
        boolean found = hashSet.contains(element);
        long endTime = System.nanoTime();
        System.out.println("HashSet Search Time: " + (endTime - startTime) / 1_000_000.0 + " ms");
    }

    private void searchInTreeSet(int element) {
        long startTime = System.nanoTime();
        boolean found = treeSet.contains(element);
        long endTime = System.nanoTime();
        System.out.println("TreeSet Search Time: " + (endTime - startTime) / 1_000_000.0 + " ms");
    }
}
