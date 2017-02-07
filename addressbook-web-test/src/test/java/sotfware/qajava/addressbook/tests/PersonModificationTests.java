package sotfware.qajava.addressbook.tests;

import org.testng.annotations.Test;

public class PersonModificationTests extends TestBase {

  @Test
  public void testPersonModification(){
    if(! app.getPersonHelper().isThereAPerson())  {   NewPersonCreationTests.testNewPersonCreation(); }
    app.getPersonHelper().selectPerson();
    app.getPersonHelper().initPersonModification(false);
    app.getPersonHelper().submitPersonModification();
    app.getNavigationHelper().returnToHomePage();
  }
}
