package step_definitions;


import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.pageObject.AdminHomePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class AdminHomePageSteps {

    private final WebDriver driver = Hooks.driver;
    AdminHomePage adminHomePage = new AdminHomePage(driver);

//    User edit list mentor mentee at homepage
    @Given("User open the admin web page")
    public void verifyLoginPageAdmin() {
        Assert.assertTrue(adminHomePage.verifyLoginPageAdmin());
    }

    @When("User input {string} as email and {string} as password and click login")
    public void userInputAsEmailAndAsPasswordAndClickLogin(String email, String password) {
        adminHomePage.inputAdminEmail(email);
        adminHomePage.inputAdminPassword(password);
        adminHomePage.clickAdminLogin();
    }

    @Then("User login successfully and click ok button")
    public void userLoginSuccessfullyAndClickOkButton() {
        adminHomePage.clickAdminOk();
    }


    @And("User already on admin home page")
    public void userAlreadyOnAdminHomePage() {
        Assert.assertTrue(adminHomePage.verifyAdminHomePage());
    }


//    User edit list mentor mentee without input name at homepage
    @When("User click three dots")
    public void userClickThreeDots() {
        adminHomePage.clickAdminThreeDots();
    }


    @And("User click edit")
    public void userClickEdit() {
        adminHomePage.clickAdminEdit();
    }


    @And("User edit {string} as name and click submit")
    public void userEditAsNameAndClickSubmit(String name) {
        adminHomePage.inputEditNameAdmin(name);
        adminHomePage.clickSubmitButtonEditAdmin();
    }

    @And("User edit name empty and click submit")
    public void userEditNameEmptyAndClickSubmit() {
        adminHomePage.clearPlaceholder();
        adminHomePage.clickSubmitButtonEditAdmin();

    }

//    User delete list mentor mentee at homepage
    @Then("Message {string} appear")
    public void messageAppearAndClickOk(String expectedMessage) {
        adminHomePage.extractAndVerifyMessage(expectedMessage);
    }

    @And("User click delete")
    public void userClickDelete() {
        adminHomePage.clickDeleteAdminButton();
    }


    @And("User click yes delete button")
    public void userClickYesDeleteButton() {
        adminHomePage.clickYesDeleteAdminButton();
    }


    @Then("Message delete {string} appear")
    public void messageDeleteAppearAndClickOk(String expectedMessage) {
        adminHomePage.extractAndVerifyMessageAfterDelete(expectedMessage);
    }

//  Admin logout
    @When("User click logout button")
    public void userClickLogoutButton() {
        adminHomePage.clickAdminLogout();
    }

    @When("User click yes logout button")
    public void userClickYesLogoutButton() {
        adminHomePage.clickAdminYesLogout();
    }

    @When("User click ok button")
    public void userClickOkButton() {
        adminHomePage.clickAdminOkLogout();
    }


    @Then("User can see admin web page")
    public void userCanSeeAdminWebPage() {
        Assert.assertTrue(adminHomePage.verifyLoginPageAdmin());
    }

//    Admin cancel logout
    @When("User click cancel logout button")
    public void userClickCancelLogoutButton() {
        adminHomePage.clickAdminCancelLogout();
    }
}