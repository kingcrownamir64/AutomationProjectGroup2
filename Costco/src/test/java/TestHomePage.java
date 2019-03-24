import Utility2.DataReader2;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestHomePage extends BaseClient {

    String homepageUrl = "https://www.costco.com";
    HomePage homePage;

    DataReader2 excelData = new DataReader2();
    String path = "/Users/Saqib/Desktop/AutomationProjectGroup2/Costco/src/test/Resources/ExcelFile.xls";

    @BeforeMethod
    public void initialize(){
        this.driver.navigate().to(this.homepageUrl);
        this.homePage = PageFactory.initElements(this.driver, HomePage.class);
    }
    //TEST 1
    @Test(priority = 1)
    public void testHomepageTitle(){
        //this.driver.navigate().to(this.homepageUrl);
        String homepageTitle = driver.getTitle();
        Assert.assertEquals(homepageTitle, "Welcome to Costco Wholesale");
    }
    //TEST 2
    @Test(priority = 2)
    public void clickCategoriesTest() throws Exception{
        //this.driver.navigate().to(this.homepageUrl);
        this.homePage.clickCategoriesTab();
        this.homePage.clickComputerFromDropDown();
        String ComputerUrl = driver.getCurrentUrl();
        Assert.assertEquals(ComputerUrl, "https://www.costco.com/computers.html");
    }
    //TEST 3
    @Test(priority = 3)
    public void search() throws Exception{
        //this.driver.navigate().to(this.homepageUrl);
        this.homePage.inputInSearchBox("computers");
        this.homePage.clickSearchButton();
        String computerTitle = driver.getTitle();
        Assert.assertEquals(computerTitle, "Computers | Costco");
    }
    //TEST 4
    @Test(priority = 4)
    public void testCustomerService() throws Exception{
       // this.driver.navigate().to(this.homepageUrl);
        this.homePage.clickOnCustomerService();
        String customerServiceTitle = driver.getTitle();
        Assert.assertEquals(customerServiceTitle, "Support Home Page");
    }
    //TEST 5
    @Test(priority = 5)
    public void searchMacbook() throws Exception{
        //this.driver.navigate().to(this.homepageUrl);
        this.homePage.inputInSearchBox("macbook");
        this.homePage.clickSearchButton();
        String computerTitle = driver.getTitle();
        Assert.assertEquals(computerTitle, "macbook | Costco");
    }

    //TEST 6
    @Test(priority = 6)
    public void clickLocationsTab() throws Exception {
       // this.driver.navigate().to(this.homepageUrl);
        this.homePage.clickLocationsTab();
        String locationsUrl = driver.getCurrentUrl();
        Assert.assertEquals(locationsUrl, "https://www.costco.com/warehouse-locations?langId=-1&storeId=10301&catalogId=10701");
    }

    //TEST 7
    @Test (priority = 7)
    public void testDropDown()throws Exception{
        //this.driver.navigate().to(this.homepageUrl);
        this.homePage.clickDropDown();
        this.homePage.clickGrocery();
    }
    //TEST 8
    @Test (priority = 8)
    public void searchInGrocery()throws Exception{
       // this.driver.navigate().to(this.homepageUrl);
        this.homePage.clickDropDown();
        this.homePage.clickGrocery();
        this.homePage.inputInSearchBox("cereal");
        this.homePage.clickSearchButton();
    }

    @Test
    public void selectsteps() throws Exception {
        String[] testSteps = excelData.fileReader3(path, 0);
        for (String str : testSteps) {
            switch (str) {
                case "search":
                    search();
                    break;
                case "navigate":
                    clickLocationsTab();
                    break;
                default:
                    throw new InvalidArgumentException("Invalid choice");
            }
            System.out.println(str);
        }
    }
}