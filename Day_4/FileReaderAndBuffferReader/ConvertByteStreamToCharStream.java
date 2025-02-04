import java.io.*;

public class ConvertByteStreamToCharStream {
    public static void main(String[] args) {
        // Replace with the path to your file
        String filePath = "C:/Gautam/Week-3/Day_4/FileReaderAndBuffferReader/newFile.txt/";

        try (
                //  Create a FileInputStream to read binary data from the file
                FileInputStream fileInputStream = new FileInputStream(filePath);

                //  Wrap the FileInputStream with InputStreamReader to convert bytes to characters
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");

                //  Use BufferedReader for efficient reading
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader)
        ) {
            String line;
            System.out.println("Contents of the file:");

            // Step 4: Read and print lines until EOF
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        } catch (UnsupportedEncodingException e) {
            System.out.println("Unsupported encoding: UTF-8");
        } catch (IOException e) {
            System.out.println("I/O error while reading the file: " + e.getMessage());
        }
    }
}
