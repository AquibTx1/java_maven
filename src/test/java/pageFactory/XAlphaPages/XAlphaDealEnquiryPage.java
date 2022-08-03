package pageFactory.XAlphaPages;

import org.openqa.selenium.By;

public class XAlphaDealEnquiryPage {

    //deal Enquiry
    public static By dealEnquiryTab = By.linkText("Deal Enquiry");
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

    //deal details
    public static By dealDetail_dealRef = By.xpath("//input[@placeholder='Deal Ref']");

}
