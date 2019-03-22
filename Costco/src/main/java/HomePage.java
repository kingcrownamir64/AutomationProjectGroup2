import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseClient {

    @FindBy (xpath = "//*[@id=\"navigation-dropdown\"]")
    private WebElement categoriesTab;

    @FindBy (xpath = "//*[@id=\"WC_CategoriesSidebarDisplayf_links_3_2\"]")
    private WebElement computerFromDropDown;

    @FindBy(id = "search-field")
    private WebElement searchBox;

    @FindBy (xpath = "//*[@id=\"navigation-widget\"]/div/nav/a[10]")
    private WebElement locationsTab;

    @FindBy (id = "customer-service-link")
    private WebElement CustomerService;

    @FindBy(xpath = "//*[@id=\"footer-list\"]/div/div[1]/ul/li[7]/a")
    private WebElement jobsTab;

    @FindBy (css = ".co-search-thin")
    private WebElement searchButton;

    @FindBy (id = "search-dropdown-select")
    private WebElement dropDown;

    @FindBy (xpath = "//*[@id=\'search-dropdown-select\']/option[2]")
    private WebElement dropDownGrocery;

    public void clickCategoriesTab() throws Exception{
        this.categoriesTab.click();
        Thread.sleep(8000);
    }

    public void clickComputerFromDropDown()throws Exception{
        this.computerFromDropDown.click();
        Thread.sleep(5000);
    }

    public void inputInSearchBox(String text){
        this.searchBox.sendKeys(text);
    }

    public void clickLocationsTab()throws Exception{
        this.locationsTab.click();
        Thread.sleep(3000);
    }

    public void clickOnCustomerService() throws Exception{
        this.CustomerService.click();
        Thread.sleep(5000);
    }

    public void clickSearchButton() throws Exception{
        this.searchButton.click();
        Thread.sleep(3000);
    }

    public void clickDropDown() throws Exception{
        this.dropDown.click();
        Thread.sleep(3000);
    }

    public void clickGrocery() throws Exception{
        this.dropDownGrocery.click();
        Thread.sleep(3000);
    }

}



