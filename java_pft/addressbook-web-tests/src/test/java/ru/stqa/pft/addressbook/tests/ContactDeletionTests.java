package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;

import static org.testng.Assert.assertTrue;

public class ContactDeletionTests extends TestBase{

  @Test
  public void testContactDeletion()  {
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContact();
    app.getContactHelper().selectAlert();
  }

}
