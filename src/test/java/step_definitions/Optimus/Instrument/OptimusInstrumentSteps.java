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

import java.util.HashMap;

import static utilities.KeywordUtil.delay;
import static utilities.KeywordUtil.waitForVisible;

public class OptimusInstrumentSteps {

    public static HashMap<String, String> dataMap;

    public static String refid_instrument;
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
}