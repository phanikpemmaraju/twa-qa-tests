package br.com.boavista.twa;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseSetUp {

  public static WebDriver webdriver;

  @BeforeAll
  static void setUp() {
    final String CHROME_DRIVER_PATH = BaseSetUp.class.getClassLoader().getResource("chromedriver-mac").getPath();
    System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
    webdriver = new ChromeDriver();
    webdriver.manage().timeouts().implicitlyWait(Duration.of(30, ChronoUnit.SECONDS));
  }

  void getUrl(String path){
    webdriver.get(path);
  }

  String getTitle(){
    return webdriver.getTitle();
  }


}
