package step_definitions;

import hooks.Hooks;
import io.cucumber.java.an.E;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.pageObject.MenteePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class MenteeSteps {

    private final WebDriver driver = Hooks.driver;

    MenteePage menteePage = new MenteePage(driver);

    //login
    @Given("User open the web mentutor")
    public void userOpenWebMentutor(){
        Assert.assertTrue(menteePage.verifyLoginPage());
    }

    @When("Email input {string} as userName and {string} as password and click login")
    public void emailInputAsUserNameAndAsPasswordAndClickLogin(String email, String password) {
        menteePage.InputEmailMentee(email);
        menteePage.InputPasswordMentee(password);
        menteePage.clickButtonMentee();
    }


    @Then("User login succes and click ok")
    public void userLoginSuccesAndClickOk() {
        menteePage.setClickLoginSuccesful();
    }

    //edit profile Mentee
    @When("User edit profile Mentee")
    public void userEditProfileMentee() {
        menteePage.setClickButtonProfile();
    }

    @And("Click pencil icon")
    public void clickPencilIcon() {
        menteePage.setClickButtonPecil();
    }

    @And("Input {string} as Name {string} as email and {string} as password and click login")
    public void inputAsNameAsEmailAndAsPasswordAndClickLogin(String name, String email, String password) {
        menteePage.InputYourName(name);
        menteePage.InputYourEmail(email);
        menteePage.InputYourPassword(password);
        menteePage.ClickSubmitProfile();
    }


    @Then("Will out notice ok")
    public void willOutNoticeOk() {
        menteePage.ClickOk();
    }


    //submit task
    @When("Click dashboard task")
    public void clickDashboardTask() {
        menteePage.ClickTaskMentee();
    }

    @And("User click Submit your task")
    public void userClickSubmitYourTask() {
        menteePage.ClickSubmitYourTask();
    }

    @And("User Choose File")
    public void userChooseFile() {
        menteePage.setChoose();
    }

    @And("Click submit")
    public void clickSubmit() {
        menteePage.ClickSubmit2();
    }

    @Then("Will out notice ok submit task")
    public void willOutNoticeOkSubmitTask() {
        menteePage.setClickSummitTask();
    }


    //comment 
    @When("Click dashboard forum")
    public void clickDashboardForum() {
        menteePage.ClickForum();
    }
    
    @And("Input share something {string}")
    public void inputShare(String halo) {
        menteePage.ShareSomething(halo);
    }

    @And("Click send button")
    public void clickSendButton() {
        menteePage.ClickSend();
    }

    @Then("Will out succes update")
    public void willOutSuccesUpdate() {
        menteePage.SetSuccessForum();
    }

    @And("Input comment here {string}")
    public void inputCommentHere(String commentHere) {
        menteePage.CommentHere(commentHere);
    }

    @Then("Click icon send")
    public void clickIconSend() {
        menteePage.IconSendResponseForum();
    }

    //comment add images
//    @When("Click image icon and chose file")
//    public void clickImageIconAndChoseFile(){
//        menteePage.ForumUploadImages();
//    }

    @When("user click view all task")
    public void userClickViewAllTask() {
        menteePage.ViewAllTask();
    }

    //home view all task
    @When("User click profile icon mentee user will redirected to profile")
    public void userClickProfileIconMenteeUserWillRedirectedToProfile() {
        menteePage.HomeProfileMentee();
    }


    //download document
    @When("User click download document at homepage")
    public void userClickDownloadDocumentAtHomepage() {
        menteePage.DownloadDocument();
    }


    //log out
    @And("User click log out icon")
    public void userClickLogOutIcon() {
        menteePage.LogOut();
    }

    @And("Click yes log out")
    public void clickYesLogOut() {
        menteePage.YesLogOut();
    }

    @Then("User successfuly log out")
    public void userSuccessfulyLogOut() {
        Assert.assertTrue(menteePage.SuccesLogOut());
    }
//
    @And("Click image icon")
    public void clickImageIcon() {
        menteePage.ClickImageForum();
    }

    @When("Chose file upload image")
    public void choseFileUploadImage() {
        menteePage.UploadImagesForum();
    }



}
