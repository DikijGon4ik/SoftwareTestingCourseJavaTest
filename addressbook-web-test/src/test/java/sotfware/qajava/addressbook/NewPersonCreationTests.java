package sotfware.qajava.addressbook;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class NewPersonCreationTests {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "F:/Studing/geckodriver.exe");
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      login("secret", "admin");
    }
    
    @Test
    public void NewPersonCreationTests() {
      addNewPerson();
      fillNewPerson();
      submitNewPersonCreation();
      returnToHomePage();
    }

  private void returnToHomePage() {
    wd.findElement(By.linkText("home")).click();
  }

  private void submitNewPersonCreation() {
    wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

  private void fillNewPerson() {
    fillPersonData(new PersonalData("F_name", "L_name", "FL"));
    fillContactInfo(new ContactInfo("12345678", "(123)456-789", "email@email.com"));
    fillAddressInfo("Test_country, Test_city, Test_street, Test_build, №1");
  }

  private void fillAddressInfo(String address) {
    wd.findElement(By.name("address")).click();
    wd.findElement(By.name("address")).clear();
    wd.findElement(By.name("address")).sendKeys(address);
  }

  private void fillContactInfo(ContactInfo contactInfo) {
    wd.findElement(By.name("home")).click();
    wd.findElement(By.name("home")).clear();
    wd.findElement(By.name("home")).sendKeys(contactInfo.getHomePhone());
    wd.findElement(By.name("mobile")).click();
    wd.findElement(By.name("mobile")).clear();
    wd.findElement(By.name("mobile")).sendKeys(contactInfo.getMobilePhone());
    wd.findElement(By.name("email")).click();
    wd.findElement(By.name("email")).clear();
    wd.findElement(By.name("email")).sendKeys(contactInfo.getEmail());
  }

  private void fillPersonData(PersonalData personalData) {
    wd.findElement(By.name("firstname")).click();
    wd.findElement(By.name("firstname")).clear();
    wd.findElement(By.name("firstname")).sendKeys(personalData.getFirstName());
    wd.findElement(By.name("lastname")).click();
    wd.findElement(By.name("lastname")).clear();
    wd.findElement(By.name("lastname")).sendKeys(personalData.getLastName());
    wd.findElement(By.name("nickname")).click();
    wd.findElement(By.name("nickname")).clear();
    wd.findElement(By.name("nickname")).sendKeys(personalData.getNickname());
  }

  private void addNewPerson() {
    wd.findElement(By.linkText("add new")).click();
  }

  private void login(String password, String username) {
    wd.get("http://localhost/addressbook/");
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).sendKeys(password);
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys(username);
    wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
  }

  @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
