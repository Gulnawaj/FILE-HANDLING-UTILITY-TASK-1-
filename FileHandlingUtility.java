import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
                            //THIS IS THE CODE OF OUR FIRST TASK(file handling utilty)
public class FileHandlingUtility {

    public static void main(String[] args) {
        String fileName = "example.txt";

        //Create a new file and write some text to it
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, I am GULNAWAJ and  this is the first line.\n");
            writer.write("This is the second line.\n");
            writer.close();
            System.out.println("File created and written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Read the content of the file and display it
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            System.out.println("\nReading the file content:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        //Append new text to the existing file
        try {
            FileWriter writer = new FileWriter(fileName, true); 
            writer.write("This is the new line added.\n");
            writer.close();
            System.out.println("\nNew line appended successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while modifying the file.");
            e.printStackTrace();
        }

        //Confirm the modification
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            System.out.println("\nReading the modified file content:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the modified file.");
            e.printStackTrace();
        }
    }
}
