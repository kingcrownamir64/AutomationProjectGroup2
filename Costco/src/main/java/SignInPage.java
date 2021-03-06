import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BaseClient {

    @FindBy(id = "logonId")
    private WebElement emailAddressBar;

    @FindBy(css = ".primary")
    private WebElement signInButton;

    @FindBy(xpath = "//*[@id=\"logonPassword\"]")
    private WebElement passwordBar;

    @FindBy(xpath = "//*[@id=\"LogonForm\"]/fieldset/div[6]/a")
    private WebElement forgotPassword;


    public void typeInEmailAddress(String text) throws Exception{
        this.emailAddressBar.sendKeys(text);
        Thread.sleep(2000);
    }

    public void clickSignInButton()throws Exception{
        this.signInButton.click();
        Thread.sleep(2000);
    }

    public void typePassword(String text) throws Exception{
        this.passwordBar.sendKeys(text);
        Thread.sleep(2000);
    }

    public void clickForgetPassword()throws Exception{
        this.forgotPassword.click();
        Thread.sleep(2000);
    }
}
