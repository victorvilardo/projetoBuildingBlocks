package vo;

public class Nome {
  
  private String primeiroNome;

  private String ultimoNome;

  public String getPrimeiroNome() {
    return primeiroNome;
  }

  public String getUltimoNome() {
    return ultimoNome;
  }

  public Nome(String primeiroNome, String ultimoNome) {
    if (primeiroNome.isEmpty() && ultimoNome.isEmpty() ){
      throw new IllegalArgumentException("Nome inválido!!");
    } 
    this.primeiroNome = primeiroNome;
    this.ultimoNome = ultimoNome;
  }

  
  
}
