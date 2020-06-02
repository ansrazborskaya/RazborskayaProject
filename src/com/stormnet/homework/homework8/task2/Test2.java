package com.stormnet.homework.homework8.task2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        Wait<WebDriver> wait = new WebDriverWait(webDriver, 10).ignoring(StaleElementReferenceException.class, ElementNotVisibleException.class);

        webDriver.get("https://mail.google.com/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierId")));
        WebElement email = webDriver.findElement(By.id("identifierId"));
        email.sendKeys("mailforhomework1@gmail.com");
        webDriver.findElement(By.xpath("//span[@class='CwaK9']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type = 'password']")));
        WebElement password = webDriver.findElement(By.xpath("//input[@type = 'password']"));
        password.sendKeys("123/*---");
        webDriver.findElement(By.xpath("//span[contains(text(),'Далее')]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'T-I J-J5-Ji T-I-KE L3') and contains(@role,'button')]")));
        webDriver.findElement(By.xpath("//div[contains(@class, 'T-I J-J5-Ji T-I-KE L3') and contains(@role,'button')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("to")));
        webDriver.findElement(By.name("to")).sendKeys("mailforhomework1@gmail.com");
        WebElement theme = webDriver.findElement(By.xpath("//input[@name='subjectbox']"));
        theme.sendKeys("Test email");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='Am Al editable LW-avf tS-tW']")));
        webDriver.findElement(By.xpath("//*[@class='Am Al editable LW-avf tS-tW']")).sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent tincidunt, " +
                "lacus sed cursus bibendum, justo nibh egestas ex, sed aliquam purus est eu nisi.");
        webDriver.findElement(By.xpath("//*[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Test email']/ancestor::tr[@class='zA zE']")));
        List<WebElement> result = webDriver.findElements(By.xpath("//span[text()='Test email']/ancestor::tr[@class='zA zE']"));
        System.out.println("You have unread emails: " + result.size());
        webDriver.quit();

    }
}
