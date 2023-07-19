package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.gotoContactPage();
    app.initContactCreation();
    app.fillContactForm(new ContactData("Имя", "Фамиля", "Отчество", "г. Москва", "+ 7 999 999 99 99"));
    app.submitContactCreation();
    app.returnContactPage();}
}
