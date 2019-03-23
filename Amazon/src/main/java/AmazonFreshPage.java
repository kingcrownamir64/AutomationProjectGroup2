import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AmazonFreshPage extends BaseClient {


    @FindBy(id = "a-autoid-0-announce")
    private WebElement DairyButton;

    @FindBy(id = "a-autoid-1-announce")
    private WebElement DeliButton;

    @FindBy(id = "a-autoid-2-announce")
    private WebElement BakeryButton;

    @FindBy(id = "a-autoid-3-announce")
    private WebElement FreshFruitButton;

    @FindBy(id = "a-autoid-4-announce")
    private WebElement MealKitButton;

    @FindBy(id = "a-autoid-5-announce")
    private WebElement BeveragesButton;

    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[2]")
    private WebElement PastPurchasesButton;

    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[3]")
    private WebElement FreshDealsButton;

    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[4]")
    private WebElement GroceriesButton;

    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[5]")
    private WebElement HouseholdHealthBeautyButton;

    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[6]")
    private WebElement LocalMarketButton;



    public void SetDairyButton() { this.DairyButton.click();
    }

    public void SetDeliButton() { this.DeliButton.click();
    }

    public void SetBakeryButton() { this.BakeryButton.click();
    }

    public void SetFreshFruitButton() { this.FreshFruitButton.click();
    }

    public void SetMealKitButton() { this.MealKitButton.click();
    }

    public void SetBeveragesButton() { this.BeveragesButton.click();
    }

    public void SetPastPurchasesButton() { this.PastPurchasesButton.click();
    }

    public void SetFreshDealsButton() { this.FreshDealsButton.click();
    }

    public void SetGroceriesButton() { this.GroceriesButton.click();
    }

    public void SetHouseholdHealthBeautyButton() { this.HouseholdHealthBeautyButton.click();
    }

    public void SetLocalMarketButton() { this.LocalMarketButton.click();
    }
}

