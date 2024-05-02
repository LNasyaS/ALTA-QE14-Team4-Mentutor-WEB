package mentutor.pageObject;

import mentutor.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends BasePage {

//    public WebDriver driver;
//
//    public AdminPage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//    }

    public AdminPage(WebDriver driver) {
        super(driver);
    }

//    LOCATOR


    @FindBy(xpath = "//h1[@class='font-semibold text-4xl mb-10']")
    private WebElement loginPageTextAdmin;

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement loginPageEmailAdmin;

    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement loginPagePasswordAdmin;

    @FindBy(xpath = "//button[@id='btn-login']")
    private WebElement loginPageButtonAdmin;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement loginSuccessButtonAdmin;

    @FindBy(xpath = "//h1[@class='text-putih text-lg md:text-xl font-medium']")
    private WebElement adminHomePage;

    @FindBy(xpath = "//h1[@class='text-putih text-lg md:text-2xl font-normal mt-[3rem] mb-[1.4rem]']")
    private WebElement adminHomePageList;

    @FindBy(xpath = "//div[@class='w-full h-[30rem] md:h-[21rem] bg-card rounded-xl md:rounded-[20px]  text-xs md:text-base overflow-auto mb-5']/div[3]/div[@class='dropdown dropdown-end ']")
    private WebElement adminThreeDots;

    @FindBy(css = "[index='1'] .px-4")
    private WebElement adminEdit;

    @FindBy(xpath = "//input[@id='input-fullname']")
    private WebElement adminEditName;

    @FindBy(xpath = "//button[@id='btn-submitAdmin']")
    private WebElement submitButtonAdmin;

    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement submitMessageAdmin;

    @FindBy(css = "[index='1'] #delete-click")
    private WebElement adminDelete;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement adminDeleteButton;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement adminOkButton;

    @FindBy(xpath = "//div[@class='swal2-html-container']")
    private WebElement adminOkButtonAfterDelete;


//    FUNCTION

    public boolean verifyLoginPageAdmin() {
        boolean a = loginPageTextAdmin.isDisplayed();
        boolean b = loginPageEmailAdmin.isDisplayed();
        boolean c = loginPagePasswordAdmin.isDisplayed();
        boolean d = loginPageButtonAdmin.isDisplayed();
        return a && b && c && d;
    }

    public void inputAdminEmail(String email) {
        loginPageEmailAdmin.sendKeys(email);
    }

    public void inputAdminPassword(String password) {
        loginPagePasswordAdmin.sendKeys(password);
    }

    public void clickAdminLogin() {
        loginPageButtonAdmin.click();
    }


    public void clickAdminOk() {
        waitForElementClickable(loginSuccessButtonAdmin);
        loginSuccessButtonAdmin.click();
    }

    public boolean verifyAdminHomePage() {
        boolean a = adminHomePage.isDisplayed();
        boolean b = adminHomePageList.isDisplayed();
        return a && b;
    }

    public void clickAdminThreeDots() {
        waitForElementClickable(adminThreeDots);
        adminThreeDots.click();
    }

    public void clickAdminEdit() {
        waitForElementClickable(adminEdit);
        adminEdit.click();
    }

    public void inputEditNameAdmin(String name) {
        adminEditName.sendKeys(name);
    }

    public void clickSubmitButtonEditAdmin() {
        submitButtonAdmin.click();
    }

    public void clearPlaceholder() {
        adminEditName.clear();
    }

    public void extractAndVerifyMessage(String expectedMessage) {
        waitForElementVisible(submitMessageAdmin);
        String actualMessage = submitMessageAdmin.getText();
        Assert.assertEquals("Error message does not match", expectedMessage, actualMessage);
    }

    public void clickDeleteAdminButton() {
        waitForElementClickable(adminDelete);
        adminDelete.click();
    }

    public void clickYesDeleteAdminButton() {
        waitForElementVisible(adminDeleteButton);
        adminDeleteButton.click();
    }

    public void clickOKAfterEditDeleteButton() {
        waitForElementVisible(adminOkButton);
        adminOkButton.click();
    }

    public void extractAndVerifyMessageAfterDelete(String expectedMessage) {
        waitForElementVisible(adminOkButtonAfterDelete);
        String actualMessage = adminOkButtonAfterDelete.getText();
        Assert.assertEquals("Error message does not match", expectedMessage, actualMessage);
    }
}
