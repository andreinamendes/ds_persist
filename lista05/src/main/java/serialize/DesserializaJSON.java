package lista05.src.main.java.serialize;

import java.io.File;

import lista05.src.main.java.model.Perfis;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DesserializaJSON {
  public void desserializaJSON(File file){
    ObjectMapper objMapper = new ObjectMapper();
    Perfis perfis = objMapper.readValue(file, perfis);

    System.out.println(perfis.toString());
  }
}
