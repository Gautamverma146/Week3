package com.tit.week03day06GautamRunTimeAnalysis.Problem04LargeFileReadingEfficiency;
// Importing IO Exception, FileOutputStream, PrintWriter
import java.io.*;

public class LargeFileReadingEfficiency {
    //Main method
    public static void main(String[] args) {
        //Adding file Path of my local file
        String filepath = "C:/Gautam/Week-3/Day_6/TimeANdSpaceComplexity/src/main/java/com/tit/week03day06GautamRunTimeAnalysis/Problem04LargeFileReadingEfficiency/example.txt";
        System.out.println("Compare large File reading Performance ");
    // checking File reader
        long filerReaderStart = System.nanoTime();
        readFileUsingFileReader(filepath);
        long fileReaderEnd = System.nanoTime();
        System.out.println("File Reader Time: "+ (fileReaderEnd-filerReaderStart)/1000_000.0+ " ms");

        //Checking Time taken by Input Stream Reader

        long inputStreamReaderStart = System.nanoTime();
        readUsingInputStreamReader(filepath);
        long inputStreamReaderEnd = System.nanoTime();
        System.out.println("Input Stream Reader Time: "+ (inputStreamReaderEnd-inputStreamReaderStart)/1000_000.0+ " ms");
    }
            // Method to read File using File Reader
    public static void readFileUsingFileReader( String filepath) {
        try(FileReader fileReader = new FileReader(filepath)){
            int data;
            while((data = fileReader.read()) != -1){
                //dummy processing
            }
        }
        //Handling Exception
        catch (IOException e){
            e.printStackTrace();
        }

}
    // Method to read File using Input Stream Reader
public static void readUsingInputStreamReader(String filepath){
        try(InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filepath))){
            int data;
            while((data = inputStreamReader.read()) != -1){
                //dummy processing

            }
        }
        //Handling Exception
        catch (IOException e){
            e.printStackTrace();
        }
}
}
