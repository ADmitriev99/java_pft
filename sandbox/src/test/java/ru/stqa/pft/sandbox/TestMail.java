package ru.stqa.pft.sandbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
    public class TestMail {
        @Test public void login() throws InterruptedException { // TODO Auto-generated method stub
            System.setProperty("webdriver.chrome.driver", "a:\\Distrib\\chromedriver\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            //driver.manage().window().maximize();
            driver.get("https://mail.ru/");
            //System.out.println("1");
            driver.findElement(By.id("mailbox:login")).click();
            //System.out.println("2");
            driver.findElement(By.id("mailbox:login")).sendKeys("test.test.8989");
            //System.out.println("3");
            driver.findElement(By.cssSelector(".mailbox__icon_next > svg")).click();
            //System.out.println("4");
            //driver.findElement(By.id("mailbox:password")).click();
            //System.out.println("5");
            //driver.findElement(By.id("mailbox:password")).sendKeys("1PassTes");
            //System.out.println("6");
            driver.findElement(By.cssSelector("#mailbox\\3Asubmit > .o-control")).click();
            //System.out.println("7");
            driver.findElement(By.id("mailbox:password")).sendKeys("1PassTes");
            //System.out.println("8");
            driver.findElement(By.cssSelector("#mailbox\\3Asubmit > .o-control")).click();
            Thread.sleep(2000);
            System.out.println(driver.getCurrentUrl());

            String Wanted = "https://e.mail.ru/inbox/?back=1&afterReload=1";

            Assert.assertEquals(driver.getCurrentUrl(), Wanted);
        }
    }
