package sotfware.qajava.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import sotfware.qajava.addressbook.model.GroupData;

import java.util.List;

public class GroupDeletionTests extends TestBase {

    @Test
    public void testGroupDeletion() {
      app.getNavigationHelper().goToGroupPage();
      if (! app.getGroupHelper().isThereAGroup()) {  GroupCreationTests.testGroupCreation(); }
      List<GroupData> before = app.getGroupHelper().getGroupList();
      app.getGroupHelper().selectGroup(before.size()-1);
      app.getGroupHelper().deleteSelectedGroup();
      app.getGroupHelper().returnToGroupPage();
      List<GroupData> after = app.getGroupHelper().getGroupList();
      Assert.assertEquals(after.size(), before.size()-1);
    }

}
