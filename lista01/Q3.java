package ds_persist.lista01;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Q3 {
  public static void main(String[] args) throws IOException {
    for(int x = 0; x < 2; x++) {
      InputStream arq = new FileInputStream(args[x]);
      InputStreamReader isr = new InputStreamReader(arq);
      BufferedReader br = new BufferedReader(isr);
      String s = br.readLine();

      while(s != null) {
        System.out.println(s);
        s = br.readLine();
      }

      br.close();
    }
  }
}