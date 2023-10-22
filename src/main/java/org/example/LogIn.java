package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogIn {
    private WebDriver driver;

    public LogIn(WebDriver driver) {
        this.driver = driver;
    }
    public void open() {
        driver.get("https://www.saucedemo.com/");
    }
    public void enterUserName(String UserName) {
        WebElement UserName_TxtBox = driver.findElement(By.id("user-name"));
        UserName_TxtBox.sendKeys(UserName);
    }

    public void enterPassword(String password) {
        WebElement Password_TxtBox = driver.findElement(By.id("password"));
        Password_TxtBox.sendKeys(password);
        WebElement Login_Btn = driver.findElement(By.id("login-button"));
        Login_Btn.click();
    }
    public void LogOut() {
        WebElement MenuBar = driver.findElement(By.id("react-burger-menu-btn"));
        MenuBar.click();
        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
        WebElement LogOut_btn = driver.findElement(By.id("logout_sidebar_link"));
        LogOut_btn.click();
    }


}
