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

    @FindBy(xpath = "//div[@class='h-screen ml-[50px] md:ml-[200px] lg:ml-[320px] relative p-6 md:px-14 md:pt-10 md:pb-10 ']/form[1]//label[@id='icon-options']")
    private WebElement click3IconTask;

    @FindBy(xpath = "//div[@class='h-screen ml-[50px] md:ml-[200px] lg:ml-[320px] relative p-6 md:px-14 md:pt-10 md:pb-10 ']/form[1]//label[@class='hover:text-button px-4 pt-2 text-sm text-abu cursor-pointer']")
    private WebElement clickEditTask;

    @FindBy(xpath = "//form[@class='flex flex-col p-9 gap-3']/input[@id='input-title']")
    private WebElement inputEditNameTask;

    @FindBy(xpath = "//input[@id='input-description']")
    private WebElement inputEditDescriptionTask;

    @FindBy(xpath = "//input[@id='input-due_date']")
    private WebElement inputEditDue_DateTask;

    @FindBy(xpath = "//button[@id='btn-submitTask']")
    private WebElement clickSubmitEditTask;

    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement UserOkMessageEdit;

    @FindBy(xpath = "//form[1]//li[@id='delete-click']")
    private WebElement clickDeleteTask;

    @FindBy(xpath = "//form[2]//label[@id='icon-options']")
    private WebElement click3IconDeleteTask;

    @FindBy(xpath = "//form[2]//li[@id='delete-click']")
    private WebElement clikDeleteTask2;

    @FindBy(xpath = "//div[@class='swal2-html-container']")
    private WebElement popUpDeleteTask;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement clikYesDelete1;

    @FindBy(xpath = "//div[@class='swal2-html-container']")
    private WebElement userOkDelete1;

    @FindBy(xpath = "//form[23]//p[@id='submit-click']")
    private WebElement clikDetailTask1;

    @FindBy(xpath = "//h1[@class='text-putih text-lg lg:text-2xl font-medium mb-1']")
    private WebElement detailTaskPage1;

    @FindBy(xpath = "//label[@class='hover:text-button px-4 text-sm text-abu cursor-pointer']")
    private WebElement clickPencilIcon1;

    @FindBy(xpath = "//h1[@class='text-putih text-lg md:text-3xl font-medium']")
    private WebElement popupEditPoints1;

    @FindBy(xpath = "//input[@id='input-score']")
    private WebElement inputSrocePoint1;

    @FindBy(xpath = "//button[@id='btn-submitEditScore']")
    private WebElement inputSubmitAtEditPoint1;

    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement userOKSubmitted1;

    @FindBy(xpath = "//h3[.='Forum']")
    private WebElement clickLogoForum1;

    @FindBy(xpath = "//h1[@class='text-putih text-lg lg:text-2xl font-medium mb-2']")
    private WebElement userAlreadyForumPage1;

    @FindBy(xpath = "//div[@class='mt-[3rem] mb-[2rem] space-y-6']/div[1]//input[@id='Input-comment']")
    private WebElement inputComment1;

    @FindBy(xpath = "//div[@class='mt-[3rem] mb-[2rem] space-y-6']/div[1]//button[@id='btn-sendComment']")
    private WebElement clickSendButton1;

    @FindBy(xpath = "//div[@class='mt-[3rem] mb-[2rem] space-y-6']/div[1]//h1[@class='text-putih text-base']")
    private WebElement successfullyComment1;

    @FindBy(xpath = "//h3[.='Logout']")
    private WebElement userLogout1;

    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement popUpLogout1;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement buttonYesLogout1;

    @FindBy(xpath = "//div[@class='swal2-html-container']")
    private WebElement successfullyLogout1;



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

    public void setInputAddTaskTitle(String AddTitle) {
        inputAddTaskTitle.sendKeys(AddTitle);
    }

    public void setInputAddTaskDescription(String AddDescription) {
        inputAddTaskDescription.sendKeys(AddDescription);
    }

    public void setInputAddTaskDate(String AddTaskDate) {
        inputAddTaskDate.sendKeys(AddTaskDate);
    }

    public void setClickAttachmentButton() {
        String absolutePath = new File("data/File.pdf").getAbsolutePath();
        clickAttachmentButton.sendKeys(absolutePath);
    }

    public void setClickImagesButton() {
        String absolutePath = new File("data/image.jpg").getAbsolutePath();
        clickAttachmentButton.sendKeys(absolutePath);
    }

    public void setClickAddButton() {
        clickAddButton.click();
    }

    public void setClick3IconTask() {
        waitForElementClickable(click3IconTask);
        click3IconTask.click();
    }

    public void setClickEditTask() {
        clickEditTask.click();
    }

    public void setInputEditNameTask(String editNameTask) {
        waitForElementVisible(inputEditNameTask);
        inputEditNameTask.sendKeys(editNameTask);
    }

    public void setInputEditDescriptionTask(String editDescriptionTask) {
        waitForElementVisible(inputEditDescriptionTask);
        inputEditDescriptionTask.sendKeys(editDescriptionTask);
    }

    public void setInputEditDue_DateTask(String editDueDateTask) {
        waitForElementVisible(inputEditDue_DateTask);
        inputEditDue_DateTask.sendKeys(editDueDateTask);
    }

    public void setClickSubmitEditTask() {
        waitForElementClickable(clickSubmitEditTask);
        clickSubmitEditTask.click();
    }

    public boolean userOkEditMessage() {
        waitForElementVisible(UserOkMessageEdit);
        return UserOkMessageEdit.isDisplayed();
    }

    public void clik3IconDelete() {
        waitForElementClickable(click3IconDeleteTask);
        click3IconDeleteTask.click();
    }

    public boolean popUpDeleteTask2(){
        waitForElementVisible(popUpDeleteTask);
        return popUpDeleteTask.isDisplayed();
    }

    public void clickForDeleteTask(){
        waitForElementClickable(clikDeleteTask2);
        clikDeleteTask2.click();
    }

    public void clickYesDelete2(){
        waitForElementClickable(clikYesDelete1);
        clikYesDelete1.click();
    }

    public boolean userOkDelete2(){
        waitForElementVisible(userOkDelete1);
        return userOkDelete1.isDisplayed();
    }

    public void clikDetailTask2(){
        waitForElementClickable(clikDetailTask1);
        clikDetailTask1.click();
    }

    public boolean detailTaskPage2(){
        waitForElementVisible(detailTaskPage1);
        return detailTaskPage1.isDisplayed();
    }

    public void clickPencilIcon2(){
        waitForElementClickable(clickPencilIcon1);
        clickPencilIcon1.click();
    }

    public boolean popupEditPoints2(){
        waitForElementVisible(popupEditPoints1);
        return popupEditPoints1.isDisplayed();
    }

    public void inputScorePoint2(String inputSrocePoint3){
        waitForElementVisible(inputSrocePoint1);
        inputSrocePoint1.sendKeys(inputSrocePoint3);
    }

    public void inputSubmitAtEditPoint2(){
        waitForElementClickable(inputSubmitAtEditPoint1);
        inputSubmitAtEditPoint1.click();
    }

    public boolean userOKSubmitted2(){
        waitForElementVisible(userOKSubmitted1);
        return userOKSubmitted1.isDisplayed();
    }

    public void clikLogoForum2(){
        waitForElementClickable(clickLogoForum1);
        clickLogoForum1.click();
    }

    public boolean userAlreadyForumPage2(){
        waitForElementVisible(userAlreadyForumPage1);
        return userAlreadyForumPage1.isDisplayed();
    }

    public void inputComment2(String inputComment3){
        waitForElementVisible(inputComment1);
        inputComment1.sendKeys(inputComment3);
    }

    public void clickSendButton2(){
        waitForElementClickable(clickSendButton1);
        clickSendButton1.click();
    }

    public boolean successfullyComment2(){
        waitForElementVisible(successfullyComment1);
        return successfullyComment1.isDisplayed();
    }

    public void userLogout2(){
        waitForElementClickable(userLogout1);
        userLogout1.click();
    }

    public boolean popUpLogout2(){
        waitForElementVisible(popUpLogout1);
        return popUpLogout1.isDisplayed();
    }

    public void buttonYesLogout2(){
        waitForElementClickable(buttonYesLogout1);
        buttonYesLogout1.click();
    }

    public boolean successfullyLogout2(){
        waitForElementVisible(successfullyLogout1);
        return successfullyLogout1.isDisplayed();
    }












}

