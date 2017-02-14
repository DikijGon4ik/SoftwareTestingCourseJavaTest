package sotfware.qajava.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import sotfware.qajava.addressbook.model.ContactInfo;
import sotfware.qajava.addressbook.model.PersonalData;

public class NewPersonCreationTests extends TestBase {

  @Test
  public static void testNewPersonCreation() {
    int before = app.getPersonHelper().getPersonCount();
    app.getPersonHelper().initPersonCreation();
    app.getPersonHelper().fillPersonData(new PersonalData("F_name", "L_name", "FL", "test1"), true);
    app.getPersonHelper().fillContactInfo(new ContactInfo("12345678", "(123)456-789", "email@email.com"));
    app.getPersonHelper().fillAddressInfo("Test_country, Test_city, Test_street, Test_build, №1");
    app.getPersonHelper().submitPersonCreation();
    app.getNavigationHelper().returnToHomePage();
    int after = app.getPersonHelper().getPersonCount();
    Assert.assertEquals(after, before+1);
  }
}
