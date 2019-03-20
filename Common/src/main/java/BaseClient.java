import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClient {

    WebDriver driver = null;


    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver","../common/Driver/chromedriver");
        this.driver= new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterClass
    public void cleanup(){
        this.driver.quit();
    }

}
