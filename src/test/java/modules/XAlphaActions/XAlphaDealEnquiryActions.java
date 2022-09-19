package modules.XAlphaActions;

import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageFactory.OptimusPages.Portfolio.PortfolioMainPage;
import pageFactory.XAlphaPages.XAlphaDealEnquiryPage;
import pageFactory.XAlphaPages.XAlphaDealInputPage;
import step_definitions.RunCukesTest;
import utilities.HTMLReportUtil;
import utilities.KeywordUtil;
import utilities.LogUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class XAlphaDealEnquiryActions extends KeywordUtil {

    static Class thisClass = XAlphaDealEnquiryActions.class;

    public static String tran_inst,invoice_transinstr;
    public static void clickDealEnquiryTab() {
        click(XAlphaDealEnquiryPage.dealEnquiryTab, "Click deal enquiry tab");
    }

    public static void clickDeaTradeDocumentsTab() {

        click(XAlphaDealEnquiryPage.tradedocumentsTab, "Click Trade Doc. tab");
    }
    public static void waitFordealEnquiry_navbar() {
        waitForVisible(XAlphaDealEnquiryPage.dealEnquiry_navbar);
    }

    public static void openFirstDeal() {
        click(XAlphaDealEnquiryPage.dealEnquiry_firstDetailLink, "Open first deal");
    }

    public static void expandFirstDealDetail() {
        waitForPresent(XAlphaDealEnquiryPage.dealEnquiry_firstExpandDeal);
        click(XAlphaDealEnquiryPage.dealEnquiry_firstExpandDeal, "Expand deal details in the first row by clicking + icon");
    }

    public static String getFirstDealReferenceId() {
        String dealRef = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstDealRef);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "Deal reference in the first row=" + dealRef);
        return dealRef;
    }

    public static String getFirstDealType() {
        String dealType = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstDealType);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "dealType in the first row=" + dealType);
        return dealType;
    }

    public static String getFirstDealProcessingStatus() {
        return getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstProcessingStatus);
    }

    public static String getFirstCounterpartyName() {
        String CounterpartyName = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstCounterPartyName);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "CounterpartyName in the first row=" + CounterpartyName);
        return CounterpartyName;
    }

    public static String getFirstPortfolioNumber() {
        String PortfolioNumber = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstPortfolioNumber);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "PortfolioNumber in the first row=" + PortfolioNumber);
        return PortfolioNumber;
    }

    public static String getFirstSummary() {
        String summary = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstSummary);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "Summary in the first row=" + summary);
        return summary;
    }

    public static String getFirstBaseAssetAmount() {
        String BaseAssetAmount = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstBaseAssetAmount);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "BaseAssetAmount in the first row=" + BaseAssetAmount);
        return BaseAssetAmount;
    }

    public static String getFirstBaseAsset() {
        String BaseAsset = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstBaseAsset);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "BaseAsset in the first row=" + BaseAsset);
        return BaseAsset;
    }

    public static String getFirstQuoteAsset() {
        String QuoteAsset = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstQuoteAsset);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "QuoteAsset in the first row=" + QuoteAsset);
        return QuoteAsset;
    }

    public static String getFirstUnitPrice() {
        String unitPrice = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstUnitPrice);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "Unit price in the first row=" + unitPrice);
        return unitPrice;
    }

    public static String getFirstFeeAsset() {
        String FeeAsset = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstFeeAsset);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "FeeAsset in the first row=" + FeeAsset);
        return FeeAsset;
    }

    public static String getFirstFeeAmount() {
        String feeAmount = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstFeeAmount);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "Fee Amount in the first row=" + feeAmount);
        return feeAmount;
    }

    //execution deal
    public static String getFirstStartAsset() {
        String StartAsset = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstStartAsset);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "StartAsset in the first row=" + StartAsset);
        return StartAsset;
    }

    public static String getFirstStartAssetAmount() {
        String StartAssetAmount = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstStartAssetAmount);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "StartAssetAmount in the first row=" + StartAssetAmount);
        return StartAssetAmount;
    }

    public static String getFirstEndAsset() {
        String EndAsset = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstEndAsset);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "EndAsset in the first row=" + EndAsset);
        return EndAsset;
    }

    public static String getFirstEndAssetAmount() {
        String EndAssetAmount = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstEndAssetAmount);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "EndAssetAmount in the first row=" + EndAssetAmount);
        return EndAssetAmount;
    }

    public static String getFirstFeeAsset_Execution() {
        String FeeAsset = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstFeeAsset_Execution);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "FeeAsset in the first row=" + FeeAsset);
        return FeeAsset;
    }

    public static String getFirstFeeProportion() {
        String FeeProportion = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstFeeProportion);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "FeeProportion in the first row=" + FeeProportion);
        return FeeProportion;
    }

    public static String getFirstFeeAmount_Execution() {
        String FeeAmount_Execution = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstFeeAmount_Execution);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "FeeAmount_Execution in the first row=" + FeeAmount_Execution);
        return FeeAmount_Execution;
    }

    public static String getFirstValueDate_Execution() {
        String ValueDate_Execution = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstValueDate);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "ValueDate_Execution in the first row=" + ValueDate_Execution);
        return ValueDate_Execution;
    }

    public static String getFirstValueDateBlank() {
        String ValueDate_Execution = getElementTextWithFindElement(XAlphaDealEnquiryPage.dealEnquiry_firstValueDate);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "ValueDate_Execution in the first row=" + ValueDate_Execution);
        return ValueDate_Execution;
    }


    public static String getDealRefwrtQuoteAssetAmt(String QuotePrice) {
        QuotePrice = formatDecimalToStr(QuotePrice);
        String dealRef = KeywordUtil.getElementText(By.xpath("(//tbody[@class='ant-table-tbody']//tr/td[10]/div/div[6]/div[2]/span[text()='" + QuotePrice + "'])//ancestor::tr/td[4]"));
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "dealRef=" + dealRef);
        return dealRef;
    }

    public static String getDealTypewrtQuoteAssetAmt(String QuotePrice) {
        QuotePrice = formatDecimalToStr(QuotePrice);
        String dealType = KeywordUtil.getElementText(By.xpath("(//tbody[@class='ant-table-tbody']//tr/td[10]/div/div[6]/div[2]/span[text()='" + QuotePrice + "'])//ancestor::tr/td[5]/span"));
        LogUtil.infoLog(thisClass, "dealType=" + dealType);
        return dealType;
    }

    public static String getDirectionwrtQuoteAssetAmt(String QuotePrice) {
        QuotePrice = formatDecimalToStr(QuotePrice);
        String summary_aka_direction = KeywordUtil.getElementText(By.xpath("((//tbody[@class='ant-table-tbody']//tr/td[10]/div/div[6]/div[2]/span[text()='" + QuotePrice + "'])//ancestor::tr/td[10])/div/div/div/span"));
        LogUtil.infoLog(thisClass, "summary_aka_direction=" + summary_aka_direction);
        return summary_aka_direction;
    }

    public static String getProcessingStatuswrtQuoteAssetAmt(String QuotePrice) {
        QuotePrice = formatDecimalToStr(QuotePrice);
        String processingStatus = KeywordUtil.getElementText(By.xpath("(//tbody[@class='ant-table-tbody']//tr/td[10]/div/div[6]/div[2]/span[text()='" + QuotePrice + "'])//ancestor::tr/td[6]/span"));
        LogUtil.infoLog(thisClass, "processingStatus=" + processingStatus);
        return processingStatus;
    }

    public static String getCounterPartywrtQuoteAssetAmt(String QuotePrice) {
        QuotePrice = formatDecimalToStr(QuotePrice);
        String counterPartyName = KeywordUtil.getElementText(By.xpath("(//tbody[@class='ant-table-tbody']//tr/td[10]/div/div[6]/div[2]/span[text()='" + QuotePrice + "'])//ancestor::tr/td[8]/div"));
        LogUtil.infoLog(thisClass, "counterPartyName=" + counterPartyName);
        return counterPartyName;
    }

    public static String getUnitPricewrtQuoteAssetAmt(String QuotePrice) {
        QuotePrice = formatDecimalToStr(QuotePrice);
        String unitPrice = KeywordUtil.getElementText(By.xpath("((//tbody[@class='ant-table-tbody']//tr/td[10]/div/div[6]/div[2]/span[text()='" + QuotePrice + "'])//ancestor::tr/td[10])/div/div[4]/div[2]/span"));
        LogUtil.infoLog(thisClass, "unitPrice=" + unitPrice);
        return unitPrice;
    }

    public static String getFeewrtQuoteAssetAmt(String QuotePrice) {
        QuotePrice = formatDecimalToStr(QuotePrice);
        String fee = KeywordUtil.getElementText(By.xpath("((//tbody[@class='ant-table-tbody']//tr/td[10]/div/div[6]/div[2]/span[text()='" + QuotePrice + "'])//ancestor::tr/td[10])/div/div[5]/div[2]/span"));
        LogUtil.infoLog(thisClass, "fee=" + fee);
        return fee;
    }

    public static String getReferencePricewrtQuoteAssetAmt(String QuotePrice) {
        QuotePrice = formatDecimalToStr(QuotePrice);
        String referencePrice = KeywordUtil.getElementText(By.xpath("((//tbody[@class='ant-table-tbody']//tr/td[10]/div/div[6]/div[2]/span[text()='" + QuotePrice + "'])//ancestor::tr/td[10])/div/div[6]/div[2]/span"));
        LogUtil.infoLog(thisClass, "referencePrice=" + referencePrice);
        return referencePrice;
    }

    //clear existing processing statuses from the filter
    public static void clearProcessingStatuses() {
        List<WebElement> statuses = getListElements(XAlphaDealEnquiryPage.dealEnquiry_processingStatuses, "Clearing processing statuses.");
        for (WebElement element : statuses) {
            element.click();
        }
    }

    public static void dealEnquiry_ResetFiler() {
        waitForVisible(XAlphaDealEnquiryPage.dealEnquiry_resetFilter);
        click(XAlphaDealEnquiryPage.dealEnquiry_resetFilter, "Clicking Reset Filter button");
    }

    //input processing status
    public static void inputProcessingStatus(String processingStatus) {
        click(XAlphaDealEnquiryPage.dealEnquiry_processingStatusClick, "Click processing status input filter box");
        inputText(XAlphaDealEnquiryPage.dealEnquiry_processingStatusInput, processingStatus, "input processing status=" + processingStatus);
        waitForPresent(By.xpath(String.format(XAlphaDealEnquiryPage.dealEnquiry_processingStatusChoice, processingStatus)));
        click(By.xpath(String.format(XAlphaDealEnquiryPage.dealEnquiry_processingStatusChoice, processingStatus)), "Choose processing status from dropdown");
    }

    //clear existing deal types(if any)
    public static void clearDealTypes() {
        List<WebElement> dealTypes = getListElements(XAlphaDealEnquiryPage.dealEnquiry_DealTypesXicon, 2, "Clearing deal types");
        for (WebElement element : dealTypes) {
            element.click();
        }
    }

    //input deal types
    public static void inputDealType(String dealType) {
        click(XAlphaDealEnquiryPage.dealEnquiry_DealTypesClick, "Click deal types input filter box");
        inputText(XAlphaDealEnquiryPage.dealEnquiry_DealTypesInput, dealType, "input deal type=" + dealType);
        waitForPresent(By.xpath(String.format(XAlphaDealEnquiryPage.dealEnquiry_processingStatusChoice, dealType)));
        click(By.xpath(String.format(XAlphaDealEnquiryPage.dealEnquiry_processingStatusChoice, dealType)), "Choose deal type from dropdown");
    }

    //input Direction
    public static void inputDirection(String directionType) {
        click(XAlphaDealEnquiryPage.dealEnquiry_Direction, "Click direction input filter box");
        inputText(XAlphaDealEnquiryPage.dealEnquiry_DirectionInput, directionType, "input direction =" + directionType);
        waitForPresent(By.xpath(String.format(XAlphaDealEnquiryPage.dealEnquiry_DirectionChoice, directionType)));
        click(By.xpath(String.format(XAlphaDealEnquiryPage.dealEnquiry_DirectionChoice, directionType)), "Choose direction from dropdown");
    }
    //clear existing directions(if any)
    public static void clearDirection() {
        List<WebElement> directions = getListElements(XAlphaDealEnquiryPage.dealEnquiry_DirectionXicon, 2, "Clearing direction selections");
        for (WebElement element : directions) {
            element.click();
        }
    }

    //choose date filter
    public static void chooseFilter_ValueDate(String filterType) {
        inputText(XAlphaDealEnquiryPage.dealEnquiry_dateFilter, filterType, "Choose " + filterType + " filter");
        waitForPresent(By.xpath(String.format(XAlphaDealEnquiryPage.dealEnquiry_dateFilterOptions, filterType)));
        click(By.xpath(String.format(XAlphaDealEnquiryPage.dealEnquiry_dateFilterOptions, filterType)), "Choose " + filterType + " filter from dropdown options");
    }

    //input start date filter
    public static void filter_StartDate(String date) throws InterruptedException {
        click(XAlphaDealEnquiryPage.dealEnquiry_StartDate, "Click end date");
        inputText(XAlphaDealEnquiryPage.dealEnquiry_StartDate, date, "Start date=" + date);
        delay(1000);
        waitForPresent(XAlphaDealInputPage.dealInput_ValueDateOkBtn);
        click(XAlphaDealInputPage.dealInput_ValueDateOkBtn, "Click OK button on value date picker");
        delay(1500);
        clickBlankArea();
    }

    //input end date filter
    public static void filter_EndDate(String date) throws InterruptedException {
        click(XAlphaDealEnquiryPage.dealEnquiry_EndDate, "Click end date");
        inputText(XAlphaDealEnquiryPage.dealEnquiry_EndDate, date, "End date=" + date);
        delay(1000);
        waitForPresent(XAlphaDealInputPage.dealInput_ValueDateOkBtn2);
        click(XAlphaDealInputPage.dealInput_ValueDateOkBtn2, "Click OK button on value date picker");
        delay(1500);
        clickBlankArea();
    }

    //input end date filter now
    public static void filter_EndDateNow() {
        click(XAlphaDealEnquiryPage.dealEnquiry_EndDate, "Click end date");
        waitForVisible(XAlphaDealInputPage.dealInput_ValueDateNowBtn2);
        click(XAlphaDealInputPage.dealInput_ValueDateNowBtn2, "Choose end date a Now");
        waitForInVisibile(XAlphaDealInputPage.dealInput_ValueDateNowBtn2);
        clickBlankArea();
    }

    public static void clickLoadDealBtn() {
        click(XAlphaDealEnquiryPage.dealEnquiry_LoadDealBtn, "Click load deal button");
    }

    public static void clickLoadDealBtnTradeDocument() {
        click(XAlphaDealEnquiryPage.tradedocuments_LoadDealBtn, "Click load deal button");
    }

    public static void closeSuccessNotification() {
        click(XAlphaDealEnquiryPage.dealEnquiry_LoadDealNotifXBtn, "Close the success notification");
    }

    public static void waitForLoadingIconToAppear() {
        waitForPresent(XAlphaDealEnquiryPage.dealEnquiry_loading);
    }

    public static void waitForLoadingIconToDisappear() {
        waitForInVisibile(XAlphaDealEnquiryPage.dealEnquiry_loading);
    }

    public static void waitForLoadingIconToAppearAndDisappear() {
        waitForPresent(XAlphaDealEnquiryPage.dealEnquiry_loading);
        waitForInVisibile(XAlphaDealEnquiryPage.dealEnquiry_loading);
    }

    public static void waitForSuccessMsgToAppear() {
        waitForPresent(XAlphaDealEnquiryPage.dealEnquiry_LoadDealSuccessMsg);
    }

    public static void waitForSuccessMsgToDisappear() {
        waitForInVisibile(XAlphaDealEnquiryPage.dealEnquiry_LoadDealSuccessMsg);
    }

    public static void waitForSuccessMsgToAppearAndDisappear() {
        waitForPresent(XAlphaDealEnquiryPage.dealEnquiry_LoadDealSuccessMsg);
        waitForInVisibile(XAlphaDealEnquiryPage.dealEnquiry_LoadDealSuccessMsg);
    }

    public static void waitForNotifDescription() {
        waitForPresent(XAlphaDealEnquiryPage.dealEnquiry_NotifDescp);
        LogUtil.infoLog(thisClass, "Notification description=" + getElementText(XAlphaDealEnquiryPage.dealEnquiry_NotifDescp));
    }

    public static String getNotifDescription() {
        String notifDescp = getElementText(XAlphaDealEnquiryPage.dealEnquiry_NotifDescp);
        LogUtil.infoLog(thisClass, "getNotifDescription=" + notifDescp);
        return getElementText(XAlphaDealEnquiryPage.dealEnquiry_NotifDescp);
    }

    public static void waitForSuccessMsgToAppear_MO() {
        waitForPresent(XAlphaDealEnquiryPage.dealEnquiry_LoadDealSuccessMsg_MO);
    }

    public static void waitForDealDetailsPage() {
        waitForPresent(XAlphaDealEnquiryPage.dealEnquiry_UpdateBtn);
    }

    public static void clickUpdateDealBtn() {
        click(XAlphaDealEnquiryPage.dealEnquiry_UpdateBtn, "Click update deal button");
    }

    //enter deal reference
    public static void inputDealRef(String dealRef) {
        System.out.println("inputDealRef=" + dealRef);
        inputText(XAlphaDealEnquiryPage.dealEnquiry_DealRefInput, dealRef, "Input deal reference=" + dealRef);
        waitForPresent(By.xpath(String.format(XAlphaDealEnquiryPage.dealEnquiry_DealRefInputSuggestion, dealRef)));
        click(By.xpath(String.format(XAlphaDealEnquiryPage.dealEnquiry_DealRefInputSuggestion, dealRef)), "Choose deal reference from dropdown suggestion");
    }

    //get entered deal reference
    public static String getDealReferenceFromDealDetails() {
        String dealRef = getElementValueWithVisibility(XAlphaDealEnquiryPage.dealDetail_dealRef);
        LogUtil.infoLog(thisClass, "dealRef on deal details page=" + dealRef);
        return dealRef;
    }

    //cash flow deal
    public static String getFirst_CashFlow_Purpose() {
        String CashFlowPurpose = getElementText(XAlphaDealEnquiryPage.dealEnquiry_first_CashFlow_Purpose);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "CashFlowPurpose in the first row=" + CashFlowPurpose);
        return CashFlowPurpose;
    }

    //cash flow asset amount
    public static String getFirst_CashFlow_AssetAmount() {
        String CashFlowAmount = getElementText(XAlphaDealEnquiryPage.dealEnquiry_first_CashFlow_AssetAmount);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "CashFlowAmount in the first row=" + CashFlowAmount);
        return CashFlowAmount;
    }

    //cash flow asset name
    public static String getFirst_CashFlow_AssetName() {
        String CashFlowAssetName = getElementText(XAlphaDealEnquiryPage.dealEnquiry_first_CashFlow_AssetName);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "CashFlowAssetName in the first row=" + CashFlowAssetName);
        return CashFlowAssetName;
    }

    //cash flow trade date
    public static String getFirst_CashFlow_TradeDate() {
        String CashFlowTradeDate = getElementText(XAlphaDealEnquiryPage.dealEnquiry_first_CashFlow_TradeDate);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "CashFlowTradeDate in the first row=" + CashFlowTradeDate);
        return CashFlowTradeDate;
    }

    //cash flow trade date
    public static String getFirst_CashFlow_ValueDate() {
        String CashFlowValueDate = getElementText(XAlphaDealEnquiryPage.dealEnquiry_first_CashFlow_ValueDate);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "CashFlowValueDate in the first row=" + CashFlowValueDate);
        return CashFlowValueDate;
    }

    public static void validatestatus() {
        List<WebElement> all_rows = getDriver().findElements(By.xpath("//th[text()='Settled']/../../following-sibling::tbody/tr"));
        boolean Settledstatus = false;
        List<WebElement> all_cols = getDriver().findElements(By.xpath("//th[text()='Settled']/../../following-sibling::tbody/tr/td[7]"));
        for (int j = 1; j <= all_cols.size(); j++) {
            String cell = getDriver().findElement(By.xpath("//th[text()='Settled']/../../following-sibling::tbody/tr[" + j + "]/td[7]/div/button/span")).getText();
            if (cell.contains("YES")) {
                Settledstatus = true;
            } else {
                click(By.xpath("//th[text()='Settled']/../../following-sibling::tbody/tr[" + j + "]/td[7]/div/button/span"), "Click on Settled Button");
            }
        }

    }

    public static void inputDealRefid_TradeDocuments(String dealRefId) {
        System.out.println("inputDealRef=" + dealRefId);
        inputText(XAlphaDealEnquiryPage.TradeDocuments_dealRef, dealRefId, "Input deal reference=" + dealRefId);

    }

    public static void clickExpandbutton() throws InterruptedException {
        delay(4000);
        click(XAlphaDealEnquiryPage.tradedocuments_expandbtn,"Clicked the Expand Button");
    }

    public static void selectEditDraft() throws InterruptedException {
        hoverOnElementandClick(XAlphaDealEnquiryPage.tradedocuments_editdraft);
    }

    public static void selectEditInvoiceDraft() throws InterruptedException {
        hoverOnElementandClick(XAlphaDealEnquiryPage.tradedocuments_editinvoiceDraft);
    }
    public static void selecReview() throws InterruptedException {
        hoverOnElementandClick(XAlphaDealEnquiryPage.tradedocuments_reviewPagecheckbox);
        delay(2000);
        hoverOnElementandClick(XAlphaDealEnquiryPage.tradedocuments_addedinstruction);
    }

    public static void selecfirstReview() throws InterruptedException {
        hoverOnElementandClick(XAlphaDealEnquiryPage.tradedocuments_reviewPagecheckbox);
    }

    public static void AddInstrReview() throws InterruptedException {
        hoverOnElementandClick(XAlphaDealEnquiryPage.tradedocuments_addedinstruction);
    }

    public static void selectPrepareEmail() {
        click(XAlphaDealEnquiryPage.tradedocuments_emailbtn,"Clicked the Prepare Email button");
    }

    public static void clearAllFileds() throws InterruptedException
    {
        hoverOnElementandClick(XAlphaDealEnquiryPage.tradedocuments_To);
        delay(3000);
        hoverOnElementandClick(XAlphaDealEnquiryPage.tradedocuments_CC);
        delay(3000);
        hoverOnElementandClick(XAlphaDealEnquiryPage.tradedocuments_BCC);
    }

    public static void closeSettlementReview() {
        click(XAlphaDealEnquiryPage.tradedocuments_closebtn,"Clicked the Close Button");
    }

    public static void inputSendername(String name) {
        inputText(XAlphaDealEnquiryPage.tradedocuments_Toinputfield, name, "Sender Name Entered =" + name);
        pressEnter(XAlphaDealEnquiryPage.tradedocuments_Toinputfield);
    }

    public static void ChooseSendmail() {
        click(XAlphaDealEnquiryPage.tradedocuments_sendbtn,"Clicked the Send Button");
    }
    public static String getConfirmationStatus() {

        String status = KeywordUtil.getElementText(By.xpath("//span[text()='Deal Ref']//following::tbody[1]/tr[2]/td[9]/span/div/div[1]"));
        LogUtil.infoLog(thisClass, "Confirmation Status is =" + status);
        return status;
    }

    public static String getConfirmationStatusExdeal() {

        String status = KeywordUtil.getElementText(By.xpath("//span[text()='Deal Ref']//following::tbody[1]/tr[2]/td[9]/span"));
        LogUtil.infoLog(thisClass, "Confirmation Status is =" + status);
        return status;
    }
    public static String getInvoiceStatus() {

        String status = KeywordUtil.getElementText(By.xpath("//span[text()='Deal Ref']//following::tbody[1]/tr[2]/td[10]/span"));
        LogUtil.infoLog(thisClass, "Confirmation Status is =" + status);
        return status;
    }
    public static String getInvoiceDetail() {
        String nodata= getElementText(By.xpath("//div[text()='No Data']"));
        LogUtil.infoLog(thisClass, "Invoice Detail =" + nodata);
        return nodata;
    }

    public static void selectInvoiceTab() {
        try {
            hoverOnElementandClick(XAlphaDealEnquiryPage.tradedocuments_invoiceTab);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void selectgenerateInvoice() {
        click(XAlphaDealEnquiryPage.tradedocuments_generateinvoicebtn,"Clicked the Generate Invoice Button");
    }

    public static void selectgenerateOrderExdeal() {
        click(XAlphaDealEnquiryPage.tradedocuments_generateorderbtn,"Clicked the Generate Order Button");
    }

    public static void goBacktoMainWindow() throws InterruptedException {
        ArrayList<String> newTb = new ArrayList<String>(getDriver().getWindowHandles());
        //switch to new tab

        getDriver().switchTo().window(newTb.get(0));
    }

    public static void addInstructions() throws InterruptedException {
        hoverOnElement(XAlphaDealEnquiryPage.tradedocuments_addinstructions);
        delay(2000);
        click(XAlphaDealEnquiryPage.tradedocuments_addReview,"Clicked ion Add Review");

    }

    public static void addInstructionsExDeal() throws InterruptedException {
        hoverOnElement(XAlphaDealEnquiryPage.tradedocuments_addinstructions);
        delay(2000);
        hoverOnElementandClick(XAlphaDealEnquiryPage.tradedocuments_newinstructions);
    }
    public static void addComments() {
        inputText(XAlphaDealEnquiryPage.tradedocuments_addcomments, "Tx-Automate Test Data", "Added Comments");
    }
    public static void selectallReview() throws InterruptedException {

        hoverOnElementandClick(XAlphaDealEnquiryPage.tradedocuments_reviewPagecheckbox3);

    }
    public static void selectAddedInstructionreview() throws InterruptedException {
        hoverOnElementandClick(XAlphaDealEnquiryPage.tradedocuments_addedinstruction);
    }
    public static String getTransferInstructions() {
        String tran_inst = KeywordUtil.getElementText(XAlphaDealEnquiryPage.tradedocuments_confirmationTransferinstr);
        LogUtil.infoLog(thisClass, "Transfer Instruction is =" + tran_inst);
        return tran_inst;
    }

    public static String getTransferInstructionsInvoce() {
        String invoice_transinstr = KeywordUtil.getElementText(XAlphaDealEnquiryPage.tradedocuments_InvoiceTransferinstr);
        LogUtil.infoLog(thisClass, "Invoice  Transfer Instruction is =" + invoice_transinstr);
        return invoice_transinstr;
    }

    public static String getStatusforbothTradeDoc() {
        String status = KeywordUtil.getElementText(XAlphaDealEnquiryPage.TradeDocuments_dealRefconfirmationstatus);
        LogUtil.infoLog(thisClass, "Status for both Deals  is =" + status);
        return status;
    }

    public static void chooseIsCompletebutton() {
        try {
            hoverOnElementandClick(XAlphaDealEnquiryPage.dealEnquiry_iscompletebtn);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void addcomments() {
        inputText(XAlphaDealEnquiryPage.tradedocuments_comments,"TX_Testing for Automation","Comments added");

    }

    public static void clickSettingIcon() throws InterruptedException {

        hoverOnElementandClick(XAlphaDealEnquiryPage.tradedocuments_settingicon);
    }

    public static void removeFields() throws InterruptedException {
        hoverOnElementandClick(XAlphaDealEnquiryPage.tradedocuments_entity);
    }

    public static void addTitle() throws InterruptedException {
        inputText(XAlphaDealEnquiryPage.tradedocuments_title,"TX-Title ","Added Testing Title");
        delay(2000);
        hoverOnElementandClick(XAlphaDealEnquiryPage.tradedocuments_confirmbtn1);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "Title Added");

    }

    public static void addSubTitle() throws InterruptedException {
        inputText(XAlphaDealEnquiryPage.tradedocuments_subtitle,"TX-Sub Title ","Added Testing Sub Title");
        delay(2000);
        hoverOnElementandClick(XAlphaDealEnquiryPage.tradedocuments_confirmbtn2);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "Sub Title Added");
    }

    public static void addAddress() throws InterruptedException {
        inputText(XAlphaDealEnquiryPage.tradedocuments_address,"TX-Title-Address ","Added Testing Title");
        delay(2000);
        hoverOnElementandClick(XAlphaDealEnquiryPage.tradedocuments_confirmbtn3);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "Adrress Added");
    }

    public static void verifyDownloadBtn() {
        waitForClickable(XAlphaDealEnquiryPage.tradedocuments_mailbtn);
        RunCukesTest.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringGreyColor("Download CSV button is enabled and clickable"));
    }
}