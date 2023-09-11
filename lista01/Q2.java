package lista01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Q2 {
  public static void main(String[] args) throws IOException {
    InputStream arq = new FileInputStream(args[0]);
    InputStreamReader isr = new InputStreamReader(arq);
    BufferedReader br = new BufferedReader(isr);
    String s = br.readLine();
    String str = args[1];

    while(s != null) {
      if(s.contains(str)){
        System.out.println(s);
      }
      s = br.readLine();
    }

    br.close();
  }
}