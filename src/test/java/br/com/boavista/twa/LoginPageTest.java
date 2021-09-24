package br.com.boavista.twa;

import org.junit.jupiter.api.Test;

public class LoginPageTest extends BaseSetUp {

  @Test
  void loginSuccessful() {
    getUrl("https://bvs2netdev.bvsnet.com.br/transacional/login.php");
    System.out.println("Title : {} "  + getTitle());
  }


}
