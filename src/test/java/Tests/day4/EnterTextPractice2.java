package Tests.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;

public class EnterTextPractice2 {

    /* ###Test 3, Verify that email changed
1. Go to "http://practice.cybertekschool.com/forgot_password"
2. Enter any valid email
3. Click on retrieve password button
4. Verify that message "Your e-mail's been sent!" is displayed*/
    public static void main(String[] args) {

        // bunu her zaman yapiyoruz ilk set up yaparken.
        WebDriver driver = BrowserFactory.getDriver("chrome");
        WebElement inputBox = driver.findElement(By.name("email"));
        inputBox.sendKeys("random@email.com, Keys.ENTER");
        WebElement confirmationMessage = driver.findElement((By.name("Confirmation message")));

        String expectedMessage = "Your e-mail's been sent!";
        String actualMessage = confirmationMessage.getText();

        if(expectedMessage.equals(actualMessage)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }
        driver.close();
    }
}
