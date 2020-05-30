package com.stormnet.homework.homework8.task2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        Wait<WebDriver> wait = new WebDriverWait(webDriver, 10).ignoring(StaleElementReferenceException.class, ElementNotVisibleException.class);

        webDriver.get("https://www.google.com/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Почта')]")));
        WebElement mailLink = webDriver.findElement(By.xpath("//a[contains(text(),'Почта')]"));
        mailLink.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[contains(@class,'header__nav--ltr')]//a[contains(text(),'Войти')]")));
        WebElement enterButton = webDriver.findElement(By.xpath("//ul[contains(@class,'header__nav--ltr')]//a[contains(text(),'Войти')]"));
        enterButton.click();
        ArrayList<String> tab2 = new ArrayList<>(webDriver.getWindowHandles());
        webDriver.switchTo().window(tab2.get(1));
        WebElement emailField = webDriver.findElement(By.id("identifierId"));
        emailField.sendKeys("mailforhomework1@gmail.com");
        webDriver.findElement(By.xpath("//span[@class='CwaK9']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type = 'password']")));
        WebElement password = webDriver.findElement(By.xpath("//input[@type = 'password']"));
        password.sendKeys("123/*---");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Далее')]")));
        webDriver.findElement(By.xpath("//span[contains(text(),'Далее')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@class='zA yO']")));
        List<WebElement> checkEmail = webDriver.findElements(By.xpath("//tr[@class='zA yO']"));
        List<WebElement> uncheckEmail = webDriver.findElements(By.xpath("//tr[@class='zA zE']"));

        System.out.println("Number of Read email: " + checkEmail.size());
        System.out.println("Number of Unread Email: " + uncheckEmail.size());
        assert (checkEmail.size() > 0 || uncheckEmail.size() > 0);

        webDriver.quit();
    }
}
