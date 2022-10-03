package modules.NitroXActions;

import pageFactory.NitroXPages.NitroXBotsPage;
import pageFactory.NitroXPages.NitroXHomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import utilities.KeywordUtil;
import utilities.LogUtil;

import java.util.HashMap;

import static utilities.KeywordUtil.*;
import static utilities.KeywordUtil.getElementText;
import static utilities.KeywordUtil.waitForVisible;

public class NitroXHome {


    static Class thisClass = NitroXHome.class;

    static String availableCoinBalance, frozenCoinBalance, totalCoinBalance, firstbidprice, lastbidprice, firstaskprice,
            openOrderTime, dealtOrderTime, dealtorderprice, dealtorderside, dealthorderquantity;
    static double quantity;

    public static void selectmode(HashMap<String, String> dataMap) {
        waitForVisible(NitroXHomePage.modeTextbyID);
        KeywordUtil.click(NitroXHomePage.modeTextField, "Mode text field clicked.");
        waitForVisible(NitroXHomePage.spotDropdown);
        if (dataMap.get("Mode").equalsIgnoreCase("Spot")) {
            KeywordUtil.click(NitroXHomePage.spotDropdown, "Spot mode selected from dropdown.");
        } else if (dataMap.get("Mode").equalsIgnoreCase("Futures")) {
            KeywordUtil.click(NitroXHomePage.FutureDropdown, "Future mode selected from dropdown.");
        } else {
            Assert.fail("Please provide a valid mode value in .xlsx file");
        }
    }

    public static void inputMode(HashMap<String, String> dataMap) {
        waitForVisible(NitroXHomePage.modeTextbyID);
        KeywordUtil.inputText(NitroXHomePage.modeTextbyID, dataMap.get("Mode"), "Mode value entered using send keys.");
        KeywordUtil.pressEnter(NitroXHomePage.modeTextbyID);
    }

    public static void selectTradingAccount(HashMap<String, String> dataMap) throws InterruptedException {
        KeywordUtil.click(NitroXHomePage.tradingaccount, "Trading Account text field clicked.");
        inputText(NitroXHomePage.tradingaccount, dataMap.get("TradingAccount"), dataMap.get("TradingAccount") + "=trading account");
        waitForPresent(By.xpath("//div[@title='" + dataMap.get("TradingAccount") + "']"));
        KeywordUtil.click(By.xpath("//div[@title='" + dataMap.get("TradingAccount") + "']"), "Trading Account selected from dropdown");
        delay(1000);
    }

    public static void inputTradingAccount(HashMap<String, String> dataMap) throws InterruptedException {
        KeywordUtil.click(NitroXHomePage.tradingaccount, "Trading Account text field clicked.");
        KeywordUtil.inputText(NitroXHomePage.inputtradingaccount, dataMap.get("TradingAccount"), dataMap.get("TradingAccount") + " : Trading account");
        click(By.xpath(String.format(NitroXHomePage.tradingAccountSuggestion, dataMap.get("TradingAccount"))), "Select trading account from suggestion options");
        delay(1000);
    }

    public static void selectBaseCurrency(HashMap<String, String> dataMap) throws Exception {

        click(NitroXHomePage.Basecurrency, "Click Base Currency");
        KeywordUtil.inputText(NitroXHomePage.Basecurrency, dataMap.get("Base"), dataMap.get("Base") + " : Base Currency");
        delay(3000);
    }

    public static void clearBaseCurrency() throws Exception {

        click(NitroXHomePage.Basecurrency, "Click Base Currency");
        KeywordUtil.clearInputUsingKeys(NitroXHomePage.Basecurrency);
    }

    public static void clearQuoteCurrency() throws Exception {

        click(NitroXHomePage.Quotecurrency, "Click Quote Currency");
        KeywordUtil.clearInputUsingKeys(NitroXHomePage.Quotecurrency);
    }
    public static void selectQuoteCurrency(HashMap<String, String> dataMap) throws Exception {
        click(NitroXHomePage.Quotecurrency, "Click Quote Currency");
        KeywordUtil.inputText(NitroXHomePage.Quotecurrency, dataMap.get("Quote"), dataMap.get("Quote") + " : Quote Currency");
    }
    public static void waitForLiveChart() {
        waitForPresent(NitroXHomePage.liveFrame);
    }



    public String getBaseCurrency() {
        return getElementText(NitroXHomePage.Basecurrency);
    }

    public String getQuoteCurrency() {
        return getElementText(NitroXHomePage.Quotecurrency);
    }

    public static String getAvailableBalance(String coin) {
        availableCoinBalance = getElementText(By.xpath("//span[text()='Balance']/following::table[1]/tbody/tr/td[text()='" + coin + "']/following-sibling::td[1]"));
        availableCoinBalance = availableCoinBalance.replace(",", "");
        LogUtil.infoLog(thisClass, coin + " balance=" + availableCoinBalance);
        return availableCoinBalance;
    }

    public static String getFrozenBalance(String coin) {
        frozenCoinBalance = getElementText(By.xpath("//span[text()='Balance']/following::table[1]/tbody/tr/td[text()='" + coin + "']/following-sibling::td[2]"));
        frozenCoinBalance = frozenCoinBalance.replace(",", "");
        LogUtil.infoLog(thisClass, coin + " balance=" + frozenCoinBalance);
        return frozenCoinBalance;
    }

    public static String getTotalBalance(String coin) {
        totalCoinBalance = getElementText(By.xpath("//span[text()='Balance']/following::table[1]/tbody/tr/td[text()='" + coin + "']/following-sibling::td[3]"));
        totalCoinBalance = totalCoinBalance.replace(",", "");
        LogUtil.infoLog(thisClass, coin + " balance=" + totalCoinBalance);
        return totalCoinBalance;
    }

    public static String getbidprice() {
        waitForVisible(NitroXHomePage.orderBookprice);
        firstaskprice = KeywordUtil.getElementText(NitroXHomePage.orderBookprice);
        LogUtil.infoLog(thisClass, "Biding price" + firstaskprice);
        return firstaskprice;
    }

    public static void InputthePrice() {
        KeywordUtil.inputText(NitroXHomePage.price, getbidprice(), "Entered the Price");
        //System.out.println("Price Selected");
    }

    public static void submitorder(HashMap<String, String> dataMap) {
        waitForVisible(NitroXHomePage.orderBookprice);
    }

    public static void InputQuantity(HashMap<String, String> dataMap) {
        quantity = Double.parseDouble(NitroXHome.getAvailableBalance(dataMap.get("Base")));
        quantity += 100.00;
        LogUtil.infoLog(thisClass, "bidding quantity=" + quantity);
        KeywordUtil.inputText(NitroXHomePage.Quantity, Double.toString(quantity), "Price Entered");
    }

    public static void ClickBuyButton() {
        KeywordUtil.click(NitroXHomePage.Buybtn, "Buy order Clicked");
    }

    public static void ClickSellButton() {
        KeywordUtil.click(NitroXHomePage.sellbtn, "Buy order Clicked");
    }


    public static String getLowestBidPrice() {
        waitForVisible(NitroXHomePage.Ordertableprice);
        lastbidprice = getElementText(By.xpath("(//span[text()='Orderbook ']/following::table[1]/tbody//child::tr)[last()]/td[2]"));
        lastbidprice = lastbidprice.replace(",", "");
        double a = Double.parseDouble(lastbidprice) - 100.00;
        LogUtil.infoLog(thisClass, "Biding price" + a);
        System.out.println(a);
        return String.valueOf(a);
    }

    public static void InputOpenOrderBidPrice() {
        KeywordUtil.inputText(NitroXHomePage.price, getLowestBidPrice(), "Entered the Open Bid Price");
    }

    public static void InputCustomQuantity(HashMap<String, String> dataMap) {
        KeywordUtil.inputText(NitroXHomePage.Quantity, dataMap.get("Quantity"), "Entered the Quantity");
    }

    public static void ClearOrderQuantity() throws InterruptedException {
        KeywordUtil.clearInputUsingKeys(NitroXHomePage.Quantity);
    }

    public static void waitForOpenOrdersTable() {
        waitForVisible(NitroXHomePage.openOrderTime_first);
    }

    //Open order actions
    public static String getTimeofNthOpenOrder(int orderNumber) {
        orderNumber += 1;
        openOrderTime = getElementText(By.xpath("//span[text()='Recent Open Orders']/following::table[01]/tbody[01]/tr[" + orderNumber + "]/td[01]/span"));
        LogUtil.infoLog(thisClass, "Open order Time=" + openOrderTime);
        return openOrderTime;
    }

    public static String getSideofNthOpenOrder(int orderNumber) {
        orderNumber += 1;
        String side = getElementText(By.xpath("//span[text()='Recent Open Orders']/following::table[01]/tbody[01]/tr[" + orderNumber + "]/td[02]/span"));
        LogUtil.infoLog(thisClass, "Open order Side=" + side);
        return side;
    }

    public static double getPriceofNthOpenOrder(int orderNumber) {
        orderNumber += 1;
        String price = getElementText(By.xpath("//span[text()='Recent Open Orders']/following::table[01]/tbody[01]/tr[" + orderNumber + "]/td[03]/span"));
        LogUtil.infoLog(thisClass, "Open order price=" + price);
        return Double.parseDouble(price.replace(",", ""));
    }

    public static double getQuantityofNthOpenOrder(int orderNumber) {
        orderNumber += 1;
        String quantity = getElementText(By.xpath("//span[text()='Recent Open Orders']/following::table[01]/tbody[01]/tr[" + orderNumber + "]/td[04]/span"));
        LogUtil.infoLog(thisClass, "Open order quantity=" + quantity);
        return Double.parseDouble(quantity);
    }

    public static String getSide(String side) {
        dealtorderside = getElementText(By.xpath("//span[text()='Recent Dealt Orders']/following::table[01]/tbody[01]/tr[" + side + "]/td[02]/span"));
        LogUtil.infoLog(thisClass, "order number=" + side + " || openOrderTime=" + dealtorderside);
        return dealtorderside;
    }

    //deal order actions
    public static String getPrice(int price) {
        dealtorderprice = getElementText(By.xpath("//span[text()='Recent Dealt Orders']/following::table[01]/tbody[01]/tr[" + price + "]/td[03]/span"));
        LogUtil.infoLog(thisClass, "order number=" + price + " || openOrderTime=" + dealtorderprice);
        return dealtorderprice;
    }

    public static String getQuantity(int quantity) {
        dealthorderquantity = getElementText(By.xpath("//span[text()='Recent Dealt Orders']/following::table[01]/tbody[01]/tr[" + quantity + "]/td[04]/span"));
        LogUtil.infoLog(thisClass, "order number=" + quantity + " || openOrderTime=" + dealthorderquantity);
        return dealthorderquantity;
    }

    public static void cancelNthOpenOrder(int orderNumber) {
        orderNumber += 1;
        click(By.xpath("//span[text()='Recent Open Orders']/following::table[01]/tbody[01]/tr[" + orderNumber + "]/td[06]/button"), "Click cancel button");
        waitForInVisibile(NitroXHomePage.orderCancelLoading);
    }

    public static void verifyOrderCancelledBasedOnTime(int orderNumber) {
        orderNumber += 1;
        LogUtil.infoLog(thisClass, getElementText(By.xpath("//span[text()='Recent Open Orders']/following::table[01]/tbody[01]/tr[" + orderNumber + "]/td[01]/span")));
        Assert.assertNotEquals(getElementText(By.xpath("//span[text()='Recent Open Orders']/following::table[01]/tbody[01]/tr[" + orderNumber + "]/td[01]/span")), openOrderTime);
    }

    public static void getOrderCancelledSuccessMsg() {
        waitForVisible(NitroXHomePage.orderCancelSuccessMsg);
        LogUtil.infoLog(thisClass, "Order cancelled success message displayed.");
    }

    public static void waitForInvisibleOrderCancelledMsg() {
        waitForInVisibile(NitroXHomePage.orderCancelSuccessMsg);
        LogUtil.infoLog(thisClass, "Order cancelled success message displayed.");
    }

    public static String getOrderSubmittedSuccessMsg() {
        waitForInVisibile(NitroXHomePage.orderSubmittedSuccessMsg);
        String msg = getElementText(NitroXHomePage.orderSubmittedSuccessMsg);
        LogUtil.infoLog(thisClass, "Order submitted message=" + msg);
        return msg;
    }

    public static void waitForOrderSubmittedSuccessMsg() {
        waitForPresent(NitroXHomePage.orderSubmittedSuccessMsg);
        LogUtil.infoLog(thisClass, "Order submitted successfully message displayed.");
    }

    public static String getEqualAskPrice() {
        waitForVisible(NitroXHomePage.Ordertableprice);
        firstaskprice = KeywordUtil.getElementText(NitroXHomePage.orderBookprice);
        firstaskprice = firstaskprice.replace(",", "");
        double a = Double.parseDouble(firstaskprice);
        LogUtil.infoLog(thisClass, "Ask price" + a);
        return String.valueOf(a);
    }

    public static String getGreaterThanAskPrice() {
        waitForVisible(NitroXHomePage.Ordertableprice);
        firstaskprice = KeywordUtil.getElementText(NitroXHomePage.orderBookprice);
        firstaskprice = firstaskprice.replace(",", "");
        double a = Double.parseDouble(firstaskprice) + 100;
        LogUtil.infoLog(thisClass, "Ask price" + a);
        return String.valueOf(a);

    }

    //Open Order Equal to Ask Price
    public static void InputBuyOrderAskPrice() {
        KeywordUtil.inputText(NitroXHomePage.price, getEqualAskPrice(), "Entered the Open Ask Price");
    }

    //Open Order More Than Ask Price
    public static void InputBuyOrderPrice() {
        KeywordUtil.inputText(NitroXHomePage.price, getGreaterThanAskPrice(), "Entered the Price More Than Ask Price");
    }

    public static double getHighestBidPrice() throws InterruptedException {
        //wait for bid prices table to appear
        waitForVisible(NitroXHomePage.highestBidPrice);
        double highestBidPrice = Double.parseDouble(getElementText(NitroXHomePage.highestBidPrice).replace(",", ""));
        LogUtil.infoLog(thisClass, "Highest bid price=" + highestBidPrice);
        return highestBidPrice;
    }

    public static double getLowestAskPrice() {
        waitForVisible(NitroXHomePage.lowestAskPrice);
        double lowestAskPrice = Double.parseDouble(getElementText(NitroXHomePage.lowestAskPrice).replace(",", ""));
        LogUtil.infoLog(thisClass, "Lowest ask price=" + lowestAskPrice);
        return lowestAskPrice;
    }

    public static double getHighestAskPrice() {
        waitForVisible(NitroXHomePage.orderBookprice);
        double orderBookprice = Double.parseDouble((getElementText(NitroXHomePage.orderBookprice).replace(",", "")));
        LogUtil.infoLog(thisClass, "Highest Ask price=" + orderBookprice);
        return orderBookprice;
    }

    //input the order price
    public static void ClearInputPrice() throws InterruptedException {
        KeywordUtil.clearInputUsingKeys(NitroXHomePage.price);
    }

    //input the order price
    public static void InputthePrice(double price) {
        KeywordUtil.inputText(NitroXHomePage.price, Double.toString(price), "Enter the price");
    }

    //get the order price entered in order form
    public static double getOrderFormPrice() {
        String orderPrice = getElementValue(NitroXHomePage.price);
        LogUtil.infoLog(thisClass, "Order from price=" + orderPrice);
        return Double.parseDouble(orderPrice.replace(",", ""));
    }

    //get the order quantity entered in order form
    public static double getOrderFormQuantity() {
        String orderQuantity = getElementValue(NitroXHomePage.Quantity);
        LogUtil.infoLog(thisClass, "Order form quantity=" + orderQuantity);
        return Double.parseDouble(orderQuantity);
    }

    //scroll to list of available bid prices on the left
    public static void scrollToBidPrices() throws InterruptedException {
        scrollingToElementofAPage(NitroXHomePage.bidPriceHeading, "Scroll to bid prices.");
    }

    public static void scrollToAskPrices() throws InterruptedException {
        scrollingToElementofAPage(NitroXHomePage.askPriceHeading, "Scroll to ask prices.");
    }


    //scroll to the orders placed table displayed at the bottom
    public static void scrollToOrdersPlaced() throws InterruptedException {
        scrollingToElementofAPage(NitroXHomePage.openOrderHeader, "Scroll to Open and Dealt orders table");
    }

    //wait for order submitted success message to disappear
    public static void waitForInvisibleOrderSubmittedMsg() {
        waitForInVisibile(NitroXHomePage.orderSubmittedSuccessMsg);
    }

    public static void cancelFirstBuyOrder() {
        click(NitroXHomePage.cancelFirstBuyOrder, "Cancel very first buy order");
    }

    public static void cancelFirstSellOrder() {
        click(NitroXHomePage.cancelFirstSellOrder, "Cancel very first sell order");
    }

    public static void clickDealtOrdersTab() {
        click(NitroXHomePage.DealtOrderTab, "Clicked Dealt Order");
    }


    //Dealt order actions
    public static String getTimeofNthDealtOrder(int orderNumber) {
        orderNumber += 1;
        dealtOrderTime = getElementText(By.xpath("//span[text()='Recent Dealt Orders']/following::table[01]/tbody[01]/tr[" + orderNumber + "]/td[01]/span"));
        LogUtil.infoLog(thisClass, "Dealt Order Time=" + dealtOrderTime);
        return dealtOrderTime;
    }

    public static String getSideofNthDealtOrder(int orderNumber) {
        orderNumber += 1;
        String side = getElementText(By.xpath("//span[text()='Recent Dealt Orders']/following::table[01]/tbody[01]/tr[" + orderNumber + "]/td[02]/span"));
        LogUtil.infoLog(thisClass, "Dealt order Side=" + side);
        return side;
    }

    public static double getPriceofNthDealtOrder(int orderNumber) {
        orderNumber += 1;
        String price = getElementText(By.xpath("//span[text()='Recent Dealt Orders']/following::table[01]/tbody[01]/tr[" + orderNumber + "]/td[03]/span"));
        LogUtil.infoLog(thisClass, "Dealt order price=" + price);
        return Double.parseDouble(price.replace(",", ""));
    }

    public static double getQuantityofNthDealtOrder(int orderNumber) {
        orderNumber += 1;
        String quantity = getElementText(By.xpath("//span[text()='Recent Dealt Orders']/following::table[01]/tbody[01]/tr[" + orderNumber + "]/td[04]/span"));
        LogUtil.infoLog(thisClass, "Dealt order quantity=" + quantity);
        return Double.parseDouble(quantity);
    }

    public static void waitForNotifMsg() {
        waitForPresent(NitroXHomePage.bottomRightNotifText);
    }

    public static String getNotifMsg() {
        String notifMsg;
        notifMsg = getElementText(NitroXHomePage.bottomRightNotifDesc);
        LogUtil.infoLog(thisClass, "Notification message description=" + notifMsg);
        return notifMsg;
    }

    public static void waitForNotifMsgToDisappear() {
        waitForInVisibile(NitroXHomePage.bottomRightNotifText);
    }

    public static boolean isPresentOrderListener() {
        return isWebElementPresent(NitroXHomePage.orderBookListener, "Orderbook listener notification is present");
    }
    public static void closeBottomRightNotif() {
        click(NitroXHomePage.closeBottomRightNotif, "Bottom right notification closed.");
    }
    public static void waitForOrderListernerToDisappear() {
        waitForInVisibile(NitroXHomePage.orderBookListener);
    }

    public static boolean isBotPresent() {
        return isWebElementPresent(NitroXBotsPage.botlist, "Bots are available");
    }

    public static void selectOTCPrice() {
        click(NitroXHomePage.OTCPricebtn, "Clicked OTC Price Button.");
        LogUtil.infoLog(thisClass, "OTC Price Button Selected");
    }

    public static void inputOTCPriceQuantity() throws InterruptedException {
        clearInputUsingKeys(NitroXHomePage.OTCquantity);
        KeywordUtil.inputText(NitroXHomePage.OTCquantity,"10", "Quantity entered");
    }

    public static void inputOTCPriceTime() throws InterruptedException {
        clearInputUsingKeys(NitroXHomePage.OTCDeliverytime);
        KeywordUtil.inputText(NitroXHomePage.OTCDeliverytime,"20", "Delivery Time entered");
    }

    public static void selectCalculate() {
        click(NitroXHomePage.OTCSpriceCalculate,"Clicked on Calculate Button");
    }

    public static void inputOTCPriceParticipation() throws InterruptedException {
        clearInputUsingKeys(NitroXHomePage.OTCParticipation);
        KeywordUtil.inputText(NitroXHomePage.OTCParticipation,"30", "ParticiPation value entered");
    }

    public static void selectRefrence() {
        click(NitroXHomePage.OTCpriceReference,"Clicked on Calculate Button");
    }

    public static void click_Reference(String searchIndex) throws InterruptedException {
        click(By.xpath(String.format(NitroXHomePage.OTCpriceReferencenew, searchIndex)), "Clicked Reference");
        LogUtil.infoLog(thisClass, "Reference Selected ");
    }

    public static void validateOTCPrice() {
        isWebElementPresent(NitroXHomePage.OTCaskbidprice,"Ask Bid Price Values");
        String askprice=getElementText(NitroXHomePage.OTCaskbidprice);
        LogUtil.infoLog(thisClass, "Ask/Bid Price displayed ="+askprice);
    }

    public static void selectQuote(String searchIndex) {
        click(By.xpath(String.format(NitroXHomePage.OTCRefcoin, searchIndex)), "Clicked Reference Coin");
        LogUtil.infoLog(thisClass, "Quote is Selected ");
            //click(NitroXHomePage.OTCQuotebtn,"Clicked on Quote Button");
    }


    public static void selectRefRange(HashMap<String,String> dataMap) {
        waitForVisible(NitroXHomePage.OTCRefrange);
        KeywordUtil.inputText(NitroXHomePage.OTCRefrange, dataMap.get("Range"), "Range Entered.");
        KeywordUtil.pressEnter(NitroXHomePage.OTCRefrange);
    }


}
