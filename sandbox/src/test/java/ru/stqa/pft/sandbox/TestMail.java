package ru.stqa.pft.sandbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
    public class TestMail {
        @Test public void login() { // TODO Auto-generated method stub
            System.setProperty("webdriver.chrome.driver", "a:\\Distrib\\chromedriver\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            //driver.manage().window().maximize();
            driver.get("https://mail.ru/");
            driver.findElement(By.id("mailbox:login")).click();
            driver.findElement(By.id("mailbox:login")).sendKeys("test.test.8989");
            driver.findElement(By.cssSelector(".mailbox__row_")).click();
            driver.findElement(By.cssSelector(".mailbox__icon_next path")).click();
            driver.findElement(By.id("mailbox:password")).click();
            driver.findElement(By.id("mailbox:password")).sendKeys("1PassTes");
            driver.findElement(By.cssSelector("#mailbox\\3Asubmit > .o-control")).click();


        }
    }
