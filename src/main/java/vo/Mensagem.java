package vo;

import domain.UserID;

public class Mensagem {

  private String corpoMensagem;
  private UserID autor;

  public Mensagem(String corpoMensagem, UserID autor) {

    if (corpoMensagem.isEmpty()){
      throw new IllegalArgumentException("Mensagem não pode ser vazia!");

    } 
    this.corpoMensagem = corpoMensagem;
    this.autor = autor;
  }
  public String getCorpoMensagem() {
    return corpoMensagem;
  }

  public UserID getAutor() {
    return autor;
  }
  
  
}
