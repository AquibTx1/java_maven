package step_definitions.XAlpha;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.XAlphaActions.XAlphaDealInputActions;
import org.testng.Assert;
import step_definitions.BaseStepDefinitions;
import utilities.GlobalUtil;

import java.util.HashMap;

public class XAlphaDealInputSteps {

    static Class thisClass = XAlphaDealInputSteps.class;

    public static HashMap<String, String> dataMap = new HashMap<String, String>();
    public static String dealRefId;

    public static String quoteAssetAmount, referencePrice, marketPrice, feeAmount, unitPrice;

    public XAlphaDealInputSteps() {
        //constructor of the class to load datamap from BaseStepDefinitions
        dataMap = BaseStepDefinitions.dataMap;
    }

    @When("Move to X-Alpha page")
    public void movetoXAlphaPage() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealInputActions.clickXAlphaHeader();
                XAlphaDealInputActions.waitForDealInputTab();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Navigate to deal input tab")
    public void navigateToDealInputForm() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealInputActions.clickDealInputTab();
                XAlphaDealInputActions.waitFordealInput_navbar();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Choose FX Spot")
    public void chooseFXSpot() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealInputActions.clickFXSpotTab();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Choose Execution deal tab")
    public void chooseExecutionDealTab() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealInputActions.clickExecutionTab();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Provide FX Spot deal input details")
    public void provideFXSpotDealInputDetails() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealInputActions.dealInput_direction(dataMap.get("Direction"));
                XAlphaDealInputActions.dealInput_BaseAssetAmount(dataMap.get("BaseAssetAmount"));
                XAlphaDealInputActions.dealInput_BaseAsset(dataMap.get("BaseAsset"));
                XAlphaDealInputActions.dealInput_QuoteAsset(dataMap.get("QuoteAsset"));
//                marketPrice = XAlphaDealInputActions.get_dealInput_MarketPrice(); //obsoleted
                referencePrice = XAlphaDealInputActions.get_dealInput_ReferencePrice(); //to be used later
                XAlphaDealInputActions.dealInput_UnitPrice(referencePrice);
                XAlphaDealInputActions.dealInput_FeeAsset(dataMap.get("FeeAsset"));
                XAlphaDealInputActions.dealInput_FeeAmount(dataMap.get("FeeAmount"));
//                XAlphaDealInputActions.dealInput_ReferencePrice(marketPrice); //obsoleted
                XAlphaDealInputActions.dealInput_CounterpartyName(dataMap.get("CounterpartyName"));
                XAlphaDealInputActions.dealInput_PortfolioNumber(dataMap.get("PortfolioNumber"));
                XAlphaDealInputActions.dealInput_ProcessingStatus(dataMap.get("ProcessingStatus"));

                quoteAssetAmount = XAlphaDealInputActions.get_dealInput_QuoteAssetAmount(); //to be used later
                unitPrice = XAlphaDealInputActions.get_dealInput_UnitPrice(); //to be used later
                feeAmount = XAlphaDealInputActions.get_dealInput_FeeAmount(); //to be used later
                referencePrice = XAlphaDealInputActions.get_dealInput_ReferencePrice(); //to be used later
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Provide execution deal input details")
    public void provideExecutionDealInputDetails() throws InterruptedException {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                //asset details
                XAlphaDealInputActions.dealInput_StartAsset(dataMap.get("StartAsset"));
                XAlphaDealInputActions.dealInput_StartAssetAmount(dataMap.get("StartAssetAmount"));
                XAlphaDealInputActions.dealInput_EndAsset(dataMap.get("EndAsset"));
                XAlphaDealInputActions.dealInput_EndAssetAmount();
                XAlphaDealInputActions.dealInput_FeeAsset(dataMap.get("FeeAsset"));
                XAlphaDealInputActions.dealInput_FeeProportion(dataMap.get("FeeProportion"));
                XAlphaDealInputActions.dealInput_FeeAmount(dataMap.get("FeeAmount"));
                XAlphaDealInputActions.dealInput_FeeAdjustment(dataMap.get("FeeAdjustment"));

                //counterparty details
                XAlphaDealInputActions.dealInput_CounterpartyName(dataMap.get("CounterpartyName"));
                XAlphaDealInputActions.dealInput_PortfolioNumber(dataMap.get("PortfolioNumber"));
                XAlphaDealInputActions.dealInput_ProcessingStatus(dataMap.get("ProcessingStatus"));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Click create deal button")
    public void clickCreateDealButton() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealInputActions.dealInput_CreateBtn();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @Then("Verify the deal success message")
    public void verifyTheDealSuccessMessage() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealInputActions.waitForDealSubmittedMsg();
                Assert.assertTrue(XAlphaDealInputActions.dealInput_SubmitMessage().startsWith("Deal has created"));
                Assert.assertTrue(XAlphaDealInputActions.dealInput_SubmitMessage().endsWith("and copied to clipboard"));
                dealRefId = XAlphaDealInputActions.getDealRefFromNotif();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @Then("Verify deal is not created")
    public void verifyDealIsNotCreated() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealInputActions.waitForDealSubmittedMsg();
                Assert.assertEquals(XAlphaDealInputActions.dealInput_SubmitMessage(), "processing status should be 'pending' or 'confirmed'");
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @Then("Verify the validation message")
    public void verifyTheValidationMessage() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealInputActions.waitForDealSubmittedMsg();
                Assert.assertEquals(XAlphaDealInputActions.dealInput_SubmitMessage(), dataMap.get("ValidationMsg"));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Choose CashFlow deal")
    public void chooseCashFlowDeal() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealInputActions.clickCashFlowTab();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Provide CashFlow deal input details")
    public void provideCashFlowDealInputDetails() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                //cash flow details
                XAlphaDealInputActions.dealInput_CashFlow_Direction(dataMap.get("Direction"));
                XAlphaDealInputActions.dealInput_CashFlow_Asset(dataMap.get("Asset"));
                XAlphaDealInputActions.dealInput_CashFlow_Amount(dataMap.get("Amount"));
                XAlphaDealInputActions.dealInput_CashFlow_Purpose(dataMap.get("CashflowPurpose"));
                XAlphaDealInputActions.dealInput_ProcessingStatus(dataMap.get("ProcessingStatus"));

                //counterparty details
                XAlphaDealInputActions.dealInput_CounterpartyName(dataMap.get("CounterpartyName"));
                XAlphaDealInputActions.dealInput_PortfolioNumber(dataMap.get("PortfolioNumber"));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Wait for deal to get settled")
    public void waitForDealToGetSettled() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealInputActions.dealInput_waitForDealInput_IncomingSettledYes();
                XAlphaDealInputActions.dealInput_waitForDealInput_OutgoingSettledYes();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
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
