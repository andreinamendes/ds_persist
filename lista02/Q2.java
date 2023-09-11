import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Q2 {
  public static void main(String[] args) throws IOException{
    try{
      long start = System.currentTimeMillis();
      InputStream is = new FileInputStream(args[0]);
      InputStreamReader isr = new InputStreamReader(is);
      BufferedReader br = new BufferedReader(isr);
      OutputStream os = new FileOutputStream(args[1]);
      OutputStreamWriter osw = new OutputStreamWriter(os);
      BufferedWriter bw = new BufferedWriter(osw);
      String s = br.readLine();

      while(s != null) {
        bw.write(s);
        bw.newLine();
        s = br.readLine();
      }

      br.close();
      bw.close();

      long end = System.currentTimeMillis();
      long final_time  = end - start;
      System.out.println("Time to read: " + final_time);
    }catch(IOException e) {
      System.err.println("File opening failed.");
      e.printStackTrace();
    }
  }
}