package Tests.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class TestForNameLocator {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");
        driver.findElement(By.name("Full_name")).sendKeys("Test users");
        driver.findElement((By.name("email"))).sendKeys("test_email@email.com");
        driver.findElement(By.name("wooden_spoon")).click();

        BrowserUtils.wait(3);
        driver.quit();


    }
}
