import Utility.DataReader;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestHomepage extends BaseClient{



    String homepageUrl = "https://www.amazon.com/ref=ap_frn_logo";
    HomePage homePage;
    //  Will navigate to the url before running all tests

    @BeforeClass
    public void initialize() {
        this.driver.navigate().to(this.homepageUrl);
        this.homePage = PageFactory.initElements(this.driver, HomePage.class);
    }

    //  Tests if website is navigated to the homepage
    @Test
    public void testUserCanNavigateToHomePage() {
        this.driver.navigate().to(this.homepageUrl);
        String homepageTitle = driver.getTitle();
        Assert.assertEquals(homepageTitle, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
    }

    //  Tests if user can use search bar
    @Test
    public void testSearchBar() {
        this.driver.navigate().to(this.homepageUrl);
        this.homePage.searchBoxHome("Type C Charger");
    }

    //  Tests if search button works
    @Test
    public void TestSearchButton() {
        this.driver.navigate().to(this.homepageUrl);
        this.homePage.searchBoxHome("Type C Charger");
        this.homePage.SearchButtonHome();
    }

    //  Check if cart button works & navigates to correct page
    @Test
    public void TestCartButton() {
        this.driver.navigate().to(this.homepageUrl);
        this.homePage.setCartButton();
        String cartTitle = driver.getTitle();
        Assert.assertEquals(cartTitle, "Amazon.com Shopping Cart");
    }

    //  Check if Your Amazon button works & navigates to correct page
    @Test
    public void TestYourAmazonButton() {
        this.driver.navigate().to(this.homepageUrl);
        this.homePage.setYourAmazonButton();
        String YourAmazonTitle = driver.getTitle();
        Assert.assertEquals(YourAmazonTitle, "Amazon Sign In");
    }


//    @Test
//    public void selectsteps() throws IOException, NullPointerException, InterruptedException {
//        String[]  testSteps = (String[]) DataReader.fileReader2(homepageUrl,0);
//
//        for (String str : testSteps){
//
//            if (str.equalsIgnoreCase("search")) {
//                testSearchBar();
//            }
//            else if (str.equalsIgnoreCase("navigate")) {
//                TestCartButton();
//            }
//            else{
//                throw new InvalidArgumentException("Invalid Choice you harami");
//            }
//
//            Thread.sleep(3000);
//        }
//
//
//    }
    @AfterClass
    public void cleanUp() {
    this.driver.quit();
}
}
