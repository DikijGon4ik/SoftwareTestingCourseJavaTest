package sotfware.qajava.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import sotfware.qajava.addressbook.model.PersonalData;
import sotfware.qajava.addressbook.tests.TestBase;

import static org.openqa.selenium.OutputType.*;

public class PersonDeletionTests extends TestBase {
    
    @Test
    public void PersonDeletionTests(){
      if(! app.getPersonHelper().isThereAPerson())  {   NewPersonCreationTests.testNewPersonCreation(); }
      List<PersonalData> before = app.getPersonHelper().getPersonList();
      app.getPersonHelper().selectPerson(before.size()-1);
      app.getPersonHelper().deletePerson();
      app.getPersonHelper().confirmDeletion();
      app.getNavigationHelper().returnToHomePage();
      List<PersonalData> after = app.getPersonHelper().getPersonList();
      Assert.assertEquals(after.size(), before.size()-1);
    }
}
