package com.tit.week03day06GautamRunTimeAnalysis.Problem06RecursivevsIterativeFibonacciComputation;

import java.util.Scanner;

public class RecursiveVSIterativeFibonacciComputation {
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking user input
        System.out.println("Enter Number for fibonacci");
        //Recursive method take more than 1 hour for greater than 50 num value
        int num = sc.nextInt();
//checking Fibonacci using Iterative method
        long fibonacciIterativeStart = System.nanoTime();
        fibonacciIterative(num);
        long fibonacciIterativeEnd = System.nanoTime();
        System.out.println("Fibonacci Iterative Time: "+ (fibonacciIterativeEnd-fibonacciIterativeStart)/1000_000.0+ " ms");
//checking Fibonacci using Recursive method
        long fibonacciRecursiveStart = System.nanoTime();
        fibonacciRecursive(num);
       long fibonacciRecursiveEnd = System.nanoTime();
        System.out.println("Fibonacci Recursive Time: "+ (fibonacciRecursiveEnd-fibonacciRecursiveStart)/1000_000.0+ " ms");



    }
    //Method to find Fibonacci using Recursion
    private static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);

    }
    // Method to find Fibonacci using Iteration
    private static int fibonacciIterative(int n){
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;

    }
}
