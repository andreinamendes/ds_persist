import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Q1 {
  public static void main(String[] args){
    try {
      long start = System.currentTimeMillis();
      FileOutputStream is = new FileOutputStream(args[1]);

      byte[] bytes = Files.readAllBytes(Paths.get(args[0]));
      is.write(bytes);

      is.close();

      long end = System.currentTimeMillis();
      long final_time = end - start;
      System.out.println("Time to write: " + final_time);
    } catch (IOException e) {
      System.err.println("File writing failed.");
      e.printStackTrace();
    }
  }
}