package lista05.src.main.java.model;

public class Perfil implements java.io.Serializable{
  private String usuario;
  private String senha;
  private int nivel;
  private String email;
  private int num_cadastro;

  // private ArrayList<Jogo> lista_desejos;
  // private ArrayList<Jogo> favoritos;
  // private ArrayList<Amigos> amigos;
  // private ArrayList<Insignia> ensignias; 
  // private ArrayList<Jogo> jogos;
  // private LocalDate data_cadastro;

  public Perfil(){

  }

  public Perfil(String usuario, String senha, int nivel, String email, int num_cadastro){
    this.usuario = usuario;
    this.senha = senha;
    this.nivel = nivel;
    this.email = email;
    this.num_cadastro = num_cadastro;
  }

  public String getUsuario() {
    return this.usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  public String getSenha() {
    return this.senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public int getNivel() {
    return this.nivel;
  }

  public void setNivel(int nivel) {
    this.nivel = nivel;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getNum_cadastro() {
    return this.num_cadastro;
  }

  public void setNum_cadastro(int num_cadastro) {
    this.num_cadastro = num_cadastro;
  }

  @Override
  public String toString() {
    return "{" +
      "usuario='" + getUsuario() + "'" +
      ", senha='" + getSenha() + "'" +
      ", nivel='" + getNivel() + "'" +
      ", email='" + getEmail() + "'" +
      ", num_cadastro='" + getNum_cadastro() + "'" +
      "}";
  }
}
