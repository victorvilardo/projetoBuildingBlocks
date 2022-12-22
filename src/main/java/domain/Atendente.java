package domain;


import java.util.Calendar;

import vo.Email;
import vo.Nome;

public class Atendente {
  
  private Integer id;
  private Nome nome;
	private String cargo;
  private Calendar tempoAtendimento;
  private Email email;

  public Atendente(Integer id, Nome nome, String cargo, Calendar tempoAtendimento, Email email) {
    this.id = id;
    this.nome = nome;
    this.cargo = cargo;
    this.tempoAtendimento = tempoAtendimento;
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

  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public Calendar getTempoAtendimento() {
    return tempoAtendimento;
  }

  public void setTempoAtendimento(Calendar tempoAtendimento) {
    this.tempoAtendimento = tempoAtendimento;
  }

  public Email getEmail() {
    return email;
  }

  public void setEmail(Email email) {
    this.email = email;
  }
}
