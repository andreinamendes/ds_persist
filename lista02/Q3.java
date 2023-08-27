import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Q3 {
  public static String readFile(String origin) {
    String strUTF8 = null;
    
    try {
      FileInputStream file = new FileInputStream(origin);
      InputStreamReader isr = new InputStreamReader(file, "ISO-8859-1");
      BufferedReader br = new BufferedReader(isr);
      
      strUTF8 = null;
      String strISO = br.readLine();

      while (strISO != null) {
        byte[] isoBytes = strISO.getBytes("ISO-8859-1");

        String value = new String(isoBytes, "UTF-8"); 
        if(strUTF8 == null){
          strUTF8 = value;
        }else{
          strUTF8 += value;       
        }
        strISO = br.readLine();
      }
      br.close(); 
    } catch (IOException e) {
      System.err.println("File opening failed.");
      e.printStackTrace();
    }

    return strUTF8;
  }

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

  public static void main(String[] args){
    writeFile(readFile(args[0]), args[1]);
  }
}
