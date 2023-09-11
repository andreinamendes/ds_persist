import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Q3 {
  public static void main(String[] args){    
    try {
      FileInputStream file = new FileInputStream(args[0]);
      InputStreamReader isr = new InputStreamReader(file, "ISO-8859-1");
      BufferedReader br = new BufferedReader(isr);
      String s = br.readLine();

      PrintStream ps = new PrintStream(args[1]);

      while (s != null) {
        try {
            s = new String(s.getBytes("ISO-8859-1"), "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            System.out.println("Encoding conversion filed.");
        }

        ps.println(s);
        s = br.readLine();
      }

      br.close();
      ps.close();
    } catch (IOException e) {
      System.err.println("File opening failed.");
      e.printStackTrace();
    }
  }
}
