import Utility.DataReader;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestHomepage extends BaseClient {


    String homepageUrl = "https://www.amazon.com/ref=ap_frn_logo";
    HomePage homePage;

    DataReader excelData = new DataReader();
    String path = "/Users/amir/Desktop/AutomationProjectGroup2/Amazon/src/test/Resources/ExcelFile.xls";

    /**
     * Will navigate to the url before running all tests
     */
    @BeforeClass
    public void initialize() {
        this.driver.navigate().to(this.homepageUrl);
        this.homePage = PageFactory.initElements(this.driver, HomePage.class);
    }

    // 1. Tests if website is navigated to the homepage
    @Test
    public void testUserCanNavigateToHomePage() {
        this.driver.navigate().to(this.homepageUrl);
        String homepageTitle = driver.getTitle();
        Assert.assertEquals(homepageTitle, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
    }

    // 2. Tests if user can use search bar
    @Test
    public void testSearchBar() {
        this.driver.navigate().to(this.homepageUrl);
        this.homePage.searchBoxHome("Type C Charger");
    }

    // 3. Tests if search button works
    @Test
    public void TestSearchButton() {
        this.driver.navigate().to(this.homepageUrl);
        this.homePage.searchBoxHome("Type C Charger");
        this.homePage.SearchButtonHome();

    }

    // 4. Check if cart button works & navigates to correct page
    @Test
    public void TestCartButton() {
        this.driver.navigate().to(this.homepageUrl);
        this.homePage.setCartButton();
        String cartTitle = driver.getTitle();
        Assert.assertEquals(cartTitle, "Amazon.com Shopping Cart");
    }

    // 5. Check if Your Amazon button works & navigates to correct page
    @Test
    public void TestYourAmazonButton() {
        this.driver.navigate().to(this.homepageUrl);
        this.homePage.setYourAmazonButton();
        String YourAmazonTitle = driver.getTitle();
        Assert.assertEquals(YourAmazonTitle, "Amazon Sign In");
    }

    // 6. Check if Your Amazon button works & navigates to correct page
    //Purposely failed test to demonstrate a failed example. Can correct by changing expected title.
    @Test
    public void TestLanguageButton() {
        // this.driver.navigate().to(this.homepageUrl);
        this.homePage.setLanguageBar();
        //String changeLanguage = driver.getTitle();
        //Assert.assertEquals(changeLanguage, "Change Language Settings");
    }

    // 7. Check if amazon menu button opens
    @Test
    public void TestMenuButton() {
        this.driver.navigate().to(this.homepageUrl);
        this.homePage.setMenuButton();
    }

    // 8. Check if Your buy again button works & navigates to correct page
    @Test
    public void TestTodaysDealButton() {
        this.driver.navigate().to(this.homepageUrl);
        this.homePage.setTodaysdealButton();
        String changeLanguage = driver.getTitle();
        Assert.assertEquals(changeLanguage, "Gold Box Deals | Today's Deals - Amazon.com");
    }

    //9. Check if drop down Account and List menu works
    @Test
    public void TestAccountAndListDropDownMenu() throws Exception {
        this.driver.navigate().to(this.homepageUrl);
        this.homePage.setAccountAndListDropDownMenu();
    }

    //10. Check if orders button navigates
    @Test
    public void TestordersButton() {
        this.driver.navigate().to(this.homepageUrl);
        this.homePage.setOrdersButton();
        String YourAmazonTitle = driver.getTitle();
        Assert.assertEquals(YourAmazonTitle, "Amazon Sign In");
    }

    //11. Check if try prime button navigates
    @Test
    public void TestTryPrimeButton() throws InterruptedException {
        this.driver.navigate().to(this.homepageUrl);
        this.homePage.setTryPrimeButton();
        String YourAmazonTryPrimeTitle = driver.getTitle();
        Assert.assertEquals(YourAmazonTryPrimeTitle, "Amazon.com: Amazon Prime");
    }

    @Test
    public void selectsteps() throws IOException, NullPointerException, InterruptedException {
        String[]  testSteps = excelData.fileReader2(path,0);

        try {
            for (int i = 0; i < testSteps.length; ++i) {
                switch (testSteps[i]) {
                    case "search":
                        testSearchBar();
                        break;

                    case "navigate":
                        TestCartButton();
                        break;
                    default:
                        throw new InvalidArgumentException("Invalid Choice you harami");
                }

                Thread.sleep(3000);
            }
        } catch (NullPointerException nm) {
            System.out.println("Nothing is in the list");
        }


    }
}

