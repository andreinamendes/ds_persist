package lista05.src.main.java.serialize;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.XmlMapper;

import lista05.src.main.java.model.Perfil;
import lista05.src.main.java.model.Perfis;

public class SerializaJSON {
  public void serializaJSON(Perfil perfil1, Perfil perfil2, Perfil perfil3, Perfil perfil4, Perfil perfil5, File file){
    Perfis perfis = new Perfis(List.of(perfil1, perfil2, perfil3, perfil4, perfil5));

    ObjectMapper xm = new ObjectMapper();
    xm.enable(SerializationFeature.INDENT_OUTPUT);
    xm.writeValue(file, perfis);
  }
}