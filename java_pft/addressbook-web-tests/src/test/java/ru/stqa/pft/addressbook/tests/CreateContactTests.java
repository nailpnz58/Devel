package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class CreateContactTests extends TestBase {

  @Test
  public void testUntitledTestCase() throws Exception {
    app.getNavigationHelper().gotoAddNewContactPage();
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Иван", "Иванович", "Иванов", "Москва, ул. Красная, 45", "+ 7 999 999 99 99"));
    app.getContactHelper().submitContactCreation();
    app.logout();
  }


}
