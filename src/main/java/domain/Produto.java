package domain;

import java.math.BigDecimal;

public class Produto {
  
  private Integer id;
  private String descricao;
  private BigDecimal valor;
  
  public Produto(Integer id, String descricao, BigDecimal valor) {
    this.id = id;
    this.descricao = descricao;
    this.valor = valor;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public BigDecimal getValor() {
    return valor;
  }

  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }
  
  

}
