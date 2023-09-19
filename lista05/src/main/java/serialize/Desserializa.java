package lista05.src.main.java.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import lista05.src.main.java.model.Perfis;

public class Desserializa {
  public void desserializa(File file){
    Perfis perfis = null;

    try {
      FileInputStream fileIn = new FileInputStream(file);
      ObjectInputStream in = new ObjectInputStream(fileIn);
      perfis = (Perfis) in.readObject();
      in.close();
      fileIn.close();
    }catch(Exception err) {
      System.out.println(err);
    }

    System.out.println(perfis.toString());
  }
}