package lista04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Q1 {
  // 1. Crie uma aplicação em Java que recebe via linha de comando
  //    (1) o nome de um arquivo compactado a ser criado e
  //    (2) uma pasta.
  // Compactar todos os arquivos e subpastas em um arquivo compactado com extensão zip.

  public static ArrayList<File> filesList(String sourcePath) throws IOException {
    File dir = new File(sourcePath);
    ArrayList<File> files = new ArrayList<File>();

    for(File file : dir.listFiles()){
      if(!file.isFile()) {
        files.addAll(filesList(file.getPath()));
      }else if(file.getName() != dir.getName()){
        files.add(file);
      }
    }

    return files;
  }

  public static void main(String[] args) throws IOException {
    InputStream is = System.in;
    InputStreamReader isr = new InputStreamReader(is);
    BufferedReader br = new BufferedReader(isr);
    String outputFile = br.readLine ();
    String sourcePath = br.readLine ();

    ArrayList<File> files = filesList(sourcePath);

    FileOutputStream fos = new FileOutputStream(outputFile);
    ZipOutputStream zos = new ZipOutputStream(fos);
    
    for(File file: files){
      System.out.println(file.getName());
      ZipEntry ze = new ZipEntry(file.getName());
      zos.putNextEntry(ze);

      FileInputStream fis = new FileInputStream(file);
      byte[] buffer = new byte[1024];
      int len;

      while ((len = fis.read(buffer)) > 0) {
          zos.write(buffer, 0, len);
      }
      
      zos.closeEntry();
      fis.close();
    }

    zos.close();
    fos.close();
  }
}