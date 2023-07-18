package ru.stqa.pft.addressbook;

import org.testng.annotations.*;
import org.openqa.selenium.*;


public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    gotoContactPage();
    initContactCreation();
    fillContactForm(new ContactData("Имя", "Фамиля", "Отчество", "г. Москва", "+ 7 999 999 99 99"));
    submitContactCreation();
    returnContactPage();}
}
