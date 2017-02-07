package sotfware.qajava.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

    @Test
    public void testGroupDeletion() {
      app.getNavigationHelper().goToGroupPage();
      if (! app.getGroupHelper().isThereAGroup()) {  GroupCreationTests.testGroupCreation(); }
      app.getGroupHelper().selectGroup();
      app.getGroupHelper().deleteSelectedGroup();
      app.getGroupHelper().returnToGroupPage();
    }

}
