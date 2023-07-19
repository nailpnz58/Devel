package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;

import static org.testng.Assert.assertTrue;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() {
    app.gotoContactList();
    app.selectedContact();
    boolean acceptNextAlert = true;
    app.deleteContact();
    app.closeAlert();
  }

}
