package modules.OptimusActions;

import com.atlassian.jira.rest.client.api.domain.LoginInfo;
import groovy.transform.builder.InitializerStrategy;
import modules.NitroXActions.NitroXHome;
import modules.XAlphaActions.XAlphaDealEnquiryActions;
import org.openqa.selenium.By;
import pageFactory.NitroXPages.NitroXBotsPage;
import pageFactory.NitroXPages.NitroXBuySellFuturePage;
import pageFactory.NitroXPages.NitroXHomePage;
import pageFactory.OptimusPages.CounterParty.OptimusCounterPartyCreatePage;
import pageFactory.OptimusPages.CounterParty.OptimusCounterPartyMainPage;
import pageFactory.OptimusPages.CounterParty.OptimusCounterPartyUpdatePage;
import pageFactory.OptimusPages.Settlement.SettlementMainPage;
import pageFactory.OptimusPages.Settlement.SettlementUpdatePage;
import pageFactory.XAlphaPages.XAlphaDealEnquiryPage;
import pageFactory.XAlphaPages.XAlphaDealInputPage;
import pageFactory.XAlphaPages.XAlphaDealProcessingPage;
import pageFactory.XAlphaPages.XAlphaLoginPage;
import utilities.KeywordUtil;
import utilities.LogUtil;

import java.util.HashMap;
import java.util.Set;

public class OptimusSettlementActions extends KeywordUtil {

    static Class thisClass = OptimusSettlementActions.class;

    static String name;
    public static void clickSettlement() {
        click(SettlementMainPage.settlement_MainTab, "Click Settlement tab");
    }

    public static void clickSettlementLink() {
        click(SettlementMainPage.settlementlink, "Click Settlement tab");
    }

    public static void choosenewSettlement() {
        click(SettlementMainPage.newSettlement, "Click Settlement tab");
    }

    public static void newSettlement_CounterParty(String CounterPartyID) {
        inputText(SettlementMainPage.newSettlement_CounterpartyID, CounterPartyID, "Select Counterparty ID=" + CounterPartyID);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + CounterPartyID + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + CounterPartyID + "']"), "CounterPartyID selected");
    }

    public static void newSettlement_ExternalNickName(String exnickname) {
        clearInput(SettlementMainPage.newSettlement_NicknameExternal);
        inputText(SettlementMainPage.newSettlement_NicknameExternal, exnickname, "Nickname External=" + exnickname);
    }

    public static void newSettlement_InternalNickName(String innickname) {
        clearInput(SettlementMainPage.newSettlement_NicknameInternal);
        inputText(SettlementMainPage.newSettlement_NicknameInternal, innickname, "Nickname External=" + innickname);
    }

    public static String getSettlement_Nickname_Internal() {
        name = getElementText(SettlementMainPage.newSettlement_NicknameInternal);
        LogUtil.infoLog(SettlementMainPage.class, "Nick Name is =" + name);
        return name;
    }
    public static void chooseSettlementType(String s) {
        inputText(SettlementMainPage.newSettlement_Type, s, "Settlement Type=" + s);
        pressEnter(SettlementMainPage.newSettlement_Type);
    }

    public static void chooseCurrency(String currency) {
        inputText(SettlementMainPage.newSettlement_Currency, currency, "Currency =" + currency);
        pressEnter(SettlementMainPage.newSettlement_Currency);
    }

    public static void chooseTransferMethod(String transfer_method) {
        inputText(SettlementMainPage.newSettlement_Transfermethod, transfer_method, "Transfer Method=" + transfer_method);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + transfer_method + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + transfer_method + "']"), "Transfer_Method selected");
    }

    public static void chooseNetwork(String network) {
        inputText(SettlementMainPage.newSettlement_Network, network, "Network Type is=" + network);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + network + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + network + "']"), "Network selected");
    }

    public static void chooseCustodian(String custodian) {
        inputText(SettlementMainPage.newSettlement_Custodian, custodian, "Network Type is=" + custodian);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + custodian + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + custodian + "']"), "Custodian selected");
    }

    public static void chooseBankName(String bankname) {
        inputText(SettlementMainPage.newSettlement_BankName, bankname, "Selected the Bank =" + bankname);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + bankname + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + bankname + "']"), "Bank Name selected");
    }

    public static void chooseAddress(String bankaddress) {
        inputText(SettlementMainPage.newSettlement_BankAddress, bankaddress, "Bank address =" + bankaddress);
    }

    public static void enterBankAccountNumber(String accountnumber) {
        inputText(SettlementMainPage.newSettlement_BankAccountNumber, accountnumber, "Account number =" + accountnumber);
    }

    public static void chooseBankSwiftCode(String swiftcode) {
    }

    public static void chooseBankBeneficiaryName(String name) {
        inputText(SettlementMainPage.newSettlement_BankBeneficiaryName, name, "Beneficiary Name =" + name);
    }

    public static void chooseBankBeneficiaryaddress(String address) {
        inputText(SettlementMainPage.newSettlement_BankAddress, address, "Bank address =" + address);
    }

    public static void chooseWalletAddress(String wallet_address) {
        inputText(SettlementMainPage.newSettlement_WalletAddress, wallet_address, "Wallet address =" + wallet_address);
    }

    public static void chooseWalleMemo(String wallet_memo) {
        inputText(SettlementMainPage.newSettlement_WalletMemo, wallet_memo, "Wallet address =" + wallet_memo);
    }

    public static void choosePurpose(String purpose) {
        inputText(SettlementMainPage.newSettlement_purpose, purpose, " Purpose =" + purpose);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + purpose + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + purpose + "']"), "Purpose selected");
    }

    public static void clickCreateSettlement() {
        KeywordUtil.click(SettlementMainPage.newSettlement_createSettlementbtn, "Create Settlement Clicked");
    }

    public static void waitForSuccessMsgToAppear() {
        waitForPresent(SettlementMainPage.CreateSettlement_SuccessMsg);
    }

    public static void waitForSuccessMsgToDisappear() {
        waitForInVisibile(SettlementMainPage.CreateSettlement_SuccessMsg);
    }

    public static void logoutFromOptimus() throws InterruptedException {
        click(SettlementMainPage.logoutbtn_settlement, "Logout from Optimus app");
    }

    public static void clickTaskslink() {
        click(SettlementMainPage.newSettlement_Tasks, "Clicked the Task Link");
    }

    public static void selectSettlementCheckbox() throws InterruptedException {
        click(SettlementMainPage.newSettlement_Checkbox, "Clicked the Checkbox");
    }

    public static void selectAllSettlementbtn() {
        click(SettlementMainPage.newSettlement_selectAll, "Clicked the select btn");
    }

    public static void selectApprovebtn() {
        click(SettlementMainPage.newSettlement_Approve, "Clicked the approve");
        waitForVisible(SettlementMainPage.yesbtn);
        click(SettlementMainPage.yesbtn, "Click yes button to confirm approve");
    }


    public static void inputNickname(String nickname) throws InterruptedException {
        System.out.println("name is =" + nickname);
        inputText(SettlementMainPage.newSettlement_inputsearchtext, nickname, "Input the name =" + nickname);
        delay(3000);
        click(SettlementMainPage.newSettlement_ClickSearch,"Search Button clicked");
    }

    public static void inputValue(String value) throws InterruptedException {
        System.out.println("name is =" + value);
        inputText(SettlementMainPage.newSettlement_inputsearchtext, value, "Input the name =" + value);
        delay(3000);
        click(SettlementMainPage.newSettlement_ClickSearch,"Search Button clicked");
    }

    public static void searchuser() {
        click(SettlementMainPage.newSettlement_ClickSearch,"Search Button clicked");
    }
    public static void sortSettlementRef() throws InterruptedException {
        KeywordUtil.click(SettlementMainPage.settlementSort,"Sorted Based on Start Time");
        delay(2000);
        KeywordUtil.click(SettlementMainPage.settlementSort,"Sorted Based on Start Time");
        LogUtil.infoLog(thisClass, "sorted the Start Time to get latest Record");
    }
    public static String getNameSettlementList()
    {
        String name=getElementText(By.xpath("//span[text()='Settlement Ref.']//following::tr[2]/td[6]"));
        LogUtil.infoLog(thisClass,"name is ="+name);
        return  name;
    }
    public static String getExtNameSettlementList()
    {
        String name=getElementText(By.xpath("//span[text()='Settlement Ref.']//following::tr[2]/td[5]"));
        LogUtil.infoLog(thisClass,"name is ="+name);
        return  name;
    }public static void clickLogout() throws InterruptedException {
        hoverOnElement(SettlementMainPage.logoutbtn_settlement);
        delay(2000);
        hoverOnElementandClick(SettlementMainPage.logoutbtn_settlement);
    }
    public static void refreshPage() {
        KeywordUtil.pageRefresh();
    }

    public static void clickEditSettlement() {
        click(SettlementMainPage.newSettlement_edit, "Clicked the Edit");
    }

    public static void newSettlement_UpdatedExternalNickName(String settlement_nickname_external_updated) throws InterruptedException {
        click(SettlementMainPage.newSettlement_updatedNicknameExternal, "Clicked the ext");
        KeywordUtil.clearInputUsingKeys(SettlementMainPage.newSettlement_updatedNicknameExternal);
        delay(2000);
        inputText(SettlementMainPage.newSettlement_updatedNicknameExternal, settlement_nickname_external_updated, "Nickname External=" + settlement_nickname_external_updated);
    }

    public static void newSettlement_UpdatedInternalNickName(String settlement_nickname_internal_updated) throws InterruptedException {
        click(SettlementMainPage.newSettlement_updatedNicknameInternal, "Clicked the ext");
        clearInputUsingKeys(SettlementMainPage.newSettlement_updatedNicknameInternal);
        delay(2000);
        inputText(SettlementMainPage.newSettlement_updatedNicknameInternal, settlement_nickname_internal_updated, "Nickname External=" + settlement_nickname_internal_updated);
    }

    public static void updateSettlement() {
        click(SettlementMainPage.newSettlement_updatebtn, "Clicked the Edit");
    }

    public static void clickPortfolio() {
        click(SettlementMainPage.newSettlement_approvelink, "Clicked the Portfolio");
    }

    public static void clickCounterPartyTab() {
        click(OptimusCounterPartyMainPage.counterParty_MainTab, "Clicked the Counterparty");
    }

    public static void deleteSettlementRecord() {
        click(SettlementUpdatePage.updatesettlement_deletebtn,"Clicked on the Delet Button");
        waitForVisible(SettlementUpdatePage.updatesettlement_yesdeletebtn);
        click(SettlementUpdatePage.updatesettlement_yesdeletebtn,"clicked on Yes Button");
    }

    public static String getSettlmentref()
    {
        String refid=getElementText(SettlementUpdatePage.updatesettlement_refid);
        LogUtil.infoLog(thisClass,"name is ="+refid);
        return  refid;
    }

    public static String getSettlmentrefid() {
        return getElementValueWithVisibility(SettlementUpdatePage.updatesettlement_refid);
    }

    public static void clickSearch() {
        click(SettlementMainPage.newSettlement_ClickSearch,"Search Button clicked");
    }

    public static String getNoData() {
        String nodata=getElementText(SettlementMainPage.newSettlement_nodata);
        return nodata;
    }
}
