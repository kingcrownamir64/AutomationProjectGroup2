import Utility.DataReader;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestAmazonFreshPage extends BaseClient  {


    String AmazonFreshPageURL = "https://www.amazon.com/gp/browse.html?node=10329849011&ref_=nav_em_T1_0_4_3_1__afs_aaf";
    AmazonFreshPage Amazonfreshpage;

    /**
     * Will navigate to the url before running all tests
     */
    @BeforeClass
    public void initialize() throws InterruptedException {
        this.driver.navigate().to(this.AmazonFreshPageURL);
        this.Amazonfreshpage = PageFactory.initElements(this.driver, AmazonFreshPage.class);
        this.driver.navigate().to(this.AmazonFreshPageURL);
        Thread.sleep(8000);

    }


    // 1. Tests if website is navigated to the homepage
    @Test(priority = 1)
    public void testUserCanNavigateToAmazonFreshPage() throws InterruptedException {
        this.driver.navigate().to(this.AmazonFreshPageURL);
        Thread.sleep(8000);
        String AmazonfreshpageTitle = driver.getTitle();
        Assert.assertEquals(AmazonfreshpageTitle, "Amazon.com: : AmazonFresh");
    }


    // 2. Tests if website is navigated to dairy tab
    @Test(priority = 2)
    public void testUserCanNavigateToDairyTab() throws InterruptedException {
        this.driver.navigate().to(this.AmazonFreshPageURL);
        this.Amazonfreshpage.SetDairyButton();
        Thread.sleep(8000);
        String DairyTabTitle = driver.getTitle();
        Assert.assertEquals(DairyTabTitle, "Amazon.com: Dairy, Cheese & Eggs - Grocery & Gourmet Food: AmazonFresh");
    }


    // 3. Tests if website is navigated to deli tab
    @Test(priority = 3)
    public void testUserCanNavigateToDeliTab() throws InterruptedException {
        this.driver.navigate().to(this.AmazonFreshPageURL);
        this.Amazonfreshpage.SetDeliButton();
        Thread.sleep(8000);
        String DeliTabTitle = driver.getTitle();
        Assert.assertEquals(DeliTabTitle, "Amazon.com: Deli - Grocery & Gourmet Food: AmazonFresh");
    }

    // 4. Tests if website is navigated to bakery tab
    @Test(priority = 4)
    public void testUserCanNavigateToBakeryTab() throws InterruptedException {
        this.driver.navigate().to(this.AmazonFreshPageURL);
        this.Amazonfreshpage.SetBakeryButton();
        Thread.sleep(8000);
        String BakeryTabTitle = driver.getTitle();
        Assert.assertEquals(BakeryTabTitle, "Amazon.com: Breads & Bakery - Grocery & Gourmet Food: AmazonFresh");
    }

    // 5. Tests if website is navigated to fresh fruit tab
    @Test(priority = 5)
    public void testUserCanNavigateToFreshFruitTab() throws InterruptedException {
        this.driver.navigate().to(this.AmazonFreshPageURL);
        this.Amazonfreshpage.SetFreshFruitButton();
        Thread.sleep(8000);
        String FreshFruitTabTitle = driver.getTitle();
        Assert.assertEquals(FreshFruitTabTitle, "Amazon.com: Fresh Fruits - Produce: AmazonFresh");
    }

    // 6. Tests if website is navigated to meal kit tab
    @Test(priority = 6)
    public void testUserCanNavigateToMealKitTab() throws InterruptedException {
        this.driver.navigate().to(this.AmazonFreshPageURL);
        this.Amazonfreshpage.SetMealKitButton();
        Thread.sleep(8000);
        String MealKitTitle = driver.getTitle();
        Assert.assertEquals(MealKitTitle, "Amazon.com: Fresh Meal Kits - Grocery & Gourmet Food: AmazonFresh");
    }

    // 7. Tests if website is navigated to beverages tab
    @Test(priority = 7)
    public void testUserCanNavigateToPastPurchasesButton() {
        this.driver.navigate().to(this.AmazonFreshPageURL);
        this.Amazonfreshpage.SetPastPurchasesButton();
//        String BeveragesTitle = driver.getTitle();
//        Assert.assertEquals(BeveragesTitle, "Amazon.com: Beverages - Grocery & Gourmet Food: AmazonFresh");
    }

    @Test(priority = 8)
    public void testUserCanNavigateToFreshDealsButton() throws InterruptedException {
        this.driver.navigate().to(this.AmazonFreshPageURL);
        this.Amazonfreshpage.SetFreshDealsButton();
        Thread.sleep(8000);
        String BeveragesTitle = driver.getTitle();
        Assert.assertEquals(BeveragesTitle, "Amazon.com: Grocery & Gourmet Food: AmazonFresh");
    }

    @Test(priority = 9)
    public void testUserCanNavigateToGroceriesButton() throws InterruptedException {
        this.driver.navigate().to(this.AmazonFreshPageURL);
        this.Amazonfreshpage.SetGroceriesButton();
        Thread.sleep(8000);
        String BeveragesTitle = driver.getTitle();
        Assert.assertEquals(BeveragesTitle, "Amazon.com: Grocery & Gourmet Food: AmazonFresh");
    }

    @Test(priority = 10)
    public void testUserCanNavigateToBeveragesTab() throws InterruptedException {
        this.driver.navigate().to(this.AmazonFreshPageURL);
        this.Amazonfreshpage.SetBeveragesButton();
        Thread.sleep(8000);
        String BeveragesTitle = driver.getTitle();
        Assert.assertEquals(BeveragesTitle, "Amazon.com: Beverages - Grocery & Gourmet Food: AmazonFresh");
    }

    @Test(priority = 11)
    public void testUserCanNavigateToHouseholdHealthBeautyTab() throws InterruptedException {
        this.driver.navigate().to(this.AmazonFreshPageURL);
        this.Amazonfreshpage.SetHouseholdHealthBeautyButton();
        Thread.sleep(8000);
        String BeveragesTitle = driver.getTitle();
        Assert.assertEquals(BeveragesTitle, "Amazon.com: Health & Household: AmazonFresh");
    }

    @Test(priority = 12)
    public void testUserCanNavigateToLocalMarketTab() throws InterruptedException {
        this.driver.navigate().to(this.AmazonFreshPageURL);
        this.Amazonfreshpage.SetLocalMarketButton();
        Thread.sleep(8000);
        String BeveragesTitle = driver.getTitle();
        Assert.assertEquals(BeveragesTitle, "Amazon.com: Local Market - Grocery & Gourmet Food: AmazonFresh");
    }



}
