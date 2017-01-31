package sotfware.qajava.addressbook.tests;

import org.testng.annotations.Test;
import sotfware.qajava.addressbook.model.ContactInfo;
import sotfware.qajava.addressbook.model.PersonalData;

public class NewPersonCreationTests extends TestBase {

  @Test
  public void testNewPersonCreation() {
    app.getPersonHelper().initPersonCreation();
    app.getPersonHelper().fillPersonData(new PersonalData("F_name", "L_name", "FL"));
    app.getPersonHelper().fillContactInfo(new ContactInfo("12345678", "(123)456-789", "email@email.com"));
    app.getPersonHelper().fillAddressInfo("Test_country, Test_city, Test_street, Test_build, №1");
    app.getPersonHelper().submitPersonCreation();
    app.getPersonHelper().returnToHomePage();
  }
}
