package modules.OptimusActions;

import com.relevantcodes.extentreports.LogStatus;
import modules.XAlphaActions.XAlphaDealEnquiryActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageFactory.OptimusPages.CounterParty.OptimusCounterPartyCreatePage;
import pageFactory.OptimusPages.Instrument.InstrumentMainPage;
import pageFactory.OptimusPages.Portfolio.PortfolioMainPage;
import pageFactory.OptimusPages.Settlement.SettlementUpdatePage;
import pageFactory.XAlphaPages.XAlphaDealEnquiryPage;
import step_definitions.RunCukesTest;
import utilities.HTMLReportUtil;
import utilities.KeywordUtil;
import utilities.LogUtil;

import java.util.List;

public class OptimusInstrumentActions  extends KeywordUtil {


    static Class<OptimusInstrumentActions> thisClass = OptimusInstrumentActions.class;

    public static String newsymbol;

    public static void clickInstrumentTab() {
        click(InstrumentMainPage.Instrument_MainTab, "Clicked the Instrument  Tab");
    }

    public static void clickTokenLink() {
        click(InstrumentMainPage.Instrument_token, "Clicked the Token Token");
    }

    public static void clickNewToken() {
        click(InstrumentMainPage.Instrument_Newtoken, "Clicked the New Token");
    }


    public static void createAssetCode(String asset_code) {
        inputText(InstrumentMainPage.Instrument_assetcode, asset_code, "Asset Code is entered =" + asset_code);

    }

    public static void createAssetType(String asset_type) {
        inputText(InstrumentMainPage.Instrument_assetType, asset_type, "Select Portfolio Status=" + asset_type);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + asset_type + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + asset_type + "']"), "Asset Type selected"+asset_type);
    }

    public static void createAssetSubType(String subtype) {
        inputText(InstrumentMainPage.Instrument_assetSubType, subtype, "Select Portfolio Status=" + subtype);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + subtype + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + subtype + "']"), "Asset Sub Type selected"+subtype);

    }

    public static void createDecimalConvention(String decimal_convention) {
        inputText(InstrumentMainPage.Instrument_decimalConv, decimal_convention, "Decimal Value Entered =" + decimal_convention);

    }

    public static void createGST(String gst) {
        inputText(InstrumentMainPage.Instrument_gst, gst, "Select Portfolio Status=" + gst);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + gst + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + gst + "']"), "GST entered and  selected"+gst);

    }

    public static void createBlockchainNetwork(String blockchain_network) {
        inputText(InstrumentMainPage.Instrument_blockchainNetwork, blockchain_network, "Blockchain Network =" + blockchain_network);
    }

    public static void createYOR(String year_of_release) {
        click(InstrumentMainPage.Instrument_yearofrealese, "Click in date field and Year Selected");
        inputText(InstrumentMainPage.Instrument_yearofrealese, year_of_release, "Entered the Year "+year_of_release);
        pressEnter(InstrumentMainPage.Instrument_yearofrealese);
    }

    public static void createCountrty(String country) {
        inputText(InstrumentMainPage.Instrument_country, country, "Country Selected =" + country);

    }

    public static void createStatus(String status) {
        inputText(InstrumentMainPage.Instrument_status, status, "Select Portfolio Status=" + status);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + status + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + status + "']"), "Status selected"+status);

    }

    public static void createNotes(String notes) {
        inputText(InstrumentMainPage.Instrument_notes, notes, "Remarks Entered =" + notes);

    }

    public static void createAssetName(String asset_name) {
        inputText(InstrumentMainPage.Instrument_assetName, asset_name, "Asset Name is  Entered =" + asset_name);
    }

    public static void clickCreateInstrument() {
        click(InstrumentMainPage.Instrument_createInstrumentbtn, "Clicked the Create Button and Forwarded for Approval");
    }

    public static String getAssetCode()
    {
        String Asset_code=getElementText(By.xpath("//span[text()='Instrument Ref.']//following::tr[2]/td[5]"));
        LogUtil.infoLog(thisClass,"Asset name is ="+Asset_code);
        return  Asset_code;
    }

    public static String getInstrumentRefid() {
        return getElementValueWithVisibility(InstrumentMainPage.refid);
    }

    public static void updateAssetName(String asset_name) throws InterruptedException {
        clearInputUsingKeys(InstrumentMainPage.Instrument_updateassetName);
        inputText(InstrumentMainPage.Instrument_updateassetName, asset_name, "Update Asset Name  Entered =" + asset_name);
    }

    public static void updateAssetCode(String asset_code) throws InterruptedException {
        clearInputUsingKeys(InstrumentMainPage.Instrument_updateassetcode);
        inputText(InstrumentMainPage.Instrument_updateassetcode, asset_code, "Update Asset code  Entered =" + asset_code);

    }

    public static void updateAssetType(String asset_type) {
        inputText(InstrumentMainPage.Instrument_updateassettype, asset_type, "Select Portfolio Status=" + asset_type);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + asset_type + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + asset_type + "']"), "Asset Type selected"+asset_type);

    }

    public static void updateAssetSubType(String sub_type) {
        inputText(InstrumentMainPage.Instrument_updateassetsubtype, sub_type, "Select Portfolio Status=" + sub_type);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + sub_type + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + sub_type + "']"), "Sub Asset Type selected"+sub_type);

    }

    public static void updateDecimalConvention(String decimal_convention) throws InterruptedException {
        clearInputUsingKeys(InstrumentMainPage.Instrument_updatedecimalcon);
        inputText(InstrumentMainPage.Instrument_updatedecimalcon, decimal_convention, "Update Decimal code  Entered =" + decimal_convention);

    }

    public static void updateGST(String gst) {
        inputText(InstrumentMainPage.Instrument_updategst, gst, "Select Portfolio Status=" + gst);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + gst + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + gst + "']"), "GST Updated and  selected"+gst);

    }

    public static void updateBNetwork(String blockchain_network) throws InterruptedException {
        clearInputUsingKeys(InstrumentMainPage.Instrument_updatenetwork);
        inputText(InstrumentMainPage.Instrument_updatenetwork, blockchain_network, "Update BlockChain Network  Entered =" + blockchain_network);
    }

    public static void clickUpdateInstrument() {
        click(InstrumentMainPage.Instrument_updatebtn,"Updated the Records");
    }

    public static void deleteRecord() {
        click(InstrumentMainPage.Instrument_deletebtn,"Deleted the Records");
        waitForVisible(SettlementUpdatePage.updatesettlement_yesdeletebtn);
        click(SettlementUpdatePage.updatesettlement_yesdeletebtn,"clicked on Yes Button");
    }

    public static String getAssetName() {
        String Asset_name=getElementText(By.xpath("//span[text()='Instrument Ref.']//following::tr[2]/td[4]"));
        LogUtil.infoLog(thisClass,"Asset name available in the list ="+Asset_name);
        return  Asset_name;

    }

    public static void clickTradingInstruments() {
        waitForVisible(InstrumentMainPage.Instrument_TradingInstruments);
        click(InstrumentMainPage.Instrument_TradingInstruments,"Open Trading Instruments");
    }

    public static void clickNewTradingInstrument() {
        waitForVisible(InstrumentMainPage.Instrument_NewTradingInstrument);
        click(InstrumentMainPage.Instrument_NewTradingInstrument,"Open Trading Instruments");
    }

    public static void createExchange(String exchange) {
        inputText(InstrumentMainPage.Instrument_Exchange, exchange, "Select Exchange =" + exchange);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + exchange + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + exchange + "']"), "Exchange Type selected"+exchange);
    }

    public static void createExchangeSymbol(String exchange_symbol) {
        newsymbol=exchange_symbol+KeywordUtil.generateRandomNumber200to500();
        inputText(InstrumentMainPage.Instrument_ExchangeSymbol, newsymbol, "Select Exchange Symbol=" + exchange_symbol);

    }

    public static void createAltCoin(String alt_coin) {
        inputText(InstrumentMainPage.Instrument_AltCoin, alt_coin, "Select Exchange =" + alt_coin);
        waitForVisible(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+alt_coin+"'])[1]"));
        KeywordUtil.click(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+alt_coin+"'])[1]"), "Alt Coin Type selected"+alt_coin);
    }

    public static void createQuoteCoin(String quote_coin) {
        inputText(InstrumentMainPage.Instrument_QuoteCoin, quote_coin, "Select Exchange =" + quote_coin);
        waitForVisible(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+quote_coin+"'])[1]"));
        KeywordUtil.click(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+quote_coin+"'])[1]"), "Quote Coin Type selected"+quote_coin);
    }

    public static void createInsDerivateType(String instrument_derivative_type) {
        inputText(InstrumentMainPage.Instrument_InstrumentType, instrument_derivative_type, "Select Exchange =" + instrument_derivative_type);
        waitForVisible(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+instrument_derivative_type+"'])[1]"));
        KeywordUtil.click(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+instrument_derivative_type+"'])[1]"), "Derivative Type selected"+instrument_derivative_type);
    }

    public static void createMarginType(String margin_type) {
        inputText(InstrumentMainPage.Instrument_MarginType, margin_type, "Select Exchange =" + margin_type);
        waitForVisible(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+margin_type+"'])[1]"));
        KeywordUtil.click(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+margin_type+"'])[1]"), "Margin  Type selected"+margin_type);
    }

    public static void createDeliveryDate(String delivery_date) throws InterruptedException {
        String date=delivery_date+KeywordUtil.getCurrentDateTime();
        inputText(InstrumentMainPage.Instrument_DeliveryDate, date, "Delivery Date =" + date);
        delay(2000);

    }

    public static void createPricePrecision(String price_precision) throws InterruptedException {
        inputText(InstrumentMainPage.Instrument_PricePrecision, price_precision, "Price Precision=" + price_precision);
        delay(2000);
    }

    public static void createSizePrecision(String size_precision) throws InterruptedException {
        inputText(InstrumentMainPage.Instrument_SizePrecision, size_precision, "Size Precision=" + size_precision);
        delay(2000);
    }

    public static void createMinOrder(String min_order) throws InterruptedException {
        inputText(InstrumentMainPage.Instrument_Min_Order, min_order, "Min. Order=" + min_order);
        delay(2000);
    }

    public static void createMaxOrder(String max_ordersize) throws InterruptedException {
        inputText(InstrumentMainPage.Instrument_MaxOrderSize, max_ordersize, "Max Order Size =" + max_ordersize);
        delay(2000);
    }

    public static void createMinOrderSize(String s) {
        inputText(InstrumentMainPage.Instrument_MinOrderSize, s, "Min.Order  Size=" + s);

    }


    public static void createLotSize(String lot_size) {
        inputText(InstrumentMainPage.Instrument_LotSize, lot_size, "Lot Exchange Symbol=" + lot_size);

    }

//    public static void createMinOrderNotional(String s) {
//        inputText(InstrumentMainPage.Instrument_MinOrderSize, exchange_symbol, "Select Exchange Symbol=" + exchange_symbol);
//
//    }

    public static void createTickSize(String tick_size) {
        inputText(InstrumentMainPage.Instrument_TickSize, tick_size, "Select Exchange Symbol=" + tick_size);

    }

    public static void createMinPrice(String s) {
        inputText(InstrumentMainPage.Instrument_Min_Price, s, "Min. Price =" + s);

    }

    public static void createMaxPrice(String max_price) {
        inputText(InstrumentMainPage.Instrument_Max_Price, max_price, "Max Price =" + max_price);

    }

    public static void createContarctSize(String contract_size) {
        inputText(InstrumentMainPage.Instrument_Contract_Size,contract_size , "Contract Size =" + contract_size);

    }

    public static void createContractAsset(String contract_asset) {
        inputText(InstrumentMainPage.Instrument_ContractAsset, contract_asset, "Select Exchange =" + contract_asset);
        waitForVisible(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+contract_asset+"'])[1]"));
        KeywordUtil.click(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+contract_asset+"'])[1]"), "Contract Asset  selected"+contract_asset);

    }

    public static void createSetAsset(String settlement_asset) {
        inputText(InstrumentMainPage.Instrument_SettlementAsset, settlement_asset, "Select Exchange =" + settlement_asset);
        waitForVisible(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+settlement_asset+"'])[2]"));
        KeywordUtil.click(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+settlement_asset+"'])[2]"), "Settlement Asset selected"+settlement_asset);
    }

    public static void createTradingStatus(String status) {
        inputText(InstrumentMainPage.Instrument_Tradingstatus, status, "Select status =" + status);
        waitForVisible(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+status+"'])"));
        KeywordUtil.click(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+status+"'])"), "Status  Type selected"+status);

    }

    public static void createMinOrderNotional(String s) {
    }

    public static String getexchangeSymbol() {
        String es=getElementText(By.xpath("//span[text()='Instrument Ref.']//following::tr[2]/td[6]"));
        LogUtil.infoLog(thisClass,"Exchange Symbol entered is ="+es);
        return  es;
    }

    public static String getAltcoin() {
        String es=getElementText(By.xpath("//span[text()='Instrument Ref.']//following::tr[2]/td[7]"));
        LogUtil.infoLog(thisClass,"Exchange Symbol entered is ="+es);
        return  es;
    }

    public static void updateExchange(String exchange) {
        inputText(InstrumentMainPage.Instrument_updateExchange, exchange, "Select Exchange =" + exchange);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + exchange + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + exchange + "']"), "Exchange Type selected"+exchange);
    }

    public static void updateAltcoin(String alt_coin) {

        inputText(InstrumentMainPage.Instrument_updateAltCoin, alt_coin, "Select Exchange =" + alt_coin);
        waitForVisible(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+alt_coin+"'])[1]"));
        KeywordUtil.click(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+alt_coin+"'])[1]"), "Alt Coin Type updated"+alt_coin);

    }

    public static void updateQuoteCoin(String quote_coin) {
        inputText(InstrumentMainPage.Instrument_updateQuoteCoin, quote_coin, "Select Exchange =" + quote_coin);
        waitForVisible(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+quote_coin+"'])[1]"));
        KeywordUtil.click(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+quote_coin+"'])[1]"), "Quote Coin Type updated"+quote_coin);

    }

    public static void updateDerivateType(String instrument_derivative_type) {
        inputText(InstrumentMainPage.Instrument_updateInstrumentType, instrument_derivative_type, "Select Exchange =" + instrument_derivative_type);
        waitForVisible(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+instrument_derivative_type+"'])[1]"));
        KeywordUtil.click(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+instrument_derivative_type+"'])[1]"), "Derivative Type Updated"+instrument_derivative_type);

    }

    public static void updateMarginType(String margin_type) {
        inputText(InstrumentMainPage.Instrument_updateMarginType, margin_type, "Select Exchange =" + margin_type);
        waitForVisible(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+margin_type+"'])[1]"));
        KeywordUtil.click(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+margin_type+"'])[1]"), "Margin  Type Updated"+margin_type);


    }

    public static void updateDeliveryDate(String delivery_date) throws InterruptedException {
        clearInputUsingKeys(InstrumentMainPage.Instrument_updateDeliveryDate);
        String date=delivery_date+KeywordUtil.getCurrentDateTime();
        inputText(InstrumentMainPage.Instrument_updateDeliveryDate, date, "Updated Delivery Date is =" + date);
        delay(2000);

    }

    public static void updatePricePrecision(String price_precision) throws InterruptedException {
        clearInputUsingKeys(InstrumentMainPage.Instrument_updatePricePrecision);
        inputText(InstrumentMainPage.Instrument_updatePricePrecision, price_precision, "Update Price Precision=" + price_precision);
        delay(2000);
    }

    public static void updateSizePrecision(String size_precision) throws InterruptedException {
        clearInputUsingKeys(InstrumentMainPage.Instrument_updateSizePrecision);
        inputText(InstrumentMainPage.Instrument_updateSizePrecision, size_precision, "Updated Precision=" + size_precision);
        delay(2000);
    }

    public static void updateMinOrderSize(String min_order) throws InterruptedException {
        clearInputUsingKeys(InstrumentMainPage.Instrument_updateMinOrderSize);
        inputText(InstrumentMainPage.Instrument_updateMinOrderSize, min_order, "Updated Min. Order=" + min_order);
        delay(2000);
    }

    public static void updateMaxOrder(String max_ordersize) throws InterruptedException {
        clearInputUsingKeys(InstrumentMainPage.Instrument_updateMaxOrderSize);
        inputText(InstrumentMainPage.Instrument_updateMaxOrderSize, max_ordersize, "Updated Max Order  =" + max_ordersize);
        delay(2000);
    }

    public static void updateLotSize(String lot_size) throws InterruptedException {
        clearInputUsingKeys(InstrumentMainPage.Instrument_updateLotSize);
        inputText(InstrumentMainPage.Instrument_updateLotSize, lot_size, "Updated Lot Size =" + lot_size);

    }

    public static void updateTickSize(String tick_size) throws InterruptedException {
        clearInputUsingKeys(InstrumentMainPage.Instrument_updateTickSize);
        inputText(InstrumentMainPage.Instrument_updateTickSize, tick_size, "Updated Tick Size=" + tick_size);
    }

    public static void clickInstrument_Futures_SideTab() throws InterruptedException {
        waitForVisible(InstrumentMainPage.InstrumentFutures_SideTab);
        click(InstrumentMainPage.InstrumentFutures_SideTab,"Open Instrument Futures_SideTab");
        waitForVisible(InstrumentMainPage.instrumentFutures_Exchange_dropdown_List);
        delay(5000);
    }

    public static void search_Futures_Exchange_dropdown_List(String item) throws InterruptedException {
        waitForVisible(InstrumentMainPage.instrumentFutures_Exchange_dropdown_List);
        clearInputUsingKeys(InstrumentMainPage.instrumentFutures_Exchange_dropdown_List);
        inputText(InstrumentMainPage.instrumentFutures_Exchange_dropdown_List, item, "Search Future Exchange=" + item);
        pressEnter(InstrumentMainPage.instrumentFutures_Exchange_dropdown_List);
    }

    public static String get_Exchange_FutureSearchList() {
        waitForVisible(InstrumentMainPage.instrumentFuture_ExchangeName_List);
        String text = getElementText(InstrumentMainPage.instrumentFuture_ExchangeName_List);
        LogUtil.infoLog(thisClass, "Element text contains " +text);
        return text;
    }
    public static String get_ExchangeSymbol_FutureSearchList() {
        waitForVisible(InstrumentMainPage.instrumentFuture_ExchangeSymbol_List);
        String text = getElementText(InstrumentMainPage.instrumentFuture_ExchangeSymbol_List);
        LogUtil.infoLog(thisClass, "Element Exchange Symbol text contains " +text);
        return text;
    }

    public static void clickInstrument_TokenPrices_SideTab() throws InterruptedException {
        waitForVisible(InstrumentMainPage.instrumentTokenPrices_SideTab);
        click(InstrumentMainPage.instrumentTokenPrices_SideTab,"Open Instrument Token Prices_SideTab");
        waitForVisible(InstrumentMainPage.instrumentTokenPrices_Base_List);
//        delay(5000);
        waitForInVisibile(XAlphaDealEnquiryPage.dealEnquiry_loading);
    }

    public static void instrumentTokenPrices_SearchBase_List(String item) {
        waitForVisible(InstrumentMainPage.instrumentTokenPrices_SearchBase_List);
        inputText(InstrumentMainPage.instrumentTokenPrices_SearchBase_List, item, "Enter Search criteria in Search Base");
        waitForVisible(InstrumentMainPage.instrumentTokenPrices_Base_List);
    }

    public static void instrumentTokenPrices_SearchQuote_List(String item) {
        waitForVisible(InstrumentMainPage.instrumentTokenPrices_SearchQuote_List);
        inputText(InstrumentMainPage.instrumentTokenPrices_SearchQuote_List, item, "Enter Search criteria in Search Quote");
        waitForVisible(InstrumentMainPage.instrumentTokenPrices_Base_List);
    }

    public static void instrumentTokenPrices_SearchDate_List(String date) throws InterruptedException {
        waitForVisible(InstrumentMainPage.instrumentTokenPrices_Base_List);
        clearInputUsingKeys(InstrumentMainPage.instrumentTokenPrices_SearchStartDate_List);
        inputText(InstrumentMainPage.instrumentTokenPrices_SearchStartDate_List, date, "Enter Search criteria in Start Date");
        pressEnter(InstrumentMainPage.instrumentTokenPrices_SearchStartDate_List);

        clearInputUsingKeys(InstrumentMainPage.instrumentTokenPrices_SearchEndDate_List);
        inputText(InstrumentMainPage.instrumentTokenPrices_SearchEndDate_List, date, "Enter Search criteria in End Date");
        pressEnter(InstrumentMainPage.instrumentTokenPrices_SearchEndDate_List);
        delay(10000);
        waitForVisible(InstrumentMainPage.instrumentTokenPrices_Base_List);
    }

    public static void instrumentTokenPrices_SearchTime_List(String time) throws InterruptedException {
        delay(10000);
        waitForVisible(InstrumentMainPage.instrumentTokenPrices_Base_List);
        click(InstrumentMainPage.instrumentTokenPrices_SearchTime_List, "Clicking Time box");
        inputText(InstrumentMainPage.instrumentTokenPrices_SearchTimeInput_List, time, "Enter Search criteria in Time");
        delay(3000);
        pressEnter(InstrumentMainPage.instrumentTokenPrices_SearchTimeInput_List);
        pressTabKey(InstrumentMainPage.instrumentTokenPrices_SearchTimeInput_List);
        waitForVisible(InstrumentMainPage.instrumentTokenPrices_Base_List);
    }

    public static void clearSearchTime() throws InterruptedException {
        List<WebElement> clearTime = getListElements(InstrumentMainPage.instrumentTokenPrices_ClearSearchTime_List, 2, "Clearing time");
        for (WebElement element : clearTime) {
            element.click();
        }
    }
    public static void clickReload() throws InterruptedException {
        click(InstrumentMainPage.instrumentTokenPrices_Reload_List, "Clicking Reload");
        XAlphaDealEnquiryActions.waitForLoadingIconToAppearAndDisappear();
        delay(70000);
    }
    public static String get_Base_TokenPriceSearchList() throws InterruptedException {
        delay(3000);
        waitForVisible(InstrumentMainPage.instrumentTokenPrices_Quote_List);
        String text = getElementText(InstrumentMainPage.instrumentTokenPrices_Base_List);
        LogUtil.infoLog(thisClass, "Base Value text contains " +text);
        return text;
    }

    public static String get_Quote_TokenPriceSearchList() {
        waitForVisible(InstrumentMainPage.instrumentTokenPrices_Quote_List);
        String text = getElementText(InstrumentMainPage.instrumentTokenPrices_Quote_List);
        LogUtil.infoLog(thisClass, "Quote Value text contains " +text);
        return text;
    }
    public static String get_DateTime_TokenPriceSearchList() throws InterruptedException {
        clickReload();
        waitForVisible(InstrumentMainPage.instrumentTokenPrices_Date_List);
        String text = getElementText(InstrumentMainPage.instrumentTokenPrices_Date_List);
        LogUtil.infoLog(thisClass, "Date time Value text contains " +text);
        return text;
    }
    public static void verifyDownloadCSVBtn() {
        waitForClickable(InstrumentMainPage.instrumentTokenPrices_DownloadCSVBtn_List);
        RunCukesTest.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringGreyColor("Download CSV button is enabled and clickable"));
    }

    public static void clickInstrument_FiatPrices_SideTab() throws InterruptedException {
        waitForVisible(InstrumentMainPage.instrument_FiatPrices_SideTab);
        click(InstrumentMainPage.instrument_FiatPrices_SideTab,"Open Instrument Token Prices_SideTab");
        waitForVisible(InstrumentMainPage.instrumentTokenPrices_Base_List);
    }


    public static void clickInstrument_PriceAlert_SideTab() throws InterruptedException {
        waitForVisible(InstrumentMainPage.instrument_PriceAlert_SideTab);
        click(InstrumentMainPage.instrument_PriceAlert_SideTab,"Open Instrument Prices Alert_SideTab");
        waitForVisible(InstrumentMainPage.instrument_PriceAlert_AutoManual_Switch);
    }

    public static void clickInstrument_PriceAlert_Arbitrage_tab() throws InterruptedException {
        waitForVisible(InstrumentMainPage.instrument_PriceAlert_Arbitrage_tab);
        click(InstrumentMainPage.instrument_PriceAlert_Arbitrage_tab,"Open Instrument instrument_PriceAlert_Arbitrage_tab");
        waitForVisible(InstrumentMainPage.instrument_PriceAlert_Arbitrage_tab);
    }

    public static void instrument_PriceAlert_AutoManual_SwitchToAuto() throws InterruptedException {
        waitForVisible(InstrumentMainPage.instrument_PriceAlert_AutoManual_Switch);
        while(getElementText(InstrumentMainPage.instrument_PriceAlert_AutoManual_Switch) == "Auto") {
            click(InstrumentMainPage.instrument_PriceAlert_AutoManual_Switch, "Open Instrument instrument_PriceAlert_Arbitrage_tab");
            waitForVisible(InstrumentMainPage.instrument_PriceAlert_Arbitrage_tab);
        }
    }

    public static void instrument_PriceAlert_AutoManual_SwitchToManual(String switchTo) throws InterruptedException {
        waitForVisible(InstrumentMainPage.instrument_PriceAlert_AutoManual_Switch);
        String text = getElementText(InstrumentMainPage.instrument_PriceAlert_AutoManual_Switch);
        while(!text.equalsIgnoreCase(switchTo)) {
            click(InstrumentMainPage.instrument_PriceAlert_AutoManual_Switch, "Click switch to " +switchTo);
            waitForVisible(InstrumentMainPage.instrument_PriceAlert_Arbitrage_tab);
            text = getElementText(InstrumentMainPage.instrument_PriceAlert_AutoManual_Switch);
        }
    }

    public static String get_Instrument_ArbitragePriceAlert_SwitchValue() throws InterruptedException {
        waitForVisible(InstrumentMainPage.instrument_PriceAlert_AutoManual_Switch);
        return getElementText(InstrumentMainPage.instrument_PriceAlert_AutoManual_Switch);
    }

    public static void click_Instrument_PriceAlert_UpdateNow() throws InterruptedException {
        waitForVisible(InstrumentMainPage.instrument_PriceAlert_UpdateNow);
        delay(2000);
        click(InstrumentMainPage.instrument_PriceAlert_UpdateNow, "Click Update Now Button");
        delay(2000);
        click(InstrumentMainPage.instrument_PriceAlert_UpdateNow, "Click Update Now Button");
    }

    public static void check_Instrument_PriceAlert_UpdateNow_State() throws InterruptedException {
//        waitForInVisibile(InstrumentMainPage.instrument_PriceAlert_UpdateNow);
        XAlphaDealEnquiryActions.waitForLoadingIconToAppearAndDisappear();
        waitForVisible(InstrumentMainPage.instrument_PriceAlert_UpdateNow);
        LogUtil.infoLog(thisClass,"Update Now button is Visible");
    }

    public static void open_Instrument_PriceAlert_ArbitrageThreshold() {
        waitForVisible(InstrumentMainPage.instrument_PriceAlert_ArbitrageThresholds);
        click(InstrumentMainPage.instrument_PriceAlert_ArbitrageThresholds, "Click Arbitrage Threshhold to open its modal");
    }

}