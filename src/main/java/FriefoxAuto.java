import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FriefoxAuto {

    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver","src/main/java/driver/geckodriver.exe");
        // 获取EDGE驱动D:\yyy\ato\src\main\java\driver\geckodriver.exe
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.baidu.com");
        WebElement webElement = ((FirefoxDriver) driver).findElementById("kw");
        webElement.sendKeys("Cheese!");
        webElement.submit();
        System.out.println("Page title is:"+driver.getTitle());


        new WebDriverWait(driver,100).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d){
                return d.getTitle().toLowerCase().startsWith("cheese");
            };
        });

        System.out.println("Page title is:"+driver.getTitle());

        driver.quit();
    }
    
}
