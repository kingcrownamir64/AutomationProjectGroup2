import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestLocationsPage extends BaseClient {

    String LocationsPageUrl = "https://www.costco.com/warehouse-locations?langId=-1&storeId=10301&catalogId=10701";
    LocationsPage locationsPage;

    @BeforeClass
    public void initialize(){
        this.driver.navigate().to(this.LocationsPageUrl);
        this.locationsPage = PageFactory.initElements(this.driver, LocationsPage.class);
    }

    @Test
    public void searchZipCode(){
        this.driver.navigate().to(this.LocationsPageUrl);
        this.locationsPage.searchLocationsZipCode("11101");
        this.locationsPage.clickLocationsSearchButton();
    }

}
