import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;

class ReadFileWithLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a file name or bye to exit");
            String input = scanner.nextLine();

            if(input.equalsIgnoreCase("bye")) {
                break;
            }

            try {
                FileReader fileReader = new FileReader(input);
                Scanner fileScanner = new Scanner(fileReader);

                while(fileScanner.hasNext()) {
                    String content = fileScanner.nextLine();
                    System.out.println(content);
                }
                fileScanner.close();

            } catch (FileNotFoundException fnfe) {
                System.err.println("Error reading file " + fnfe.getMessage());
            }

        }
        scanner.close();
        
    }
}