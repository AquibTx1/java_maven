package pageFactory.OptimusPages.Account;

import org.openqa.selenium.By;

public class OptimusAccountMainPage {

    public static By account_MainTab = By.xpath("//div[@class='optimus_nav']/ul/li/a[contains(text(),'Account')]");
    public static By account_WelcomeText_MainTab = By.cssSelector("._title_q9zok_1");

    public static By account_SideTab = By.xpath("//span[@aria-label='bank']//parent::li");
    public static By account_NitroAccount_SideTab = By.xpath("//span[@aria-label='user']//parent::li");

    public static By account_CreateNewTab = By.xpath("//div[@aria-controls=\"rc-tabs-0-panel-item_1\"]/span[contains(text(),'New Account')]");
    public static By account_ListTab = By.xpath("//div[@aria-controls='rc-tabs-0-panel-item_0'][contains(text(),'Account List')]");

    public static By account_EditLink_List = By.xpath("//table/tbody/tr[2]/td[2]/div/a[contains(text(),'Edit')]");
    public static By account_AccountID_List = By.xpath("//table/tbody/tr[2]/td[3]");
    public static By account_MainAccountID_List = By.xpath("//table/tbody/tr[2]/td[4]");
    public static By account_AccountName_List = By.xpath("//table/tbody/tr[2]/td[8]");
    public static By account_AccountLogin_List = By.xpath("//table/tbody/tr[2]/td[9]");
    public static By account_References_SideTab = By.xpath("//span[@aria-label='setting']//parent::li/span/a[contains(text(),'References')]");
    public static By account_Configurations_SideTab = By.xpath("//span[@aria-label='setting']//parent::li/span/a[contains(text(),'Configurations')]");
    public static By account_Configurations_SearchBox = By.xpath("//input[@placeholder='search account']");
    public static By account_Configuration_Search_Btn = By.xpath("//input[@placeholder='search account']//parent::span/span/button");
    public static By account_Configurations_RecordingAccounts_tab = By.xpath("//div[@class='ant-tabs-nav-list']/div/div[contains(text(),'Recording Accounts')]");
    public static By account_Configurations_RecordingWalletAddress_tab = By.xpath("//div[@class='ant-tabs-nav-list']/div/div[contains(text(),'Recording Wallet Addresses')]");

    public static By account_Configurations_AddAccount_List = By.xpath("//div[@class='ant-tabs-content-holder']/div/div[2]/div/div[@class='_ctrl_1bi9q_1']/button[2]");
    public static By accountConfigurations_Recording_CloseDeleteAccount_List = By.xpath("//tbody/tr[1]/td[7]/div[1]/button[2]/span");
    public static By account_Configurations_OKDeleteAccount_popUp_List = By.xpath("//div[@class='ant-popover-content']/div[2]/div/div[2]/button[2]/span[contains(text(),'OK')]");
    public static By accountConfigurations_Recording_AccountName_List = By.xpath("//div[@class='ant-tabs-content-holder']/div/div[2]/div/div[2]/div/..//div[@class='ant-table-content']/table/tbody/tr[1]/td[3]");
    public static By accountConfigurations_Recording_ProductName_List = By.xpath("//div[@class='ant-tabs-content-holder']/div/div[2]/div/div[2]/div/..//div[@class='ant-table-content']/table/tbody/tr[1]/td[3]");
    public static By accountConfigurations_Recording_Exchange = By.id("add_recording_acc_exchange");
    public static String accountConfigurations_Recording_Exchange_Options = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";

    public static By accountConfigurations_Recording_AccountName = By.id("add_recording_acc_account_id");
    public static String accountConfigurations_Recording_AccountName_Options = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By accountConfigurations_Recording_ProductName = By.id("add_recording_acc_nitro_account_id");
    public static String accountConfigurations_Recording_ProductName_Options = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s";
    public static By accountConfigurations_Recording_AddRecording_CreateBtn = By.xpath("//button[@type='submit']/span[contains(text(),'Add Account')]");

    public static By accountConfigurations_RecordingWallet_SearchBox = By.xpath("//input[@placeholder='search address']");
    public static By accountConfigurations_RecordingWallet_SearchBtn = By.cssSelector(".ant-btn.ant-btn-icon-only.ant-input-search-button");
    public static By accountConfigurations_RecordingWallet_Chain_List = By.xpath("//tbody/tr[1]/td[4]");
    public static By accountConfigurations_RecordingWallet_NoData_List = By.xpath("//div[@class='ant-empty-description']");




}
