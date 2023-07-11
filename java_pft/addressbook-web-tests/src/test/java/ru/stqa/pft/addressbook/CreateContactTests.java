package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class CreateContactTests extends TestBase {

  @Test
  public void testUntitledTestCase() throws Exception {
    gotoAddNewContactPage();
    initContactCreation();
    fillContactForm(new ContactData("Иван", "Иванович", "Иванов", "Москва, ул. Красная, 45", "+ 7 999 999 99 99"));
    submitContactCreation();
    logout();
  }


}
