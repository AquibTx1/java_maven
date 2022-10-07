package modules.OptimusActions;

import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import pageFactory.OptimusPages.CounterParty.OptimusCounterPartyCreatePage;
import pageFactory.OptimusPages.CounterParty.OptimusCounterPartyListPage;
import pageFactory.OptimusPages.CounterParty.OptimusCounterPartyUpdatePage;
import pageFactory.OptimusPages.CounterParty.OptimusRelatedPartyCreatePage;
import pageFactory.OptimusPages.Portfolio.PortfolioMainPage;
import pageFactory.OptimusPages.Settlement.SettlementMainPage;
import pageFactory.OptimusPages.Portfolio.PortfolioMainPage;
import pageFactory.OptimusPages.Settlement.SettlementUpdatePage;
import step_definitions.RunCukesTest;
import utilities.HTMLReportUtil;
import utilities.KeywordUtil;
import utilities.LogUtil;

import java.util.HashMap;


public class OptimusPortfolioCreateActions extends KeywordUtil {


    static Class<OptimusPortfolioCreateActions> thisClass = OptimusPortfolioCreateActions.class;

    public static void createPortfolioType(String porttype) {
        inputText(PortfolioMainPage.Portfolio_createPortfoliotype,porttype,"Portfolio Type"+porttype);
            waitForPresent(By.xpath(String.format(PortfolioMainPage.Portfolio_createPortfolio, porttype)));
            click(By.xpath(String.format(PortfolioMainPage.Portfolio_createPortfolio, porttype)), "Choose PortType");
    }
    public static void create_PortfolioName(String portfolioname) {
        inputText(PortfolioMainPage.Portfolio_createName, portfolioname, "Select Portfolioname=" + portfolioname);

    }
    public static void update_PortfolioName(String portfolioname) throws InterruptedException {
        KeywordUtil.clearInputUsingKeys(PortfolioMainPage.updateportfolioname);
        inputText(PortfolioMainPage.updateportfolioname, portfolioname, "Updated Portfolioname=" + portfolioname);
    }
    public static void createPortfolioStatus(String pstatus) {
        inputText(PortfolioMainPage.Portfolio_createStatus, pstatus, "Select Portfolio Status=" + pstatus);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + pstatus + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + pstatus + "']"), "Portfolio status selected");
    }
    public static void create_PortfolioOwner(String powner) {
        inputText(PortfolioMainPage.Portfolio_createOwner, powner, "Select Portfolio Status=" + powner);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + powner + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + powner + "']"), "Portfolio Owner selected");
    }
    public static void createHead(String phead) {

        inputText(PortfolioMainPage.Portfolio_createHead, phead, "Select Portfolio Status=" + phead);
        waitForPresent(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + phead + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + phead + "']"), "Portfolio Head selected");
    }

    public static void createTradingLocation(String Tradingloc) {
        inputText(PortfolioMainPage.Portfolio_createTradingLocation, Tradingloc, "Select Portfolio Status=" + Tradingloc);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + Tradingloc + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + Tradingloc + "']"), "Portfolio Trading selected");
    }

    public static void clickPortfolioMainTab() {
        click(PortfolioMainPage.Portfolio_MainTab, "Clicked the Portfolio Tab");
    }

    public static void clickPortfoliolink() {
        click(PortfolioMainPage.Portfolio_link, "Clicked the Portfolio Tab");
    }

    public static void ChooseNewPortfolio() {
        click(PortfolioMainPage.NewPortfolio_link, "Clicked the New Portfolio");
    }

    public static void createMaingroup(String maingroup) {
        inputText(PortfolioMainPage.Portfolio_Hierarchy, maingroup, "Select Portfolio Status=" + maingroup);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + maingroup + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + maingroup + "']"), "Main Group selected");
    }

    public static void createBusinessLine(String businessline) {
        inputText(PortfolioMainPage.Portfolio_Business, businessline, "Select Portfolio Status=" + businessline);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + businessline + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + businessline + "']"), "Business Head selected");

    }

    public static void createActivity(String activity) {
        inputText(PortfolioMainPage.Portfolio_Activity, activity, "Select Portfolio Status=" + activity);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + activity + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + activity + "']"), "Activity Head selected");

    }

    public static void createSubActivity(String subactivity) {
        inputText(PortfolioMainPage.Portfolio_SubActivity, subactivity, "Select Portfolio Status=" + subactivity);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + subactivity + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + subactivity + "']"), " Sub activity selected");

    }

    public static void createStrategy(String startegy) {
        inputText(PortfolioMainPage.Portfolio_Strategy, startegy, "Select Portfolio Strategy=" + startegy);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + startegy + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + startegy + "']"), "Strategy selected");

    }

    public static void createCurrency(String currency) {
        inputText(PortfolioMainPage.Portfolio_currency, currency, "Select Portfolio Strategy=" + currency);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + currency + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + currency + "']"), "Currency selected"+currency);
    }

    public static void createFunCurrency(String functional_currency) {
        inputText(PortfolioMainPage.Portfolio_functionalcurrency, functional_currency, "Select Portfolio Strategy=" + functional_currency);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + functional_currency + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + functional_currency + "']"), "Functional Currency"+functional_currency);
    }

    public static void createPLCalculation(String calculation) {
        inputText(PortfolioMainPage.Portfolio_calculation, calculation, "Select Portfolio Strategy=" + calculation);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + calculation + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + calculation + "']"), "Calculation Selected"+calculation);
    }

    public static void createFiatSettlmentGroup(String fiat) {
        inputText(PortfolioMainPage.Portfolio_fiatgroup, fiat, "Select Portfolio Strategy=" + fiat);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + fiat + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + fiat + "']"), "Fiat  Selected"+fiat);
    }

    public static void createTokenSettlmentGroup(String Token) {
        inputText(PortfolioMainPage.Portfolio_tokengroup, Token, "Select Portfolio Strategy=" + Token);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + Token + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + Token + "']"), "Token Selected"+Token);
    }

    public static void CostCenter(String costcenter) {
        inputText(PortfolioMainPage.Portfolio_CostCenter, costcenter, "Select Portfolio Strategy=" + costcenter);

    }

    public static void clickCreatePortfolio() {
        clickJS(PortfolioMainPage.create_Portfoliobtn, "Clicked the Portfolio Button");

    }

    public static String getPortfolioName()
    {
        String name=getElementText(By.xpath("//span[text()='Portfolio Number']//following::tr[2]/td[5]"));
        LogUtil.infoLog(thisClass,"Portfolio name is ="+name);
        return  name;
    }
    public static String getPortfolioOwner()
    {
        String owner=getElementText(By.xpath("//span[text()='Portfolio Number']//following::tr[2]/td[7]"));
        LogUtil.infoLog(thisClass,"name is ="+owner);
        return  owner;
    }
    public static String getPortfolionumber() {
        return getElementValueWithVisibility(PortfolioMainPage.portfolionumber);
    }
    public static void clickUpdatePortfolio() {
        click(PortfolioMainPage.updatebtn, "Clicked the update button");
    }
    public static void update_PortfolioOwner(String portfolio_own) throws InterruptedException {
        inputText(PortfolioMainPage.updateportfolio_owner, portfolio_own, "Updated Portfolio Owner=" +portfolio_own);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + portfolio_own + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + portfolio_own + "']"), "Owner Updated"+portfolio_own);

    }
    public static void update_PortfolioEntitycode(String portfolio_entity_code) {
        inputText(PortfolioMainPage.Portfolio_updateentitycode, portfolio_entity_code, "Updated Portfolio Owner=" +portfolio_entity_code);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + portfolio_entity_code + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + portfolio_entity_code + "']"), "Entity Code Updated"+portfolio_entity_code);
    }

    public static void update_PortfolioLocation(String portfolio_location) throws InterruptedException {
        clearInputUsingKeys(PortfolioMainPage.Portfolio_updatedLocation);
        inputText(PortfolioMainPage.Portfolio_updatedLocation,portfolio_location,"Portfolio Updated Location"+portfolio_location);
        waitForPresent(By.xpath(String.format(PortfolioMainPage.Portfolio_updatedLocationoption, portfolio_location)));
        click(By.xpath(String.format(PortfolioMainPage.Portfolio_updatedLocationoption, portfolio_location)), "Choose Portfolio Location");

    }

    public static void update_PortfolioBranchCode(String accounting_branch_code) {
        inputText(PortfolioMainPage.Portfolio_updateBranchcode, accounting_branch_code, "Branch Code=" +accounting_branch_code);
        }

    public static void update_PortfolioCostCenter(String cost_center) {
        inputText(PortfolioMainPage.Portfolio_updateCostCenter, cost_center, "Updated Cost  Center=" +cost_center);

    }
    public static void update_PortfolioGSTInfo(String gst_information) {
        inputText(PortfolioMainPage.Portfolio_updateGSTInformation, gst_information, "Updated Portfolio Owner=" +gst_information);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + gst_information + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + gst_information + "']"), "Entity Code Updated"+gst_information);
    }

    public static String getPortfolioLocation() {
        String Location=getElementText(By.xpath("//span[text()='Portfolio Number']//following::tr[2]/td[22]"));
        LogUtil.infoLog(thisClass,"name is ="+Location);
        return  Location;
    }

    public static String getPortfolioentitycode() {
        String code=getElementText(By.xpath("//span[text()='Portfolio Number']//following::tr[2]/td[21]"));
        LogUtil.infoLog(thisClass,"name is ="+code);
        return  code;
    }
    public static void deleteRecord() throws InterruptedException {
        delay(2000);
            click(PortfolioMainPage.Portfolio_deleterecordbtn,"Clicked on the Delete Button");
            waitForVisible(SettlementUpdatePage.updatesettlement_yesdeletebtn);
        delay(5000);
            click(SettlementUpdatePage.updatesettlement_yesdeletebtn,"clicked on Yes Button");
        delay(2000);
    }

    public static void update_HeadofBusiness(String head) {
        inputText(PortfolioMainPage.Portfolio_updateHOB, head, "Updated Portfolio Owner=" +head);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + head + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + head + "']"), "New Head Updated"+head);

    }

    public static void update_TradingLocation(String TL) {
        inputText(PortfolioMainPage.Portfolio_updateTradingLocation, TL, "Updated Portfolio Owner=" +TL);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + TL + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + TL + "']"), "NEw Trading Location Updated"+TL);

    }

    public static String validateuser(HashMap<String, String> dataMap) {
        // boolean flag = false;
        String S1 = dataMap.get("Portfolio Name").toString();
        String Name=(getElementText(By.xpath("//td[text()='"+S1+"']")));
        System.out.println(Name);
        return Name;
    }

    public static void verifyDownloadCSVBtn() {
        waitForClickable(PortfolioMainPage.Portfolio_DownloadCSVBtn);
        RunCukesTest.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringGreyColor("Download CSV button is enabled and clickable"));
    }
}
