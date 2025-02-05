

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ReadUserInput {
    public static void main(String[] args) {
        String filePath = "C:/Gautam/Week-3/Day_4/FileReaderAndBuffferReader/newFile.txt/";

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
            FileWriter fw = new FileWriter(filePath, true);
        ) {
            String line;
            System.out.println("Enetr text to write to the file and type exit to exit");
            while (!(line = br.readLine()).equalsIgnoreCase("exit")){
                fw.write(line+System.lineSeparator());
            }
            System.out.println("input saved to file " + filePath);
        }catch (IOException e){
            System.err.println("error handling file " + e.getMessage());
        }

    }
}