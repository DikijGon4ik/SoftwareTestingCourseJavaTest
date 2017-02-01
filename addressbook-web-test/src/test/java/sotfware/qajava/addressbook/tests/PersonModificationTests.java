package sotfware.qajava.addressbook.tests;

import org.testng.annotations.Test;

public class PersonModificationTests extends TestBase {

  @Test
  public void testPersonModification(){
    app.getPersonHelper().selectPerson();
    app.getPersonHelper().initPersonModification();
    app.getPersonHelper().submitPersonModification();
    app.getPersonHelper().returnToHomePage();
  }

}
