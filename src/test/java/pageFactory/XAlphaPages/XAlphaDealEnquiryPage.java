package pageFactory.XAlphaPages;

import org.openqa.selenium.By;

public class XAlphaDealEnquiryPage {

    //deal Enquiry
    public static By dealEnquiryTab = By.linkText("Deal Enquiry");

    public static By tradedocumentsTab = By.linkText("Trade Documents");
    public static By dealEnquiry_navbar = By.linkText("deals");
    public static By dealEnquiry_loading = By.xpath("//span[@class='ant-spin-dot ant-spin-dot-spin']");

    //first row details
    public static By dealEnquiry_firstExpandDeal = By.xpath("//button[@aria-label='Expand row']");
    public static By dealEnquiry_firstDealRef = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[04]");
    public static By dealEnquiry_firstDetailLink = By.xpath("(//tbody[@class='ant-table-tbody']//a[@type='link' and text()='Detail'])[1]");
    public static By dealEnquiry_firstDealType = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[05]/span");
    public static By dealEnquiry_firstProcessingStatus = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[06]/span");
    public static By dealEnquiry_firstCounterPartyName = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[08]/div");
    public static By dealEnquiry_firstPortfolioNumber = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[09]/div");
    public static By dealEnquiry_firstSummary = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[10]/div/div[1]/div/span");

    public static By dealEnquiry_purpose_CashFlow= By.xpath(" (//tbody[@class='ant-table-tbody']/tr[02]/td[10]/..//div[@class='_value_1mi80_16'])[2]");
    public static By dealEnquiry_firstBaseAssetAmount = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[10]/div/div[2]/div[2]/span");
    public static By dealEnquiry_firstBaseAsset = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[10]/div/div[2]/div[3]");
    public static By dealEnquiry_firstQuoteAsset = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[10]/div/div[3]/div[3]");
    public static By dealEnquiry_firstUnitPrice = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[10]/div/div[4]/div[2]/span");
    public static By dealEnquiry_firstFeeAsset = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[10]/div/div[5]/div[3]");
    public static By dealEnquiry_firstFeeAmount = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[10]/div/div[5]/div[2]/span");

    //execution deal details
    public static By dealEnquiry_firstStartAsset = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[10]/div/div[1]/div[3]");
    public static By dealEnquiry_firstStartAssetAmount = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[10]/div/div[1]/div[2]/span");
    public static By dealEnquiry_firstEndAsset = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[10]/div/div[2]/div[3]");
    public static By dealEnquiry_firstEndAssetAmount = By.xpath("//div[text()='End: ']/following-sibling::div/span");
    public static By dealEnquiry_firstFeeAsset_Execution = By.xpath("//div[text()='Fee: ']/following-sibling::div[2]");
    public static By dealEnquiry_firstFeeProportion = By.xpath("//div[text()='Fee Proportion: ']/following-sibling::div/span");
    public static By dealEnquiry_firstFeeAmount_Execution = By.xpath("//div[text()='Fee: ']/following-sibling::div/span");
    public static By dealEnquiry_firstFeeAdjustment = By.xpath(""); //not available at the moment on deal enquiry
    public static By dealEnquiry_firstValueDate = By.xpath("//tbody[@class='ant-table-tbody']/tr[2]/td[12]/span");

    //cash flow deal details
    public static By dealEnquiry_first_CashFlow_Purpose = By.xpath("(//div[text()='Purpose: ']/following-sibling::div[1])[1]");
    public static By dealEnquiry_first_CashFlow_AssetAmount = By.xpath("(//div[text()='Asset: ']/following-sibling::div[1]/span)[1]");
    public static By dealEnquiry_first_CashFlow_AssetName = By.xpath("//div[text()='Asset: ']/following-sibling::div[2]");
    public static By dealEnquiry_first_CashFlow_TradeDate = By.xpath("//tbody[@class='ant-table-tbody']/tr[2]/td[11]/span");
    public static By dealEnquiry_first_CashFlow_ValueDate = By.xpath("//tbody[@class='ant-table-tbody']/tr[2]/td[12]/span");

    //deal filters
    public static By dealEnquiry_processingStatusClick = By.xpath("//div[@ph_label='Processing Status']");
    public static By dealEnquiry_processingStatusInput = By.id("filter_form_processing_status");
    public static By dealEnquiry_processingStatuses = By.xpath("//div[@ph_label='Processing Status']//div[@class='ant-select-selection-overflow-item']/span/span[2]");
    public static String dealEnquiry_processingStatusChoice = "//div[@class='ant-select-item-option-content' and text()='%s']";

    public static By dealEnquiry_DealTypesClick = By.xpath("//div[@ph_label='Processing Status']");

    public static By dealEnquiry_Direction = By.xpath("//div[@ph_label='Direction']");

    public static By dealEnquiry_DirectionInput = By.id("filter_form_direction");

    public static String dealEnquiry_DirectionChoice = "//div[@class='ant-select-item-option-content' and text()='%s']";

    public static By dealEnquiry_DirectionXicon = By.xpath("//div[@ph_label='Direction']//div[@class='ant-select-selection-overflow-item']/span/span[2]");

    public static By settlement_detail_Click = By.xpath("//span[text()='INCOMING']/following::td[6]/div/button");

    public static By settlement_detail_outgoing = By.xpath("//span[text()='OUTGOING']/following::td[6]/div/button");
    public static By dealEnquiry_DealTypesInput = By.id("filter_form_deal_type");
    public static By dealEnquiry_DealTypesXicon = By.xpath("//div[@ph_label='Deal Type']//div[@class='ant-select-selection-overflow-item']/span/span[2]");
    public static String dealEnquiry_DealTypesChoice = "//div[@class='ant-select-item-option-content' and text()='%s']";

    public static By dealEnquiry_resetFilter = By.xpath("//button[@type='button']/span[text()='Reset Filter']");
    public static By dealEnquiry_LoadDealBtn = By.xpath("//button[@type='submit']/span[text()='Load Deal']");
    public static By dealEnquiry_LoadDealNotifXBtn = By.xpath("//span[@class='ant-notification-notice-close-x']");
    public static By dealEnquiry_LoadDealSuccessMsg = By.xpath("//div[@class='ant-notification-notice-message' and text()='Success!']");
    public static By dealEnquiry_NotifDescp = By.xpath("//div[@class='ant-notification-notice-description']");
    public static By dealEnquiry_LoadDealSuccessMsg_MO = By.xpath("//div[@class='ant-notification-notice-description' and text()='Deal update has to be approved by MO. A task has created.']");
    public static By dealEnquiry_DealRefInput = By.id("filter_form_deal_ref");
    public static String dealEnquiry_DealRefInputSuggestion = "//div[@class='ant-select-item-option-content' and text()='%s']";
    public static By dealEnquiry_UpdateBtn = By.xpath("//button[@type='submit']/span[text()='Update']");
    public static By dealEnquiry_dateFilter = By.id("filter_form_date_type");
    public static String dealEnquiry_dateFilterOptions = "//div[@id='filter_form_date_type_list']/following-sibling::div//div[text()='%s']";
    public static By dealEnquiry_StartDate = By.id("filter_form_start");
    public static By dealEnquiry_EndDate = By.id("filter_form_end");

    public static By dealEnquiry_iscompletebtn = By.id("deal_type_data.is_complete");

    //deal details
    public static By dealDetail_dealRef = By.xpath("//input[@placeholder='Deal Ref']");

    //Trade Documents

    public static By TradeDocuments_dealRef = By.xpath("//label[text()='Deal Ref.']//following::input[1]");

    public static By TradeDocuments_dealRefconfirmationstatus = By.xpath("//span[text()='Deal Ref']//following::tbody/tr[2]/td[9]/span");
    public static By tradedocuments_expandbtn = By.xpath("//button[@aria-label='Expand row']");
    public static By tradedocuments_confirmation = By.xpath("//div[text()='Confirmation']");
    public static By tradedocuments_editdraft = By.xpath("//span[text()='Confirmation']//following::table[2]/tbody/tr[2]/td[7]/div/button");
    public static By tradedocuments_confirmationTransferinstr = By.xpath("//span[text()='Confirmation']//following::table[2]/tbody/tr[2]/td[4]/div/span[3]");
    public static By tradedocuments_InvoiceTransferinstr = By.xpath("//span[text()='Trade Value Date']//following::table[2]/tbody[1]/tr[2]/td[4]/div/span[3]");
    public static By tradedocuments_editinvoiceDraft = By.xpath("//span[text()='Trade Value Date']//following::table[2]/tbody[1]/tr[2]/td[7]/div/button");
    public static By tradedocuments_reviewPage = By.xpath("//span[text()='hide details']");

    public static By tradedocuments_fullreport = By.xpath("//div[text()='Full Report']");

    public static By tradedocuments_settingicon = By.xpath("//span[@aria-label='setting']");

    public static By tradedocuments_confirmbtn1 = By.xpath("(//input[@placeholder='Title']//following::span[@class='anticon anticon-check'])[1]");
    public static By tradedocuments_confirmbtn2 = By.xpath("(//input[@placeholder='Title']//following::span[@class='anticon anticon-check'])[2]");
    public static By tradedocuments_confirmbtn3 = By.xpath("(//input[@placeholder='Title']//following::span[@class='anticon anticon-check'])[3]");

    public static By tradedocuments_comments = By.xpath("//input[contains(@class,'ant-input _additional-comment')]");

    public static By tradedocuments_usermenu = By.xpath("//div[text()='User']");

    public static By tradedocuments_title = By.xpath("//input[@placeholder='Title']");
    public static By tradedocuments_subtitle = By.xpath("//input[@placeholder='Sub-title']");
    public static By tradedocuments_address = By.xpath("//textarea[@placeholder='Address']");
    public static By tradedocuments_entity = By.xpath("(//span[text()='Entity'])[1]");
    public static By tradedocuments_reviewPagecheckbox = By.xpath("//span[text()='Add Instruction ']/following::span[2]");
    public static By tradedocuments_addinstructions = By.xpath("//span[text()='Add Instruction ']");

    public static By tradedocuments_newinstructions = By.xpath("//span[text()=' New Instruction']");
    //span[text()='1 - CRYPTO (USDT)']
    public static By tradedocuments_addReview = By.xpath("//span[text()='1 - CRYPTO (USDT)']");
    public static By tradedocuments_reviewPagecheckbox2 = By.xpath("//label[@class='ant-checkbox-wrapper ant-checkbox-wrapper-in-form-item']/span[1]");
    public static By tradedocuments_reviewPagecheckbox3 = By.xpath("//input[@id='reviewAddnInstr']");
    public static By tradedocuments_addedinstruction = By.xpath("(//*[contains(@id,'review')])[2]");
    public static By tradedocuments_reviewPagecheckbox4 = By.xpath("(//span[text()='Add Instruction ']//following::label[@class='ant-checkbox-wrapper ant-checkbox-wrapper-in-form-item'])[2]");
    public static By tradedocuments_emailbtn = By.xpath("//span[text()='Prepare Email']");
    public static By tradedocuments_sender = By.xpath("//input[@id='sender']");
    public static By tradedocuments_To = By.xpath("//input[@id='recipients']//following::span[3]");
    public static By tradedocuments_CC = By.xpath("//input[@id='cc']//following::span[3]");
    public static By tradedocuments_BCC = By.xpath("//input[@id='bcc']//following::span[3]");
    public static By tradedocuments_LoadDealBtn = By.xpath("//span[text()='Load']");
    public static By tradedocuments_resetbtn = By.xpath("//span[text()='Reset Form']");

    public static By tradedocuments_mailbtn = By.xpath("//span[@aria-label='download']");
    public static By tradedocuments_closebtn = By.xpath("//button[@aria-label='Close']");
    public static By tradedocuments_Toinputfield = By.xpath("//input[@id='recipients']");
    public static By tradedocuments_sendbtn = By.xpath("//span[@aria-label='send']");
    public static By tradedocuments_generateinvoicebtn = By.xpath("//span[text()='Generate Invoice']");
    public static By tradedocuments_generateorderbtn = By.xpath("//span[text()='Generate Order']");
    public static By tradedocuments_invoiceTab = By.xpath("//div[text()='Invoice']");
    public static By tradedocuments_addcomments = By.xpath("//textarea[@id='addnInstr']");


}
