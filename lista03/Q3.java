package lista03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class Q3 {
  // 3. Escreva um arquivo de propriedades Java via editor de textos. Esse arquivo deve ter os dados de chave e valor. Exemplo:

  //   -> arquivo config.properties
  //      - arquivo = meu_arquivo.txt
  //      - linha_inicial = 1
  //      - linha_final = 3
  //   -> Depois, escreva uma classe Java que exibe da linha_inicial até a linha_final do arquivo, conforme definidos no arquivo de propriedades config.properties.

  public static void main(String[] args) throws IOException {
    Properties prop = new Properties();
    String file = new String();
    int start = 0;
    int end = 0;

    try {
      prop.load(new FileInputStream("config.properties"));

      file = prop.getProperty("arquivo");
      start = Integer.parseInt(prop.getProperty("linha_inicial"));
      end = Integer.parseInt(prop.getProperty("linha_final"));
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    InputStream is = new FileInputStream(file);
    InputStreamReader isr = new InputStreamReader(is);
    BufferedReader br = new BufferedReader(isr);
    String s = br.readLine();

    for(int a = 0; a < start-1; a++) {
      s = br.readLine();
    }

    for(int a = start; a < end - 1; a++){
      s = br.readLine();
      System.out.println(s);
    }
  }
}
