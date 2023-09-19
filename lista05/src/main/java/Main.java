package lista05.src.main.java;

import java.io.File;

import lista05.src.main.java.model.Perfil;
import lista05.src.main.java.serialize.Desserializa;
import lista05.src.main.java.serialize.DesserializaJSON;
import lista05.src.main.java.serialize.DesserializaXML;
import lista05.src.main.java.serialize.Serializa;
import lista05.src.main.java.serialize.SerializaJSON;
import lista05.src.main.java.serialize.SerializaXML;

public class Main {
    public static void main(String[] args) {
        Serializa ser = new Serializa();
        SerializaXML ser_xml = new SerializaXML();
        SerializaJSON ser_json = new SerializaJSON();

        Desserializa des = new Desserializa();
        DesserializaXML des_xml = new DesserializaXML();
        DesserializaJSON des_json = new DesserializaJSON();

        Perfil perfil1 = new Perfil("dreinamd", "12345678", 10, "andreinamendes@gmail.com", 378465);
        Perfil perfil2 = new Perfil("dreina", "ksdhgfks", 4, "andreina_mendes@gmail.com", 456456);
        Perfil perfil3 = new Perfil("d_mendes", "12345678", 20, "andreinamd@gmail.com", 786783);
        Perfil perfil4 = new Perfil("dr_mendes", "sdfjhdsf", 12, "andreina123@gmail.com", 922383);
        Perfil perfil5 = new Perfil("mendes_d", "12345678", 17, "andreina_md89@gmail.com", 123764);

        File file_ser = new File("lista05\\src\\main\\tmp\\perfil.ser");
        File file_xml = new File("lista05\\src\\main\\tmp\\perfil.xml");
        File file_json = new File("lista05\\src\\main\\tmp\\perfil.json");

        ser.serializa(perfil1, perfil2, perfil3, perfil4, perfil5, file_ser);
        ser_xml.serializaXML(perfil1, perfil2, perfil3, perfil4, perfil5, file_xml);
        ser_json.serializaJSON(perfil1, perfil2, perfil3, perfil4, perfil5, file_json);
        des.desserializa(file_ser);
        des_xml.desserializaXML(file_xml);
        des_json.desserializaJSON(file_json);
    }
}