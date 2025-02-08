package com.tit.week03day06GautamRunTimeAnalysis.Problem03StringConcatenationPerformance;

public class StringConcatenationPerformance {
    public static void main(String[] args) {
        int[] iterations ={1000, 100000,1_000_00};
        for(int iteration : iterations){
            System.out.println("Comparing String concatenation performance of data Set size  " + iteration);
            

            long concatenateStringStart = System.nanoTime();
            concatenateWithString(iteration);
            long concatenateStringEnd = System.nanoTime();
            System.out.println("String Concatenate Time: "+ (concatenateStringEnd-concatenateStringStart)/1_000_000.0+ " ms");



            long concatenateStringBuilderStart = System.nanoTime();
            concatenateWithStringBuilder(iteration);
            long concatenateStringBuilderEnd = System.nanoTime();
            System.out.println("String Builder Concatenate Time: "+ (concatenateStringBuilderEnd-concatenateStringBuilderStart)/1000_000.0+ " ms");



            long concatenateStringBufferStart = System.nanoTime();
            concatenateWithStringBuffer(iteration);
            long concatenateStringBufferEnd = System.nanoTime();
            System.out.println("String Buffer Concatenate Time: "+ (concatenateStringBufferEnd-concatenateStringBufferStart)/1000_000.0+ " ms");
            System.out.println();
        }

    }
    public static void concatenateWithString(int element){
        String result ="";
        for(int i = 0; i< element;  i++){
            result += "a";
        }
    }
    public static void concatenateWithStringBuilder(int element){
        StringBuilder result = new StringBuilder();
        for(int i=0; i<element; i++){
            result.append("a");
        }
}
    public static void concatenateWithStringBuffer(int element){
        StringBuffer result = new StringBuffer();
        for(int i = 0; i< element; i++){
            result.append("a");
        }
    }
}
