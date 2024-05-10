package mentutor.pageObject;

import mentutor.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminInputMemberPage extends BasePage {

    public AdminInputMemberPage(WebDriver driver) {
        super(driver);
    }

//    LOCATOR

    @FindBy(xpath = "//div[@id='nav-member']")
    private WebElement adminInputMemberButton;

    @FindBy(xpath = "//input[@id='input-fullname']")
    private WebElement adminInputMemberFullName;

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement adminInputMemberEmail;

    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement adminInputMemberPassword;

    @FindBy(xpath = "//select[@id='dropdown-role']")
    private WebElement adminInputMemberDropdownRole;

    @FindBy(xpath = "//option[@id='mentor']")
    private WebElement adminInputMemberDropdownMentor;

    @FindBy(xpath = "//option[@id='mentee']")
    private WebElement adminInputMemberDropdownMentee;

    @FindBy(xpath = "//select[@id='dropdown-class']")
    private WebElement adminInputMemberDropdownClass;

    @FindBy(xpath = "//option[.='Bahasa Korea']")
    private WebElement adminInputMemberClassBahasaKorea;

    @FindBy(xpath = "//option[.='Biologi 3']")
    private WebElement adminInputMemberClassBiologi;
    //option[.='Biologi 3']

    @FindBy(xpath = "//button[@id='btn-addMember']")
    private WebElement adminInputMemberAddButton;

    @FindBy(xpath = "//p[.='Fullname is required']")
    private WebElement adminErrorFullnameIsRequired;

    @FindBy(css = ".space-y-4 > div:nth-of-type(2) > .break-words")
    private WebElement adminErrorEmailIsRequired;

    @FindBy(xpath = "//p[.='Role is required']")
    private WebElement adminErrorRoleIsRequired;

    @FindBy(xpath = "//p[.='Class is required']")
    private WebElement adminErrorClassIsRequired;

    @FindBy(css= "div:nth-of-type(4) > .break-words")
    private WebElement adminErrorPasswordIsRequired;





//    FUNCTION
    public void clickInputMemberAdmin() {
        waitForElementClickable(adminInputMemberButton);
        adminInputMemberButton.click();
    }

    public void inputMemberFullName(String fullName) {
        adminInputMemberFullName.sendKeys(fullName);
    }

    public void inputMemberEmail(String email) {
        adminInputMemberEmail.sendKeys(email);
    }

    public void setAdminInputMemberPassword(String password) {
        adminInputMemberPassword.sendKeys(password);
    }

    public void clickInputMemberDropdownRole() {
        waitForElementClickable(adminInputMemberDropdownRole);
        adminInputMemberDropdownRole.click();
    }

    public void clickInputMemberDropdownClass() {
        waitForElementClickable(adminInputMemberDropdownClass);
        adminInputMemberDropdownClass.click();
    }

    public void clickAdminMemberRoleMentor() {
        waitForElementClickable(adminInputMemberDropdownMentor);
        adminInputMemberDropdownMentor.click();
    }

    public void clickAdminMemberRoleMentee() {
        waitForElementClickable(adminInputMemberDropdownMentee);
        adminInputMemberDropdownMentee.click();
    }

    public void clickAdminMemberClassBahasaKorea() {
        waitForElementClickable(adminInputMemberClassBahasaKorea);
        adminInputMemberClassBahasaKorea.click();
    }

    public void clickAdminMemberClassBiologi() {
        waitForElementClickable(adminInputMemberClassBiologi);
        adminInputMemberClassBiologi.click();
    }

    public boolean verifyInputMemberPageAdmin() {
        waitForElementVisible(adminInputMemberFullName);
        waitForElementVisible(adminInputMemberEmail);
        waitForElementVisible(adminInputMemberPassword);
        waitForElementVisible(adminInputMemberDropdownRole);
        waitForElementVisible(adminInputMemberDropdownClass);
        boolean a = adminInputMemberFullName.isDisplayed();
        boolean b = adminInputMemberEmail.isDisplayed();
        boolean c = adminInputMemberPassword.isDisplayed();
        boolean d = adminInputMemberDropdownRole.isDisplayed();
        boolean e = adminInputMemberDropdownClass.isDisplayed();
        return a && b && c && d && e;
    }

    public void clickAdminMemberAddButton() {
        waitForElementClickable(adminInputMemberAddButton);
        adminInputMemberAddButton.click();
    }

    public void verifyErrorFullNameAdmin(String expectedMessage) {
        waitForElementVisible(adminErrorFullnameIsRequired);
        String actualMessage = adminErrorFullnameIsRequired.getText();
        Assert.assertEquals("Error message does not match", expectedMessage, actualMessage);
    }

    public void verifyErrorEmailAdmin(String expectedMessage) {
        waitForElementVisible(adminErrorEmailIsRequired);
        String actualMessage = adminErrorEmailIsRequired.getText();
        Assert.assertEquals("Error message does not match", expectedMessage, actualMessage);
    }
    public void verifyErrorRoleAdmin(String expectedMessage) {
        waitForElementVisible(adminErrorRoleIsRequired);
        String actualMessage = adminErrorRoleIsRequired.getText();
        Assert.assertEquals("Error message does not match", expectedMessage, actualMessage);
    }
    public void verifyErrorClassAdmin(String expectedMessage) {
        waitForElementVisible(adminErrorClassIsRequired);
        String actualMessage = adminErrorClassIsRequired.getText();
        Assert.assertEquals("Error message does not match", expectedMessage, actualMessage);
    }
    public void verifyErrorPasswordAdmin(String expectedMessage) {
        waitForElementVisible(adminErrorPasswordIsRequired);
        String actualMessage = adminErrorPasswordIsRequired.getText();
        Assert.assertEquals("Error message does not match", expectedMessage, actualMessage);
    }
}
