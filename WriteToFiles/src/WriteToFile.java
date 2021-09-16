import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in java might be tricky, but it is fun enough");
            myWriter.close();
            System.out.println("Successfully wrote to the file");
        }   catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace(); // printStackTrace() helps the programmer to understand where
                                 // the actual problem occurred. This method prints the same message
                                 // of e object and also the line number where the exception occurred

        }
    }
}
