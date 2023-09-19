package lista04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class Q4 {
  // 4. Crie uma aplicação em Java que recebe via linha de comando o nome de um
  // arquivo para geração/armazenamento dos hashes md5, sha1 e sha256 do arquivo especificado.
  // A aplicação deve mostrar o tempo de execução de cada uma dessas operações.
  // Dica: veja o seguinte tutorial: MD5 Hashing in Java | Baeldung

  public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
    InputStream is = System.in;
    InputStreamReader isr = new InputStreamReader(is);
    BufferedReader br = new BufferedReader(isr);
    String file = br.readLine ();

    Map<String, MessageDigest> hashes = new HashMap<String, MessageDigest>();

    hashes.put("md5", MessageDigest.getInstance("MD5"));
    hashes.put("sha1", MessageDigest.getInstance("SHA-1"));
    hashes.put("sha256", MessageDigest.getInstance("SHA-256"));

    for(String hash: hashes.keySet()){
      long start = System.currentTimeMillis();
      byte[] result = hashes.get(hash).digest(file.getBytes());
      long end = System.currentTimeMillis();
      long final_time = end - start;

      System.out.println(hash + ": " + final_time + "ms.");
    }
  }
}
