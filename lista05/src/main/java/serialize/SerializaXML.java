package lista05.src.main.java.serialize;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import lista05.src.main.java.model.Perfil;
import lista05.src.main.java.model.Perfis;

public class SerializaXML {
  public File serializaXML(Perfil perfil1, Perfil perfil2, Perfil perfil3, Perfil perfil4, Perfil perfil5, File file){
    Perfis lista = new Perfis(List.of(perfil1, perfil2, perfil3, perfil4, perfil5));

    XmlMapper xm = new XmlMapper();
    xm.enable(SerializationFeature.INDENT_OUTPUT);
    xm.writeValue(file, perfis);
  }
}