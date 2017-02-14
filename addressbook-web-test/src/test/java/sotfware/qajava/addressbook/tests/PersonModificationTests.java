package sotfware.qajava.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import sotfware.qajava.addressbook.model.PersonalData;

import java.util.List;

public class PersonModificationTests extends TestBase {

  @Test
  public void testPersonModification(){
    if(! app.getPersonHelper().isThereAPerson())  {   NewPersonCreationTests.testNewPersonCreation(); }
    List<PersonalData> before = app.getPersonHelper().getPersonList();
    app.getPersonHelper().selectPerson(before.size()-1);
    app.getPersonHelper().initPersonModification(false);
    app.getPersonHelper().submitPersonModification();
    app.getNavigationHelper().returnToHomePage();
    List<PersonalData> after = app.getPersonHelper().getPersonList();
    Assert.assertEquals(after.size(), before.size());
  }
}
