package vo;

public class Email {
  
  private String email;

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Email(String email) {
    if (email.length() > 15) {
      throw new IllegalArgumentException ("Email grande demais!!");
    }
    this.email = email;
  }


}
