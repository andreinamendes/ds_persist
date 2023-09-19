package lista05.src.main.java.serialize;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import lista05.src.main.java.model.Perfil;
import lista05.src.main.java.model.Perfis;

public class Serializa {
  public void serializa(Perfil perfil1, Perfil perfil2, Perfil perfil3, Perfil perfil4, Perfil perfil5, File file){
    Perfis perfis = new Perfis(List.of(perfil1, perfil2, perfil3, perfil4, perfil5));

    try{
      FileOutputStream fileOut = new FileOutputStream(file);
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(perfis);
      out.close();
      fileOut.close();
      System.out.printf("Serializado");
    }catch(IOException err){
      err.printStackTrace();
    }
  }
}