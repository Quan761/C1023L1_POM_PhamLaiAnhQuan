package Risefairsketch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import commons.AbstractPage;
import Risefairsketch.TasksPageInterface;

public class TasksPage extends AbstractPage {
	WebDriver driver;

	public TasksPage(WebDriver driver_) {
		driver = driver_;
	}

	public void clickAddTask() {
		clickToElement(driver, TasksPageInterface.AddTask);
	}

	public void enterTitle(String taskName) {
		sendkeyToElement(driver, TasksPageInterface.TXB_TITLE, taskName);
	}

	public void enterDescription() {
		sendkeyToElement(driver, TasksPageInterface.TXB_DESCRIPTION, "ThucHanh02");
	}

	public void clickRelatedTo() {
		clickToElement(driver, TasksPageInterface.RELATEDTO);
	}

	public void chooseProject() {
		clickToElement(driver, TasksPageInterface.CHOOSEPROJECT);
	}

	public void clickProject() {
		clickToElement(driver, TasksPageInterface.PROJECT);
	}

	public void chooseOnlineCourseCreationLaunch() {
		clickToElement(driver, TasksPageInterface.CHOOSEONLINECOURSECREATIONLAUNCH);
	}

	public void clickPoints() {
		clickToElement(driver, TasksPageInterface.POINTS);
	}

	public void choose2Points() {
		clickToElement(driver, TasksPageInterface.CHOOSE2POINTS);
	}

	public void clickMilestone() {
		clickToElement(driver, TasksPageInterface.MILESTONE);
	}

	public void chooseBetaRelease() {
		clickToElement(driver, TasksPageInterface.CHOOSEBETARELEASE);
	}

	public void clickAssignTo() {
		clickToElement(driver, TasksPageInterface.ASSIGNTO);
	}

	public void chooseJohnDoe() {
		clickToElement(driver, TasksPageInterface.CHOOSEJOHNDOE);
	}

	public void clickCollaborators() {
		clickToElement(driver, TasksPageInterface.COLLABORATOR);
	}

	public void chooseMarkThomas() {
		clickToElement(driver, TasksPageInterface.CHOOSEMARKTHOMAS);
	}

	public void clickStatus() {
		clickToElement(driver, TasksPageInterface.STATUS);
	}

	public void chooseTodo() {
		clickToElement(driver, TasksPageInterface.CHOOSETODO);
	}

	public void clickPriority() {
		clickToElement(driver, TasksPageInterface.PRIORITY);
	}

	public void chooseMinor() {
		clickToElement(driver, TasksPageInterface.CHOOSEMINOR);
	}

	public void clickLabels() {
		clickToElement(driver, TasksPageInterface.LABELS);
	}

	public void chooseFeedBack() {
		clickToElement(driver, TasksPageInterface.CHOOSEFEEDBACK);
	}

	public void clickStartDate() {
		clickToElement(driver, TasksPageInterface.STARTDATE);
	}

	public void chooseStartDate() {
		clickToElement(driver, TasksPageInterface.CHOOSE30);
	}

	public void clickDeadline() {
		clickToElement(driver, TasksPageInterface.DEADLINE);
	}

	public void chooseDeadline() {
		clickToElement(driver, TasksPageInterface.CHOOSE4);
	}

	public void clickSave() {
		clickToElement(driver, TasksPageInterface.BTN_SAVE);
	}

	public void waitForPopupDisappear() {
		waitForElementPresence(driver, TasksPageInterface.WAIT);
	}

	public void enterSearch(String taskName) {
		sendkeyToElement(driver, TasksPageInterface.TXB_SEARCH, taskName);
	}

	public void clickTitle() {
		clickElementByJavascript(driver, TasksPageInterface.LBL_TITLE);
	}

	public void enterFirstComment() {
		sendkeyToElement(driver, TasksPageInterface.TXB_COMMENT, "First comment");
	}

	public void clickPostCommentFirstTime() {
		clickToElement(driver, TasksPageInterface.BTN_POSTCOMMENT);
	}

	public void verifyCommentIsAdded() {
		waitForElementVisible(driver, TasksPageInterface.ALERTMESSAGE);
		Assert.assertTrue(driver.findElement(By.xpath(TasksPageInterface.ALERTMESSAGE)).isDisplayed());
	}

	public void enterSecondComment() {
		sendkeyToElement(driver, TasksPageInterface.TXB_COMMENT, "Second comment");
	}

	public void clickPostCommentSecondTime() {
		clickToElement(driver, TasksPageInterface.BTN_POSTCOMMENT);
		waitForElementPresence(driver, TasksPageInterface.ALERTMESSAGE);
	}

	public void clickTodo() {
		clickToElement(driver, TasksPageInterface.TODO);
		clickToElement(driver, TasksPageInterface.CLICKTOCHANGETODO);
	}

	public void chooseInProgress() {
		clickToElement(driver, TasksPageInterface.INPROGRESS);
	}
}
