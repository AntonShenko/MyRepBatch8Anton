package myEx.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/pro/Documents/IntelliJ/ChromeDriver/chromedriver");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.google.com/");
    }
}
