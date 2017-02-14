package sotfware.qajava.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

    @Test
    public void testGroupDeletion() {
      app.getNavigationHelper().goToGroupPage();
      int before = app.getGroupHelper().getGroupCount();
      if (! app.getGroupHelper().isThereAGroup()) {  GroupCreationTests.testGroupCreation(); }
      app.getGroupHelper().selectGroup();
      app.getGroupHelper().deleteSelectedGroup();
      app.getGroupHelper().returnToGroupPage();
      int after = app.getGroupHelper().getGroupCount();
      Assert.assertEquals(after, before-1);
    }

}
