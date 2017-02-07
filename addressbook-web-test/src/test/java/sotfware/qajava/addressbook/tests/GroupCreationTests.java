package sotfware.qajava.addressbook.tests;

import org.testng.annotations.Test;
import sotfware.qajava.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public static void testGroupCreation() {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }

}
