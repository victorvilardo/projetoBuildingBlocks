package domain;

import vo.Email;
import vo.Nome;

public class Cliente {
  private Integer id;
  private Nome nome;
	private Email email;


  public Cliente(Integer id, Nome nome, Email email) {
    this.id = id;
    this.nome = nome;
    this.email = email;
  }


  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public Nome getNome() {
    return nome;
  }


  public void setNome(Nome nome) {
    this.nome = nome;
  }


  public Email getEmail() {
    return email;
  }


  public void setEmail(Email email) {
    this.email = email;
  }

  
}
