package modules.OptimusActions;

import org.openqa.selenium.By;
import pageFactory.OptimusPages.Account.OptimusAccountCreatePage;
import pageFactory.OptimusPages.Account.OptimusAccountMainPage;
import pageFactory.OptimusPages.Account.OptimusNitroAccountPage;
import pageFactory.OptimusPages.CounterParty.OptimusCounterPartyMainPage;
import pageFactory.OptimusPages.CounterParty.OptimusCounterPartyServicesPage;
import step_definitions.RunCukesTest;
import utilities.KeywordUtil;

public class OptimusAccountActions extends KeywordUtil {

    static Class<OptimusAccountActions> thisClass = OptimusAccountActions.class;

    public static void openAccountMainTab() {
        click(OptimusAccountMainPage.account_MainTab, "Clicking Main Account Tab");
        waitForVisible(OptimusAccountMainPage.account_WelcomeText_MainTab);
    }

    public static void openAccountsSideTab() {
        click(OptimusAccountMainPage.account_SideTab, "Clicked Account Side Tab");
        waitForVisible(OptimusAccountMainPage.account_ListTab);
    }
    public static void openAccountListTab() {
        click(OptimusAccountMainPage.account_ListTab, "Open Create Account Tab");
        waitForVisible(OptimusAccountMainPage.account_EditLink_List);
    }

    public static void waitForEditLinkinResult() {
        waitForVisible(OptimusAccountMainPage.account_EditLink_List);
    }

    public static void clickEditLinkinResult() {
        click(OptimusAccountMainPage.account_EditLink_List, "Edit Link clicked, in Search result");
        waitForVisible(OptimusAccountCreatePage.account_MainAccountID);
    }

    public static String getAccountNameFromList() {
        waitForVisible(OptimusAccountMainPage.account_AccountName_List);
        return getElementText(OptimusAccountMainPage.account_AccountName_List);
    }

    public static String account_GetAccountIDFromList() {
        waitForVisible(OptimusAccountMainPage.account_AccountID_List);
        return getElementText(OptimusAccountMainPage.account_AccountID_List);
    }
    public static String getAccountLoginFromList() {
        waitForVisible(OptimusAccountMainPage.account_AccountLogin_List);
        return getElementText(OptimusAccountMainPage.account_AccountLogin_List);
    }

    public static void openAccountCreateTab() {
        click(OptimusAccountMainPage.account_CreateNewTab, "Open Create Account Tab");
        waitForVisible(OptimusAccountCreatePage.account_AccountID);
    }

    public static String get_account_AccountID() {
        waitForPresent(OptimusAccountCreatePage.account_AccountID);
        return getElementValueWithVisibility(OptimusAccountCreatePage.account_AccountID);
    }

    public static void account_MainAccountID(String mainAccountID) throws InterruptedException {
        waitForClickable(OptimusAccountCreatePage.account_MainAccountID);
        clearInputUsingKeys(OptimusAccountCreatePage.account_MainAccountID);
        inputText(OptimusAccountCreatePage.account_MainAccountID, mainAccountID, "Enter account MainAccountID ");
    }

    public static void account_AccountSource(String accountSource) throws InterruptedException {
        waitForClickable(OptimusAccountCreatePage.account_AccountSource);
        clearInputUsingKeys(OptimusAccountCreatePage.account_AccountSource);
        inputText(OptimusAccountCreatePage.account_AccountSource, accountSource, "Select accountSource  = " + accountSource);
        waitForPresent(By.xpath(String.format(OptimusAccountCreatePage.account_AccountSource_Options, accountSource)));
        click(By.xpath(String.format(OptimusAccountCreatePage.account_AccountSource_Options, accountSource)), "Choose account Source dropdown options");
    }

    public static void account_AccountSource_update(String accountSource) throws InterruptedException {
        waitForClickable(OptimusAccountCreatePage.account_AccountSource_update);
        clearInputUsingKeys(OptimusAccountCreatePage.account_AccountSource_update);
        inputText(OptimusAccountCreatePage.account_AccountSource_update, accountSource, "Select accountSource  = " + accountSource);
        waitForPresent(By.xpath(String.format(OptimusAccountCreatePage.account_AccountSource_Options, accountSource)));
        click(By.xpath(String.format(OptimusAccountCreatePage.account_AccountSource_Options, accountSource)), "Choose account Source dropdown options");
    }

    public static void account_Exchange(String account) throws InterruptedException {
        waitForClickable(OptimusAccountCreatePage.account_Exchange);
        clearInputUsingKeys(OptimusAccountCreatePage.account_Exchange);
        inputText(OptimusAccountCreatePage.account_Exchange, account, "Enter account_Exchange ");
    }

    public static void account_AccountType(String account) throws InterruptedException {
        waitForClickable(OptimusAccountCreatePage.account_AccountType);
        clearInputUsingKeys(OptimusAccountCreatePage.account_AccountType);
        inputText(OptimusAccountCreatePage.account_AccountType, account, "Select accountSource  = " + account);
        waitForPresent(By.xpath(String.format(OptimusAccountCreatePage.account_AccountType_Options, account)));
        click(By.xpath(String.format(OptimusAccountCreatePage.account_AccountType_Options, account)), "Choose account_AccountType dropdown options");
    }

    public static void account_AccountType_update(String account) throws InterruptedException {
        waitForClickable(OptimusAccountCreatePage.account_AccountType_update);
        clearInputUsingKeys(OptimusAccountCreatePage.account_AccountType_update);
        inputText(OptimusAccountCreatePage.account_AccountType_update, account, "Select accountSource  = " + account);
        waitForPresent(By.xpath(String.format(OptimusAccountCreatePage.account_AccountType_Options, account)));
        click(By.xpath(String.format(OptimusAccountCreatePage.account_AccountType_Options, account)), "Choose account_AccountType dropdown options");
    }

    public static void account_AccountName(String account) throws InterruptedException {
        waitForClickable(OptimusAccountCreatePage.account_AccountName);
        clearInputUsingKeys(OptimusAccountCreatePage.account_AccountName);
        inputText(OptimusAccountCreatePage.account_AccountName, account, "Enter account_AccountName ");
    }
    public static String getAccountNameFromDetails() {
        waitForVisible(OptimusAccountCreatePage.account_AccountName);
        return getElementValueWithVisibility(OptimusAccountCreatePage.account_AccountName);
    }
    public static void account_AccountLogin(String account) throws InterruptedException {
        waitForClickable(OptimusAccountCreatePage.account_AccountLogin);
        clearInputUsingKeys(OptimusAccountCreatePage.account_AccountLogin);
        inputText(OptimusAccountCreatePage.account_AccountLogin, account, "Enter account_AccountLogin ");
    }

    public static void account_Function(String account) throws InterruptedException {
        waitForClickable(OptimusAccountCreatePage.account_Function);
        clearInputUsingKeys(OptimusAccountCreatePage.account_Function);
        inputText(OptimusAccountCreatePage.account_Function, account, "Select account_Function  = " + account);
        waitForPresent(By.xpath(String.format(OptimusAccountCreatePage.account_Function_Options, account)));
        click(By.xpath(String.format(OptimusAccountCreatePage.account_Function_Options, account)), "Choose account_Function dropdown options");
    }

    public static void account_Function_update(String account) throws InterruptedException {
        waitForClickable(OptimusAccountCreatePage.account_Function_update);
        clearInputUsingKeys(OptimusAccountCreatePage.account_Function_update);
        inputText(OptimusAccountCreatePage.account_Function_update, account, "Select account_Function  = " + account);
        waitForPresent(By.xpath(String.format(OptimusAccountCreatePage.account_AccountType_Options, account)));
        click(By.xpath(String.format(OptimusAccountCreatePage.account_AccountType_Options, account)), "Choose account_Function dropdown options");
    }

    public static void account_Permission(String account) throws InterruptedException {
        waitForClickable(OptimusAccountCreatePage.account_Permission);
        clearInputUsingKeys(OptimusAccountCreatePage.account_Permission);
        inputText(OptimusAccountCreatePage.account_Permission, account, "Select account_Permission  = " + account);
        waitForPresent(By.xpath(String.format(OptimusAccountCreatePage.account_Permission_Options, account)));
        click(By.xpath(String.format(OptimusAccountCreatePage.account_Permission_Options, account)), "Choose account_Permission dropdown options");
    }

    public static void account_Permission_update(String account) throws InterruptedException {
        waitForClickable(OptimusAccountCreatePage.account_Permission_update);
        clearInputUsingKeys(OptimusAccountCreatePage.account_Permission_update);
        inputText(OptimusAccountCreatePage.account_Permission_update, account, "Select account_Permission_update  = " + account);
        waitForPresent(By.xpath(String.format(OptimusAccountCreatePage.account_Permission_Options, account)));
        click(By.xpath(String.format(OptimusAccountCreatePage.account_Permission_Options, account)), "Choose account_Permission_update dropdown options");
    }

    public static void account_Owner(String account) throws InterruptedException {
        waitForClickable(OptimusAccountCreatePage.account_Owner);
        clearInputUsingKeys(OptimusAccountCreatePage.account_Owner);
        inputText(OptimusAccountCreatePage.account_Owner, account, "Enter account_Owner ");
    }

    public static void account_Entity(String account) throws InterruptedException {
        waitForClickable(OptimusAccountCreatePage.account_Entity);
        clearInputUsingKeys(OptimusAccountCreatePage.account_Entity);
        inputText(OptimusAccountCreatePage.account_Entity, account, "Select account_Entity  = " + account);
        waitForPresent(By.xpath(String.format(OptimusAccountCreatePage.account_Entity_Options, account)));
        click(By.xpath(String.format(OptimusAccountCreatePage.account_Entity_Options, account)), "Choose account_Entity dropdown options");
    }

    public static void account_Entity_update(String account) throws InterruptedException {
        waitForClickable(OptimusAccountCreatePage.account_Entity_update);
        clearInputUsingKeys(OptimusAccountCreatePage.account_Entity_update);
        inputText(OptimusAccountCreatePage.account_Entity_update, account, "Select account_Entity  = " + account);
        waitForPresent(By.xpath(String.format(OptimusAccountCreatePage.account_Entity_Options, account)));
        click(By.xpath(String.format(OptimusAccountCreatePage.account_Entity_Options, account)), "Choose account_Entity dropdown options");
    }

    public static void account_WalletController(String account) throws InterruptedException {
        waitForClickable(OptimusAccountCreatePage.account_WalletController);
        clearInputUsingKeys(OptimusAccountCreatePage.account_WalletController);
        inputText(OptimusAccountCreatePage.account_WalletController, account, "Select account_WalletController  = " + account);
        waitForPresent(By.xpath(String.format(OptimusAccountCreatePage.account_WalletController_Options, account)));
        click(By.xpath(String.format(OptimusAccountCreatePage.account_WalletController_Options, account)), "Choose account_WalletController dropdown options");
    }

    public static void account_WalletController_update(String account) throws InterruptedException {
        waitForClickable(OptimusAccountCreatePage.account_WalletController_update);
        clearInputUsingKeys(OptimusAccountCreatePage.account_WalletController_update);
        inputText(OptimusAccountCreatePage.account_WalletController_update, account, "Select account_WalletController  = " + account);
        waitForPresent(By.xpath(String.format(OptimusAccountCreatePage.account_WalletController_Options, account)));
        click(By.xpath(String.format(OptimusAccountCreatePage.account_WalletController_Options, account)), "Choose account_WalletController dropdown options");
    }

    public static void account_Channel1(String account) throws InterruptedException {
        waitForClickable(OptimusAccountCreatePage.account_Channel1);
        clearInputUsingKeys(OptimusAccountCreatePage.account_Channel1);
        inputText(OptimusAccountCreatePage.account_Channel1, account, "Enter account_Channel1 ");
    }

    public static void account_Address1(String account) throws InterruptedException {
        waitForClickable(OptimusAccountCreatePage.account_Address1);
        clearInputUsingKeys(OptimusAccountCreatePage.account_Address1);
        inputText(OptimusAccountCreatePage.account_Address1, account, "Enter account_Address1 ");
    }

    public static void account_Memo1(String account) throws InterruptedException {
        waitForClickable(OptimusAccountCreatePage.account_Memo1);
        clearInputUsingKeys(OptimusAccountCreatePage.account_Memo1);
        inputText(OptimusAccountCreatePage.account_Memo1, account, "Enter account_Memo1 ");
    }

    public static void account_Channel2_Check() {
        isWebElementPresent(OptimusAccountCreatePage.account_Channel2, "Checking if Channel 2 is present after clicking plus button");
    }

    public static void account_Channel2(String account) throws InterruptedException {
        waitForClickable(OptimusAccountCreatePage.account_Channel2);
        clearInputUsingKeys(OptimusAccountCreatePage.account_Channel2);
        inputText(OptimusAccountCreatePage.account_Channel2, account, "Enter account_Channel1 ");
    }

    public static void account_Address2(String account) throws InterruptedException {
        waitForClickable(OptimusAccountCreatePage.account_Address2);
        clearInputUsingKeys(OptimusAccountCreatePage.account_Address2);
        inputText(OptimusAccountCreatePage.account_Address2, account, "Enter account_Address2 ");
    }

    public static void account_Memo2(String account) throws InterruptedException {
        waitForClickable(OptimusAccountCreatePage.account_Memo2);
        clearInputUsingKeys(OptimusAccountCreatePage.account_Memo2);
        inputText(OptimusAccountCreatePage.account_Memo2, account, "Enter account_Memo2 ");
    }

    public static void account_AddressMinus_Btn(){
        waitForClickable(OptimusAccountCreatePage.account_Address_minus_btn);
        click(OptimusAccountCreatePage.account_Address_minus_btn, "Click Address Minus button");
    }

    public static void account_AddressPlus_Btn(){
        waitForClickable(OptimusAccountCreatePage.account_Address_plus_btn);
        click(OptimusAccountCreatePage.account_Address_plus_btn, "Click Address Plus button");
    }

    public static void account_PortfolioNumber(String account) throws InterruptedException {
        waitForClickable(OptimusAccountCreatePage.account_PortfolioNumber);
        clearInputUsingKeys(OptimusAccountCreatePage.account_PortfolioNumber);
        inputText(OptimusAccountCreatePage.account_PortfolioNumber, account, "Select account_PortfolioNumber  = " + account);
        waitForPresent(By.xpath(String.format(OptimusAccountCreatePage.account_PortfolioNumber_Options, account)));
        click(By.xpath(String.format(OptimusAccountCreatePage.account_PortfolioNumber_Options, account)), "Choose account_PortfolioNumber dropdown options");
    }

    public static void account_PortfolioNumber_update(String account) throws InterruptedException {
        waitForClickable(OptimusAccountCreatePage.account_PortfolioNumber_update);
        clearInputUsingKeys(OptimusAccountCreatePage.account_PortfolioNumber_update);
        inputText(OptimusAccountCreatePage.account_PortfolioNumber_update, account, "Select account_PortfolioNumber  = " + account);
        waitForPresent(By.xpath(String.format(OptimusAccountCreatePage.account_PortfolioNumber_Options, account)));
        click(By.xpath(String.format(OptimusAccountCreatePage.account_PortfolioNumber_Options, account)), "Choose account_PortfolioNumber dropdown options");
    }

    public static String get_account_PortfolioName() throws InterruptedException {
        delay(1000);
        return getElementText(OptimusAccountCreatePage.account_PortfolioName);
    }

    public static String get_account_PortfolioEntity() throws InterruptedException {
        delay(1000);
        return getElementText(OptimusAccountCreatePage.account_PortfolioEntity);
    }

    public static void account_CounterpartyRef(String account) throws InterruptedException {
        waitForClickable(OptimusAccountCreatePage.account_CounterpartyRef);
        clearInputUsingKeys(OptimusAccountCreatePage.account_CounterpartyRef);
        inputText(OptimusAccountCreatePage.account_CounterpartyRef, account, "Select account_CounterpartyRef  = " + account);
        waitForPresent(By.xpath(String.format(OptimusAccountCreatePage.account_CounterpartyRef_Options, account)));
        click(By.xpath(String.format(OptimusAccountCreatePage.account_CounterpartyRef_Options, account)), "Choose account_CounterpartyRef dropdown options");
    }

    public static void account_CounterpartyRef_update(String account) throws InterruptedException {
        waitForClickable(OptimusAccountCreatePage.account_CounterpartyRef_update);
        clearInputUsingKeys(OptimusAccountCreatePage.account_CounterpartyRef_update);
        inputText(OptimusAccountCreatePage.account_CounterpartyRef_update, account, "Select account_CounterpartyRef  = " + account);
        waitForPresent(By.xpath(String.format(OptimusAccountCreatePage.account_CounterpartyRef_Options, account)));
        click(By.xpath(String.format(OptimusAccountCreatePage.account_CounterpartyRef_Options, account)), "Choose account_CounterpartyRef dropdown options");
    }

    public static String get_account_CounterpartyName() throws InterruptedException {
        delay(1000);
        return getElementText(OptimusAccountCreatePage.account_CounterpartyName);
    }

    public static void account_Comment(String account) throws InterruptedException {
        waitForClickable(OptimusAccountCreatePage.account_Comment);
        clearInputUsingKeys(OptimusAccountCreatePage.account_Comment);
        inputText(OptimusAccountCreatePage.account_Comment, account, "Enter account_Comment ");
    }

    public static void click_Account_Create_btn() {
        click(OptimusAccountCreatePage.account_Create_btn, "Clicking Create Account button");
    }

    public static void click_Account_Delete_btn() {
        click(OptimusAccountCreatePage.account_Delete_btn, "Clicking Delete Account button");
    }

    public static void click_Configurations_SideTab() {
        click(OptimusAccountMainPage.account_Configurations_SideTab, "Clicking Configurations Side tab");
        waitForVisible(OptimusAccountMainPage.account_Configurations_RecordingAccounts_tab);
    }

    public static void click_Configurations_RecordingAccounts_Tab() {
        click(OptimusAccountMainPage.account_Configurations_RecordingAccounts_tab, "Clicking Recording Accounts Configurations tab");
        waitForVisible(OptimusAccountMainPage.accountConfigurations_Recording_AccountName_List);
    }

    public static void click_Configurations_RecordingWalletAddress_Tab() {
        waitForPresent(OptimusAccountMainPage.account_Configurations_RecordingWalletAddress_tab);
        click(OptimusAccountMainPage.account_Configurations_RecordingWalletAddress_tab, "Clicking Recording Wallet Address Configurations Side tab");
    }

    public static void click_CreateAccount_ConfigurationAccounts() {
        click(OptimusAccountMainPage.account_Configurations_AddAccount_List, "Clicking Add Account button on list page");
        waitForPresent(OptimusNitroAccountPage.nitroAccount_Create_ModalWindow);
    }
    public static void accountConfigurations_Search(String item) {
        waitForClickable(OptimusAccountMainPage.account_Configurations_SearchBox);
        inputText(OptimusAccountMainPage.account_Configurations_SearchBox, item, "Search input Account = " + item);
        click(OptimusAccountMainPage.account_Configuration_Search_Btn, "Click search button to search");
    }
    public static void accountConfigurations_Recording_Exchange(String item) {
        waitForClickable(OptimusAccountMainPage.accountConfigurations_Recording_Exchange);
        inputText(OptimusAccountMainPage.accountConfigurations_Recording_Exchange, item, "Select Recording Account Exchange = " + item);
        waitForPresent(By.xpath(String.format(OptimusAccountMainPage.accountConfigurations_Recording_Exchange_Options, item)));
        click(By.xpath(String.format(OptimusAccountMainPage.accountConfigurations_Recording_Exchange_Options, item)), "Choose Recording account Exchange dropdown options");
    }
    public static void accountConfigurations_Recording_AccountName(String item) {
        waitForClickable(OptimusAccountMainPage.accountConfigurations_Recording_AccountName);
        inputText(OptimusAccountMainPage.accountConfigurations_Recording_AccountName, item, "Select Recording Account name = " + item);
        waitForPresent(By.xpath(String.format(OptimusAccountMainPage.accountConfigurations_Recording_AccountName_Options, item)));
        click(By.xpath(String.format(OptimusAccountMainPage.accountConfigurations_Recording_AccountName_Options, item)), "Choose Recording account name dropdown options");
    }
    public static void accountConfigurations_Recording_ProductName(String item) {
        waitForClickable(OptimusAccountMainPage.accountConfigurations_Recording_ProductName);
        inputText(OptimusAccountMainPage.accountConfigurations_Recording_ProductName, item, "Select Product Name Account  = " + item);
        pressEnter(OptimusAccountMainPage.accountConfigurations_Recording_ProductName);
//        waitForPresent(By.xpath(String.format(OptimusAccountMainPage.accountConfigurations_Recording_ProductName_Options, item)));
//        click(By.xpath(String.format(OptimusAccountMainPage.accountConfigurations_Recording_ProductName_Options, item)), "Choose Product Name account dropdown options");
    }

    public static void clickCreateBtn_RecordingAccount() {
        click(OptimusAccountMainPage.accountConfigurations_Recording_AddRecording_CreateBtn, "Click Create Recording Account");
        waitForInVisibile(OptimusNitroAccountPage.nitroAccount_Create_ModalWindow);
    }

    public static void deleteAccount_ConfigurationAccounts() {
        click(OptimusAccountMainPage.accountConfigurations_Recording_CloseDeleteAccount_List, "Clicking Delete Account button on list page");
        waitForPresent(OptimusAccountMainPage.account_Configurations_OKDeleteAccount_popUp_List);
        click(OptimusAccountMainPage.account_Configurations_OKDeleteAccount_popUp_List, "Clicking OK to confirm Delete Account on list page");
    }

    public static String getRecordingAccountNameFromRecordingList() {
        waitForVisible(OptimusAccountMainPage.accountConfigurations_Recording_AccountName_List);
        return getElementText(OptimusAccountMainPage.accountConfigurations_Recording_AccountName_List);
    }

    public static String getProductAccountNameFromRecordingList() {
        waitForVisible(OptimusAccountMainPage.accountConfigurations_Recording_AccountName_List);
        return getElementText(OptimusAccountMainPage.accountConfigurations_Recording_AccountName_List);
    }

    public static void accountConfigurations_RecordingWallet_Search(String item) throws InterruptedException {
        waitForPresent(OptimusAccountMainPage.accountConfigurations_RecordingWallet_SearchBox);
        clearInputUsingKeys(OptimusAccountMainPage.accountConfigurations_RecordingWallet_SearchBox);
        inputText(OptimusAccountMainPage.accountConfigurations_RecordingWallet_SearchBox, item, "Enter Search Criteria");
        click(OptimusAccountMainPage.accountConfigurations_RecordingWallet_SearchBtn, "Click Search button ");
//        waitForVisible(OptimusAccountMainPage.accountConfigurations_RecordingWallet_NoData_List);
        delay(2000);
    }

    public static String get_accountConfigurations_RecordingWallet_Chain_List() {
//        waitForVisible(OptimusAccountMainPage.accountConfigurations_RecordingWallet_Chain_List);
        return getElementText(OptimusAccountMainPage.accountConfigurations_RecordingWallet_Chain_List);
    }

    public static String get_accountConfigurations_RecordingWallet_NoData_List() {
//        waitForVisible(OptimusAccountMainPage.accountConfigurations_RecordingWallet_NoData_List);
        return getElementText(OptimusAccountMainPage.accountConfigurations_RecordingWallet_NoData_List);
    }

}