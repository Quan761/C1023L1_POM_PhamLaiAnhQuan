package Risefairsketch;

public class TasksPageInterface {
	public static final String AddTask = "//a[@class='btn btn-default'][normalize-space()='Add task']";
	public static final String TXB_TITLE = "//input[@id='title']";
	public static final String TXB_DESCRIPTION = "//textarea[@id='description']";
	public static final String RELATEDTO = "//label[normalize-space()='Related to']/following::div[@id='s2id_task-context']";
	public static final String CHOOSEPROJECT = "//div[@id='select2-drop']//li[contains(.,'Project')]";
	public static final String PROJECT = "//label[@for='project_id']/following::div[@id='s2id_project_id']";
	public static final String CHOOSEONLINECOURSECREATIONLAUNCH = "//div[@id='select2-drop']//li[contains(.,'Online Course')]";
	public static final String POINTS = "//label[normalize-space()='Points']/following::div[@id='s2id_autogen18']";
	public static final String CHOOSE2POINTS = "//div[@id='select2-drop']//li[contains(.,'2 Points')]";
	public static final String MILESTONE = "//label[@for='milestone_id']/following::div[@id='s2id_milestone_id']";
	public static final String CHOOSEBETARELEASE = "//div[@id='select2-drop']//li[contains(.,'Beta Release')]";
	public static final String ASSIGNTO = "//label[@for='assigned_to']/following::div[@id='s2id_assigned_to']";
	public static final String CHOOSEJOHNDOE = "//div[@id='select2-drop']//li[contains(.,'John Doe')]";
	public static final String COLLABORATOR = "//label[@for='collaborators']/following::div[@id='s2id_collaborators']";
	public static final String CHOOSEMARKTHOMAS = "//div[@id='select2-drop']//ul[@class='select2-results']//li[contains(.,'Mark Thomas')]";
	public static final String STATUS = "//label[normalize-space()='Status']/following::div[@id='s2id_task_status_id']";
	public static final String CHOOSETODO = "//div[@id='select2-drop']//li[contains(.,'To do')]";
	public static final String PRIORITY = "//label[@for='priority_id']/following::div[@id='s2id_priority_id']";
	public static final String CHOOSEMINOR = "//div[@id='select2-drop']//li[contains(.,'Minor')]";
	public static final String LABELS = "//label[@for='project_labels']/following::div[@id='s2id_project_labels']";
	public static final String CHOOSEFEEDBACK = "//div[@id='select2-drop']//li[contains(.,'Feedback')]";
	public static final String STARTDATE = "//input[@id='start_date']";
	public static final String CHOOSE30 = "//td[@class='day'][normalize-space()='30']";
	public static final String DEADLINE = "//input[@id='deadline']";
	public static final String CHOOSE4 = "//td[@class='new day'][normalize-space()='4']";
	public static final String BTN_SAVE = "//button[@type='submit']";
	public static final String TXB_SEARCH = "//input[@type='search']";
	public static final String WAIT = "//div[@class='modal fade show']";
	public static final String LBL_TITLE = "//table//tr[1]//a[@data-action-url='https://rise.fairsketch.com/tasks/view']";
	public static final String TXB_COMMENT = "//textarea[@id='comment_description']";
	public static final String BTN_POSTCOMMENT = "//button[normalize-space()='Post Comment']";
	public static final String ALERTMESSAGE = "//div[@class='app-alert-message']";
	public static final String TODO = "//a[@class='white-link']";
	public static final String CLICKTOCHANGETODO = "//div[@class='app-popover-body']/div[2]";
	public static final String INPROGRESS = "//div[@id='select2-drop']//li[contains(.,'In progress')]";
}
