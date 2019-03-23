import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class PharmacyPage extends BaseClient{

    @FindBy (xpath = "/html/body/div[6]/div/div[1]/a/div/div/p[2]")
    private WebElement immunizationLink;

    @FindBy (xpath = "/html/body/div[6]/div/div[2]/a/div/div/p[2]")
    private WebElement autoRefillProgram;

    @FindBy (xpath = "/html/body/div[6]/div/div[4]/a/div/div/p[2]")
    private WebElement medicarePlanFinder;

    @FindBy (xpath = "//html/body/div[8]/div/div[2]/a/div/div/p[2]")
    private WebElement petMedications;

    @FindBy (xpath = "/html/body/div[8]/div/div[3]/a/div/div/p[2]")
    private WebElement patientAccess;

    @FindBy (xpath = "/html/body/div[8]/div/div[4]/a/div/div/p[2]")
    private WebElement VIPPS;

    @FindBy (xpath = "//*[@id=\"costcoModal\"]/div/div/div[3]/div[1]/div[1]/button")
    private WebElement cancelVIPPS;

    @FindBy (xpath = "//*[@id=\"costcoModalBtn2\"]")
    private WebElement VIPPSExternalLink;

    @FindBy (xpath = "//*[@id=\"hero-carousel\"]/button[1]")
    private WebElement prevImage;


    public void clickImmunizationLink()throws Exception{
        this.immunizationLink.click();
        Thread.sleep(2000);
    }

    public void clickAutoRefillLink() throws Exception{
        this.autoRefillProgram.click();
        Thread.sleep(2000);
    }

    public void clickMedicarePlanFinder() throws Exception{
        this.medicarePlanFinder.click();
        Thread.sleep(2000);
    }

    public void clickPetMedications() throws Exception{
        this.petMedications.click();
        Thread.sleep(2000);
    }

    public void clickPatientAccess() throws Exception{
        this.patientAccess.click();
        Thread.sleep(2000);
    }

    public void clickVIPPS()throws Exception{
        this.VIPPS.click();
        Thread.sleep(2000);
    }

    public void clickCancelVIPPS() throws Exception{
        this.cancelVIPPS.click();
        Thread.sleep(2000);
    }

    public void clickVIPPSExternalLink() throws Exception{
        this.VIPPSExternalLink.click();
        Thread.sleep(2000);
    }

    public void clickPrevImage() throws Exception{
        for (int i = 0; i < 5; i++){
            this.prevImage.click();
            Thread.sleep(2000);
        }
    }
}