package sotfware.qajava.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import sotfware.qajava.addressbook.model.ContactInfo;
import sotfware.qajava.addressbook.model.PersonalData;

import java.util.ArrayList;
import java.util.List;

public class PersonHelper extends HelperBase {

  public PersonHelper(WebDriver wd) {
    super(wd);
  }

  public void initPersonCreation() {
    click(By.linkText("add new"));
  }

  public void fillPersonData(PersonalData personalData, boolean creation) {
    type(By.name("firstname"), personalData.getFirstName());
    type(By.name("lastname"), personalData.getLastName());
    type(By.name("nickname"), personalData.getNickname());
    if(creation)
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(personalData.getGroup());
    else
      Assert.assertFalse(isElementPresent(By.name("new_group")));
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

  public void selectPerson(int index) {
    wd.findElements(By.name("selected[]")).get(index).click();
  }

  public void deletePerson() {
    click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
  }

  public void confirmDeletion() {
    wd.switchTo().alert().accept();
  }

  public void initPersonModification(boolean b) {
  click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
  }

  public void submitPersonModification() {
    click(By.name("update"));
  }

  public boolean isThereAPerson() {
    return isElementPresent(By.name("selected[]"));
  }

  public int getPersonCount() {
    return wd.findElements(By.name("selected[]")).size();
  }


  public List<PersonalData> getPersonList() {
    List<PersonalData> datas = new ArrayList<PersonalData>();
    List<WebElement> elements = wd.findElements(By.name("entry"));
    for (WebElement element : elements){
      String name = element.getText();
      String firstName = element.getText();
      String lastName = element.getText();
      String nickName = element.getText();
      String group = element.getText();
      PersonalData data = new PersonalData(firstName, lastName, nickName, group);
      datas.add(data);
    }
    return datas;
    }

  }