import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;

class ReadFileExampleWithScanner {
    public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Enter file name");
        String fileName = scanner.nextLine();

        FileReader fileReader = new FileReader(fileName);
        Scanner fileScanner = new Scanner(fileReader);

        while(fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            System.out.println(line);
        }

        fileScanner.close();
    } catch (FileNotFoundException fnfe) {
        System.err.println("Error reading file: " + fnfe.getMessage());
    } 
        
    }
}