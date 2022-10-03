package pageFactory.OptimusPages;

import org.openqa.selenium.By;

public class OptimusReferenceMasterPage {

    public static By referenceTasksTab_MO_Checker = By.xpath("//span[text()='Reference Tasks']");
    public static By referenceTasksTab_SearchBox_Checker = By.xpath("//div[@class='ant-tabs ant-tabs-top']/div[2]/div/div[2]//descendant::input[@placeholder='input search text']");
    public static By referenceTasksTab_SearchBtn_Checker = By.xpath("//div[@class='ant-tabs-content ant-tabs-content-top']/div[2]//form[@class='ant-form ant-form-inline _title_form_d4fpm_1']//button/span[@aria-label='search']");
    public static By referenceTasksTab_TaskCheckbox_Checker = By.xpath("(//div[@class='_workflow_task_list_d4fpm_1']/div[1]/div/div/div[2]/label/span)[2]");
    public static By referenceTasksTab_SelectAll_Checker = By.xpath("//div[@class='_workflow_task_list_d4fpm_1']/form/button/span[contains(text(),'Select All Applicable')]");
    public static By referenceTasksTab_Checker_ApproveBtn = By.xpath("//div[@class='_workflow_task_list_d4fpm_1']/form/div/button/span[contains(text(),'Approve')]");
    public static By referenceTasksTab_Checker_ApproveAll_YesBtn = By.xpath("//div[@class='ant-popover-inner-content']/div[@class='ant-popover-buttons']/button/span[contains(text(),'Yes')]");
    public static By reference_SideTab = By.xpath("//ul/li/span/a[text()='References']");
    public static By reference_MainSearch = By.xpath("//input[@placeholder='input search text']");
    public static By reference_MainSearchBtn = By.cssSelector("form > span > span > span.ant-input-group-addon");
    public static String reference_SubTab = "//main/div/div/div[@role='tablist']/div/div[@class='ant-tabs-nav-list']/div/div[text()='%s']";
    public static String reference_SubTab_List_SearchIndex = "(//div[contains(text(),'List')])[%s]";

    public static String reference_List_SearchBox_SearchIndex = "(//form[@class='ant-form ant-form-inline']//descendant::input[@placeholder='input search text'])[%s]";
    public static String reference_List_SearchBtn_SearchIndex = "(//form[@class='ant-form ant-form-inline']//descendant::span[@class='ant-input-group-addon']/button)[%s]";
    public static String reference_List_Search_ReloadBtn = "(//button/span[@aria-label='reload'])[%s]";
    public static String reference_List_Edit_SearchIndex = "(//tbody/tr[2]/td[1]/div[1]/a)[%s]";
    public static String reference_List_Name_SearchIndex = "(//tbody/tr[2]/td[2])[%s]";
    public static String reference_List_Description_SearchIndex = "(//tbody/tr[2]/td[3])[%s]";
    public static String reference_SubTab_NewEdit_Page_SearchIndex = "(//span[contains(text(),'New')])[%s]";
    public static String reference_New_Name_TabIndex = "//main/div/div/div[2]/div/div[%s]/div/div[2]/div/div[2]/div/form/div/div/div/div[2]/div/div/input";
    public static By reference_Name_Update = By.id("update_reference_name");
    public static String reference_New_Description_TabIndex = "//main/div/div/div[2]/div/div[%s]/div/div[2]/div/div[2]/div/form/div/div[2]/div/div[2]/div/div/textarea";
    public static By reference_Description_Update = By.id("update_reference_description");
    public static String reference_New_Submit_CreateBtn_TabIndex = "//main/div/div/div[2]/div/div[%s]/div/div[2]/div/div[2]/div/form/div[3]/div/button/span[contains(text(),'Create')]";
    public static By reference_New_DeleteBtn = By.xpath("//button/span[contains(text(),'Delete')]");
    public static By reference_New_Delete_YesBtn = By.xpath("//div[@class='ant-popover-inner-content']/div[2]/button[2]/span[text()='Yes']");

    public static By reference_NewEdit_UpdateBtn = By.xpath("//button/span[contains(text(),'Update')]");


}
