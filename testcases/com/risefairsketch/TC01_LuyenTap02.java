package com.risefairsketch;

import org.testng.annotations.Test;

import Risefairsketch.TasksPage;
import Risefairsketch.HomePage;
import Risefairsketch.LoginPage;
import commons.AbstractTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;

public class TC01_LuyenTap02 extends AbstractTest {
	WebDriver driver;
	String url = "https://rise.fairsketch.com/signin";
	String taskName;

	@Parameters({ "browser" })
	@BeforeClass
	public void beforeClass(String browser) {
		driver = openMultiBrowsers(browser);
		taskName = randomText();
	}

	@Test
	public void TC01_LoginAndOpenTaskPage() {

		System.out.println("Step 1 - Navigate to Login page");
		loginPage = new LoginPage(driver);
		loginPage.openLoginPage(url);

		System.out.println("Step 2 - Sign in");
		loginPage.enterEmail();
		loginPage.enterPassword();
		loginPage.clickSignin();

		System.out.println("Step 3 - Click [Tasks]");
		homePage = new HomePage(driver);
		homePage.clickTasks();

	}

//	@Test
	public void TC02_AddTask() {
		System.out.println("Step 4.1 - Click [Add Task]");
		tasksPage = new TasksPage(driver);
		tasksPage.clickAddTask();

		System.out.println("Step 4.2 - Enter [Title]");
		tasksPage.enterTitle(taskName);

		System.out.println("Step 4.3 - Enter [Description]");
		tasksPage.enterDescription();

		System.out.println("Step 4.4 - Choose [Project] in the [Related to] section");
		tasksPage.clickRelatedTo();
		tasksPage.chooseProject();

		System.out.println("Step 4.5 - Choose [Online Course Creation and Launch] in the [Project] section");
		tasksPage.clickProject();
		tasksPage.chooseOnlineCourseCreationLaunch();

		System.out.println("Step 4.6 - Choose [2 Points] in the [Points] section");
		tasksPage.clickPoints();
		tasksPage.choose2Points();

		System.out.println("Step 4.7 - Choose [Beta Release] in the [Milestone] section");
		tasksPage.clickMilestone();
		tasksPage.chooseBetaRelease();

		System.out.println("Step 4.8 - Choose [John Doe] in the [Assign to] section");
		tasksPage.clickAssignTo();
		tasksPage.chooseJohnDoe();

		System.out.println("Step 4.9 - Choose [Mark Thomas] in the [Collaborators] section");
		tasksPage.clickCollaborators();
		tasksPage.chooseMarkThomas();

		System.out.println("Step 4.10 - Choose [To do] in the [Status] section");
		tasksPage.clickStatus();
		tasksPage.chooseTodo();

		System.out.println("Step 4.11 - Choose [Minor] in the [Priority] section");
		tasksPage.clickPriority();
		tasksPage.chooseMinor();

		System.out.println("Step 4.12 - Choose [Feedback] in the [Labels] section");
		tasksPage.clickLabels();
		tasksPage.chooseFeedBack();

		System.out.println("Step 4.13 - Choose the starting date in the [Start Date] section");
		tasksPage.clickStartDate();
		tasksPage.chooseStartDate();

		System.out.println("Step 4.14 - Choose the end date in the [Deadline] section");
		tasksPage.clickDeadline();
		tasksPage.chooseDeadline();

		System.out.println("Step 4.15 - Click [Save]");
		tasksPage.clickSave();
		tasksPage.waitForPopupDisappear();
	}

	@Test
	public void TC03_SearchAndPostComment() {
		tasksPage = new TasksPage(driver);
		System.out.println("Step 5 - Search for the newly created task through the [Search] feature");
		tasksPage.enterSearch(taskName);

		System.out.println("Step 6.1 - Click on the [Title] section of the newly created task");
		tasksPage.clickTitle();

		System.out.println("Step 6.2 - Enter first comment and click [Post comment] button");
		tasksPage.enterFirstComment();
		tasksPage.clickPostCommentFirstTime();
		tasksPage.verifyCommentIsAdded();

		System.out.println("Step 6.3 - Enter second comment and click [Post comment] button");
		tasksPage.enterSecondComment();
		tasksPage.clickPostCommentSecondTime();
		tasksPage.verifyCommentIsAdded();
		
		System.out.println("Step 6.4 - Change status from [Todo] -> [In progress]");
		tasksPage.clickTodo();
		tasksPage.chooseInProgress();

	}

	@AfterClass
	public void afterClass() {
		// driver.quit();
	}

	private LoginPage loginPage;
	private HomePage homePage;
	private TasksPage tasksPage;

}
