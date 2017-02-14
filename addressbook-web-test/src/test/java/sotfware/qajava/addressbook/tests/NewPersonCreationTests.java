package sotfware.qajava.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import sotfware.qajava.addressbook.model.ContactInfo;
import sotfware.qajava.addressbook.model.PersonalData;

import java.util.List;

public class NewPersonCreationTests extends TestBase {

  @Test
  public static void testNewPersonCreation() {
    List<PersonalData> before = app.getPersonHelper().getPersonList();
    app.getPersonHelper().initPersonCreation();
    app.getPersonHelper().fillPersonData(new PersonalData("F_name", "L_name", "FL", "test1"), true);
    app.getPersonHelper().fillContactInfo(new ContactInfo("12345678", "(123)456-789", "email@email.com"));
    app.getPersonHelper().fillAddressInfo("Test_country, Test_city, Test_street, Test_build, №1");
    app.getPersonHelper().submitPersonCreation();
    app.getNavigationHelper().returnToHomePage();
    List<PersonalData> after = app.getPersonHelper().getPersonList();
    Assert.assertEquals(after.size(), before.size()+1);
  }
}
