import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sun.reflect.annotation.ExceptionProxy;

public class TestPharmacyPage extends BaseClient{

    String pharmacyUrl = "https://www.costco.com/Pharmacy/home-delivery?storeId=10301&catalogId=10701&langId=-1";
    PharmacyPage pharmacyPage;

    @BeforeClass
    public void initialize(){
        this.driver.navigate().to(this.pharmacyUrl);
        this.pharmacyPage = PageFactory.initElements(this.driver, PharmacyPage.class);
    }

    //TEST 1
    @Test
    public void TestPharmacyTitle(){
        this.driver.navigate().to(this.pharmacyUrl);
        String pharmacyTitle = driver.getTitle();
        Assert.assertEquals(pharmacyTitle, "Welcome to Costco Wholesale");
    }
    //TEST 2
    @Test
    public void TestImmunizationLink() throws Exception{
        this.driver.navigate().to(this.pharmacyUrl);
        this.pharmacyPage.clickImmunizationLink();
        String immunizationLinkTitle = driver.getTitle();
        Assert.assertEquals(immunizationLinkTitle, "Full Service Travel Medicine Consultation Program*");
    }
    //TEST 3
    @Test
    public void TestAutoRefillLink() throws Exception{
        this.driver.navigate().to(this.pharmacyUrl);
        this.pharmacyPage.clickAutoRefillLink();
        String AutoRefillLink = driver.getTitle();
        Assert.assertEquals(AutoRefillLink, "Prescription Auto Refill Program | Costco");
    }
    //TEST 4
    @Test
    public void TestMedicarePlanLink() throws Exception{
        this.driver.navigate().to(this.pharmacyUrl);
        this.pharmacyPage.clickMedicarePlanFinder();
        String MedicarePlanTitle = driver.getTitle();
        Assert.assertEquals(MedicarePlanTitle, "Medicare | Costco");
    }
    //TEST 5
    @Test
    public void TestPetMedications() throws Exception{
        this.driver.navigate().to(this.pharmacyUrl);
        this.pharmacyPage.clickPetMedications();
        String PetMedicationsTitle = driver.getTitle();
        Assert.assertEquals(PetMedicationsTitle, "Costco Rx - Pet Medications | Costco");
    }
    //TEST 6
    @Test
    public void TestPatientAccess() throws Exception{
        this.driver.navigate().to(this.pharmacyUrl);
        this.pharmacyPage.clickPatientAccess();
        String PatientAccessTitle = driver.getTitle();
        Assert.assertEquals(PatientAccessTitle, "Language Translation Services | Costco");
    }

    //TEST 7
    @Test
    public void TestVIPPS() throws Exception{
        this.driver.navigate().to(this.pharmacyUrl);
        this.pharmacyPage.clickVIPPS();
        this.pharmacyPage.clickCancelVIPPS();
    }
    //TEST 8
    @Test
    public void TestVIPPSExternalLink() throws Exception{
        this.driver.navigate().to(this.pharmacyUrl);
        this.pharmacyPage.clickVIPPS();
        this.pharmacyPage.clickVIPPSExternalLink();
    }
    //TEST 9
    @Test
    public void TestPrevImage() throws Exception{
        this.driver.navigate().to(this.pharmacyUrl);
        this.pharmacyPage.clickPrevImage();
    }
}
