package LitecartTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LitecartTest {
@Test

    public void loginTest() {

    ChromeDriver driver = new ChromeDriver();
    driver.navigate().to(" http://localhost/litecart/admin/");
    WebElement l = driver.findElement(By.name("username"));
    l.sendKeys("admin");
    WebElement p = driver.findElement(By.name("password"));
    p.sendKeys("admin");
    driver.findElement(By.name("login")).click();

    driver.quit();

}
}
