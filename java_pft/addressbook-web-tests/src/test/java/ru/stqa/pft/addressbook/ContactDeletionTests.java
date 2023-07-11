package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

import static org.testng.Assert.assertTrue;

public class ContactDeletionTests extends TestBase{

  @Test
  public void testContactDeletion()  {
    selectContact();
    deleteSelectedContact();
    selectAlert();
  }

}
