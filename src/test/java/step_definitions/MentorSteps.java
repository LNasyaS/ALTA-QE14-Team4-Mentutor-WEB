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

    @When("User input {string} as Name and {string} as password and click submit")
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
}
