package sotfware.qajava.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import sotfware.qajava.addressbook.tests.TestBase;

import static org.openqa.selenium.OutputType.*;

public class PersonDeletionTests extends TestBase {
    
    @Test
    public void PersonDeletionTests(){
      app.getPersonHelper().selectPerson();
      app.getPersonHelper().deletePerson();
      app.getPersonHelper().confirmDeletion();
      app.getPersonHelper().returnToHomePage();
    }
}