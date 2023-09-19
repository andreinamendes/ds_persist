package lista05.src.main.java.model;

import java.util.List;

@JacksonXmlRootElement(localName = "lista_perfis")
public class Perfis implements java.io.Serializable{
  @JacksonXmlElementWrapper(localName = "perfis")
  @JacksonXmlProperty(localName = "perfil")
  List<Perfil> perfis;

  public Perfis(List<Perfil> perfis){
    this.perfis = perfis;
  }

  public List<Perfil> getPerfis() {
    return this.perfis;
  }

  public void setPerfis(List<Perfil> perfis) {
    this.perfis = perfis;
  }

  public String listPerfis(){
    String list = "";

    for(int a = 0; a < this.perfis.size(); a++){
      list += "\n" + this.perfis.get(a).toString();
    }

    return list;
  }

  @Override
  public String toString() {
    return "{" + " perfis='" + listPerfis() + "'" + "}";
  }  
}