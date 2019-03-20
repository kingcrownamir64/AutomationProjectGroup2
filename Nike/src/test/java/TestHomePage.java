import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestHomePage extends BaseClient {

    String homepageUrl = "https://www.nike.com/";
    HomePage homePage;

    @BeforeClass
    public void initialize() {
        this.driver.navigate().to(this.homepageUrl);
        this.homePage = PageFactory.initElements(this.driver, HomePage.class);
    }

    // 5. Tests if website is navigated to the homepage
    @Test
    public void testUserCanNavigateToHomePage() {
        this.driver.navigate().to(this.homepageUrl);
        String homepageTitle = driver.getTitle();
        Assert.assertEquals(homepageTitle, "Nike. Just Do It. Nike.com");
    }
}
