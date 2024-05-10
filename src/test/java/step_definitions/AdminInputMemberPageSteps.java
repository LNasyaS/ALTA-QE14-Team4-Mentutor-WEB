package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.pageObject.AdminInputClassPage;
import mentutor.pageObject.AdminInputMemberPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class AdminInputMemberPageSteps {

    private final WebDriver driver = Hooks.driver;

    AdminInputMemberPage adminInputMemberPage = new AdminInputMemberPage(driver);

    
//    Input mentor valid data
    @When("User click input member button")
    public void userClickInputMemberButton() {
        adminInputMemberPage.clickInputMemberAdmin();
    }

    @Then("User already on admin input member page")
    public void userAlreadyOnAdminInputMemberPage() {
        Assert.assertTrue(adminInputMemberPage.verifyInputMemberPageAdmin());
    }

    @When("User input name {string} and email {string}")
    public void userInputNameAndEmail(String fullName, String email) {
        adminInputMemberPage.inputMemberFullName(fullName);
        adminInputMemberPage.inputMemberEmail(email);
    }

    @And("User choose role as mentor")
    public void userChooseRoleAsMentor() {
        adminInputMemberPage.clickInputMemberDropdownRole();
        adminInputMemberPage.clickAdminMemberRoleMentor();
    }

    @And("User choose class Bahasa Korea")
    public void userChooseClassBahasaKorea() {
        adminInputMemberPage.clickInputMemberDropdownClass();
        adminInputMemberPage.clickAdminMemberClassBahasaKorea();
    }

    @And("User input password {string}")
    public void userInputPassword(String password) {
        adminInputMemberPage.setAdminInputMemberPassword(password);
    }

    @And("User click add member button")
    public void userClickAddMemberButton() {
        adminInputMemberPage.clickAdminMemberAddButton();
    }

//    Input valid member mentee
    @And("User choose role as mentee")
    public void userChooseRoleAsMentee() {
        adminInputMemberPage.clickAdminMemberRoleMentee();
    }

//    input null member
    @Then("Message error fullname {string} appear")
    public void messageErrorFullnameAppear(String error) {
        adminInputMemberPage.verifyErrorFullNameAdmin(error);
    }

    @And("Message error email {string} appear")
    public void messageErrorEmailAppear(String error) {
        adminInputMemberPage.verifyErrorEmailAdmin(error);
    }

    @And("Message error role {string} appear")
    public void messageErrorRoleAppear(String error) {
        adminInputMemberPage.verifyErrorRoleAdmin(error);
    }

    @And("Message error class {string} appear")
    public void messageErrorClassAppear(String error) {
        adminInputMemberPage.verifyErrorClassAdmin(error);
    }

    @And("Message error password {string} appear")
    public void messageErrorPasswordAppear(String error) {
        adminInputMemberPage.verifyErrorPasswordAdmin(error);
    }

//    User input mentee with existing data but with different class
    @And("User choose class Biologi")
    public void userChooseClassBiologi() {
        adminInputMemberPage.clickInputMemberDropdownClass();
        adminInputMemberPage.clickAdminMemberClassBiologi();
    }
}
