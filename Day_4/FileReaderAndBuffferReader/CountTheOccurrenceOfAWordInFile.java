import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountTheOccurrenceOfAWordInFile {
    public static void main(String[] args) {
        int count = 0;
        String targetWord = "abs";
        // Adding file path
        String filePath = "C:/Gautam/Week-3/Day_4/FileReaderAndBuffferReader/newFile.txt";

        // Exception handling and reading file elements with the help of BufferedReader
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            System.out.println("Reading file line by line:");

            // Reading and processing each line until EOF
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);

                // Split line into words using regex and count occurrences
                String[] words = line.split("\\W+");
                for (String word : words) {
                    if (word.contains(targetWord)) {
                        count++;
                    }
                }
            }

            System.out.println("The word '" + targetWord + "' appears " + count + " times in the file.");
        } catch (IOException e) {
            // Exception handling
            e.printStackTrace();
        }
    }
}
