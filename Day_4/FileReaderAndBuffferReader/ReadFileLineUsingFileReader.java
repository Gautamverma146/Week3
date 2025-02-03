//importing buffer reader
import java.io.BufferedReader;
//importing file reader
import java.io.FileReader;
//importing Input, output exception
import java.io.IOException;

public class ReadFileLineUsingFileReader {
    //Main method
    public static void main(String[] args) {
//adding file path
        String filePath = "C:/Gautam/Week-3/Day_4/FileReaderAndBuffferReader/newFile.txt";
//exception handlinng and reading file element with the help of buffer reader
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            System.out.println("Reading file line by line:");

            // Reading and printing each line until EOF
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            //exception handled
            e.printStackTrace();
        }
    }
}
