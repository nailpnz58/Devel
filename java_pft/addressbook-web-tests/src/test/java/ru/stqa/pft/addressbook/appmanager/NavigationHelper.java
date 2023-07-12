package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  public void gotoAddNewContactPage() {
    click(By.linkText("add new"));
  }

  public void gotoHomePage(){
    click(By.linkText("home"));
  }

  public void editContact() {
    click(By.xpath("//img[@alt='Edit']"));
  }

  public void updateModification() {
    click(By.xpath("//div[@id='content']/form/input[22]"));
  }
}
