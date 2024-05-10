package mentutor.pageObject;

import mentutor.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminInputClassPage extends BasePage {

    public AdminInputClassPage(WebDriver driver) {
        super(driver);
    }

//    LOCATOR
    @FindBy(xpath = "//div[@id='nav-input']")
    private WebElement inputClassAdmin;

    @FindBy(xpath = "//h1[@class='text-putih text-lg md:text-2xl font-medium']")
    private WebElement inputClassPage;

    @FindBy(xpath = "//div[@class='flex flex-row text-putih md:text-base  px-3 md:px-7 py-2 space-x-2 sticky top-0 z-10 bg-card border-abu border-opacity-50 border-b']")
    private WebElement inputClassListAdmin;


    @FindBy(xpath = "//input[@name='classname']")
    private WebElement inputClassAdminPlaceholder;

    @FindBy(xpath = "//button[@id='btn-addClass']")
    private WebElement addClassButtonAdmin;

    @FindBy(xpath = "//p[.='class is required']")
    private WebElement errorMessageClassAdmin;

    @FindBy(xpath = "//div[@class='w-full h-[26rem] md:h-[18rem] bg-card rounded-xl md:rounded-[20px] text-xs md:text-lg overflow-auto mb-7']/div[2]//label[@id='icon-options']")
    private WebElement editClassThreeDots;

    @FindBy(xpath = "//div[@class='w-full h-[26rem] md:h-[18rem] bg-card rounded-xl md:rounded-[20px] text-xs md:text-lg overflow-auto mb-7']/div[2]//label[@id='edit-click']")
    private WebElement editClassAdmin;

    @FindBy(xpath = "//div[@class='flex flex-col space-y-2 my-5']/input[@id='input-class']")
    private WebElement adminEditClassPlaceholder;

    @FindBy(xpath = "//select[@id='dropdown-status']")
    private WebElement adminEditClassDropdownStatus;

    @FindBy(xpath = "//button[@id='btn-submitEditClass']")
    private WebElement adminEditClassSubmitButton;


    @FindBy(xpath = "//option[@id='active']")
    private WebElement adminEditClassStatusActive;

    @FindBy(xpath = "//option[@id='non_active']")
    private WebElement adminEditClassStatusNonActive;


//    @FindBy(xpath = "//h2[@class='swal2-title']")
//    private WebElement adminSuccessUpdatedClassMessage;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement adminClassUpdatedOkButton;

    @FindBy(xpath = "//label[.='✕']")
    private WebElement adminClassEditCloseButton;

    @FindBy(xpath = "//div[@class='w-full h-[26rem] md:h-[18rem] bg-card rounded-xl md:rounded-[20px] text-xs md:text-lg overflow-auto mb-7']/div[2]/p[@class='w-[17%] text-center text-[#E41E1E]']")
    private WebElement adminClassStatus;

    @FindBy(css = ".mb-7 > div:nth-of-type(2) > p:nth-of-type(2)")
    private WebElement adminClassName;

    @FindBy(xpath = "//div[@class='w-full h-[26rem] md:h-[18rem] bg-card rounded-xl md:rounded-[20px] text-xs md:text-lg overflow-auto mb-7']/div[2]//li[@id='delete-click']")
    private WebElement adminClassEditDeleteButton;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement adminClassYesDeleteButton;

    @FindBy(xpath = "//p[.='class must be 5 characters']")
    private WebElement adminClassErrorCharacters;



//    FUNCTION
    public void clickInputClassAdmin() {
        waitForElementClickable(inputClassAdmin);
        inputClassAdmin.click();
    }

    public boolean verifyInputClassPageAdmin() {
        boolean a = inputClassPage.isDisplayed();
        boolean b = inputClassListAdmin.isDisplayed();
        return a && b;
    }

    public void inputClassAdmin(String className) {
        inputClassAdminPlaceholder.sendKeys(className);
    }

    public void clickAddClassAdmin() {
        addClassButtonAdmin.click();
    }

    public void verifyErrorAddClassAdmin(String expectedMessage) {
        waitForElementVisible(errorMessageClassAdmin);
        String actualMessage = errorMessageClassAdmin.getText();
        Assert.assertEquals("Error message does not match", expectedMessage, actualMessage);
    }

    public void clickAdminClassThreeDots() {
        waitForElementClickable(editClassThreeDots);
        editClassThreeDots.click();
    }

    public void clickAdminClassEdit() {
        waitForElementClickable(editClassAdmin);
        editClassAdmin.click();
    }

    public boolean verifyEditClassPopUpPage() {
        waitForElementVisible(adminEditClassPlaceholder);
        waitForElementVisible(adminEditClassDropdownStatus);
        waitForElementVisible(adminEditClassSubmitButton);
        boolean a = adminEditClassPlaceholder.isDisplayed();
        boolean b = adminEditClassDropdownStatus.isDisplayed();
        boolean c = adminEditClassSubmitButton.isDisplayed();
        return a && b && c;
    }

    public void clickAdminClassEditDropdown() {
        waitForElementClickable(adminEditClassDropdownStatus);
        adminEditClassDropdownStatus.click();
    }

    public void clickAdminClassEditStatus() {
        waitForElementClickable(adminEditClassStatusNonActive);
        adminEditClassStatusNonActive.click();
//        waitForElementClickable(adminEditClassStatusActive);
//        adminEditClassStatusActive.click();
    }

    public void clickAdminClassEditSubmitButton() {
        waitForElementClickable(adminEditClassSubmitButton);
        adminEditClassSubmitButton.click();
    }

//    public void extractAndVerifyMessage(String expectedMessage) {
//        waitForElementVisible(adminSuccessUpdatedClassMessage);
//        String actualMessage = adminSuccessUpdatedClassMessage.getText();
//        Assert.assertEquals("Error message does not match", expectedMessage, actualMessage);
//    }

    public void clickAdminClassEditOkButton() {
        waitForElementClickable(adminClassUpdatedOkButton);
        adminClassUpdatedOkButton.click();
    }

    public void clickAdminClassEditCloseButton() {
        waitForElementClickable(adminClassEditCloseButton);
        adminClassEditCloseButton.click();
    }

    public void verifyStatusClassChange(String classStatus) {
        waitForElementVisible(adminClassStatus);
        String actualMessage = adminClassStatus.getText();
        Assert.assertEquals("Class status does not match", classStatus, actualMessage);
    }

    public void clearClassNamePlaceholder() {
        adminEditClassPlaceholder.clear();
    }

    public void inputEditClassName(String className) {
        adminEditClassPlaceholder.sendKeys(className);
    }

    public void verifyClassNameChange(String className) {
        waitForElementVisible(adminClassName);
        String actualMessage = adminClassName.getText();
        Assert.assertEquals("Class name does not match", className, actualMessage);
    }

    public void clickAdminClassDeleteButton() {
        waitForElementClickable(adminClassEditDeleteButton);
        adminClassEditDeleteButton.click();
    }


    public void clickAdminClassYesDeleteButton() {
        waitForElementClickable(adminClassYesDeleteButton);
        adminClassYesDeleteButton.click();
    }

    public void verifyErrorAddClassCharacter(String expectedMessage) {
        waitForElementVisible(adminClassErrorCharacters);
        String actualMessage = adminClassErrorCharacters.getText();
        Assert.assertEquals("Error message does not match", expectedMessage, actualMessage);
    }
}
