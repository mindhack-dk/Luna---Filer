import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileHandling {
  public static void main(String[] args) {

    // Write to file

    File file = new File("myfile.txt"); // "src//files//myfile.txt"
    try {
      PrintStream ps = new PrintStream(file);
      ps.println("Here's my text");
      ps.println("And some more.");
      ps.println();
      ps.println("That's all, folks!");
      ps.close();
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }

    // Read file

    try {
      Scanner fileReader = new Scanner(new File("myfile.txt"));
      while(fileReader.hasNext())
        System.out.println("[" + fileReader.nextLine() + "]");
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
