package sotfware.qajava.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PersonModificationTests extends TestBase {

  @Test
  public void testPersonModification(){
    if(! app.getPersonHelper().isThereAPerson())  {   NewPersonCreationTests.testNewPersonCreation(); }
    int before = app.getPersonHelper().getPersonCount();
    app.getPersonHelper().selectPerson(before-1);
    app.getPersonHelper().initPersonModification(false);
    app.getPersonHelper().submitPersonModification();
    app.getNavigationHelper().returnToHomePage();
    int after = app.getPersonHelper().getPersonCount();
    Assert.assertEquals(after, before);
  }
}
