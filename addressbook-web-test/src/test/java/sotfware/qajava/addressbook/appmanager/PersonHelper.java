package sotfware.qajava.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import sotfware.qajava.addressbook.model.ContactInfo;
import sotfware.qajava.addressbook.model.PersonalData;

public class PersonHelper extends HelperBase {

  public PersonHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void initPersonCreation() {
    click(By.linkText("add new"));
  }

  public void fillPersonData(PersonalData personalData) {
    type(By.name("firstname"), personalData.getFirstName());
    type(By.name("lastname"), personalData.getLastName());
    type(By.name("nickname"), personalData.getNickname());
  }

  public void fillAddressInfo(String address) {
    type(By.name("address"), address);
  }

  public void fillContactInfo(ContactInfo contactInfo) {
    type(By.name("home"), contactInfo.getHomePhone());
    type(By.name("mobile"), contactInfo.getMobilePhone());
    type(By.name("email"), contactInfo.getEmail());
  }

  public void submitPersonCreation() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void selectPerson() {
    click(By.name("selected[]"));
  }

  public void deletePerson() {
    click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
  }

  public void confirmDeletion() {
    wd.switchTo().alert().accept();
  }

  public void initPersonModification() {
  click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
  }

  public void submitPersonModification() {
    click(By.name("update"));
  }
}