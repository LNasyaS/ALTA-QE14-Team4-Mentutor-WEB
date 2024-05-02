package step_definitions;


import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.pageObject.AdminPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminSteps {

    private final WebDriver driver = Hooks.driver;
    AdminPage adminPage = new AdminPage(driver);

    @Given("User open the admin web page")
    public void verifyLoginPageAdmin() {
        Assert.assertTrue(adminPage.verifyLoginPageAdmin());
    }

    @When("User input {string} as email and {string} as password and click login")
    public void userInputAsEmailAndAsPasswordAndClickLogin(String email, String password) {
        adminPage.inputAdminEmail(email);
        adminPage.inputAdminPassword(password);
        adminPage.clickAdminLogin();
    }

    @Then("User login successfully and click ok button")
    public void userLoginSuccessfullyAndClickOkButton() {
//        Assert.assertTrue(adminPage.verifyLoginSuccessAdmin());
        adminPage.clickAdminOk();
    }


    @And("User already on admin home page")
    public void userAlreadyOnAdminHomePage() {
        Assert.assertTrue(adminPage.verifyAdminHomePage());
    }


    @When("User click three dots")
    public void userClickThreeDots() {
        adminPage.clickAdminThreeDots();
    }


    @And("User click edit")
    public void userClickEdit() {
        adminPage.clickAdminEdit();
    }


    @And("User edit {string} as name and click submit")
    public void userEditAsNameAndClickSubmit(String name) {
        adminPage.inputEditNameAdmin(name);
        adminPage.clickSubmitButtonEditAdmin();
    }

    @And("User edit name empty and click submit")
    public void userEditNameEmptyAndClickSubmit() {
        adminPage.clearPlaceholder();
        adminPage.clickSubmitButtonEditAdmin();

    }

    @Then("Message {string} appear")
    public void messageAppearAndClickOk(String expectedMessage) {
        adminPage.extractAndVerifyMessage(expectedMessage);
    }

    @And("User click delete")
    public void userClickDelete() {
        adminPage.clickDeleteAdminButton();
    }


    @And("User click yes delete button")
    public void userClickYesDeleteButton() {
        adminPage.clickYesDeleteAdminButton();
    }


    @Then("Message delete {string} appear")
    public void messageDeleteAppearAndClickOk(String expectedMessage) {
        adminPage.extractAndVerifyMessage(expectedMessage);
    }
}