import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestHomePage extends BaseClient {

    String homepageUrl = "https://www.costco.com";
    HomePage homePage;

    @BeforeClass
    public void initialize(){
        this.driver.navigate().to(this.homepageUrl);
        this.homePage = PageFactory.initElements(this.driver, HomePage.class);
    }
    //TEST 1
    @Test
    public void testHomepageTitle(){
        this.driver.navigate().to(this.homepageUrl);
        String homepageTitle = driver.getTitle();
        Assert.assertEquals(homepageTitle, "Welcome to Costco Wholesale");
    }
    //TEST 2
    @Test
    public void clickCategoriesTest() throws Exception{
        this.driver.navigate().to(this.homepageUrl);
        this.homePage.clickCategoriesTab();
        this.homePage.clickComputerFromDropDown();
        String ComputerUrl = "https://www.costco.com/computers.html";
        Assert.assertEquals(this.driver.getCurrentUrl(), "https://www.costco.com/computers.html");
    }
    //TEST 3
    @Test
    public void search(){
        this.driver.navigate().to(this.homepageUrl);
        this.homePage.inputInSearchBox("computers");
        String ComputerUrl = "https://www.costco.com/computers.html";
        Assert.assertEquals(this.driver.getCurrentUrl(), "https://www.costco.com/computers.html");
    }


}
