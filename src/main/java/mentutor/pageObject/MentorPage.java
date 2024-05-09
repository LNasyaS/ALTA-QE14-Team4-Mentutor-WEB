package mentutor.pageObject;

import mentutor.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;

public class MentorPage extends BasePage {

    public MentorPage(WebDriver driver) {
        super(driver);
    }


//Locator

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement inputMentorEmail;

    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement inputMentorPassword;

    @FindBy(xpath = "//button[@id='btn-login']")
    private WebElement clickLogin;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement clickLoginSucces;

    @FindBy(xpath = "//h3[.='Profile']")
    private WebElement clickProfileButton;

    @FindBy(xpath = "//label[@class='h-8 w-8 md:h-10 md:w-10 bg-card shadow-md text-putih flex items-center justify-center rounded-[5px] cursor-pointer']")
    private WebElement clickPencilButton;

    @FindBy(xpath = "//input[@id='input-fullname']")
    private WebElement inputEditName;

    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement inputEditPassword;

    @FindBy(xpath = "//button[@id='btn-submitMentee']")
    private WebElement clickSubmitEditButton;

    @FindBy(xpath = "//h3[.='Task']")
    private WebElement clickTaskButton;

    @FindBy(xpath = "//input[@name='title']")
    private WebElement inputAddTaskTitle;

    @FindBy(xpath = "//textarea[@id='input-desc']")
    private WebElement inputAddTaskDescription;

    @FindBy(xpath = "//input[@id='input-date']")
    private WebElement inputAddTaskDate;

    @FindBy(xpath = "//input[@id='uploadfile-btn']")
    private WebElement clickAttachmentButton;

    @FindBy(xpath = "//input[@id='uploadimage-btn']")
    private WebElement clickImagesButton;

    @FindBy(xpath = "//button[@id='input-file']")
    private WebElement clickAddButton;

    @FindBy( className = "dropdown dropdown-bottom dropdown-end")
    private WebElement click3IconTask;

    @FindBy(xpath = "//div[@class='h-screen ml-[50px] md:ml-[200px] lg:ml-[320px] relative p-6 md:px-14 md:pt-10 md:pb-10 ']/form[1]//label[@class='hover:text-button px-4 pt-2 text-sm text-abu cursor-pointer']")
    private WebElement clickEditTask;

    @FindBy(xpath = "//input[@value='TaskAPI']")
    private WebElement inputEditNameTask;

    @FindBy(xpath = "//input[@id='input-description']")
    private WebElement inputEditDescriptionTask;

    @FindBy(xpath = "//input[@id='input-due_date']")
    private WebElement inputEditDue_DateTask;

    @FindBy(xpath = "//button[@id='btn-submitTask']")
    private WebElement clickSubmitEditTask;

// FUNCTION

    public boolean verifyLoginPage() {
        boolean a = inputMentorEmail.isDisplayed();
        boolean b = inputMentorPassword.isDisplayed();
        boolean c = clickLogin.isDisplayed();
        return a && b && c;
    }

    public void setInputMentorEmail(String MentorEmail) {
        inputMentorEmail.sendKeys(MentorEmail);
    }

    public void setInputMentorPassword(String MentorPassword) {
        inputMentorPassword.sendKeys(MentorPassword);
    }

    public void setInputButtonLogin() {
        clickLogin.click();
    }

    public void setClickButtonSuccesful() {
        waitForElementClickable(clickLoginSucces);
        clickLoginSucces.click();
    }

    public void setClickProfileButton() {
        clickProfileButton.click();
    }

    public void setClickPencilButton() {
        clickPencilButton.click();
    }

    public void setInputEditName(String EditName) {
        inputEditName.sendKeys(EditName);
    }

    public void setInputEditPassword(String EditPassword) {
        inputEditPassword.sendKeys(EditPassword);
    }

    public void setClickSubmitEditButton() {
        clickSubmitEditButton.click();
    }

    public void setClickTaskButton() {
        clickTaskButton.click();
    }

    public void setInputAddTaskTitle(String AddTitle){
        inputAddTaskTitle.sendKeys(AddTitle);
    }

    public void setInputAddTaskDescription(String AddDescription){
        inputAddTaskDescription.sendKeys(AddDescription);
    }

    public void setInputAddTaskDate(String AddTaskDate){
        inputAddTaskDate.sendKeys(AddTaskDate);
    }

    public void setClickAttachmentButton() {
        String absolutePath = new File("data/File.pdf").getAbsolutePath();
        clickAttachmentButton.sendKeys(absolutePath);

    }

    public void setClickImagesButton(){
        String absolutePath = new File("data/image.jpg").getAbsolutePath();
        clickAttachmentButton.sendKeys(absolutePath);
    }

    public void setClickAddButton(){
        clickAddButton.click();

    }

    public void setClick3IconTask(){
        click3IconTask.click();
    }

    public void setClickEditTask(){
        clickEditTask.click();
    }

    public void setInputEditNameTask(String editNameTask){
        inputEditNameTask.sendKeys(editNameTask);
    }

    public void setInputEditDescriptionTask(String editDescriptionTask){
        inputEditDescriptionTask.sendKeys(editDescriptionTask);
    }

    public void setInputEditDue_DateTask(String editDueDateTask){
        inputEditDue_DateTask.sendKeys(editDueDateTask);
    }

    public void setClickSubmitEditTask(){
        clickSubmitEditTask.click();
    }





}

