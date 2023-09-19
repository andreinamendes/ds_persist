package lista05.src.main.java.serialize;

import java.io.File;

import lista05.src.main.java.model.Perfis;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class DesserializaXML {
  public void desserializaXML(File file){
    XmlMapper xmlMapper = new XmlMapper();
    Perfis perfis = xmlMapper.readValue(file, perfis);

    System.out.println(perfis.toString());
  }
}