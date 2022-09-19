package step_definitions.Optimus.Instrument;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import modules.OptimusActions.OptimusInstrumentActions;
import modules.OptimusActions.OptimusSettlementActions;
import org.testng.Assert;
import pageFactory.OptimusPages.Instrument.InstrumentMainPage;
import pageFactory.OptimusPages.Settlement.SettlementMainPage;
import step_definitions.BaseStepDefinitions;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

import javax.naming.directory.SearchControls;
import java.util.HashMap;
import java.util.Random;

import static utilities.KeywordUtil.*;

public class OptimusInstrumentSteps {

    public static HashMap<String, String> dataMap;

    public static String refid_instrument;
    public static String PriceAlertItem;
    public static String BalanceAlertItem, balanceText;

    public OptimusInstrumentSteps() {
        dataMap = BaseStepDefinitions.dataMap;
    }

    @And("Open the Instrument Tab")
    public void openTheInstrumentTab() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(InstrumentMainPage.Instrument_MainTab);
                OptimusInstrumentActions.clickInstrumentTab();

            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Click the Tokens link")
    public void clickTheTokensLink() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(InstrumentMainPage.Instrument_token);
                OptimusInstrumentActions.clickTokenLink();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }
    @And("Enter All the field detail")
    public void enterAllTheFieldDetail() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(InstrumentMainPage.Instrument_assetName);
                OptimusInstrumentActions.createAssetName(dataMap.get("Asset Name"));
                OptimusInstrumentActions.createAssetCode(dataMap.get("Asset Code"));
                OptimusInstrumentActions.createAssetType(dataMap.get("Asset Type"));
                OptimusInstrumentActions.createAssetSubType(dataMap.get("Asset Sub-Type"));
                OptimusInstrumentActions.createDecimalConvention(dataMap.get("Decimal Convention"));
                OptimusInstrumentActions.createGST(dataMap.get("GST"));
                OptimusInstrumentActions.createBlockchainNetwork(dataMap.get("Blockchain Network"));
                OptimusInstrumentActions.createYOR(dataMap.get("Year of Release"));
                OptimusInstrumentActions.createCountrty(dataMap.get("Country"));
                OptimusInstrumentActions.createStatus(dataMap.get("Status"));
                OptimusInstrumentActions.createNotes(dataMap.get("Notes"));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }
    @And("Click Create Instrument")
    public void clickCreateInstrument() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.clickCreateInstrument();
                OptimusSettlementActions.waitForSuccessMsgToAppear();
               // OptimusSettlementActions.waitForSuccessMsgToDisappear();

            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }
    @And("Open New Token")
    public void openNewToken() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(InstrumentMainPage.Instrument_Newtoken);
                OptimusInstrumentActions.clickNewToken();

            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Navigate to Instrument Task")
    public void navigateToInstrumentTask() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(SettlementMainPage.newSettlement_inputsearchtext);
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }

    }

    @And("Input the Asset")
    public void inputTheAsset() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.inputValue(refid_instrument);
                OptimusSettlementActions.selectSettlementCheckbox();
                waitForVisible(SettlementMainPage.newSettlement_selectAll);
                OptimusSettlementActions.selectAllSettlementbtn();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }
    @And("Approve the Asset created")
    public void approveTheAssetCreated() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.selectApprovebtn();
                OptimusSettlementActions.waitForSuccessMsgToAppear();
                OptimusSettlementActions.waitForSuccessMsgToDisappear();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Verify the Token Created")
    public void verifyTheTokenCreated() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(InstrumentMainPage.Instrument_token);
                OptimusInstrumentActions.clickTokenLink();
                waitForVisible(SettlementMainPage.newSettlement_edit);
                OptimusSettlementActions.sortSettlementRef();
                OptimusSettlementActions.inputValue(dataMap.get("Asset Code"));
                Assert.assertEquals(OptimusInstrumentActions.getAssetCode(),dataMap.get("Asset Code"));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }
    @And("Edit the Existing fields")
    public void editTheExistingFields() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(SettlementMainPage.newSettlement_edit);
                OptimusSettlementActions.clickEditSettlement();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }

    }

    @And("Click Update Instrument")
    public void clickUpdateInstrument() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(InstrumentMainPage.refid);
                refid_instrument = OptimusInstrumentActions.getInstrumentRefid();
                OptimusInstrumentActions.updateAssetName(dataMap.get("Asset Name"));
                OptimusInstrumentActions.updateAssetCode(dataMap.get("Asset Code"));
                OptimusInstrumentActions.updateAssetType(dataMap.get("Asset Type"));
                OptimusInstrumentActions.updateAssetSubType(dataMap.get("Asset Sub-Type"));
                OptimusInstrumentActions.updateDecimalConvention(dataMap.get("Decimal Convention"));
                OptimusInstrumentActions.updateGST(dataMap.get("GST"));
                OptimusInstrumentActions.updateBNetwork(dataMap.get("Blockchain Network"));
                OptimusInstrumentActions.clickUpdateInstrument();
                OptimusSettlementActions.waitForSuccessMsgToAppear();
                OptimusSettlementActions.waitForSuccessMsgToDisappear();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Verify the Token Updated")
    public void verifyTheTokenUpdated() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(InstrumentMainPage.Instrument_token);
                OptimusInstrumentActions.clickTokenLink();
                waitForVisible(SettlementMainPage.newSettlement_edit);
                OptimusSettlementActions.sortSettlementRef();
                OptimusSettlementActions.inputValue(refid_instrument);
                Assert.assertEquals(OptimusInstrumentActions.getAssetCode(),dataMap.get("Asset Code"));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Search the Instrument to be Updated")
    public void searchTheInstrumentToBeUpdated() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.inputValue(dataMap.get("Asset Name"));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Search the Instrument to be deleted")
    public void searchTheInstrumentToBeDeleted() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.inputValue(dataMap.get("Asset Code"));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Click delete Instrument")
    public void clickDeleteInstrument() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(InstrumentMainPage.refid);
                refid_instrument = OptimusInstrumentActions.getInstrumentRefid();
                OptimusInstrumentActions.deleteRecord();
                OptimusSettlementActions.waitForSuccessMsgToAppear();
                OptimusSettlementActions.waitForSuccessMsgToDisappear();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Verify the Token Deleted")
    public void verifyTheTokenDeleted() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(InstrumentMainPage.Instrument_token);
                OptimusInstrumentActions.clickTokenLink();
                waitForVisible(SettlementMainPage.newSettlement_edit);
                OptimusSettlementActions.sortSettlementRef();
                OptimusSettlementActions.inputValue(refid_instrument);
                Assert.assertEquals(OptimusSettlementActions.getNoData(),"No Data");

            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Input the Asset Code")
    public void inputTheAssetCode() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.inputValue(dataMap.get("Asset Code"));
                OptimusSettlementActions.selectSettlementCheckbox();
                waitForVisible(SettlementMainPage.newSettlement_selectAll);
                OptimusSettlementActions.selectAllSettlementbtn();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }
    @And("Search the existing Instrument")
    public void searchTheExistingInstrument() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(SettlementMainPage.newSettlement_edit);
                OptimusSettlementActions.inputValue(dataMap.get("Asset Name"));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @Then("Verify the Instrument")
    public void verifyTheInstrument() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                Assert.assertEquals(OptimusInstrumentActions.getAssetName(),dataMap.get("Asset Name"));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Click the Trading Instrument")
    public void clickTheTradingInstrument() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.clickTradingInstruments();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Open New Trading Instrument")
    public void openNewTradingInstrument() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.clickNewTradingInstrument();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Enter the details in Trading Instrument")
    public void enterTheDetailsInTradingInstrument() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.createExchange(dataMap.get("Exchange"));
                OptimusInstrumentActions.createExchangeSymbol(dataMap.get("Exchange Symbol"));
                OptimusInstrumentActions.createAltCoin(dataMap.get("Alt Coin"));
                OptimusInstrumentActions.createQuoteCoin(dataMap.get("Quote Coin"));
                OptimusInstrumentActions.createInsDerivateType(dataMap.get("Instrument Derivative Type"));
                OptimusInstrumentActions.createMarginType(dataMap.get("Margin Type"));
                OptimusInstrumentActions.createDeliveryDate(dataMap.get("Delivery Date"));
                OptimusInstrumentActions.createPricePrecision(dataMap.get("Price Precision"));
                OptimusInstrumentActions.createSizePrecision(dataMap.get("Size Precision"));
                OptimusInstrumentActions.createMinOrderSize(dataMap.get("Min. Order Size"));
                OptimusInstrumentActions.createMaxOrder(dataMap.get("Max. Order Size"));
                OptimusInstrumentActions.createLotSize(dataMap.get("Lot Size"));
                OptimusInstrumentActions.createTickSize(dataMap.get("Tick Size"));
                //OptimusInstrumentActions.createMinOrderNotional(dataMap.get("Min. Order Notional"));
                OptimusInstrumentActions.createMaxOrder(dataMap.get("Max. Orders"));
                OptimusInstrumentActions.createMinPrice(dataMap.get("Min. Price"));
                OptimusInstrumentActions.createMaxPrice(dataMap.get("Max. Price"));
                OptimusInstrumentActions.createContarctSize(dataMap.get("Contract Size"));
                OptimusInstrumentActions.createContractAsset(dataMap.get("Contract Asset"));
                OptimusInstrumentActions.createSetAsset(dataMap.get("Settlement Asset"));
                OptimusInstrumentActions.createTradingStatus(dataMap.get("Status"));

            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Input the Exchange value")
    public void inputTheExchangeValue() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.inputValue(OptimusInstrumentActions.newsymbol);
                OptimusSettlementActions.selectSettlementCheckbox();
                waitForVisible(SettlementMainPage.newSettlement_selectAll);
                OptimusSettlementActions.selectAllSettlementbtn();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }

    }

    @And("Verify the Trading Instrument Approved")
    public void verifyTheTradingInstrumentApproved() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(SettlementMainPage.newSettlement_edit);
                OptimusSettlementActions.sortSettlementRef();
                OptimusSettlementActions.inputValue(OptimusInstrumentActions.newsymbol);
                Assert.assertEquals(OptimusInstrumentActions.getexchangeSymbol(),OptimusInstrumentActions.newsymbol);
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }

    }

    @And("Approve the Task")
    public void approveTheTask() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.selectSettlementCheckbox();
                waitForVisible(SettlementMainPage.newSettlement_selectAll);
                OptimusSettlementActions.selectAllSettlementbtn();
                OptimusSettlementActions.selectApprovebtn();

            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Wait for sometime")
    public void waitForSometime() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                delay(40000);
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
        }
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }
    }

    @And("Search the Exchange Symbol to be Updated")
    public void searchTheExchangeSymbolToBeUpdated() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.inputValue(dataMap.get("Exchange Symbol"));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
        }
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }
    }

    @And("Update existing Trading Instrument fields")
    public void updateExistingTradingInstrumentFields() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(InstrumentMainPage.refid);
                refid_instrument = OptimusInstrumentActions.getInstrumentRefid();
                OptimusInstrumentActions.updateExchange(dataMap.get("Exchange"));
                OptimusInstrumentActions.updateAltcoin(dataMap.get("Alt Coin"));
                OptimusInstrumentActions.updateQuoteCoin(dataMap.get("Quote Coin"));
                OptimusInstrumentActions.updateDerivateType(dataMap.get("Instrument Derivative Type"));
                OptimusInstrumentActions.updateMarginType(dataMap.get("Margin Type"));
                OptimusInstrumentActions.updateDeliveryDate(dataMap.get("Delivery Date"));
                OptimusInstrumentActions.updatePricePrecision(dataMap.get("Price Precision"));
                OptimusInstrumentActions.updateSizePrecision(dataMap.get("Size Precision"));
                OptimusInstrumentActions.updateMinOrderSize(dataMap.get("Min. Order Size"));
                OptimusInstrumentActions.updateMaxOrder(dataMap.get("Max. Order Size"));
                OptimusInstrumentActions.updateLotSize(dataMap.get("Lot Size"));
                OptimusInstrumentActions.updateTickSize(dataMap.get("Tick Size"));
                OptimusInstrumentActions.clickUpdateInstrument();
                OptimusSettlementActions.waitForSuccessMsgToAppear();
//                OptimusInstrumentActions.createContarctSize(dataMap.get("Contract Size"));
//                OptimusInstrumentActions.createContractAsset(dataMap.get("Contract Asset"));
//                OptimusInstrumentActions.createSetAsset(dataMap.get("Settlement Asset"));
//                OptimusInstrumentActions.createTradingStatus(dataMap.get("Status"));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
        }
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }
    }

    @And("Input the Instrument Ref. id")
    public void inputTheInstrumentRefId() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.inputValue(refid_instrument);

            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
        }
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }

    }

    @And("Search the record")
    public void searchTheRecord() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.inputValue(dataMap.get("Search"));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
        }
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }
    }
    @And("Verify the Trading Instrument Updated")
    public void verifyTheTradingInstrumentUpdated() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(SettlementMainPage.newSettlement_edit);
                OptimusSettlementActions.sortSettlementRef();
                OptimusSettlementActions.inputValue(refid_instrument);
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Search the Exchange Symbol to be deleted")
    public void searchTheExchangeSymbolToBeDeleted() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.inputValue(dataMap.get("Exchange Symbol"));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
        }
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }
    }

    @And("Verify the Trading Instrument deleted")
    public void verifyTheTradingInstrumentDeleted() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(SettlementMainPage.newSettlement_edit);
                OptimusSettlementActions.sortSettlementRef();
                OptimusSettlementActions.inputValue(refid_instrument);
                Assert.assertEquals(OptimusSettlementActions.getNoData(),"No Data");
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }

    }

    @And("Search the existing Trading Instrument")
    public void searchTheExistingTradingInstrument() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.inputValue(dataMap.get("Alt Coin"));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }

    }

    @Then("Verify the Trading Instrument")
    public void verifyTheTradingInstrument() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                Assert.assertEquals(OptimusInstrumentActions.getAltcoin(),dataMap.get("Alt Coin"));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }

    }

    @And("Click the Futures Side Tab Under Instrument")
    public void clickTheFuturesSideTabUnderInstrument() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.clickInstrument_Futures_SideTab();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }

    }

    @And("Select Exchange from Search Dropdown")
    public void selectExchangeFromSearchDropdown() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.search_Futures_Exchange_dropdown_List(dataMap.get("Exchange"));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }

    }

    @Then("Verify Search Results of Existing Futures")
    public void verifySearchResultsOfExistingFutures() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                Assert.assertEquals(OptimusInstrumentActions.get_Exchange_FutureSearchList(), dataMap.get("Exchange1"), "Text Matches" );
                Assert.assertEquals(OptimusInstrumentActions.get_ExchangeSymbol_FutureSearchList(), dataMap.get("Search"), "Text Matches" );
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }

    }

    @And("Select Base from Search Dropdown")
    public void selectBaseFromSearchDropdown() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.instrumentTokenPrices_SearchBase_List(dataMap.get("Base"));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }

    }

    @And("Select Quote from Search Dropdown")
    public void selectQuoteFromSearchDropdown() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.instrumentTokenPrices_SearchQuote_List(dataMap.get("Quote"));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }

    }

    @And("Select Date from Search Dropdown")
    public void selectDateFromSearchDropdown() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.instrumentTokenPrices_SearchDate_List(dataMap.get("Date"));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }

    }

    @And("Select Time from Search Dropdown")
    public void selectTimeFromSearchDropdown() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.clearSearchTime();
                OptimusInstrumentActions.instrumentTokenPrices_SearchTime_List(dataMap.get("Time"));

            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }

    }

    @Then("Verify Base in Search Results of Existing Token Prices")
    public void verifyBaseInSearchResultsOfExistingTokenPrices() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                Assert.assertEquals(OptimusInstrumentActions.get_Base_TokenPriceSearchList(), dataMap.get("Base"), "Text Matches");
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @Then("Verify Quote in Search Results of Existing Token Prices")
    public void verifyQuoteInSearchResultsOfExistingTokenPrices() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                Assert.assertEquals(OptimusInstrumentActions.get_Quote_TokenPriceSearchList(), dataMap.get("Quote"), "Text Matches");
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }


    @Then("Verify DateTime in Search Results of Existing Token Prices")
    public void verifyDateTimeInSearchResultsOfExistingTokenPrices() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                Assert.assertEquals(OptimusInstrumentActions.get_DateTime_TokenPriceSearchList(), dataMap.get("Exchange"), "Text Matches");
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Click the Token Price Side Tab Under Instrument")
    public void clickTheTokenPriceSideTabUnderInstrument() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.clickInstrument_TokenPrices_SideTab();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @Then("Verify downloaded CSV Button in Instrument")
    public void verifyDownloadedCSVButtonInInstrument() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.verifyDownloadCSVBtn();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Click the Fiat Price Side Tab Under Instrument")
    public void clickTheFiatPriceSideTabUnderInstrument() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.clickInstrument_FiatPrices_SideTab();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }
    @And("Click the Alert Price Side Tab Under Instrument")
    public void clickTheAlertPriceSideTabUnderInstrument() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.clickInstrument_PriceAlert_SideTab();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Click to open Arbitrage Sub tab")
    public void clickToOpenArbitrageSubTab() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.clickInstrument_PriceAlert_Arbitrage_tab();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Switch to Auto mode for Arbitrage tab")
    public void switchToAutoModeForArbitrageTab() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.instrument_PriceAlert_AutoManual_SwitchToAuto();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @Then("Verify List Switched {string} Mode")
    public void verifyListSwitchedMode(String mode) {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                Assert.assertEquals(OptimusInstrumentActions.get_Instrument_ArbitragePriceAlert_SwitchValue(), mode);
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Switch to {string} Mode for Arbitrage tab")
    public void switchToModeForArbitrageTab(String switchTo) {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.instrument_PriceAlert_AutoManual_SwitchToManual(switchTo);
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Click Update Now button on Arbitrage tab")
    public void clickUpdateNowButtonOnArbitrageTab() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.click_Instrument_PriceAlert_UpdateNow();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @Then("Verify Update Now button is clicked")
    public void verifyUpdateNowButtonIsClicked() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.check_Instrument_PriceAlert_UpdateNow_State();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Click Arbitrage Threshold button on Arbitrage tab")
    public void clickArbitrageThresholdButtonOnArbitrageTab() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.open_Instrument_PriceAlert_ArbitrageThreshold();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @Then("Verify Arbitrage Threshold modal is open")
    public void verifyArbitrageThresholdModalIsOpen() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                Assert.assertEquals(OptimusInstrumentActions.get_Instrument_PriceAlert_ArbitrageThreshold_Modal(), "Arbitrage Thresholds", "Header is Open Text Matches");
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Click to open Price Sub tab")
    public void clickToOpenPriceSubTab() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.open_Instrument_PriceAlert_Price_SubTab();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Click Create button on Price tab page")
    public void clickCreateButtonOnPriceTabPage() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.open_InstrumentPriceAlert_Price_Create();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Enter All the field detail of Price Alert on Create Price modal")
    public void enterAllTheFieldDetailOfPriceAlertOnCreatePriceModal() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                PriceAlertItem = dataMap.get("Price_Pair") + KeywordUtil.generateRandomNumber200to500();
                OptimusInstrumentActions.instrumentPriceAlert_Price_Exchange(dataMap.get("Price_Exchange"));
                OptimusInstrumentActions.instrumentPriceAlert_Price_Pair(PriceAlertItem);
                OptimusInstrumentActions.instrumentPriceAlert_Price_IsItAMagicPair(dataMap.get("Price_IsItAMagicPair"));
                OptimusInstrumentActions.instrumentPriceAlert_Price_Operator(dataMap.get("Price_Operator"));
                OptimusInstrumentActions.instrumentPriceAlert_Price_Price(dataMap.get("Price_Price"));
                OptimusInstrumentActions.instrumentPriceAlert_Price_Comment(dataMap.get("Price_Comment"));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }


    @Then("Search the New Price Alert in the Price List")
    public void searchTheNewPriceAlertInThePriceList() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.instrumentPriceAlert_Price_Search(PriceAlertItem);
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @Then("Verify the Alert Price Pair is Created and Available in List")
    public void verifyTheAlertPricePairIsCreatedAndAvailableInList() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                Assert.assertTrue((OptimusInstrumentActions.get_InstrumentPriceAlert_Price_Pair_List()).contains(PriceAlertItem), "Pair Text Matches");
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }


    @Then("Verify the Alert Price Comment is Created and Available in List")
    public void verifyTheAlertPriceCommentIsCreatedAndAvailableInList() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                Assert.assertEquals(OptimusInstrumentActions.get_InstrumentPriceAlert_Price_Comment_List(), dataMap.get("Price_Comment"), "Comment Text Matches");
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }


    @Then("Search the Price Alert in the Price List")
    public void searchThePriceAlertInThePriceList() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.instrumentPriceAlert_Price_Search(dataMap.get("Search"));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Click Reset button in Instrument")
    public void clickResetButtonInInstrument() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.instrumentPriceAlert_Price_Reset();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @Then("Verify the Search box is Reset in Instrument")
    public void verifyTheSearchBoxIsResetInInstrument() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                Assert.assertEquals(OptimusInstrumentActions.get_InstrumentPriceAlert_Price_Search_Text(), "");
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Take the Price Pair of item to be deleted")
    public void takeThePricePairOfItemToBeDeleted() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                PriceAlertItem = OptimusInstrumentActions.get_InstrumentPriceAlert_Price_Pair_List();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @Then("Search for Deleted Price Alert by pair")
    public void searchForDeletedPriceAlertByPair() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.instrumentPriceAlert_Price_Search(PriceAlertItem);
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Click Delete button of Price Alert in Instrument")
    public void clickDeleteButtonOfPriceAlertInInstrument() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.instrumentPriceAlert_Price_Delete();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Click to open Balance Sub tab")
    public void clickToOpenBalanceSubTab() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.open_Instrument_PriceAlert_Balance_SubTab();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Click Create button on Balance Alert tab page")
    public void clickCreateButtonOnBalanceAlertTabPage() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.open_Instrument_PriceAlert_Create_Balance();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Enter All the field detail of Balance Alert on Create Balance modal")
    public void enterAllTheFieldDetailOfBalanceAlertOnCreateBalanceModal() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                BalanceAlertItem = dataMap.get("Balance_Comment") + KeywordUtil.generateRandomNumber200to500();
                OptimusInstrumentActions.instrumentPriceAlert_Balance_Account_Create(dataMap.get("Balance_Account"));
                OptimusInstrumentActions.instrumentPriceAlert_Balance_Asset_Create(dataMap.get("Balance_Asset"));
                OptimusInstrumentActions.instrumentPriceAlert_Balance_Operator_Create(dataMap.get("Balance_Operator"));
                OptimusInstrumentActions.instrumentPriceAlert_Balance_Amount_Create(dataMap.get("Balance_Amount"));
                OptimusInstrumentActions.instrumentPriceAlert_Balance_Comment_Create(BalanceAlertItem);
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @Then("Search the Balance Alert in the Price List")
    public void searchTheBalanceAlertInThePriceList() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.instrumentPriceAlert_Balance_Search(dataMap.get("Balance_Account"),dataMap.get("Balance_Asset"));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @Then("Verify the Alert Balance Account ID And Asset is Created and Available in List")
    public void verifyTheAlertBalanceAccountIDAndAssetIsCreatedAndAvailableInList() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                Assert.assertEquals(OptimusInstrumentActions.get_InstrumentPriceAlert_Balance_Account_List(), dataMap.get("Balance_Account"));
                Assert.assertEquals(OptimusInstrumentActions.get_InstrumentPriceAlert_Balance_Asset_List(), dataMap.get("Search"));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }


    @Then("Verify the Alert Balance Comment is Created and Available in List")
    public void verifyTheAlertBalanceCommentIsCreatedAndAvailableInList() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                Assert.assertEquals(OptimusInstrumentActions.get_InstrumentPriceAlert_Balance_Comment_List(), BalanceAlertItem);
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Click Reset button in Balance Alert under Instrument")
    public void clickResetButtonInBalanceAlertUnderInstrument() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.instrumentPriceAlert_Balance_Reset();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @Then("Verify the Empty Search box is Reset in Instrument")
    public void verifyTheEmptySearchBoxIsResetInInstrument() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                String text = OptimusInstrumentActions.get_InstrumentPriceAlert_Balance_Search_AccountID();
                Assert.assertEquals(text,  "");
                text = OptimusInstrumentActions.get_InstrumentPriceAlert_Balance_Search_DataAsset();
                Assert.assertEquals(text, "");

            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Take the Balance Alert Details of item to be deleted")
    public void takeTheBalanceAlertDetailsOfItemToBeDeleted() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                balanceText = OptimusInstrumentActions.get_InstrumentPriceAlert_Balance_Comment_List();
//                 OptimusInstrumentActions.get_InstrumentPriceAlert_Balance_Account_List() ;
//                 OptimusInstrumentActions.get_InstrumentPriceAlert_Balance_Asset_List() ;
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Click Delete button of Balance Alert in Instrument")
    public void clickDeleteButtonOfBalanceAlertInInstrument() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.instrumentPriceAlert_Balance_Delete();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Reload the List")
    public void reloadTheList() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.clickReload();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Open Manual Price Side Tab Under Instrument")
    public void openManualPriceSideTabUnderInstrument() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.open_instrument_ManualPrices_SideTab();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Select Base from Search Dropdown in Manual Prices")
    public void selectBaseFromSearchDropdownInManualPrices() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.instrument_ManualPrices_Base_Search(dataMap.get("Search"));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Select Quote from Search Dropdown in Manual Prices")
    public void selectQuoteFromSearchDropdownInManualPrices() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.instrument_ManualPrices_Quote_Search(dataMap.get("Search"));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @Then("Verify Base in Search Results of Existing Manual Prices")
    public void verifyBaseInSearchResultsOfExistingManualPrices() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                Assert.assertEquals(OptimusInstrumentActions.get_instrument_ManualPrices_Base_List(), (dataMap.get("Search")));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @Then("Verify Quote in Search Results of Existing Manual Prices")
    public void verifyQuoteInSearchResultsOfExistingManualPrices() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                Assert.assertEquals(OptimusInstrumentActions.get_instrument_ManualPrices_Date_List(), (dataMap.get("Quote")));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Select Date from Search Dropdown in Manual Prices")
    public void selectDateFromSearchDropdownInManualPrices() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.instrument_ManualPrices_StartDate_Search(dataMap.get("Search"));
                OptimusInstrumentActions.instrument_ManualPrices_EndDate_Search(dataMap.get("Actions"));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @Then("Verify DateTime in Search Results of Existing Manual Prices")
    public void verifyDateTimeInSearchResultsOfExistingManualPrices() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                Assert.assertEquals(OptimusInstrumentActions.get_instrument_ManualPrices_Date_List(), (dataMap.get("Result")));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }
}