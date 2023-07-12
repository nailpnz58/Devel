package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {
  @Test
  public void testGroupModification(){
    app.getNavigationHelper().gotoHomePage(); //переход на страницу со списком контактов
    app.getNavigationHelper().editContact(); //клик по иконке редактирования
    app.getContactHelper().fillContactForm(new ContactData("Test", "Тестович", "Тестов", "Москва, ул. Синяя, 11", "+ 7 111 222 33 44"));
    app.getNavigationHelper().updateModification(); //клик по кнопке update
    app.getNavigationHelper().gotoHomePage(); //переход на страницу со списком контактов
  }
}
