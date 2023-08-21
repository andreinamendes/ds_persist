package ds_persist.lista01;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Q1 {
  public static void main(String[] args) throws IOException {
    InputStream is = new FileInputStream(args[0]);
    InputStreamReader isr = new InputStreamReader(is);
    BufferedReader br = new BufferedReader(isr);
    String s = br.readLine();

    for(int a = 0; a < 10; a++) {
      System.out.println(s);
      s = br.readLine();
    }

    br.close();
  }
}