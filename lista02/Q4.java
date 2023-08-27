import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Q4 {
  public static void writeFile(String text, String out_file) {
    try {
      OutputStream os = new FileOutputStream(out_file);
      OutputStreamWriter osw = new OutputStreamWriter(os);
      BufferedWriter bw = new BufferedWriter(osw);

      bw.write(text);
      bw.newLine();
      bw.close();

    } catch (IOException e) {
      System.err.println("File writing failed.");
      e.printStackTrace();
    }
  }
  
  public static void main(String[] args) throws IOException {
    InputStream is = System.in;
    InputStreamReader isr = new InputStreamReader(is);
    BufferedReader br = new BufferedReader(isr);
    String s = br.readLine() + '\n';
    String a = null;
    
    while (!(a = br.readLine()).equals("FIM")) {
      s += a + '\n';
    }

    String destiny = br.readLine();
    writeFile(s, destiny);
  }
}