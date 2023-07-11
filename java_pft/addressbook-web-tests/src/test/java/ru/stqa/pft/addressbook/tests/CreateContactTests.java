package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class CreateContactTests extends TestBase {

  @Test
  public void testUntitledTestCase() throws Exception {
    app.gotoAddNewContactPage();
    app.initContactCreation();
    app.fillContactForm(new ContactData("Иван", "Иванович", "Иванов", "Москва, ул. Красная, 45", "+ 7 999 999 99 99"));
    app.submitContactCreation();
    app.logout();
  }


}
