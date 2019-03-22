import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

    public class HomePage extends BaseClient {


        @FindBy(id = "twotabsearchtextbox")
        private WebElement searchBox;

        @FindBy(className = "nav-input")
        private WebElement searchButton;

        @FindBy(id = "nav-cart")
        private WebElement cartButton;

        @FindBy(id="nav-your-amazon")
        private WebElement YourAmazonButton;

        @FindBy(xpath="//*[@id='nav-link-accountList'']/span[2]")
        private WebElement LanguageBar;

        @FindBy (xpath = "//*[@id=\"nav-flyout-ya-signin\"]/a/span")
        private WebElement topLink;

        @FindBy(id="nav-hamburger-menu")
        private WebElement MenuButton;

        @FindBy(xpath="//*[@id=\"nav-xshop\"]/a[2]")
        private WebElement TodaysdealButton;

        @FindBy(xpath = "//*[@id=\"nav-link-prime\"]/span[2]")
        private WebElement AccountAndListDropDownMenu;

        @FindBy(id = "nav-orders")
        private WebElement ordersButton;

        @FindBy(xpath = "//*[@id=\"nav-logo\"]/a[2]")
        private WebElement TryPrimeButton;


        public void searchBoxHome(String text) { this.searchBox.sendKeys(text);
        }

        public void SearchButtonHome() {
            this.searchBox.click();
        }

        public void setCartButton() {
            this.cartButton.click();
        }

        public void setYourAmazonButton() {
            this.YourAmazonButton.click();
        }

        public void setLanguageBar() {
            this.LanguageBar.click();
        }

        public void setMenuButton() {
            this.MenuButton.click();
        }

        public void setTodaysdealButton() {
            this.TodaysdealButton.click();
        }

        public void setAccountAndListDropDownMenu(WebElement accountAndListDropDownMenu) {
            AccountAndListDropDownMenu = accountAndListDropDownMenu;
        }

        public void setAccountAndListDropDownMenu() throws Exception {
            Actions actions = new Actions(driver);
            actions.moveToElement(AccountAndListDropDownMenu).perform();
            Thread.sleep(2000);
            actions.moveToElement(topLink).perform();
            Thread.sleep(1500);
            actions.click().build().perform();
        }

        public void setOrdersButton() {
            this.ordersButton.click();
        }

        public void setTryPrimeButton() throws InterruptedException { this.TryPrimeButton.click();
            Thread.sleep(2000);
        }

    }

