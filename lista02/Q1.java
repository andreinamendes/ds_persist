import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Q1 {
  public static ArrayList<String> readFile(String in_file) {
    ArrayList<String> text = new ArrayList<String>();

    try {
      long start = System.currentTimeMillis();
      InputStream is = new FileInputStream(in_file);
      InputStreamReader isr = new InputStreamReader(is);
      BufferedReader br = new BufferedReader(isr);
      String s = br.readLine();

      while (s != null) {
        text.add(s);
        s = br.readLine();
      }

      br.close();

      long end = System.currentTimeMillis();
      long final_time = end - start;
      System.out.println("Time to read: " + final_time);
    } catch (IOException e) {
      System.err.println("File opening failed.");
      e.printStackTrace();
    }

    return text;
  }

  public static void writeFile(ArrayList<String> text, String out_file) {
    try {
      long start = System.currentTimeMillis();
      OutputStream os = new FileOutputStream(out_file);
      OutputStreamWriter osw = new OutputStreamWriter(os);
      BufferedWriter bw = new BufferedWriter(osw);

      for (int a = 0; a < text.size(); a++) {
        bw.write(text.get(a));
        if (a < text.size() - 1) {
          bw.newLine();
        }
      }

      bw.close();

      long end = System.currentTimeMillis();
      long final_time = end - start;
      System.out.println("Time to write: " + final_time);
    } catch (IOException e) {
      System.err.println("File writing failed.");
      e.printStackTrace();
    }
  }

  public static void main(String[] args) throws IOException {
    writeFile(readFile(args[0]), args[1]);
  }
}