package pageFactory.OptimusPages.Instrument;

import org.openqa.selenium.By;

public class InstrumentMainPage {

    public static By Instrument_MainTab = By.xpath("//a[text()='Instrument']");

    public static By Instrument_token = By.xpath("//a[text()='Tokens']");

    public static By Instrument_Newtoken = By.xpath("//span[text()='New Token']");

    public static By Instrument_assetName= By.id("create_instrument_asset_name");

    //Update Details
    public static By Instrument_updateassetName= By.id("update_instrument_asset_name");
    public static By Instrument_updateassetcode= By.id("update_instrument_asset_code");
    public static By Instrument_updateassetsubtype= By.id("update_instrument_asset_sub_type");
    public static By Instrument_updateassettype= By.id("update_instrument_asset_type");
    public static By Instrument_updatedecimalcon= By.id("update_instrument_decimal_convention");
    public static By Instrument_updatenetwork= By.id("update_instrument_blockchain_network");
    public static By Instrument_updatebtn= By.xpath("//span[text()='Update Instrument']");
    public static By Instrument_deletebtn= By.xpath("//span[text()='Delete Instrument']");
    public static By refid=By.id("update_instrument_instrument_ref");

    public static By Instrument_updategst= By.id("update_instrument_gst");
    public static By Instrument_assetcode= By.id("create_instrument_asset_code");
    public static By Instrument_assetType= By.id("create_instrument_asset_type");
    public static By Instrument_assetSubType= By.id("create_instrument_asset_sub_type");
    public static By Instrument_decimalConv= By.id("create_instrument_decimal_convention");
    public static By Instrument_gst= By.id("create_instrument_gst");
    public static By Instrument_blockchainNetwork= By.id("create_instrument_blockchain_network");
    public static By Instrument_country= By.id("create_instrument_country");
    public static By Instrument_status= By.id("create_instrument_status");
    public static By Instrument_notes= By.id("create_instrument_notes");
    public static By Instrument_yearofrealese= By.id("create_instrument_year_of_release_moment");
    public static By Instrument_createInstrumentbtn= By.xpath("//span[text()='Create Instrument']");

    //Trading Instruments
    public static By Instrument_TradingInstruments= By.xpath("//a[text()='Trading Instruments']");
    public static By Instrument_NewTradingInstrument= By.xpath("//span[text()='New Trading Instrument']");
    public static By Instrument_Exchange= By.id("create_instrument_exchange_id");
    public static By Instrument_updateExchange= By.id("update_instrument_exchange_id");

    public static By Instrument_ExchangeSymbol= By.id("create_instrument_exchange_symbol");
    public static By Instrument_AltCoin= By.id("create_instrument_alt_coin");
    public static By Instrument_updateAltCoin= By.id("update_instrument_alt_coin");

    public static By Instrument_QuoteCoin= By.id("create_instrument_quote_coin");
    public static By Instrument_updateQuoteCoin= By.id("update_instrument_quote_coin");
    public static By Instrument_InstrumentType= By.id("create_instrument_instrument_type");
    public static By Instrument_updateInstrumentType= By.id("update_instrument_instrument_type");
    public static By Instrument_MarginType= By.id("create_instrument_margin_type");
    public static By Instrument_updateMarginType= By.id("update_instrument_margin_type");
    public static By Instrument_DeliveryDate= By.id("create_instrument_delivery_date");
    public static By Instrument_updateDeliveryDate= By.id("update_instrument_delivery_date");
    public static By Instrument_PricePrecision= By.id("create_instrument_price_precision");
    public static By Instrument_updatePricePrecision= By.id("update_instrument_price_precision");
    public static By Instrument_SizePrecision= By.id("create_instrument_size_precision");
    public static By Instrument_updateSizePrecision= By.id("update_instrument_size_precision");
    public static By Instrument_MinOrderSize= By.id("create_instrument_min_order_size");
    public static By Instrument_updateMinOrderSize= By.id("update_instrument_min_order_size");

    public static By Instrument_MaxOrderSize= By.id("create_instrument_max_order_size");
    public static By Instrument_updateMaxOrderSize= By.id("update_instrument_max_order_size");
    public static By Instrument_LotSize= By.id("create_instrument_lot_size");
    public static By Instrument_updateLotSize= By.id("update_instrument_lot_size");
    public static By Instrument_TickSize= By.id("create_instrument_tick_size");
    public static By Instrument_updateTickSize= By.id("update_instrument_tick_size");
    public static By Instrument_Min_Order= By.id("create_instrument_min_order_notional");
    public static By Instrument_Max_Order= By.id("create_instrument_max_num_orders");
    public static By Instrument_Min_Price= By.id("create_instrument_min_price");
    public static By Instrument_Max_Price= By.id("create_instrument_max_price");
    public static By Instrument_Contract_Size= By.id("create_instrument_contract_size");
    public static By Instrument_ContractAsset= By.id("create_instrument_contract_asset");
    public static By Instrument_SettlementAsset= By.id("create_instrument_settlement_asset");
    public static By Instrument_Tradingstatus= By.id("create_instrument_status");
    public static By Instrument_Tradingnotes= By.id("create_instrument_notes");

    public static By InstrumentFutures_SideTab = By.xpath("//span/a[text()='Futures']");
    public static By instrumentFutures_Exchange_dropdown_List = By.id("exchange_list");
    public static By instrumentFuture_ExchangeName_List = By.xpath("//tbody/tr[2]/td[1]");
    public static By instrumentFuture_ExchangeSymbol_List = By.xpath("//tbody/tr[2]/td[3]");
    public static By instrumentTokenPrices_SideTab = By.xpath("//ul/li/span/a[contains(text(),'Token Prices')]");
    public static By instrumentTokenPrices_SearchBase_List = By.xpath("//input[@placeholder='search base']");
    public static By instrumentTokenPrices_SearchQuote_List = By.xpath("//input[@placeholder='search quote']");
    public static By instrumentTokenPrices_SearchStartDate_List = By.xpath("//input[@placeholder='Start date']");
    public static By instrumentTokenPrices_SearchEndDate_List = By.xpath("//input[@placeholder='End date']");
    public static By instrumentTokenPrices_SearchTime_List = By.xpath("//div[@class='ant-select-selection-search']/input[@aria-autocomplete='list'][@class='ant-select-selection-search-input']//parent::div//parent::div//parent::div[@class='ant-select-selection-overflow']//parent::div[@class='ant-select-selector']");
    public static By instrumentTokenPrices_SearchTimeInput_List = By.xpath("(//input[@class='ant-select-selection-search-input'])[1]");
    public static By instrumentTokenPrices_ClearSearchTime_List = By.xpath("//span[@aria-label='close']");

    public static By  instrumentTokenPrices_Reload_List = By.xpath("//button/span[@class='anticon anticon-reload']");
    public static By instrumentTokenPrices_Base_List = By.xpath("//tbody/tr[2]/td[1]");
    public static By instrumentTokenPrices_Quote_List = By.xpath("//tbody/tr[2]/td[2]");
    public static By instrumentTokenPrices_Date_List = By.xpath("//tbody/tr[2]/td[4]");
    public static By instrumentTokenPrices_DownloadCSVBtn_List = By.xpath("//button/span[contains(text(),'Download CSV')]");


    public static By instrument_FiatPrices_SideTab = By.xpath("//ul/li/span/a[contains(text(),'Fiat Prices')]");

    public static By instrument_PriceAlert_SideTab = By.xpath("//ul/li/span/a[contains(text(),'Price Alert')]");
    public static By instrument_PriceAlert_Arbitrage_tab = By.xpath("//div[@class='ant-tabs-nav-list']/div[1]/div[contains(text(),'Arbitrage')]");
    public static By instrument_PriceAlert_AutoManual_Switch = By.xpath("//div[@class='ant-space ant-space-horizontal ant-space-align-center']/div[1]/button[@role='switch']/span");
    public static By instrument_PriceAlert_UpdateNow = By.xpath("//div[@class='ant-space ant-space-horizontal ant-space-align-center']/div[2]/button/span[contains(text(),'Update Now')]");
    public static By instrument_PriceAlert_ArbitrageThresholds = By.xpath("//div[@class='ant-space ant-space-horizontal ant-space-align-center']/div[3]/button/span");
    public static By instrument_PriceAlert_ArbitrageThresholds_Modal = By.cssSelector(".ant-modal-content > div.ant-modal-header");
    public static By instrument_PriceAlert_ArbitrageThresholds_ModalCancel = By.xpath("//button/span[contains(text(),'Cancel')]");
    public static By instrument_PriceAlert_Price_SubTab = By.xpath("//div[@class='ant-tabs-nav-list']/div[2]/div[contains(text(),'Price')]");
    public static By instrumentPriceAlert_Price_Create = By.xpath("//div[@class='ant-tabs-content-holder']/div[1]/div[2]/button[@type='button']/span[contains(text(),'Create')]");
    public static By instrumentPriceAlert_Price_SearchBox = By.xpath("//input[@id='filterForm_search']");
    public static By instrumentPriceAlert_Price_Reset = By.xpath("(//button/span[contains(text(),'Reset')])[1]");
    public static By instrumentPriceAlert_Price_Delete = By.xpath("(//tbody/tr[2]/td[7]/div/div/button/span[contains(text(),'Delete')])[1]");
    public static By instrumentPriceAlert_Price_Delete_YesBtn = By.xpath("//div[@class='ant-popover ant-popconfirm ant-popover-placement-right ']/div/div[2]/div/div[2]/button/span[text()='Yes']");
    public static By instrumentPriceAlert_Balance_Delete_YesBtn = By.xpath("//div[@class='ant-popover-content']/div[2]/div/div[2]/button[2]");

    public static By instrumentPriceAlert_Price_Pair_List = By.xpath("(//tbody/tr[2]/td[3])[2]");
    public static By instrumentPriceAlert_Price_Comment_List = By.xpath("(//tbody/tr[2]/td[6])[2]");

    public static By instrumentPriceAlert_Price_Modal = By.className("ant-modal");
    public static By instrumentPriceAlert_Price_Exchange = By.id("create_alert_exchange");
    public static String instrumentPriceAlert_Price_Exchange_Options = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";

    public static By instrumentPriceAlert_Price_Pair = By.id("create_alert_pair");
    public static By instrumentPriceAlert_Price_IsItAMagicPair = By.id("create_alert_is_magic_pair");
    public static String instrumentPriceAlert_Price_IsItAMagicPair_Options = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By instrumentPriceAlert_Price_Operator = By.id("create_alert_mode");
    public static String instrumentPriceAlert_Price_Operator_Options = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By instrumentPriceAlert_Price_Price = By.id("create_alert_price");
    public static By instrumentPriceAlert_Price_Comment = By.id("create_alert_comment");
    public static By instrumentPriceAlert_Price_Submit = By.xpath("//button[@type='submit']");


    public static By instrument_PriceAlert_Balance = By.xpath("//div[@class='ant-tabs-nav-list']/div[3]/div[contains(text(),'Balance')]");
    public static By instrumentPriceAlert_Balance_Create = By.xpath("//div[@class='ant-tabs-content-holder']/div[1]/div[3]/button[@type='button']/span[contains(text(),'Create')]");
    public static By instrumentPriceAlert_Balance_Create_popUp = By.xpath("(//div[@class='ant-modal'][@role='document'])[2]");

    public static By instrumentPriceAlert_Balance_AccountID_SearchBox = By.id("filter_data_account_ids");
    public static String instrumentPriceAlert_Balance_AccountID_SearchBox_Options = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By instrumentPriceAlert_Balance_DataAsset_SearchBox = By.id("filter_data_assets");
    public static String instrumentPriceAlert_Balance_DataAsset_SearchBox_Options = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By instrumentPriceAlert_Balance_Reset = By.cssSelector("#filter_data > button > span");
//    public static By instrumentPriceAlert_Balance_AccountID_List = By.xpath("//div[@class='ant-tabs-content-holder']/div/div[3]/div/div/div/div/div[@class='ant-table-container']/div[2]/table/tbody/tr[2]/td[1]");
//    public static By instrumentPriceAlert_Balance_AccountName_List = By.xpath("//div[@class='ant-tabs-content-holder']/div/div[3]/div/div/div/div/div[@class='ant-table-container']/div[2]/table/tbody/tr[2]/td[2]");
    public static By instrumentPriceAlert_Balance_Delete_List = By.xpath("//div[@class='ant-tabs-content-holder']/div/div[3]/div/div/div/div/div[@class='ant-table-container']/div[2]/table/tbody/tr[2]/td[7]/div");

    public static By instrumentPriceAlert_Balance_Account_Create = By.id("create_alert_account_id");
    public static String instrumentPriceAlert_Balance_Account_Create_Options = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By instrumentPriceAlert_Balance_Asset_Create = By.id("create_alert_asset");
    public static String instrumentPriceAlert_Balance_Asset_Create_Options = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By instrumentPriceAlert_Balance_AssetStatus_Create = By.xpath("//div[@class='ant-select-selector']/span[@class='ant-select-selection-item']");
    public static By instrumentPriceAlert_Balance_Operator_Create = By.id("create_alert_opr");
    public static String instrumentPriceAlert_Balance_Operator_Create_Options = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By instrumentPriceAlert_Balance_Amount_Create = By.id("create_alert_amount");
    public static By instrumentPriceAlert_Balance_Comment_Create = By.id("create_alert_comment");
    public static By instrument_PriceAlert_Balance_Table_ID_Sort = By.xpath("(//span[@aria-label='caret-down'][@class='anticon anticon-caret-down ant-table-column-sorter-down active'])[2]");

    public static By instrumentPriceAlert_Balance_Account_List = By.xpath("(//tbody/tr[2]/td[2])[2]");

    public static By instrumentPriceAlert_Balance_Asset_List = By.xpath("(//tbody/tr[2]/td[3])[2]");
    public static By instrumentPriceAlert_Balance_Comment_List = By.xpath("//main/div/div[2]/div/div[3]/div[@class='ant-table-wrapper']/div/..//div[@class='ant-table-body']/table/tbody/tr[2]/td[6]");


    //Manual Prices
    public static By instrument_ManualPrices_SideTab = By.xpath("//ul/li/span/a[contains(text(),'Manual Prices')]");
    public static By instrument_ManualPrices_Base_Search = By.xpath("//main/div[@class='ant-row']/div[1]/div/div/div/div/div/input");
    public static By instrument_ManualPrices_Quote_Search = By.xpath("//main/div[@class='ant-row']/div[2]/div/div/div/div/div/input");
    public static By instrument_ManualPrices_StartDate_Search = By.xpath("//input[@placeholder='Start Date']");
    public static By instrument_ManualPrices_EndDate_Search = By.xpath("//input[@placeholder='End Date']");
    public static By instrument_ManualPrices_Reset_Search = By.xpath("//button/span[@aria-label='clear']");
    public static By instrument_ManualPrices_Base_List = By.xpath("//tbody/tr[2]/td[2]");
    public static By instrument_ManualPrices_Quote_List = By.xpath("//tbody/tr[2]/td[3]");
    public static By instrument_ManualPrices_Price_List = By.xpath("//tbody/tr[2]/td[4]");
    public static By instrument_ManualPrices_Date_List = By.xpath("//tbody/tr[2]/td[5]");

//    Create
    public static By instrument_ManualPrices_Create = By.xpath("//button[@type='button']/span[@class='anticon anticon-plus']");

    public static By instrument_ManualPrices_Edit = By.xpath("//tbody/tr[2]/td[1]/button/span[@class='anticon anticon-edit']");
    public static By instrument_ManualPrices_Delete = By.xpath("//tbody/tr[2]/td/button/span[@aria-label='delete']");
    public static By instrument_ManualPrices_Create_Modal = By.className("ant-modal-content");


    public static By instrument_ManualPrices_Create_Base = By.xpath("//div[@class='ant-modal-body']/form/div/div/div/div[2]/..//input[@id='base']");

    public static By instrument_ManualPrices_Create_Quote = By.xpath("//input[@id='quote']");
    public static By instrument_ManualPrices_Create_Date = By.xpath("//input[@id='date']");
    public static By instrument_ManualPrices_Create_Price = By.xpath("//input[@id='price']");
    public static By instrument_ManualPrices_Create_OK = By.xpath("//button/span[text()='OK']");


//OPTION INSTRUMENTS TAB

    public static By instrument_OptionInstrumentTab = By.xpath("//a[text()='Option Instruments']");

    public static By instrument_NewOptionTradingInstrument = By.xpath("//span[text()='New Option Trading Instrument']");
    public static By instrument_OptionInstruments_InstrumentName = By.id("instrument_name");

    public static By instrument_OptionInstruments_OptionType = By.id("option_type");

    public static String instrument_OptionInstruments_OptionType_Options= "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By instrument_OptionInstruments_Strike = By.id("strike");
    public static By instrument_OptionInstruments_StrikeType = By.id("strike_type");
    public static String instrument_OptionInstruments_StrikeType_Options= "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By instrument_OptionInstruments_Notional = By.id("notional");
    public static By instrument_OptionInstruments_NotionalType= By.id("notional_type");
    public static String instrument_OptionInstruments_NotionalType_Options= "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By instrument_OptionInstruments_Expiry = By.id("expiry_moment");
    public static By instrument_OptionInstruments_Expiryhour= By.id("expiry_hour_utc");
    public static By instrument_OptionInstruments_ManualBidVol= By.id("manual_bid_vol");
    public static By instrument_OptionInstruments_ManualOfferVol = By.id("manual_offer_vol");
    public static By instrument_OptionInstruments_ManualSpot= By.id("manual_spot_px");
    public static By instrument_OptionInstruments_DriftVol= By.id("drift_vol");
    public static By instrument_OptionInstruments_Symbol = By.id("symbol");
    public static String instrument_OptionInstruments_Symbol_Options= "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By instrument_OptionInstruments_Structure= By.id("structure");
    public static By instrument_OptionInstruments_Spreadpctbid = By.id("spread_pct_bid");
    public static By instrument_OptionInstruments_Spreadoffer= By.id("spread_pct_offer");








}
