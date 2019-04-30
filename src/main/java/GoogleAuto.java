import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleAuto {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
        // 获取EDGE驱动
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.zentao.net/user-login.html");

    }
    
}
