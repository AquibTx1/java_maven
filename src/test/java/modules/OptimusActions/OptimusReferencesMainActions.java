package modules.OptimusActions;

import org.openqa.selenium.By;
import pageFactory.OptimusPages.OptimusReferenceMasterPage;
import utilities.KeywordUtil;
import utilities.LogUtil;

public class OptimusReferencesMainActions extends KeywordUtil {

    static Class<OptimusReferencesMainActions> thisClass = OptimusReferencesMainActions.class;

    public static void open_ReferenceTasksTab_MO_Checker() throws InterruptedException {
        waitForVisible(OptimusReferenceMasterPage.referenceTasksTab_MO_Checker);
        click(OptimusReferenceMasterPage.referenceTasksTab_MO_Checker, "Click References Tasks tab with Mo Account");
        delay(3000);
    }

    public static void open_Reference_SideTab() throws InterruptedException {
//        delay(15000);
        waitForVisible(OptimusReferenceMasterPage.reference_SideTab);
        click(OptimusReferenceMasterPage.reference_SideTab, "Click References side tab");
        waitForVisible(OptimusReferenceMasterPage.reference_MainSearch);
    }

    public static void reference_MainSearch_Tab(String item, String searchIndex) throws InterruptedException {
        KeywordUtil.hardRefresh();
        delay(2000);
        waitForVisible(OptimusReferenceMasterPage.reference_MainSearch);
        inputText(OptimusReferenceMasterPage.reference_MainSearch, item, "Enter Search for Tab Name");
        delay(2000);
        click(OptimusReferenceMasterPage.reference_MainSearchBtn, "Click Master Search button");
        delay(2000);
        click(By.xpath(String.format(OptimusReferenceMasterPage.reference_List_Search_ReloadBtn, searchIndex)), "Clicking Reload to load list");
        waitForVisible(By.xpath(String.format(OptimusReferenceMasterPage.reference_List_Search_ReloadBtn, searchIndex)));
    }


    public static void referenceTask_MOCheckerSearch(String item) {
        waitForVisible(OptimusReferenceMasterPage.referenceTasksTab_SearchBox_Checker);
        inputText(OptimusReferenceMasterPage.referenceTasksTab_SearchBox_Checker, item, "Enter Search for Reference Task");
        click(OptimusReferenceMasterPage.referenceTasksTab_SearchBtn_Checker, "Click Search button");
    }

    public static void select_FirstReferenceTasks() {
        waitForVisible(OptimusReferenceMasterPage.referenceTasksTab_TaskCheckbox_Checker);
        click(OptimusReferenceMasterPage.referenceTasksTab_TaskCheckbox_Checker, "click to Select Reference Type to approve");
    }

    public static void select_All_ReferenceTasks() {
        waitForVisible(OptimusReferenceMasterPage.referenceTasksTab_SelectAll_Checker);
        click(OptimusReferenceMasterPage.referenceTasksTab_SelectAll_Checker, "click to Select All button for Reference Type to approve");
    }

    public static void approve_AllSelected_ReferenceTasks() {
        waitForVisible(OptimusReferenceMasterPage.referenceTasksTab_Checker_ApproveBtn);
        click(OptimusReferenceMasterPage.referenceTasksTab_Checker_ApproveBtn, "click to Approve All button for Reference Type to approve");
        waitForVisible(OptimusReferenceMasterPage.referenceTasksTab_Checker_ApproveAll_YesBtn);
        click(OptimusReferenceMasterPage.referenceTasksTab_Checker_ApproveAll_YesBtn, "click Yes in popup to Approve All button for Reference Type to approve");

    }


    public static void reference_List_SearchBox(String searchIndex,String item) {
        waitForVisible(By.xpath(String.format(OptimusReferenceMasterPage.reference_List_SearchBox_SearchIndex, searchIndex)));
        inputText(By.xpath(String.format(OptimusReferenceMasterPage.reference_List_SearchBox_SearchIndex, searchIndex)), item, "Enter Ref type in Search");
        click(By.xpath(String.format(OptimusReferenceMasterPage.reference_List_SearchBtn_SearchIndex, searchIndex)), "Click Ref type Search button");
    }

    public static void open_Reference_SubTab(String searchIndex, String tabName) {
        waitForVisible(OptimusReferenceMasterPage.reference_MainSearch);
        click(By.xpath(String.format(OptimusReferenceMasterPage.reference_SubTab, tabName)), "Click on Reference sub tab " + tabName);
        waitForVisible(By.xpath(String.format(OptimusReferenceMasterPage.reference_SubTab_List_SearchIndex, searchIndex)));
    }

    public static void open_Reference_ListTab(String searchIndex) {
        waitForVisible(OptimusReferenceMasterPage.reference_MainSearch);
        click(By.xpath(String.format(OptimusReferenceMasterPage.reference_SubTab_List_SearchIndex, searchIndex)), "Click on Reference sub tab ");
        waitForVisible(By.xpath(String.format(OptimusReferenceMasterPage.reference_List_SearchBox_SearchIndex, searchIndex)));
    }

    public static void click_New_ReferenceType_SubTab_Page(String searchIndex) {
        waitForVisible(By.xpath(String.format(OptimusReferenceMasterPage.reference_SubTab_NewEdit_Page_SearchIndex, searchIndex)));
        click(By.xpath(String.format(OptimusReferenceMasterPage.reference_SubTab_NewEdit_Page_SearchIndex, searchIndex)), "click to open New Reference Type page");
    }

    public static void input_New_ReferenceType_Name(String tabIndex, String text) throws InterruptedException {
        waitForVisible(By.xpath(String.format(OptimusReferenceMasterPage.reference_New_Name_TabIndex, tabIndex)));
        inputText(By.xpath(String.format(OptimusReferenceMasterPage.reference_New_Name_TabIndex, tabIndex)), text, "Enter Name for Reference sub tab " + text);
    }

    public static void input_New_ReferenceType_Description(String tabIndex, String text) throws InterruptedException {
        waitForVisible(By.xpath(String.format(OptimusReferenceMasterPage.reference_New_Description_TabIndex, tabIndex)));
        inputText(By.xpath(String.format(OptimusReferenceMasterPage.reference_New_Description_TabIndex, tabIndex)), text, "Enter Name for Reference sub tab " + text);
    }

    public static void input_Update_ReferenceType_Name(String text) throws InterruptedException {
        waitForVisible(OptimusReferenceMasterPage.reference_Name_Update);
        clearInputUsingKeys(OptimusReferenceMasterPage.reference_Name_Update);
        inputText(OptimusReferenceMasterPage.reference_Name_Update, text, "Update Name for Reference sub tab " + text);
    }

    public static void input_Update_ReferenceType_Description(String text) throws InterruptedException {
        waitForVisible(OptimusReferenceMasterPage.reference_Description_Update);
        clearInputUsingKeys(OptimusReferenceMasterPage.reference_Description_Update);
        inputText(OptimusReferenceMasterPage.reference_Description_Update, text, "Update Description for Reference sub tab " + text);
    }
    public static void referenceType_Submit_Createbtn(String tabIndex) throws InterruptedException {
        waitForVisible(By.xpath(String.format(OptimusReferenceMasterPage.reference_New_Submit_CreateBtn_TabIndex, tabIndex)));
        click(By.xpath(String.format(OptimusReferenceMasterPage.reference_New_Submit_CreateBtn_TabIndex, tabIndex)), "Clicked Submit button");
    }

    public static void click_ReferenceType_Deletebtn() throws InterruptedException {
        waitForVisible(OptimusReferenceMasterPage.reference_New_DeleteBtn);
        click(OptimusReferenceMasterPage.reference_New_DeleteBtn, "Clicked Delete button");
        click(OptimusReferenceMasterPage.reference_New_Delete_YesBtn, "Clicked Yes to delete Item");
    }

    public static void click_ReferenceType_Updatebtn() throws InterruptedException {
        waitForVisible(OptimusReferenceMasterPage.reference_NewEdit_UpdateBtn);
        click(OptimusReferenceMasterPage.reference_NewEdit_UpdateBtn, "Clicked Update button");
    }

    public static void click_ReferenceList_Editbtn(String searchIndex) throws InterruptedException {
        waitForVisible(By.xpath(String.format(OptimusReferenceMasterPage.reference_List_Edit_SearchIndex, searchIndex)));
        click(By.xpath(String.format(OptimusReferenceMasterPage.reference_List_Edit_SearchIndex, searchIndex)), "Clicked Edit button in List");
    }


    public static String get_Name_ReferenceList(String searchIndex) {
        waitForVisible(By.xpath(String.format(OptimusReferenceMasterPage.reference_List_Name_SearchIndex, searchIndex)));
        String text = getElementText(By.xpath(String.format(OptimusReferenceMasterPage.reference_List_Name_SearchIndex, searchIndex)));
        LogUtil.infoLog(thisClass, "Element Text is =" + text);
        return text;
    }

    public static String get_Description_ReferenceList(String searchIndex) {
        waitForVisible(By.xpath(String.format(OptimusReferenceMasterPage.reference_List_Description_SearchIndex, searchIndex)));
        String text = getElementText(By.xpath(String.format(OptimusReferenceMasterPage.reference_List_Description_SearchIndex, searchIndex)));
        LogUtil.infoLog(thisClass, "Element text is =" + text);
        return text;
    }

    public static String get_Name_ReferenceDetails() {
        waitForVisible(OptimusReferenceMasterPage.reference_Name_Update);
        String text = getElementValueWithVisibility(OptimusReferenceMasterPage.reference_Name_Update);
        LogUtil.infoLog(thisClass, "Element Text is =" + text);
        return text;
    }

}
