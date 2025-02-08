package com.tit.week03day06GautamRunTimeAnalysis.Problem03StringConcatenationPerformance;

public class StringConcatenationPerformance {
    //Main method
    public static void main(String[] args) {
        //Array for 3 Operation counts
        int[] iterations ={1000, 100000,1_000_00};
        //New for loop for taking one by one operation count
        for(int iteration : iterations){
            System.out.println("Comparing String concatenation performance of data Set size  " + iteration);

// checking String time for concatenate 3 operation counts
            long concatenateStringStart = System.nanoTime();
            concatenateWithString(iteration);
            long concatenateStringEnd = System.nanoTime();
            System.out.println("String Concatenate Time: "+ (concatenateStringEnd-concatenateStringStart)/1_000_000.0+ " ms");


// checking String Builder concatenation time for 3 operations
            long concatenateStringBuilderStart = System.nanoTime();
            concatenateWithStringBuilder(iteration);
            long concatenateStringBuilderEnd = System.nanoTime();
            System.out.println("String Builder Concatenate Time: "+ (concatenateStringBuilderEnd-concatenateStringBuilderStart)/1000_000.0+ " ms");


// checking String buffer concatenation time for 3 operations
            long concatenateStringBufferStart = System.nanoTime();
            concatenateWithStringBuffer(iteration);
            long concatenateStringBufferEnd = System.nanoTime();
            System.out.println("String Buffer Concatenate Time: "+ (concatenateStringBufferEnd-concatenateStringBufferStart)/1000_000.0+ " ms");
            System.out.println();
        }

    }
    //method to concatenate String
    public static void concatenateWithString(int element){
        String result ="";
        for(int i = 0; i< element;  i++){
            result += "a";
        }
    }
    //method to concatenate String Using String Builder
    public static void concatenateWithStringBuilder(int element){
        StringBuilder result = new StringBuilder();
        for(int i=0; i<element; i++){
            result.append("a");
        }
}
// Method to Concatenate String Using String Buffer
    public static void concatenateWithStringBuffer(int element){
        StringBuffer result = new StringBuffer();
        for(int i = 0; i< element; i++){
            result.append("a");
        }
    }
}
