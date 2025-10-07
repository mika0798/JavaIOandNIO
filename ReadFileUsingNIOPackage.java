import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadFileUsingNIOPackage {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter file name: ");
            String fileName = scanner.nextLine();

            Path filePath = Paths.get(fileName);
            String content = Files.readString(filePath);

            System.out.println(content);

        } catch (IOException ioe) {
            System.err.println("Error reading file: " + ioe.getMessage());
        }
    }
}