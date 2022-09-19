package modules.NitroXActions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.FindElements;
import org.testng.Assert;
import org.testng.IDataProviderInterceptor;
import pageFactory.NitroXPages.NitroXBotsPage;
import org.openqa.selenium.By;
import pageFactory.NitroXPages.NitroXHomePage;
import utilities.KeywordUtil;
import utilities.LogUtil;

import java.util.HashMap;
import java.util.List;

import static utilities.KeywordUtil.*;

public class NitroXBotsAction {

    static Class thisClass = NitroXBotsAction.class;
    public static String getTotal, firstbotid,firsttradingAccount,trrigervalue,tvalue,dealref,Mode,dealtamount,Botdetailquantity;
   public static int totalfiltered,serviceidbefore,serviceidAfter = 0;


    public static void clickStart() throws Exception
    {
        KeywordUtil.click(NitroXBotsPage.startbtn,  "Start Button Clicked");
    }

    public static void inputService(String service) throws Exception
    {
        KeywordUtil.inputText(NitroXBotsPage.service, service, "Service value entered ");
        pressEnter(NitroXBotsPage.service);
    }

    public static void inputMethod(String method) throws Exception
    {
        KeywordUtil.inputText(NitroXBotsPage.method,method, "Method of bot value entered ");
        pressEnter(NitroXBotsPage.method);
    }

    public static void inputBotQuantity(String botquantity) throws Exception
    {
        KeywordUtil.click(NitroXBotsPage.botquanity,"Clicked into the Bot Quantity");
        KeywordUtil.pressBackSpace(NitroXBotsPage.botquanity);
        KeywordUtil.inputText(NitroXBotsPage.botquanity, botquantity, "Bot Quantity value entered ");
    }

    public static void inputOrderDirection(String orderdirection) throws Exception
    {
        KeywordUtil.clearInputUsingKeys(NitroXBotsPage.orderdirection);
        KeywordUtil.inputText(NitroXBotsPage.orderdirection,orderdirection, "BUY or Sell Order field selected ");
        pressEnter(NitroXBotsPage.orderdirection);
    }

    public static void inputMinTime(String mintime) throws Exception
    {
        KeywordUtil.click(NitroXBotsPage.mintimebreak,"Min Time Values Click");
        KeywordUtil.clearInputUsingKeys(NitroXBotsPage.mintimebreak);
        KeywordUtil.inputText(NitroXBotsPage.mintimebreak,mintime, "Min Time values selected");
    }

    public static void inputMaxTime(String maxtime) throws Exception
    {
        KeywordUtil.click(NitroXBotsPage.maxtimebreak,"Max Time Values Click");
        KeywordUtil.clearInputUsingKeys(NitroXBotsPage.maxtimebreak);
        KeywordUtil.inputText(NitroXBotsPage.maxtimebreak,maxtime, "Max Time  selected ");
    }
    public static void inputOrderAmount(String amount) throws Exception
    {
        KeywordUtil.click(NitroXBotsPage.orderamount,"Ordered Amount Entered");
        KeywordUtil.clearInputUsingKeys(NitroXBotsPage.orderamount);
        KeywordUtil.inputText(NitroXBotsPage.orderamount, amount, "Amount vale entered ");
    }
    public static void inputMinPrice(String minprice) throws Exception
    {
        KeywordUtil.click(NitroXBotsPage.minprice,"Min Price  Values Click");
        KeywordUtil.clearInputUsingKeys(NitroXBotsPage.minprice);
        KeywordUtil.inputText(NitroXBotsPage.minprice,minprice, "Min Amount value entered ");
    }
    public static void inputMaxPrice(String maxprice) throws Exception
    {
        KeywordUtil.click(NitroXBotsPage.maxprice,"Max Price Values Click");
        KeywordUtil.clearInputUsingKeys(NitroXBotsPage.maxprice);
        KeywordUtil.inputText(NitroXBotsPage.maxprice, maxprice,"Max Amount value entered ");
    }

    public static void inputOrderType(HashMap<String,String>dataMap) throws Exception
    {
        KeywordUtil.inputText(NitroXBotsPage.ordertype, dataMap.get("Order Type"), "Order Type selected ");
        pressEnter(NitroXBotsPage.ordertype);
    }

    public static void inputDealRef(HashMap<String,String> dataMap) throws Exception
    {
        KeywordUtil.inputText(NitroXBotsPage.dealref, dataMap.get("Deal Ref"), "Deal Ref. entered ");
    }

    public static void clickSubmit() throws Exception
    {
        KeywordUtil.click(NitroXBotsPage.submitbtn,  "Bot Exec Submit Button Clicked");
    }

    public static void closeBot() throws Exception
    {
        KeywordUtil.click(NitroXBotsPage.closebtn,  "Bot Exec close Button Clicked");
    }

    public static void selecttotalBots() throws Exception
    {
        KeywordUtil.click(NitroXBotsPage.totalfilered,  "Total Filtered Bots  Clicked");
    }

    public static void getDetailedBots()
    {
        KeywordUtil.switchToFrame("babda");
    }

    public static String getBotId() throws Exception
    {
        waitForVisible(NitroXBotsPage.botid);
        firstbotid = KeywordUtil.getElementText(NitroXBotsPage.botid);
        LogUtil.infoLog(thisClass, "BOT  Id Is" + firstbotid);
        return firstbotid;
    }

    public static String getName() throws Exception
    {
        waitForVisible(NitroXBotsPage.botName);
        firsttradingAccount = KeywordUtil.getElementText(NitroXBotsPage.botName);
        LogUtil.infoLog(thisClass, "Trader  Name Is" + firsttradingAccount);
        return firsttradingAccount;
    }

    public static void waitforBotWindow() throws Exception
    {
        waitForVisible(NitroXBotsPage.startnewbot);
    }

    public static void getBotSubmitSuccessMsg() throws Exception
    {
        waitForVisible(NitroXBotsPage.botsuccessMsg);
        LogUtil.infoLog(thisClass, "Bot successfully Submitted message displayed.");

    }
    public static String getBotStartTime() throws Exception
    {
        waitForVisible(NitroXBotsPage.starttime);
        String time=getElementText(By.xpath("//span[text()='Detailed Bots ETH/USDT' or text()='Detailed Bots BTC/USDT']/following::table[1]/tbody/tr[1]/td[7]"));
        return time;
    }

    public static int getTotalFilteredBots()
    {
        String getTotal=getElementText(By.xpath("//div[text()='Total (Filtered)']/following-sibling::*/span/span"));
        totalfiltered= Integer.parseInt(getTotal);
        return  totalfiltered;
    }
    public static boolean validateBotDisplayed()
    {
        String getTotalbbots=getElementText(By.xpath("//div[text()='Total (Filtered)']/following-sibling::*/span/span"));
        LogUtil.infoLog(thisClass, "Bots available=" + getTotalbbots);
        System.out.println(getTotalbbots);
        return true;
    }
    public static int getServiceIDBefore()
    {
        String serviceid=getElementText(By.xpath("//th[text()='Service ID']//following::tr[1]/td[2]"));
        serviceidbefore= Integer.parseInt(serviceid);
        return  serviceidbefore;
    }

    public static int getServiceIDAfter()
    {
        String serviceid=getElementText(By.xpath("//th[text()='Service ID']//following::tr[1]/td[2]"));
        serviceidAfter= Integer.parseInt(serviceid);
        return  serviceidAfter;
    }
    public static int getBotafterBuyorSell(){
        getTotal=getElementText(By.xpath("//div[text()='Total (Filtered)']/following-sibling::*/span/span"));
        return  Integer.parseInt(getTotal);
    }
    public static void sortStartTime() throws InterruptedException {
        KeywordUtil.click(NitroXBotsPage.clickstarttime,"Sorted Based on Start Time");
        delay(2000);
        KeywordUtil.click(NitroXBotsPage.clickstarttime,"Sorted Based on Start Time");
        LogUtil.infoLog(thisClass, "sorted the Start Time to get Latest Bot Created");
    }
    public static void inputTrigerCondtion()
    {
        trrigervalue=KeywordUtil.generateRandomNumber();
        KeywordUtil.inputText(NitroXBotsPage.trrigercond,trrigervalue,"Entered Trigger ");
        LogUtil.infoLog(thisClass, "Actual Trigger value :" +trrigervalue);
    }
    public static void selectLatestBotName()
    {
        KeywordUtil.click(NitroXBotsPage.botName,  "Total Filtered Bots  Clicked");
        LogUtil.infoLog(thisClass, "Clicked the Latest Bot Created");
    }
    public static void selectConfig()
    {
        KeywordUtil.click(NitroXBotsPage.config,  "Total Filtered Bots  Clicked");
        LogUtil.infoLog(thisClass, "Clicked the config");
        //waitForVisible(NitroXBotsPage.trigger);
    }
    public static String getTrigerConditionvalue() {
        tvalue= KeywordUtil.getElementText(NitroXBotsPage.trrigger);
        LogUtil.infoLog(thisClass, "Trigger value is" + tvalue);
        return tvalue;
    }
    public static void CloseConfig()
    {
        KeywordUtil.click(NitroXBotsPage.closeconfigbtn,  " Closed Clicked");
        LogUtil.infoLog(thisClass, "Closed  the config Tab");
    }

    public static void CloseConfig2()
    {
        KeywordUtil.click(NitroXBotsPage.closeconfigbtn2,  " Closed Clicked");
        LogUtil.infoLog(thisClass, "Closed  the config Tab");
    }


    public static void CloseBotDetail() {
        KeywordUtil.click(NitroXBotsPage.closebotdetailbtn,  " BOT Detail Closed");
        LogUtil.infoLog(thisClass, "Closed  the Bot Detail");
    }

    public static void clickDealtOrdersTab()
    {
        click(NitroXBotsPage.DealtOrderTab, "Clicked Dealt Order");
    }

    public static void stopAllBots()  {

        try {
            click(NitroXBotsPage.totalfilered,"Clicked Total Filtered");
            delay(2000);
            waitForVisible(NitroXBotsPage.allbots);
            click(NitroXBotsPage.allbots,"Selected All Bots");
            scrollingToElementofAPage(NitroXBotsPage.stopbots,"Scrolled to Stop All Bots ");
            click(NitroXBotsPage.stopbots,"Stopped all Bots");
            waitForVisible(NitroXBotsPage.nodatabotdetail);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }
    public static void stopCurrentBot(){
            try {
                KeywordUtil.pageRefresh();
                click(NitroXBotsPage.totalfilered,"Clicked Total Filtered");
                delay(2000);
                NitroXBotsAction.sortStartTime();
                //NitroXBotsAction.selectLatestBotName();
                click(NitroXBotsPage.currentbot,"Selected Current Bot");
                scrollingToElementofAPage(NitroXBotsPage.stopbots,"Scrolled to Stop All Bots ");
                click(NitroXBotsPage.stopbots,"Stopped the Current  Bot");
                click(NitroXBotsPage.closebtn,"Clicked the Detailed Bot");
            } catch (Throwable e) {
                e.getMessage();
                e.printStackTrace();
            }
    }
    public static double getPrice() {
        waitForVisible(NitroXHomePage.Ordertableprice);
        String lastaskprice = getElementText(By.xpath("(//span[text()='Orderbook ']/following::table[1]/tbody//child::tr)[last()]/td[2]"));
        lastaskprice = lastaskprice.replace(",", "");
        LogUtil.infoLog(thisClass, "Ask price" + lastaskprice);
        return Double.parseDouble(lastaskprice);
    }

    public static double getBidPrice() {
        waitForVisible(By.xpath("//span[text()='Spread:']/following::table[1]/tbody/tr"));
        String firstbidprice = getElementText(By.xpath("(//span[text()='Spread:']/following::table[1]/tbody//child::tr)[1]/td[2]"));
        firstbidprice = firstbidprice.replace(",", "");
        LogUtil.infoLog(thisClass, "Biding price" + firstbidprice);
        return Double.parseDouble(firstbidprice.replace(",",""));
    }

    public static double getDealtOrderPrice()
    {
        String price = getElementText(By.xpath("//span[text()='Recent Dealt Orders']/following::table[01]/tbody[01]/tr[02]/td[03]/span"));
        LogUtil.infoLog(thisClass, "Dealt order price=" + price);
        return Double.parseDouble(price.replace(",", ""));
    }
    public static double getDealtOrderQuantity()
    {
        String Quantity = formatDecimalToStr(getElementText(By.xpath("//span[text()='Recent Dealt Orders']/following::table[01]/tbody[01]/tr[02]/td[04]/span")));
        LogUtil.infoLog(thisClass, "Dealt order Quantity=" + Quantity);
        return Double.parseDouble(Quantity.replace(",",""));
        //Double.parseDouble(Quantity.replace(",", ""));
    }
    public static double getBotDetailQuantity()
    {
        Botdetailquantity = getElementText(By.xpath("//span[text()='quantity']/following::td[1]/span"));
        LogUtil.infoLog(thisClass, "Bot detail Quantity=" + Botdetailquantity);
        return Double.parseDouble(Botdetailquantity.replace(",", ""));
    }
    public static double getDealt_price()
    {
        String dealt_price = getElementText(By.xpath("//span[text()='dealt_price']/following::td[1]/span"));
        LogUtil.infoLog(thisClass, "Dealt order price=" + dealt_price);
        return Double.parseDouble(dealt_price.replace(",", ""));
    }

    public static double getOrderAmount()
    {
        String orderamount = getElementText(By.xpath("//*[text()='order_amount']/following::span[1]"));
        LogUtil.infoLog(thisClass, "Ordered Amount is=" + orderamount);
        return Double.parseDouble(orderamount.replace(",", ""));
    }
    public static String getSide()
    {
        String side=getElementText(By.xpath("//span[text()='Recent Dealt Orders']/following::table[01]/tbody[01]/tr[02]/td[02]/span"));
        LogUtil.infoLog(thisClass, "Side is=" + side);
        return side;
    }
    public static String getBotDetailSide()
    {
        String side=getElementText(By.xpath("//span[text()='side']/following::span[1]"));
        LogUtil.infoLog(thisClass, "Side is=" + side);
        return side;
    }


    /*********************************SNIPER BOT********************************************/

    public static void selectSide(HashMap<String,String>dataMap) throws InterruptedException {
        KeywordUtil.clearInputUsingKeys(NitroXBotsPage.side);
        delay(1000);
        KeywordUtil.inputText(NitroXBotsPage.side, dataMap.get("Side"), "BUY or Sell Order field selected ");
        pressEnter(NitroXBotsPage.side);
    }
    public static void inputTotalAmount(String totalAmount) throws InterruptedException {
        KeywordUtil.clearInputUsingKeys(NitroXBotsPage.totalamount);
        KeywordUtil.inputText(NitroXBotsPage.totalamount, totalAmount, "Amount value entered ");
    }
    public static String getTotalAmount(){
        String amount=getElementText(NitroXBotsPage.totalamount);
        LogUtil.infoLog(thisClass, "Total Amount is : " + amount);
        return amount;
    }
    public static String getAmountfromBotDetailSnipper()
    {
        dealtamount=getElementText(NitroXBotsPage.botdetail_snipper);
        LogUtil.infoLog(thisClass, "Dealt Amount in Bot Detail : " + dealtamount);
        return dealtamount;

    }
    public static String getTotalAmountfromBotDetailSnipper()
    {
        String totalamount=getElementText(NitroXBotsPage.totalamount_botdetail);
        LogUtil.infoLog(thisClass, "Total Amount in Bot Detail : " + totalamount);
        return totalamount;

    }
    public static void inputMinPriceforSniper(HashMap<String,String>dataMap) throws InterruptedException {

        KeywordUtil.click(NitroXBotsPage.minprice_sniper,"Min Price  Values Entered");
        KeywordUtil.clearInputUsingKeys(NitroXBotsPage.minprice_sniper);
        KeywordUtil.inputText(NitroXBotsPage.minprice_sniper, dataMap.get("MinPrice"), "Min Amount value entered ");
    }
    public static void inputMaxPriceforSniper(HashMap<String,String>dataMap) throws InterruptedException {
        KeywordUtil.click(NitroXBotsPage.maxprice_sniper,"Max Price  Values Entered");
        KeywordUtil.clearInputUsingKeys(NitroXBotsPage.maxprice_sniper);
        KeywordUtil.inputText(NitroXBotsPage.maxprice_sniper, dataMap.get("MaxPrice"), "Max Amount value entered ");
    }
    public static void inputMaxThreshold(HashMap<String,String>dataMap) throws InterruptedException {

        KeywordUtil.click(NitroXBotsPage.maxSlippageThreshold_sniper,"Threshold  Values Entered");
        KeywordUtil.clearInputUsingKeys(NitroXBotsPage.maxSlippageThreshold_sniper);
        KeywordUtil.inputText(NitroXBotsPage.maxSlippageThreshold_sniper, dataMap.get("MaxSlippageThreshold"), "Threshold  Values Entered");
    }

    public static String getTrigerConditionvalue_Sniper() {
        String tvalue_sniper = getElementText(NitroXBotsPage.s_trrigger);
        LogUtil.infoLog(thisClass, "Trigger  value in Config Tab : " + tvalue_sniper);
        return tvalue_sniper;
    }
    public static void inputTwapBotQuantity(String Quantity) throws InterruptedException {
            KeywordUtil.clearInputUsingKeys(NitroXBotsPage.quantity);
            KeywordUtil.inputText(NitroXBotsPage.quantity,Quantity, "Quantity entered");
    }

    public static void inputPairBotQuantity(String Quantity) throws InterruptedException {
        KeywordUtil.clearInputUsingKeys(NitroXBotsPage.quantity);
        KeywordUtil.inputText(NitroXBotsPage.quantity,Quantity, "Quantity entered");
    }

    public static void inputSliceSize(String slicesize) throws InterruptedException {
            KeywordUtil.clearInputUsingKeys(NitroXBotsPage.slicesize);
            KeywordUtil.inputText(NitroXBotsPage.slicesize, slicesize, "SliceSize value entered");
    }

    public static String getSliceSize(){
        String slice_size = getElementText(NitroXBotsPage.slicesize_botdetail);
        LogUtil.infoLog(thisClass, "Updated SliceSize  : " + slice_size);
        return slice_size;
    }
    public static void selectmode(HashMap<String, String> dataMap)
    {
            waitForVisible(NitroXBotsPage.instrumenttype);
            inputText(NitroXBotsPage.instrumenttype,dataMap.get("Mode"),"Mode Selected");

    }

    public static void selectmodePairTradingBot(HashMap<String, String> dataMap)
    {
        waitForVisible(NitroXBotsPage.instrumenttype);
        inputText(NitroXBotsPage.instrumenttype,dataMap.get("Mode"),"Mode Selected");
        pressEnter(NitroXBotsPage.instrumenttype);
    }
    public static void inputTradingAccount(HashMap<String, String> dataMap) {
        try {
            click(NitroXBotsPage.accountid, "Trading Account text field clicked.");
            inputText(NitroXBotsPage.accountid, dataMap.get("TradingAccount"), "Trading Account Selected");
            pressEnter(NitroXBotsPage.accountid);
        }
        catch(Throwable ex)
        {
            throw new RuntimeException(ex);
        }
    }

    public static void inputBaseCurrency(HashMap<String, String> dataMap) {

        try {
            click(NitroXBotsPage.basecurrency, "Base text field clicked.");
            inputText(NitroXBotsPage.basecurrency, dataMap.get("Base"), "Base Currency Entered");
        }
        catch(Throwable ex)
        {
            throw new RuntimeException(ex);
        }
    }
    public static void inputQuoteCurrency(HashMap<String, String> dataMap) {

        try {
            click(NitroXBotsPage.quotecurrency, "Quote text field clicked.");
            inputText(NitroXBotsPage.quotecurrency, dataMap.get("Quote"), "Quote Currency Entered");

        }
        catch(Throwable ex)
        {
            throw new RuntimeException(ex);
        }
    }

    public static void selectMainPairTradingSide(HashMap<String,String>dataMap) throws InterruptedException {
        KeywordUtil.clearInputUsingKeys(NitroXBotsPage.side);
        delay(1000);
        KeywordUtil.inputText(NitroXBotsPage.side, dataMap.get("Side"), "BUY or Sell Order field selected ");
        pressEnter(NitroXBotsPage.side);
    }

    public static void selectSubPairSide(HashMap<String, String> dataMap) {

        try {
            KeywordUtil.clearInputUsingKeys(NitroXBotsPage.pairlegSide);
            KeywordUtil.inputText(NitroXBotsPage.pairlegSide, dataMap.get("PairSide"), "BUY or Sell Order field selected ");
            pressEnter(NitroXBotsPage.pairlegSide);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }
    public static void inputDuration(HashMap<String, String> dataMap) {
        try {
            KeywordUtil.clearInputUsingKeys(NitroXBotsPage.duration);
            KeywordUtil.inputText(NitroXBotsPage.duration, dataMap.get("Duration"), "Duration of Bot entered");
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

    }
    public static void inputDealRefNumber()
    {
        dealref=KeywordUtil.generateRandomNumber();
        KeywordUtil.inputText(NitroXBotsPage.dealref,dealref,"Entered Deal Ref. ");
        LogUtil.infoLog(thisClass, "Actual Trigger value :" +dealref);
    }

    public static String getDealRef() {

        String dealref = getElementText(NitroXBotsPage.dealrefrow);
        LogUtil.infoLog(thisClass, "Deal Reference in get deal is : " + dealref);
        return dealref;
    }

    public static String getQuantity() {
        String quantity = getElementText(NitroXBotsPage.quantity_twap);
        LogUtil.infoLog(thisClass, "Deal Reference in Quantity : " + quantity);
        return quantity;
    }
    public static void selectSideTwapBot(HashMap<String,String>dataMap) throws InterruptedException {

        KeywordUtil.inputText(NitroXBotsPage.side, dataMap.get("TSIDE"), "BUY or Sell Order field selected ");
        pressEnter(NitroXBotsPage.side);
    }
    public static String getSideTwap()
    {
        String side = getElementText(NitroXBotsPage.side_twap);
        LogUtil.infoLog(thisClass, "Deal Reference in Quantity : " + side);
        return side;
    }
    public static void getFilteredBots() throws InterruptedException {

        String totalbots =(getElementText(By.xpath("//div[text()='Total (Filtered)']/following-sibling::*/span/span")));
        int bots= Integer.parseInt(totalbots);
        if(bots>0)
        {
            NitroXBotsAction.stopAllBots();
            NitroXBotsAction.refreshPage();
            delay(3000);
            NitroXBotsAction.refreshPage();
        }
    }
    public static void validateStatus() {
        try
        {
            int count = 0;
            for (int i = 0; i < 15; i++)
            {
                    count = getDriver().findElements(By.xpath("//span[text()='STRATEGY COMPLETED']")).size();
                    if (count < 1) {
                        KeywordUtil.pageRefresh();
                        delay(3000);
                        NitroXBotsAction.selecttotalBots();
                        NitroXBotsAction.sortStartTime();
                        NitroXBotsAction.selectLatestBotName();
                        delay(3000);
                    }
                    else {
                        break;
                    }
            }
        }
        catch(Throwable e)
        {
            e.printStackTrace();
        }
    }
    public static void refreshPage() {

        KeywordUtil.pageRefresh();
    }

    public static void inputTargetAccountPosition(HashMap<String, String> dataMap)
    {
        KeywordUtil.inputText(NitroXBotsPage.targetaccountposition,dataMap.get("Target Account Position"), "Target Account Entered");
       // KeywordUtil.inputText(NitroXBotsPage.targetaccountposition,dataMap.get("TargetAmount"), "Duration of Bot entered");
    }
    public static void getTargetAccountPosition(HashMap<String, String> dataMap)

    {
        String S1 = dataMap.get("Instrument").toString();
        String[] S2 = S1.split(" ");
        String instrument = S2[0].replace("/", "");
        String targetaccount= getElementText(By.xpath("//span[text()='Balance']/following::table[1]/tbody/tr/td[starts-with(text(),'"+instrument+"')]/following-sibling::td[1]"));
        targetaccount = targetaccount.replace(",", "");
        double amount = Double.parseDouble(targetaccount) + 300;
        LogUtil.infoLog(thisClass, "Asset  Amount" + amount);
        dataMap.put("TargetAmount",String.valueOf(amount));
    }

    public static String getTrigerConditionvalueforFutureMode() {

        String trriger= KeywordUtil.getElementText(NitroXBotsPage.trrigger_futuremode);
        LogUtil.infoLog(thisClass, "Trigger value is" + trriger);
        return trriger;
    }


    public static void validatePairTradingStatus() {
        try
        {
            int count = 0;
            for (int i = 0; i < 15; i++)
            {
                count = getDriver().findElements(By.xpath("(//span[text()='LEG COMPLETED'])[1]")).size();
                if (count < 1) {
                    KeywordUtil.pageRefresh();
                    delay(2000);
                    NitroXBotsAction.selecttotalBots();
                    waitForVisible(NitroXBotsPage.BotTime);
                    NitroXBotsAction.sortStartTime();
                    NitroXBotsAction.selectLatestBotName();
                    delay(5000);
                }
                else {
                    break;
                }
            }
        }
        catch(Throwable e)
        {
            e.printStackTrace();
        }
    }

    public static void validateLegPairTradingStatus() {
        try
        {
            int count = 0;
            for (int i = 0; i < 15; i++)
            {
                count = getDriver().findElements(By.xpath("(//span[text()='LEG COMPLETED'])[2]")).size();
                if (count < 1) {
                    KeywordUtil.pageRefresh();
                    delay(2000);
                    NitroXBotsAction.selecttotalBots();
                    waitForVisible(NitroXBotsPage.BotTime);
                    NitroXBotsAction.sortStartTime();
                    NitroXBotsAction.selectLatestBotName();
                    delay(5000);
                }
                else {
                    break;
                }
            }
        }
        catch(Throwable e)
        {
            e.printStackTrace();
        }
    }
    public static void validateTotalFilteredStatus() {
        try
        {
            int count = 0;
            for (int i = 0; i < 15; i++)
            {
                count = getDriver().findElements(By.xpath("//div[text()='Total (Filtered)']/following::span[2]")).size();
                if (count < 1) {
                    KeywordUtil.pageRefresh();
                    delay(2000);
                    NitroXBotsAction.selecttotalBots();
                    NitroXBotsAction.sortStartTime();
                    NitroXBotsAction.selectLatestBotName();
                    delay(5000);
                }
                else {
                    break;
                }
            }
        }
        catch(Throwable e)
        {
            e.printStackTrace();
        }
    }
    public static String getModefromHomePage() {
        return  null;
    }

    public static String getModefromBotDetailPage() {
        Mode=getElementText(NitroXBotsPage.instrument_type_spot_ex);
        LogUtil.infoLog(thisClass, "Mode is : " + Mode);
        return Mode;
    }

    public static void pauseAllBots() throws InterruptedException {
        hoverOnElement(NitroXBotsPage.moreactions);
        delay(2000);
        hoverOnElement(NitroXBotsPage.clickhoverbtn);
        click(NitroXBotsPage.clickhoverbtn,"ALl Bots are paused");
    }

    public static void stopalltheBot() throws InterruptedException {
        hoverOnElement(NitroXBotsPage.moreactions);
        delay(2000);
        hoverOnElement(NitroXBotsPage.clickstopbtn);
        click(NitroXBotsPage.clickstopbtn,"Bots are stopped");
    }

    public static void logout() throws InterruptedException {
        hoverOnElement(NitroXBotsPage.systemlink);
        hoverOnElement(NitroXBotsPage.logout);
        click(NitroXBotsPage.logout,"ALl Logout button link");
    }
    public static void selectLatestBot() {click(NitroXBotsPage.currentbot,"Current Bot Selected");

    }

    public static void selectCheckBoxList() {click(NitroXBotsPage.botscheckbox,"Checkbox  Selected");

    }
    public static void pauseCurrentBot() {
        click(NitroXBotsPage.pausebtn, "Current Bot Paused");
    }
    public static boolean getPairBotNotifMsg() {
        String notifMsg;
        notifMsg = getElementText(NitroXBotsPage.pairtradingstatus);
        LogUtil.infoLog(thisClass, "Notification message description=" + notifMsg);
        return true;
    }

    public static void resumeCurrentBot() {
        click(NitroXBotsPage.resumebotbtn, "Current Bot Resumed");
    }

    public static void restartCurrentBot() {

        clickJS(NitroXBotsPage.restartbotbtn, "Restart Bot Resumed");
//        boolean flag=false;
//        try {
//            //click restart
//            clickJS(NitroXBotsPage.restartbotbtn, "Restart Bot Resumed");
//            //wait and verify for the success message
//            NitroXHome.waitForNotifMsg();
//            int i = 0;
//            while (i < 2) {
//                if (NitroXHome.getNotifMsg().startsWith("You have unexpectedly disconnected from ther server.")) {
//                    NitroXHome.waitForNotifMsgToDisappear();
//                    delay(4000);
//                    //click sell button again
//                    clickJS(NitroXBotsPage.restartbotbtn, "Restart Bot Resumed");
//                    LogUtil.infoLog(thisClass, "Restart counter=" + i);
//                    NitroXHome.waitForNotifMsg();
//                    i++;
//                } else {
//                    flag = true;
//                    break;
//                }
//            }
//            if (flag) {
//                Assert.assertTrue(NitroXHome.getNotifMsg().contains("1 bots have been queued to be restarted."));
//                NitroXHome.waitForInvisibleOrderSubmittedMsg();
//            } else {
//                LogUtil.errorLog(thisClass, "Restart Error");
//                assert false;
//            }
//        }catch (Throwable e)
//        {
//            e.printStackTrace();
//        }

    }

    public static void clickPersistyes()  {
        click(NitroXBotsPage.persistyes, "CLicked on Bot Persist Yes");
    }
    public static void clickPersistNo()  {
        click(NitroXBotsPage.persistno, "CLicked on Bot Persist No");
    }

    public static void stopCurrentRunningBot() {
        click(NitroXBotsPage.stopbotbtn, "Current Bot Stopped");

    }

    public static void stopBots() {
        click(NitroXBotsPage.stopallbtn, " Bots Stopped");

    }
    public static void editLatestBot() {
        click(NitroXBotsPage.editbotbtn, "Current Bot Edited");
    }
    public static void duplicateLatestBot() {
        click(NitroXBotsPage.duplicatebotbtn, "Current Bot Stopped");
    }

    public static void inputNewOrderAmount(HashMap<String, String> dataMap) throws InterruptedException {
        KeywordUtil.click(NitroXBotsPage.orderamount,"Ordered Amount Entered");
        KeywordUtil.clearInputUsingKeys(NitroXBotsPage.orderamount);
        KeywordUtil.inputText(NitroXBotsPage.orderamount, dataMap.get("New Order Amount"), "Amount vale entered ");
    }
    public static boolean validaterunningbot() {
        String notifMsg;
        notifMsg = getElementText(NitroXBotsPage.botid);
        LogUtil.infoLog(thisClass, "Running bots id is=" + notifMsg);
        return true;
    }
    public static boolean getAllBots()
    {
        List<WebElement> all_bots= getDriver().findElements(By.xpath("//th[text()='Service ID']//following::tr/td[5]"));
        boolean runningstatus=false;
        for(WebElement e:all_bots)
        {
            String value=e.getText();
            System.out.println(value);
            if(value.contains("Running"))
            {
                runningstatus=true;
                break;
            }
        }
        Assert.assertTrue(runningstatus,"Running Bot is there in the list");
        return true;
    }
    public static boolean validateEmptyList() {
        String notifMsg;
        notifMsg = getElementText(NitroXBotsPage.nodatabotdetail);
        LogUtil.infoLog(thisClass, "Bot available=" + notifMsg);
        return true;
    }
    public static void validateBots(HashMap<String, String> dataMap)  {
            try {
                String value;
                value = getElementText(By.xpath("//div[text()='Total (Filtered)']/following-sibling::*/span/span"));
                if (value.equals("0")) {
                    NitroXHome.selectBaseCurrency(dataMap);
                    NitroXHome.selectQuoteCurrency(dataMap);
                    scrollingToElementofAPage(NitroXBotsPage.startbtn, "Scrolled to start element");
                    NitroXBotsAction.clickStart();
                    NitroXBotsAction.waitforBotWindow();
                   // NitroXBotsAction.inputService(dataMap.get("Service"));
                    NitroXBotsAction.inputMethod(dataMap.get("Method"));
                    NitroXBotsAction.inputBotQuantity(dataMap.get("Bot Quantity"));
                    waitForVisible(NitroXBotsPage.orderdirection);
                    NitroXBotsAction.clickSubmit();
                    delay(15000);
                    NitroXBotsAction.selecttotalBots();
                } else {
                    NitroXBotsAction.selecttotalBots();
                }
            }
            catch (Throwable e)
            {
                e.printStackTrace();
                e.getMessage();
            }
        }

    public static void validateFutureModeBots(HashMap<String, String> dataMap)  {
        try {
            String value;
            value = getElementText(By.xpath("//div[text()='Total (Filtered)']/following-sibling::*/span/span"));
            if (value.equals("0")) {
                NitroXBuySellFutureAction.inputInstrument(dataMap);
                scrollingToElementofAPage(NitroXBotsPage.startbtn, "Scrolled to start element");
                NitroXBotsAction.clickStart();
                NitroXBotsAction.waitforBotWindow();
                //NitroXBotsAction.inputService(dataMap.get("Service"));
                NitroXBotsAction.inputMethod(dataMap.get("Method"));
                NitroXBotsAction.inputBotQuantity(dataMap.get("Bot Quantity"));
                NitroXBotsAction.inputTargetAccountPosition(dataMap);
                NitroXBotsAction.clickSubmit();
                delay(15000);
                NitroXBotsAction.selecttotalBots();
            } else {
                NitroXBotsAction.selecttotalBots();
            }
        }
        catch (Throwable e)
        {
            e.printStackTrace();
            e.getMessage();
        }
    }

    public static void validateFutureModeBotswithInstrument(HashMap<String, String> dataMap)  {
        try {
            String value;
            value = getElementText(By.xpath("//div[text()='Total (Filtered)']/following-sibling::*/span/span"));
            if (value.equals("0")) {
                scrollingToElementofAPage(NitroXBotsPage.startbtn, "Scrolled to start element");
                NitroXBotsAction.clickStart();
                NitroXBotsAction.waitforBotWindow();
               //NitroXBotsAction.inputService(dataMap.get("Service"));
                NitroXBotsAction.inputMethod(dataMap.get("Method"));
                NitroXBotsAction.inputBotQuantity(dataMap.get("Bot Quantity"));
                NitroXBotsAction.inputTargetAccountPosition(dataMap);
                NitroXBotsAction.clickSubmit();
                delay(15000);
                NitroXBotsAction.selecttotalBots();
            } else {
                NitroXBotsAction.selecttotalBots();
            }
        }
        catch (Throwable e)
        {
            e.printStackTrace();
            e.getMessage();
        }
    }
    public static void countBots(HashMap<String, String> dataMap)  {
        try {
            String value;
            value = getElementText(By.xpath("//div[text()='Total (Filtered)']/following-sibling::*/span/span"));
            if (value.equals("0")) {
                scrollingToElementofAPage(NitroXBotsPage.startbtn, "Scrolled to start element");
                NitroXBotsAction.clickStart();
                NitroXBotsAction.waitforBotWindow();
               // NitroXBotsAction.inputService(dataMap.get("Service"));
                NitroXBotsAction.inputMethod(dataMap.get("Method"));
                NitroXBotsAction.inputBotQuantity(dataMap.get("Bot Quantity"));
                waitForVisible(NitroXBotsPage.orderdirection);
                NitroXBotsAction.clickSubmit();
                delay(15000);
                NitroXBotsAction.selecttotalBots();
            } else {
                NitroXBotsAction.selecttotalBots();
            }
        }
        catch (Throwable e)
        {
            e.printStackTrace();
        }
    }
    public static void CheckBotStatus() {
        try {
            String value;
            value = getElementText(By.xpath("//div[text()='Total (Filtered)']/following-sibling::*/span/span"));
            if (value.equals("0")) {
                NitroXBotsAction.selecttotalBots();
            } else {
                NitroXBotsAction.stopAllBots();
                NitroXBotsAction.closeBot();
                NitroXBotsAction.refreshPage();
                NitroXHome.waitForLiveChart();
                //NitroXHome.waitForNotifMsg();
                //waitForInVisibile(NitroXBotsPage.orderbooklistener);
                NitroXBotsAction.selecttotalBots();
            }
        }
        catch (Throwable e)
        {
            e.printStackTrace();
        }
    }
    public static void clearInstrument() {
        try {
            KeywordUtil.clearInputUsingKeys(NitroXBotsPage.instrumenttype);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }
    public static void pressenter()
    {
        KeywordUtil.pressEnter(NitroXHomePage.tradingaccount);
    }

    public static void movetoListandStopBots() throws InterruptedException {
        waitForVisible(NitroXBotsPage.allbots);
        click(NitroXBotsPage.allbots,"Selected All Bots");
        scrollingToElementofAPage(NitroXBotsPage.stopbots,"Scrolled to Stop All Bots ");
        click(NitroXBotsPage.stopbots,"Stopped all Bots");
    }
}
