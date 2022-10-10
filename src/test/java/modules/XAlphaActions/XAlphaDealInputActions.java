package modules.XAlphaActions;

import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import pageFactory.NitroXPages.NitroXHomePage;
import pageFactory.XAlphaPages.XAlphaDealEnquiryPage;
import pageFactory.XAlphaPages.XAlphaDealInputPage;
import step_definitions.RunCukesTest;
import utilities.HTMLReportUtil;
import utilities.KeywordUtil;
import utilities.LogUtil;

public class XAlphaDealInputActions extends KeywordUtil {

    static Class thisClass = XAlphaDealInputActions.class;

    public static void clickXAlphaHeader() {
        if (isWebElementVisible(XAlphaDealInputPage.dealInputTab)) {
            LogUtil.infoLog(thisClass, "User is already on deal X-Alpha tab");
        } else {
            click(XAlphaDealInputPage.xAlphaHeader, "Click X-Alpha Tab");
        }
    }

    public static void waitForDealInputTab() {
        waitForVisible(XAlphaDealInputPage.dealInputTab);
    }

    public static void clickDealInputTab() {
        if (isWebElementVisible(XAlphaDealInputPage.dealInput_navbar)) {
            LogUtil.infoLog(thisClass, "User is already on deal input tab");
        } else {
            click(XAlphaDealInputPage.dealInput_navbar, "Click deal input tab");
        }
    }

    public static void waitFordealInput_navbar() {
        waitForVisible(XAlphaDealInputPage.dealInput_navbar);
    }

    public static void clickFXSpotTab() {
        click(XAlphaDealInputPage.dealInput_FXSpot, "Click FX Spot tab");
    }

    public static void clickExecutionTab() {
        click(XAlphaDealInputPage.dealInput_ExecutionTab, "Click Execution tab");
    }

    public static void dealInput_direction_click() {
        click(XAlphaDealInputPage.dealInput_direction, "Click FX Spot tab");
    }

    public static void dealInput_direction(String direction) {
        inputText(XAlphaDealInputPage.dealInput_direction, direction.toLowerCase(), "Select deal input direction=" + direction);
        waitForPresent(By.xpath(String.format(XAlphaDealInputPage.dealInput_directionOptions, direction)));
        click(By.xpath(String.format(XAlphaDealInputPage.dealInput_directionOptions, direction)), "Choose direction from drop down options");
    }

    public static String get_dealInput_direction() {
        String direction = getElementText(XAlphaDealInputPage.dealInput_directionText);
        LogUtil.infoLog(thisClass, "deal input direction=" + direction);
        return direction;
    }

    public static void dealInput_BaseAssetAmount(String BaseAssetAmount) throws InterruptedException {
        clearInputUsingKeys(XAlphaDealInputPage.dealInput_BaseAssetAmount);
        inputText(XAlphaDealInputPage.dealInput_BaseAssetAmount, BaseAssetAmount, "Select deal input base asset amount=" + BaseAssetAmount);
    }

    public static String get_dealInput_BaseAssetAmount() {
        String BaseAssetAmount = getElementValue(XAlphaDealInputPage.dealInput_BaseAssetAmount);
        LogUtil.infoLog(thisClass, "deal input base asset amount=" + BaseAssetAmount);
        return BaseAssetAmount;
    }

    public static void dealInput_BaseAsset(String BaseAsset) {
        inputText(XAlphaDealInputPage.dealInput_BaseAsset, BaseAsset, "Select deal input base asset" + BaseAsset);
        waitForPresent(By.xpath(String.format(XAlphaDealInputPage.dealInput_BaseAssetOptions, BaseAsset)));
        click(By.xpath(String.format(XAlphaDealInputPage.dealInput_BaseAssetOptions, BaseAsset)), "Select deal input base asset from drop down options");
    }

    public static String get_dealInput_BaseAsset() {
        String BaseAsset = getElementText(XAlphaDealInputPage.dealInput_BaseAssetText);
        LogUtil.infoLog(thisClass, "deal input BaseAsset=" + BaseAsset);
        return BaseAsset;
    }

    public static void dealInput_QuoteAsset(String QuoteAsset) {
        inputText(XAlphaDealInputPage.dealInput_QuoteAsset, QuoteAsset, "Select deal input Quote Asset=" + QuoteAsset);
        waitForPresent(By.xpath(String.format(XAlphaDealInputPage.dealInput_QuoteAssetOptions, QuoteAsset)));
        click(By.xpath(String.format(XAlphaDealInputPage.dealInput_QuoteAssetOptions, QuoteAsset)), "Choose QuoteAsset from dropdown options");
    }

    public static String get_dealInput_QuoteAsset() {
        String QuoteAsset = getElementText(XAlphaDealInputPage.dealInput_QuoteAssetText);
        LogUtil.infoLog(thisClass, "deal input QuoteAsset=" + QuoteAsset);
        return QuoteAsset;
    }

    public static String get_dealInput_ReferencePrice() {
        waitForVisible(XAlphaDealInputPage.dealInput_ReferencePriceLoadingIcon);
        waitForInVisibile(XAlphaDealInputPage.dealInput_ReferencePriceLoadingIcon);
        String referencePrice = getElementValueWithVisibility(XAlphaDealInputPage.dealInput_ReferencePrice);
        LogUtil.infoLog(XAlphaDealInputActions.class, "Reference price=" + referencePrice);
        return referencePrice;
    }

    public static String get_dealInput_MarketPrice() {
        String marketPrice = getElementValueWithVisibility(XAlphaDealInputPage.dealInput_MarketPrice);
        LogUtil.infoLog(XAlphaDealInputActions.class, "Market price=" + marketPrice);
        return marketPrice;
    }

    public static void dealInput_ReferencePrice(String ReferencePrice) throws InterruptedException {
        clearInputUsingKeys(XAlphaDealInputPage.dealInput_ReferencePrice);
        inputText(XAlphaDealInputPage.dealInput_ReferencePrice, ReferencePrice, "Select deal input ReferencePrice=" + ReferencePrice);
    }

    public static void dealInput_UnitPrice(String unitPrice) throws InterruptedException {
        clearInputUsingKeys(XAlphaDealInputPage.dealInput_UnitPrice);
        inputText(XAlphaDealInputPage.dealInput_UnitPrice, unitPrice, "Select deal input unit price=" + unitPrice);
    }

    public static String get_dealInput_UnitPrice() {
        String dealInput_UnitPrice;
        dealInput_UnitPrice = getElementValue(XAlphaDealInputPage.dealInput_UnitPrice);
        LogUtil.infoLog(XAlphaDealInputActions.class, "dealInput_UnitPrice=" + dealInput_UnitPrice);
        return dealInput_UnitPrice;
    }

    public static void dealInput_QuoteAssetAmount(String QuoteAssetAmount) throws InterruptedException {
        inputText(XAlphaDealInputPage.dealInput_QuoteAssetAmount, QuoteAssetAmount, "dealInput_QuoteAssetAmount=" + QuoteAssetAmount);
    }

    public static String get_dealInput_QuoteAssetAmount() {
        String dealInput_QuoteAssetAmount;
        dealInput_QuoteAssetAmount = getElementValue(XAlphaDealInputPage.dealInput_QuoteAssetAmount);
        LogUtil.infoLog(XAlphaDealInputActions.class, "dealInput_QuoteAssetAmount=" + dealInput_QuoteAssetAmount);
        return dealInput_QuoteAssetAmount;
    }

    public static void dealInput_FeeAsset(String FeeAsset) throws InterruptedException {
        delay(3000);
        inputText(XAlphaDealInputPage.dealInput_FeeAsset, FeeAsset, "Select deal input Fee Asset=" + FeeAsset);
        waitForPresent(By.xpath(String.format(XAlphaDealInputPage.dealInput_FeeAssetOptions, FeeAsset)));
        click(By.xpath(String.format(XAlphaDealInputPage.dealInput_FeeAssetOptions, FeeAsset)), "Choose FeeAsset from drop down options");
    }

    public static String get_dealInput_FeeAsset() {
        String FeeAsset = getElementText(XAlphaDealInputPage.dealInput_FeeAssetText);
        LogUtil.infoLog(XAlphaDealInputActions.class, "dealInput_FeeAsset=" + FeeAsset);
        return FeeAsset;
    }

    public static void dealInput_FeeAmount(String FeeAmount) throws InterruptedException {
        clearInputUsingKeys(XAlphaDealInputPage.dealInput_FeeAmount);
        inputText(XAlphaDealInputPage.dealInput_FeeAmount, FeeAmount, "Select deal input Fee Amount=" + FeeAmount);
    }

    public static void dealInput_MarketPrice(String MarketPrice) throws InterruptedException {
        inputText(XAlphaDealInputPage.dealInput_MarketPrice, MarketPrice, "Select deal input Market Price=" + MarketPrice);
    }

    public static String get_dealInput_FeeAmount() throws InterruptedException {
        delay(1200);
        String feeAmount = getElementValueWithVisibility(XAlphaDealInputPage.dealInput_FeeAmount);
        LogUtil.infoLog(XAlphaDealInputActions.class, "Fee Amount=" + feeAmount);
        return feeAmount;
    }

    public static void dealInput_CounterpartyName(String CounterpartyName) {
        inputText(XAlphaDealInputPage.dealInput_CounterpartyName, CounterpartyName, "Select deal input Counterparty Name=" + CounterpartyName);
        waitForPresent(By.xpath(String.format(XAlphaDealInputPage.dealInput_CounterpartyNameOptions, CounterpartyName)));
        click(By.xpath(String.format(XAlphaDealInputPage.dealInput_CounterpartyNameOptions, CounterpartyName)), "Choose counterparty name from dropdown options");
    }

    public static String get_dealInput_CounterpartyName() {
        String CounterpartyName = getElementText(XAlphaDealInputPage.dealInput_CounterpartyNameText);
        LogUtil.infoLog(XAlphaDealInputActions.class, "CounterpartyName=" + CounterpartyName);
        return CounterpartyName;
    }

    public static void dealInput_PortfolioNumber(String PortfolioNumber) {
        inputText(XAlphaDealInputPage.dealInput_PortfolioNumber, PortfolioNumber, "Select deal input Portfolio Number=" + PortfolioNumber);
        pressEnter(XAlphaDealInputPage.dealInput_PortfolioNumber);
    }

    public static String get_dealInput_PortfolioNumber() {
        String PortfolioNumber = getElementText(XAlphaDealInputPage.dealInput_PortfolioNumberText);
        LogUtil.infoLog(XAlphaDealInputActions.class, "PortfolioNumber=" + PortfolioNumber);
        return PortfolioNumber;
    }

    public static void dealInput_ProcessingStatus(String arg0) {
        String processingStatus = arg0.toLowerCase();
        inputText(XAlphaDealInputPage.dealInput_ProcessingStatus, processingStatus, "Input deal input ProcessingStatus=" + arg0);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + processingStatus + "']"));
        click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + processingStatus + "']"), "processingStatus=" + processingStatus);
    }

    public static void clearDealInput_ValueDate() {
        waitForPresent(XAlphaDealInputPage.dealInput_ValueDate);
        click(XAlphaDealInputPage.dealInput_ValueDate, "Click value date picker");
        waitForPresent(XAlphaDealInputPage.dealInput_ValueDateNowBtn);
        if (isWebElementVisible(XAlphaDealInputPage.dealInput_ValueDateXbtn, 1)) {
            click(XAlphaDealInputPage.dealInput_ValueDateXbtn, "Clear value date");
        }
        clickBlankArea();
    }

    public static void dealInput_ValueDate(String ValueDate) throws InterruptedException {
        clearDealInput_ValueDate();
        click(XAlphaDealInputPage.dealInput_ValueDate, "Click Deal input ValueDate");
        inputTextByCharacter(XAlphaDealInputPage.dealInput_ValueDate, ValueDate, "Deal input ValueDate=" + ValueDate);
        delay(2000);
        waitForPresent(XAlphaDealInputPage.dealInput_ValueDateOkBtn);
        click(XAlphaDealInputPage.dealInput_ValueDateOkBtn, "Click OK button on value date picker");
        clickBlankArea();
    }

    public static void dealInput_ValueDateNow() {
        click(XAlphaDealInputPage.dealInput_ValueDate, "Click ValueDate picker");
        waitForPresent(XAlphaDealInputPage.dealInput_ValueDateNowBtn);
        click(XAlphaDealInputPage.dealInput_ValueDateNowBtn, "Click Now button on value date picker");
        clickBlankArea();
    }

    public static void dealInput_waitForDealInput_IncomingSettledYes() {
        waitForVisible(XAlphaDealInputPage.dealInput_IncomingSettledYes);
    }
    public static void dealInput_waitForDealInput_OutgoingSettledYes() {
        waitForVisible(XAlphaDealInputPage.dealInput_OutgoingSettledYes);
    }

    //execution deal > start asset
    public static void dealInput_StartAsset(String StartAsset) throws InterruptedException {
        delay(3000);
        inputText(XAlphaDealInputPage.dealInput_StartAsset, StartAsset, "Select deal input StartAsset=" + StartAsset);
        waitForPresent(By.xpath(String.format(XAlphaDealInputPage.dealInput_StartAssetOptions, StartAsset)));
        click(By.xpath(String.format(XAlphaDealInputPage.dealInput_StartAssetOptions, StartAsset)), "Choose StartAsset from dropdown options");
    }

    //execution deal > StartAssetAmount
    public static void dealInput_StartAssetAmount(String StartAssetAmount) throws InterruptedException {
        clearInputUsingKeys(XAlphaDealInputPage.dealInput_StartAssetAmount);
        delay(2000);

        inputText(XAlphaDealInputPage.dealInput_StartAssetAmount, StartAssetAmount, "Deal input StartAssetAmount=" + StartAssetAmount);
    }

    //execution deal > end asset
    public static void dealInput_EndAsset(String EndAsset) throws InterruptedException {
        delay(3000);
        inputText(XAlphaDealInputPage.dealInput_EndAsset, EndAsset, "Select deal input EndAsset=" + EndAsset);
        waitForPresent(By.xpath(String.format(XAlphaDealInputPage.dealInput_EndAssetOptions, EndAsset)));
        click(By.xpath(String.format(XAlphaDealInputPage.dealInput_EndAssetOptions, EndAsset)), "Choose EndAsset from dropdown options");
    }

    //execution deal > EndAssetAmount

    public static String getEndAssetAmount() {
        int number  = KeywordUtil.generateRandomNumber200to500()+1000;
        LogUtil.infoLog(thisClass, "Ask price" + number);
        return String.valueOf(number);

    }
    public static void dealInput_EndAssetAmount() throws InterruptedException {
        clearInputUsingKeys(XAlphaDealInputPage.dealInput_EndAssetAmount);
        delay(3000);
        inputText(XAlphaDealInputPage.dealInput_EndAssetAmount, getEndAssetAmount(), "Deal input EndAssetAmount=");
    }

    //execution deal > FeeProportion
    public static void dealInput_FeeProportion(String FeeProportion) throws InterruptedException {
        clearInputUsingKeys(XAlphaDealInputPage.dealInput_FeeProportion);
        clearInputUsingKeys(XAlphaDealInputPage.dealInput_FeeProportion); //intentional
        pressBackSpace(XAlphaDealInputPage.dealInput_FeeProportion); //intentional
        inputTextByCharacter(XAlphaDealInputPage.dealInput_FeeProportion, FeeProportion, "Deal input FeeProportion=" + FeeProportion);
        clickBlankArea();
    }

    //execution deal > FeeAdjustment
    public static void dealInput_FeeAdjustment(String FeeAdjustment) throws InterruptedException {
        clearInputUsingKeys(XAlphaDealInputPage.dealInput_FeeAdjustment);
        delay(3000);
        inputText(XAlphaDealInputPage.dealInput_FeeAdjustment, FeeAdjustment, "Deal input FeeAdjustment=" + FeeAdjustment);
    }

    public static void dealInput_CreateBtn() {
        click(XAlphaDealInputPage.dealInput_CreateBtn, "Click deal input Create Button");
    }

    public static void waitForDealSubmittedMsg() {
        waitForVisible(XAlphaDealInputPage.dealInput_validationMsg);
    }

    public static String dealInput_SubmitMessage() {
        String msg = getElementText(XAlphaDealInputPage.dealInput_validationMsg);
        LogUtil.infoLog(thisClass, "deal message=" + msg);
        return msg;
    }

    public static String getDealRefFromNotif() {
        String msg = getElementText(XAlphaDealInputPage.dealInput_validationMsg);
        String[] splittedMsg = msg.split(" ");
        LogUtil.infoLog(thisClass, "Deal ref id in notification message=" + splittedMsg[3]);
        RunCukesTest.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringGreyColor("Deal ref id in notification message=" + splittedMsg[3]));
        return splittedMsg[3];
    }

    //cash flow tab
    public static void clickCashFlowTab() {
        click(XAlphaDealInputPage.dealInput_CashFlowTab, "Navigate to CashFlow tab");
    }

    //cash flow Direction
    public static void dealInput_CashFlow_Direction(String Direction) {
        inputText(XAlphaDealInputPage.dealInput_CashFlow_Direction, Direction, "Select deal input CashFlow Direction=" + Direction);
        waitForPresent(By.xpath(String.format(XAlphaDealInputPage.dealInput_CashFlow_DirectionOptions, Direction)));
        click(By.xpath(String.format(XAlphaDealInputPage.dealInput_CashFlow_DirectionOptions, Direction)), "Choose CashFlow Direction from dropdown options");
    }

    //cash flow Asset
    public static void dealInput_CashFlow_Asset(String Asset) {
        inputText(XAlphaDealInputPage.dealInput_CashFlow_Asset, Asset, "Select deal input CashFlow Asset=" + Asset);
        waitForPresent(By.xpath(String.format(XAlphaDealInputPage.dealInput_CashFlow_AssetOptions, Asset)));
        click(By.xpath(String.format(XAlphaDealInputPage.dealInput_CashFlow_AssetOptions, Asset)), "Choose CashFlow Asset from dropdown options");
    }

    //cash flow Amount
    public static void dealInput_CashFlow_Amount(String Amount) throws InterruptedException {
        clearInputUsingKeys(XAlphaDealInputPage.dealInput_CashFlow_Amount);
        inputText(XAlphaDealInputPage.dealInput_CashFlow_Amount, Amount, "Deal input CashFlow Amount=" + Amount);
    }

    //cash flow Purpose
    public static void dealInput_CashFlow_Purpose(String Purpose) {
        inputText(XAlphaDealInputPage.dealInput_CashFlow_Purpose, Purpose, "Select deal input CashFlow Purpose=" + Purpose);
        waitForPresent(By.xpath(String.format(XAlphaDealInputPage.dealInput_CashFlow_PurposeOptions, Purpose)));
        click(By.xpath(String.format(XAlphaDealInputPage.dealInput_CashFlow_PurposeOptions, Purpose)), "Choose CashFlow Purpose from dropdown options");
    }

    public static void clickSettled() {
        click(XAlphaDealEnquiryPage.settlement_detail_Click,"Clicked to Settlement tab");
        click(XAlphaDealEnquiryPage.settlement_detail_outgoing,"Clicked to Settlement tab");
    }
}
