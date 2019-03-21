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

    public void clickCategoriesTab() throws Exception{
        this.categoriesTab.click();
        Thread.sleep(3000);
    }

    public void clickComputerFromDropDown()throws Exception{
        this.computerFromDropDown.click();
        Thread.sleep(3000);
    }

    public void inputInSearchBox(String text){
        this.searchBox.sendKeys(text);
    }

    public void clickLocationsTab()throws Exception{
        this.locationsTab.click();
        Thread.sleep(2000);
    }

}



