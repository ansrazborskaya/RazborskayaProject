package com.stormnet.homework.homework8.task2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class OzTask2 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Wait<WebDriver> wait = new WebDriverWait(driver, 10).ignoring(StaleElementReferenceException.class, ElementNotVisibleException.class);

        driver.get("https://oz.by/");

        ArrayList<String> expectedResult = new ArrayList<>();
        expectedResult.add("Продукты, деликатесы");
        expectedResult.add("Книги");
        expectedResult.add("Косметика, парфюмерия");
        expectedResult.add("Дом, сад, зоотовары");
        expectedResult.add("Развлечения, творчество");
        expectedResult.add("Канцтовары, учёба");
        expectedResult.add("Сувениры, подарки");
        expectedResult.add("Детям и мамам");
        expectedResult.add("Туризм, отдых, спорт");
        expectedResult.add("Техника, электроника");
        expectedResult.add("Здоровье, медтехника");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='main-nav__list__li main-nav__list__li_wnav']")));

        List<WebElement> result = driver.findElements(By.xpath("//li[@class='main-nav__list__li main-nav__list__li_wnav']"));
        List<String> actualResult = new ArrayList<>();

        for (WebElement element : result) {
            actualResult.add(element.getText());
        }

        if (expectedResult.equals(actualResult)) {
            System.out.println("Cписки равны");
        } else {
            System.out.println("Значения в списке не совпадают");
        }
        driver.quit();
    }
}
