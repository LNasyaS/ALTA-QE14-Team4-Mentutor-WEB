package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.pageObject.MentorPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class MentorSteps {

    private final WebDriver driver = Hooks.driver;

    MentorPage mentorPage = new MentorPage(driver);

//    Login
    @Given("User open the mentutor web")
    public void userOpenMentutorWeb(){
        Assert.assertTrue(mentorPage.verifyLoginPage());
    }

    @When("User input {string} as Email and {string} as password and click login")
    public void userInputAsEmailAndAsPasswordAndClickLogin(String email, String password) {
        mentorPage.setInputMentorEmail(email);
        mentorPage.setInputMentorPassword(password);
        mentorPage.setInputButtonLogin();
    }

    @Then("User already on dashboard page")
    public void userAlreadyOnDashboardPage() {
        mentorPage.setClickButtonSuccesful();
    }

//    Update Profile
    @When("User click profile on dashboard menu")
    public void userClickProfileOnDashboardMenu() {
        mentorPage.setClickProfileButton();
    }

    @And("User click icon pencil")
    public void userClickIconPencil() {
        mentorPage.setClickPencilButton();
    }

    @And("User input {string} as Name and {string} as password and click submit")
    public void userInputAsNameAndAsPasswordAndClickSubmit(String name, String password) {
        mentorPage.setInputEditName(name);
        mentorPage.setInputEditPassword(password);
        mentorPage.setClickSubmitEditButton();
    }

//    View All Task

    @When("User click task on dashboard menu")
    public void userClickTaskOnDashboardMenu() {
        mentorPage.setClickTaskButton();
    }

    @And("User choose Attachment")
    public void userChooseAttachment() { mentorPage.setClickAttachmentButton();
    }

    @And("User choose Images")
    public void userChooseImages() { mentorPage.setClickImagesButton();
    }


    @And("User input {string} as Title , {string} as Description , {string} as Due_Date")
    public void userInputAsTitleAsDescriptionAsDueDate(String Title, String Description, String Due_Date) {
        mentorPage.setInputAddTaskTitle(Title);
        mentorPage.setInputAddTaskDescription(Description);
        mentorPage.setInputAddTaskDate(Due_Date);
    }

    @And("User click add button")
    public void userClickAddButton() {mentorPage.setClickAddButton();
    }


    @And("the user clicks on the ellipsis icon")
    public void theUserClicksOnTheEllipsisIcon() {mentorPage.setClick3IconTask();
    }

    @And("selects edit on one of the available tasks")
    public void selectsEditOnOneOfTheAvailableTasks() {mentorPage.setClickEditTask();
    }

    @And("User input {string} as Title Edit , {string} as Description Edit , {string} as Due_Date Edit")
    public void userInputAsTitleEditAsDescriptionEditAsDue_DateEdit(String Title_Edit, String Description_Edit, String Due_Date_Edit) {
        mentorPage.setInputEditNameTask(Title_Edit);
        mentorPage.setInputEditDescriptionTask(Description_Edit);
        mentorPage.setInputEditDue_DateTask(Due_Date_Edit);
    }

    @And("User click submit edit task button")
    public void userClickSubmitEditTaskButton() {mentorPage.setClickSubmitEditTask();
    }


    @Then("user succes updated")
    public void userSuccesUpdated() {
        Assert.assertTrue(mentorPage.userOkEditMessage());
    }

    @And("the user clicks on the ellipsis delete icon")
    public void theUserClicksOnTheEllipsisDeleteIcon() {mentorPage.clik3IconDelete();
    }

    @And("A popup appears")
    public void aPopupAppears() {mentorPage.popUpDeleteTask2();
    }

    @And("selects delete on one of the available tasks")
    public void selectsDeleteOnOneOfTheAvailableTasks() {mentorPage.clickForDeleteTask();
    }

    @And("A popup appears, then click the delete button")
    public void aPopupAppearsThenClickTheDeleteButton() {mentorPage.clickYesDelete2();
    }

    @Then("user succes delete task")
    public void userSuccesDeleteTask() {mentorPage.userOkDelete2();
    }


    @And("User clicks See the Submitted Task by Mentees in the bottom right corner of the task")
    public void userClicksSeeTheSubmittedTaskByMenteesInTheBottomRightCornerOfTheTask() {mentorPage.clikDetailTask2();
    }


    @And("The user enters the task detail page")
    public void theUserEntersTheTaskDetailPage() {mentorPage.detailTaskPage2();
    }

    @And("The user clicks the pencil icon")
    public void theUserClicksThePencilIcon() {mentorPage.clickPencilIcon2();
    }

    @And("A pop-up for editing points appears")
    public void aPopUpForEditingPointsAppears() {mentorPage.popupEditPoints2();
    }


    @When("User input {string} as score")
    public void userInputAsScore(String score) {
        mentorPage.inputScorePoint2(score);
    }

    @And("User click submit button")
    public void userClickSubmitButton() {mentorPage.inputSubmitAtEditPoint2();
    }

    @Then("User succes assign submitted task")
    public void userSuccesAssignSubmittedTask() {mentorPage.userOKSubmitted2();
    }

    @And("User clicks the forum icon")
    public void userClicksTheForumIcon() {mentorPage.clikLogoForum2();
    }

    @And("User already on the class forum page")
    public void userAlreadyOnTheClassForumPage() {mentorPage.userAlreadyForumPage2();
    }

    @And("User input {string} as comment in one of the comment boxes corresponding to the task they selected")
    public void userInputAsCommentInOneOfTheCommentBoxesCorrespondingToTheTaskTheySelected(String comment) {
        mentorPage.inputComment2(comment);
    }

    @And("Click the send icon")
    public void clickTheSendIcon() {mentorPage.clickSendButton2();
    }

    @Then("Comment has been successfully posted")
    public void commentHasBeenSuccessfullyPosted() {mentorPage.successfullyComment2();
    }

    @And("user clicks the logout icon")
    public void userClicksTheLogoutIcon() {mentorPage.userLogout2();
    }

    @And("A logout popup appears")
    public void aLogoutPopupAppears() {mentorPage.popUpLogout2();
    }


    @And("Click Yes, logout!")
    public void clickYesLogout() {mentorPage.buttonYesLogout2();
    }

    @Then("successfully logged out")
    public void successfullyLoggedOut() {mentorPage.successfullyLogout2();
    }

    @Then("Task successfully created")
    public void taskSuccessfullyCreated() {mentorPage.successfullyCreated2();
    }

    @Then("User succes update profile")
    public void userSuccesUpdateProfile() {mentorPage.succescUpdatedProfile2();
    }
}
