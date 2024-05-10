package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.pageObject.AdminInputClassPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class AdminInputClassPageSteps {

    private final WebDriver driver = Hooks.driver;

    AdminInputClassPage adminInputClassPage = new AdminInputClassPage(driver);



//  User add valid class
    @When("User click input class button")
    public void userClickInputClassButton() {
        adminInputClassPage.clickInputClassAdmin();
    }


    @Then("User already on admin input class page")
    public void userAlreadyOnAdminInputClassPage() {
        Assert.assertTrue(adminInputClassPage.verifyInputClassPageAdmin());
    }

    @When("User input {string} as class name and click add button")
    public void userInputAsClassNameAndClickAddButton(String className) {
        adminInputClassPage.inputClassAdmin(className);
        adminInputClassPage.clickAddClassAdmin();
    }

    @When("User click add class button")
    public void userClickAddClassButton() {
        adminInputClassPage.clickAddClassAdmin();
    }

    @Then("Message error {string} appear")
    public void messageErrorAppear(String expectedMessage) {
        adminInputClassPage.verifyErrorAddClassAdmin(expectedMessage);
    }

//  User edit list active non active class
    @When("User click three dots class list")
    public void userClickThreeDotsClassList() {
        adminInputClassPage.clickAdminClassThreeDots();
    }


    @And("User click edit class")
    public void userClickEditClass() {
        adminInputClassPage.clickAdminClassEdit();
    }

    @Then("User can see edit class pop up page")
    public void userCanSeeEditClassPopUpPage() {
        Assert.assertTrue(adminInputClassPage.verifyEditClassPopUpPage());
    }

    @When("User click active dropdown")
    public void userClickActiveDropdown() {
        adminInputClassPage.clickAdminClassEditDropdown();
    }

    @And("User click non active button")
    public void userClickNonActiveButton() {
        adminInputClassPage.clickAdminClassEditStatus();
    }

    @And("User click submit button")
    public void userClickSubmitButton() {
        adminInputClassPage.clickAdminClassEditSubmitButton();
    }

    @When("User click ok success update class button")
    public void userClickOkSuccessUpdateClassButton() {
        adminInputClassPage.clickAdminClassEditOkButton();
    }

    @And("User click close edit class button")
    public void userClickCloseEditClassButton() {
        adminInputClassPage.clickAdminClassEditCloseButton();
    }

    @Then("User can see updated class list change to {string}")
    public void userCanSeeUpdatedClassListChangeTo(String classStatus) {
        adminInputClassPage.verifyStatusClassChange(classStatus);
    }

//  User edit list class without input data
    @When("User click change class name to null")
    public void userClickChangeClassNameToNull() {
        adminInputClassPage.clearClassNamePlaceholder();
    }


//  User edit list class name
    @When("User click change class name to {string}")
    public void userClickChangeClassNameTo(String className) {
        adminInputClassPage.clearClassNamePlaceholder();
        adminInputClassPage.inputEditClassName(className);
    }

    @Then("User can see updated class name change to {string}")
    public void userCanSeeUpdatedClassNameChangeTo(String className) {
        adminInputClassPage.verifyClassNameChange(className);
    }


//    User delete list class
    @And("User click delete class")
    public void userClickDeleteClass() {
        adminInputClassPage.clickAdminClassDeleteButton();
    }

    @And("User click class yes delete button")
    public void userClickClassYesDeleteButton() {
        adminInputClassPage.clickAdminClassYesDeleteButton();
    }

//  User input invalid class
    @Then("Message error add class {string} appear")
    public void messageErrorAddClassAppear(String error) {
        adminInputClassPage.verifyErrorAddClassCharacter(error);
    }
}
