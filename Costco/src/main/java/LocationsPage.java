import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocationsPage extends BaseClient {

    @FindBy (id = "search-warehouse")
    private WebElement searchLocation;

    @FindBy(xpath = "//*[@id=\"warehouse-locator-search-form\"]/div[1]/span/button")
    private WebElement LocationsSearchButton;

    @FindBy (css = ".tertiary")
    private WebElement viewMoreLocations;

    public void searchLocationsZipCode(String text){
        this.searchLocation.sendKeys(text);
    }

    public void clickLocationsSearchButton() throws Exception{
        this.LocationsSearchButton.click();
        Thread.sleep(3000);
    }

    public void clickViewMoreLocations() throws Exception{
        this.viewMoreLocations.click();
        Thread.sleep(2000);
    }
}
