package mentutor.pageObject;


import mentutor.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;

public class MenteePage extends BasePage {

    public MenteePage(WebDriver driver) {
        super(driver);
    }

    //Locator Boss
    //login
    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement emailMentee;

    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement passwordMentee;

    @FindBy(xpath = "//button[@id='btn-login']")
    private WebElement clickButtonLogin;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement clickLoginSuccesfull;

    //edit profile
    @FindBy(xpath = "//h3[.='Profile']")
    private WebElement clickButtonProfile;

    @FindBy(css = "[height='1em'][viewBox='0 0 1024 1024']")
    private WebElement clickButtonPencil;

    @FindBy(xpath = "//input[@id='input-fullname']")
    private WebElement clickInputFullname;

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement clickInputEmail;

    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement clickInputPassword;

    @FindBy(xpath = "//button[@id='btn-submitMentee']")
    private WebElement clickSubmitMenteeProfile;

    @FindBy (xpath = "//h2[@class='swal2-title']")
    private WebElement clickOkUpdateProfile;

    //add task
    @FindBy(xpath = "//div[@id='nav-taskmentee']")
    private WebElement clickTaskMentee;

    @FindBy(xpath = "//div[@class='pb-9']//div[1][@class=\" w-[18rem] md:w-[32rem] lg:w-[52rem] h-auto  bg-card p-5 md:py-5 md:px-8 lg:p-10 rounded-[10px] mb-8\"]//div[2]//label")
    private WebElement clickSubmitYourTask;

    @FindBy(xpath = "//input[@id='uploadfile-btn']")
    private WebElement clickChoseFile;

    @FindBy(xpath = "//button[@id='btn-submitTask']")
    private WebElement submit2;

    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement okTask;

    //comment
    @FindBy(xpath = "//h3[.='Forum']")
    private WebElement clickForum;

    @FindBy(xpath = "//input[@id='input-status']")
    private WebElement inputShareSomething;

    @FindBy(css = "#btn-send")
    private WebElement inputSend;

    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement successUpdateForum;

    //response comment
    @FindBy(xpath = "//div[@class='space-y-8']/div[1]//input[@id='Input-comment']")
    private WebElement commentHere;

    @FindBy(xpath = "//div[@class='space-y-8']/div[1]//button[@id='btn-sendComment']")
    private WebElement iconSendResponseForum;

    //comment add images

    @FindBy(xpath= "/html/body/div[1]/div/div[2]/div[1]/div[1]/form/div[2]/label")
    private WebElement clickforumUploadImages;

//    @FindBy(xpath= "//input[@id='btn-gbr']")
//    private WebElement forumUploadImages;

    @FindBy(xpath= "/html/body/div[1]/div/div[2]/div[1]/div[1]/form/div[2]/label")
    private WebElement forumUploadImages;

    //home view all task
    @FindBy(xpath= "//p[@id='view-task']")
    private WebElement viewAllTask;

    //home user click profile icon mentee
    @FindBy(xpath= "//h1[@id='name-profile']")
    private WebElement homeProfile;

    //download document
    @FindBy(xpath= "//p[.='R5tyS5CfPAzrSe0VZnYj-TUGAS Introduction Management Tools - Google Dokumen.pdf']")
    private WebElement downloadDocument;

    //user log out
    @FindBy(xpath= "//h3[.='Logout']")
    private WebElement logOut;

    @FindBy(xpath= "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement yesLogOut;

    @FindBy(xpath= "//h2[@class='swal2-title']")
    private WebElement succesLogOut;


    //Fuction
    //login
    public boolean verifyLoginPage() {
        boolean a = emailMentee.isDisplayed();
        boolean b = passwordMentee.isDisplayed();
        boolean c = clickButtonLogin.isDisplayed();
        return a && b && c;
    }

    public void InputEmailMentee(String email) {
        emailMentee.sendKeys(email);
    }

    public void InputPasswordMentee(String password) {
        passwordMentee.sendKeys(password);
    }

    public void clickButtonMentee() {
        clickButtonLogin.click();
    }

    public void setClickLoginSuccesful() {
        waitForElementClickable(clickLoginSuccesfull);
        clickLoginSuccesfull.click();
    }

    //profile
    public void setClickButtonProfile() {
        clickButtonProfile.click();
    }

    public void setClickButtonPecil(){
        clickButtonPencil.click();
    }

    public void InputYourName(String user) {
        waitForElementVisible(clickInputFullname);
        waitForElementClickable(clickInputFullname);
        clickInputFullname.sendKeys(user);
    }

    public void InputYourEmail(String user) {
        waitForElementVisible(clickInputEmail);
        waitForElementClickable(clickInputEmail);
        clickInputEmail.sendKeys(user);
    }

    public void InputYourPassword(String user) {
        waitForElementVisible(clickInputPassword);
        waitForElementClickable(clickInputPassword);
        clickInputPassword.sendKeys(user);
    }

    public void ClickSubmitProfile() {
        clickSubmitMenteeProfile.click();
    }

    public boolean ClickOk() {
        waitForElementVisible(clickOkUpdateProfile);
        return clickOkUpdateProfile.isDisplayed();
    }

    //Add task
    public void ClickTaskMentee() {
       clickTaskMentee.click();
    }

    public void ClickSubmitYourTask() {
        waitForElementClickable(clickSubmitYourTask);
        clickSubmitYourTask.click();
    }

    public void setChoose(){
        waitForElementVisible(clickChoseFile);
        waitForElementClickable(clickChoseFile);
        String absolutePath1 = new File("data/tugas.pdf").getAbsolutePath();
        clickChoseFile.sendKeys(absolutePath1);
    }

    public void ClickSubmit2() {
        waitForElementClickable(submit2);
        submit2.click();
    }

    public boolean setClickSummitTask() {
        waitForElementClickable(okTask);
        return  okTask.isDisplayed();
    }

    //comment
    public void ClickForum() {
        waitForElementClickable(clickForum);
        clickForum.click();
    }

    public void ShareSomething(String share) {
        waitForElementVisible(inputShareSomething);
        waitForElementClickable(inputShareSomething);
        inputShareSomething.sendKeys(share);
    }

    public void ClickSend() {
        waitForElementVisible(inputSend);
        waitForElementClickable(inputSend);
        inputSend.click();
    }

    public boolean SetSuccessForum() {
        waitForElementClickable(successUpdateForum);
        return  successUpdateForum.isDisplayed();
    }

    //response comment
    public void CommentHere(String share) {
        waitForElementVisible(commentHere);
        waitForElementClickable(commentHere);
        commentHere.sendKeys(share);
    }

    public void IconSendResponseForum() {
        waitForElementVisible(iconSendResponseForum);
        waitForElementClickable(iconSendResponseForum);
        iconSendResponseForum.click();
    }

    //comment add images
    public void ClickImageForum() {
        waitForElementVisible(clickforumUploadImages);
        waitForElementClickable(clickforumUploadImages);
        clickforumUploadImages.click();
    }

    public void UploadImagesForum(){
        waitForElementVisible(forumUploadImages);
        waitForElementClickable(forumUploadImages);
//        forumUploadImages.click();
        String absolutePath2 = new File("data/gambarX.png").getAbsolutePath();
        forumUploadImages.sendKeys(absolutePath2);
    }

    //view all task
    public void ViewAllTask() {
        waitForElementVisible(viewAllTask);
        waitForElementClickable(viewAllTask);
        viewAllTask.click();
    }

    //home user click profile icon mentee
    public void HomeProfileMentee() {
        waitForElementVisible(homeProfile);
        waitForElementClickable(homeProfile);
        homeProfile.click();
    }

    //download file
    public void DownloadDocument() {
        waitForElementVisible(downloadDocument);
        waitForElementClickable(downloadDocument);
        downloadDocument.click();
    }

    //log out
    public void LogOut() {
        waitForElementVisible(logOut);
        waitForElementClickable(logOut);
        logOut.click();
    }
    public void YesLogOut() {
        waitForElementVisible(yesLogOut);
        waitForElementClickable(yesLogOut);
        yesLogOut.click();
    }

    public boolean SuccesLogOut() {
        waitForElementClickable(succesLogOut);
        return succesLogOut.isDisplayed();
    }

}

