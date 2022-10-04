package step_definitions.XAlpha;

import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import modules.NitroXActions.NitroXBotsAction;
import modules.OptimusActions.OptimusPortfolioCreateActions;
import modules.XAlphaActions.XAlphaDealInputActions;
import modules.XAlphaActions.XAlphaDealEnquiryActions;
import org.testng.Assert;
import pageFactory.XAlphaPages.XAlphaDealEnquiryPage;
import step_definitions.BaseStepDefinitions;
import step_definitions.RunCukesTest;
import utilities.GlobalUtil;
import utilities.HTMLReportUtil;
import utilities.KeywordUtil;

import java.text.ParseException;
import java.util.HashMap;

import static utilities.KeywordUtil.*;

public class XAlphaDealEnquirySteps {

    public static HashMap<String, String> dataMap = new HashMap<String, String>();

    public static String dealRefId, dealInput_FeeAmount_autoPopulated,transfer_instr,transerinstr_invoice;

    public XAlphaDealEnquirySteps() {
        //constructor of the class to load datamap from BaseStepDefinitions
        dataMap = BaseStepDefinitions.dataMap;
    }

    @And("Navigate to deal enquiry tab")
    public void navigateToDealEnquiryTab() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.waitForSuccessMsgToDisappear();
                XAlphaDealEnquiryActions.clickDealEnquiryTab();
//                XAlphaDealEnquiryActions.waitFordealEnquiry_navbar();
                XAlphaDealEnquiryActions.waitForLoadingIconToAppearAndDisappear();
                XAlphaDealEnquiryActions.waitForSuccessMsgToAppear();
                XAlphaDealEnquiryActions.closeSuccessNotification();
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

    @Then("Verify the deal is created")
    public void verifyTheDealIsCreated() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.getDealRefwrtQuoteAssetAmt(XAlphaDealInputSteps.quoteAssetAmount);
                String unitPriceDealEnquiry = XAlphaDealEnquiryActions.getUnitPricewrtQuoteAssetAmt(XAlphaDealInputSteps.quoteAssetAmount);
                String feeDealEnquiry = XAlphaDealEnquiryActions.getFeewrtQuoteAssetAmt(XAlphaDealInputSteps.quoteAssetAmount);
                String referencePriceDealEnquiry = XAlphaDealEnquiryActions.getReferencePricewrtQuoteAssetAmt(XAlphaDealInputSteps.quoteAssetAmount);
                String dealTypeDealEnquiry = XAlphaDealEnquiryActions.getDealTypewrtQuoteAssetAmt(XAlphaDealInputSteps.quoteAssetAmount).toLowerCase();
                String processingStatusDealEnquiry = XAlphaDealEnquiryActions.getProcessingStatuswrtQuoteAssetAmt(XAlphaDealInputSteps.quoteAssetAmount).toLowerCase();
                String directionDealEnquiry = XAlphaDealEnquiryActions.getDirectionwrtQuoteAssetAmt(XAlphaDealInputSteps.quoteAssetAmount).toLowerCase();

                //convert deal input field values to be matched
                XAlphaDealInputSteps.unitPrice = KeywordUtil.formatDecimalToStr(XAlphaDealInputSteps.unitPrice);
                XAlphaDealInputSteps.feeAmount = KeywordUtil.formatDecimalToStr(XAlphaDealInputSteps.feeAmount);
                XAlphaDealInputSteps.referencePrice = KeywordUtil.formatDecimalToStr(XAlphaDealInputSteps.referencePrice);

                //assert the values
                Assert.assertEquals(unitPriceDealEnquiry, XAlphaDealInputSteps.unitPrice);
                Assert.assertEquals(feeDealEnquiry, XAlphaDealInputSteps.feeAmount);
                Assert.assertEquals(referencePriceDealEnquiry, XAlphaDealInputSteps.referencePrice);
                Assert.assertEquals(dealTypeDealEnquiry, dataMap.get("DealType").toLowerCase());
                Assert.assertEquals(processingStatusDealEnquiry, dataMap.get("ProcessingStatus").toLowerCase());
                Assert.assertEquals(directionDealEnquiry, dataMap.get("Direction").toLowerCase());
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

    @And("Load a deal wrt processing type and deal type")
    public void loadADealWrtProcessingTypeAndDealType() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                //clear existing processing statuses from the filter and input the new one
                XAlphaDealEnquiryActions.clearProcessingStatuses();
                XAlphaDealEnquiryActions.inputProcessingStatus(dataMap.get("ProcessingStatus"));

                //clear existing deal types from the filter and input the new one
                XAlphaDealEnquiryActions.clearDealTypes();
                XAlphaDealEnquiryActions.inputDealType(dataMap.get("DealType"));

                //click load deal button
                XAlphaDealEnquiryActions.clickLoadDealBtn();

                //wait for deals to load
                XAlphaDealEnquiryActions.waitForLoadingIconToAppear();
                XAlphaDealEnquiryActions.waitForLoadingIconToDisappear();

                //wait for success message to appear and disappear
                XAlphaDealEnquiryActions.waitForSuccessMsgToAppear();
                XAlphaDealEnquiryActions.closeSuccessNotification();

                //make sure the first deal have the correct processing status
                Assert.assertEquals(XAlphaDealEnquiryActions.getFirstDealProcessingStatus(), dataMap.get("ProcessingStatus"));
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

    @And("Load deals")
    public void loadDeals() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.clickLoadDealBtn();

                //wait for deals to load
                XAlphaDealEnquiryActions.waitForLoadingIconToAppear();
                XAlphaDealEnquiryActions.waitForLoadingIconToDisappear();

                //wait for success message to appear and disappear
                XAlphaDealEnquiryActions.waitForSuccessMsgToAppear();
                XAlphaDealEnquiryActions.closeSuccessNotification();
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

    @And("Change processing status")
    public void changeProcessingStatus() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                delay(7000); //to load settled Settlement Details sub-section
                //update processing status
                XAlphaDealInputActions.dealInput_ProcessingStatus(dataMap.get("ProcessingStatus_new"));
                delay(3000);
                XAlphaDealInputActions.dealInput_ProcessingStatus(dataMap.get("ProcessingStatus_new")); //intentional due to existing bug
//                XAlphaDealEnquiryActions.clickUpdateDealBtn();
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

    @Then("Verify the deal updated success message")
    public void verifyTheDealUpdatedSuccessMessage() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.waitForNotifDescription();
                Assert.assertEquals(XAlphaDealEnquiryActions.getNotifDescription(), "Deal has updated");
                XAlphaDealEnquiryActions.closeSuccessNotification();
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

    @Then("Verify the deal forwarded to MO for approval")
    public void verifyTheDealForwardedToMOForApproval() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.waitForSuccessMsgToAppear();
                Assert.assertEquals(XAlphaDealEnquiryActions.getNotifDescription(), "Deal update has to be approved by MO. A task has created.");
                XAlphaDealEnquiryActions.closeSuccessNotification();
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

    @And("Load a deal wrt deal reference id")
    public void loadADealWrtDealReferenceId() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.dealEnquiry_ResetFiler();
//                Commenting this to add new method for Reset Filter
//                XAlphaDealEnquiryActions.clearProcessingStatuses();
                XAlphaDealEnquiryActions.inputDealRef(dealRefId);
                XAlphaDealEnquiryActions.clickLoadDealBtn();
                XAlphaDealEnquiryActions.waitForSuccessMsgToAppear();
                XAlphaDealEnquiryActions.closeSuccessNotification();
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

    @And("Load a deal wrt deal reference id from deal input")
    public void loadADealWrtDealReferenceIdFromDealInput() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.clearProcessingStatuses();
                XAlphaDealEnquiryActions.inputDealRef(XAlphaDealInputSteps.dealRefId);
                XAlphaDealEnquiryActions.clickLoadDealBtn();
                XAlphaDealEnquiryActions.waitForSuccessMsgToAppear();
                XAlphaDealEnquiryActions.closeSuccessNotification();
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

    @Then("Verify the processing type")
    public void verifyTheProcessingType() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                //Method to repeat loading the result 2 times to check the validation
                int rep = 0;
                    while(XAlphaDealEnquiryActions.getFirstDealProcessingStatus().toLowerCase().equalsIgnoreCase(dataMap.get("ProcessingStatus")) && rep < 2) {
                        rep++;
                        XAlphaDealEnquiryActions.clickLoadDealBtn();

                        //Wait for loading spinner to appear and disappear
                        XAlphaDealEnquiryActions.waitForLoadingIconToAppear();
                        XAlphaDealEnquiryActions.waitForLoadingIconToDisappear();

                        //wait for success message to appear and disappear
                        XAlphaDealEnquiryActions.waitForSuccessMsgToAppear();
                        XAlphaDealEnquiryActions.closeSuccessNotification();

                        delay(10000);
                    }
//                }
                Assert.assertEquals(XAlphaDealEnquiryActions.getFirstDealProcessingStatus().toLowerCase(), dataMap.get("ProcessingStatus_new").toLowerCase());
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

    @And("Open first deal in the row")
    public void openFirstDealInTheRow() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                //open first deal
                dealRefId = XAlphaDealEnquiryActions.getFirstDealReferenceId(); //to be used later
                RunCukesTest.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringGreyColor("Deal ref id in the first row=" + dealRefId));
                XAlphaDealEnquiryActions.openFirstDeal();
                XAlphaDealEnquiryActions.waitForDealDetailsPage();
                Assert.assertEquals(XAlphaDealEnquiryActions.getDealReferenceFromDealDetails(), dealRefId);
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

    @And("Update deal details\\(Direction, BaseAssetAmount, BaseAsset, QuoteAsset, UnitPrice, QuoteAssetAmount, FeeAsset, FeeAmount, ReferencePrice)")
    public void updateDealDetailsDirectionBaseAssetAmountBaseAssetQuoteAssetUnitPriceQuoteAssetAmountFeeAssetFeeAmountReferencePrice() throws InterruptedException {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealInputActions.dealInput_direction(dataMap.get("Direction_updated"));
                XAlphaDealInputActions.dealInput_BaseAssetAmount(dataMap.get("BaseAssetAmount_updated"));
                XAlphaDealInputActions.dealInput_BaseAsset(dataMap.get("BaseAsset_updated"));
                XAlphaDealInputActions.dealInput_QuoteAsset(dataMap.get("QuoteAsset_updated"));
                XAlphaDealInputActions.dealInput_UnitPrice(dataMap.get("UnitPrice_updated"));
                XAlphaDealInputActions.dealInput_FeeAsset(dataMap.get("FeeAsset_updated"));
                XAlphaDealInputActions.dealInput_FeeAmount(dataMap.get("FeeAmount_updated"));
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

    @And("Click update deal button")
    public void clickUpdateDealButton() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.clickUpdateDealBtn();
                XAlphaDealEnquiryActions.waitForSuccessMsgToAppear();
               // XAlphaDealEnquiryActions.closeSuccessNotification();

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

    @Then("Verify Updated deal details\\(Direction, BaseAssetAmount, BaseAsset, QuoteAsset, UnitPrice, QuoteAssetAmount, FeeAsset, FeeAmount, ReferencePrice)")
    public void verifyUpdatedDealDetailsDirectionBaseAssetAmountBaseAssetQuoteAssetUnitPriceQuoteAssetAmountFeeAssetFeeAmountReferencePrice() throws InterruptedException {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                //actual values in the first row
                String direction = XAlphaDealEnquiryActions.getFirstSummary();
                String baseAssetAmount = XAlphaDealEnquiryActions.getFirstBaseAssetAmount();
                String baseAsset = XAlphaDealEnquiryActions.getFirstBaseAsset();
                String quoteAsset = XAlphaDealEnquiryActions.getFirstQuoteAsset();
                String unitPrice = XAlphaDealEnquiryActions.getFirstUnitPrice(); //convert to string if required
                String feeAsset = XAlphaDealEnquiryActions.getFirstFeeAsset();
                String feeAmount = XAlphaDealEnquiryActions.getFirstFeeAmount();

                //do formatting of the values as per requirement
                String directionUpdated = dataMap.get("Direction_updated").toLowerCase();
                String baseAssetAmount_updated = KeywordUtil.formatDecimalToStr(dataMap.get("BaseAssetAmount_updated"));
                String baseAsset_updated = dataMap.get("BaseAsset_updated").split(" | ")[0].trim();
                String quoteAsset_updated = dataMap.get("QuoteAsset_updated").split(" | ")[0].trim();
                String unitPrice_updated = KeywordUtil.formatDecimalToStr(dataMap.get("UnitPrice_updated"));
                String feeAsset_updated = dataMap.get("FeeAsset_updated").split(" | ")[0].trim();
                String feeAmount_updated = KeywordUtil.formatDecimalToStr(dataMap.get("FeeAmount_updated"));

                //match the values
                Assert.assertEquals(direction, directionUpdated);
                Assert.assertEquals(baseAssetAmount, baseAssetAmount_updated);
                Assert.assertEquals(baseAsset, baseAsset_updated);
                Assert.assertEquals(quoteAsset, quoteAsset_updated);
                Assert.assertEquals(unitPrice, unitPrice_updated);
                Assert.assertEquals(feeAsset, feeAsset_updated);
                Assert.assertEquals(feeAmount, feeAmount_updated);
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

    @Then("Verify Updates deal details\\(CounterpartyName, PortfolioNumber)")
    public void verifyUpdatesDealDetailsCounterpartyNamePortfolioNumber() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                //actual values in the first row
                String counterpartyName = XAlphaDealEnquiryActions.getFirstCounterpartyName();
                String portfolioNumber = XAlphaDealEnquiryActions.getFirstPortfolioNumber();

                //do formatting of the values as per requirement
                String counterpartyName_updated = dataMap.get("CounterpartyName_updated").split(" | ")[0].trim() + " " + dataMap.get("CounterpartyName_updated").split(" | ")[1].trim();
                String portfolioNumber_updated = dataMap.get("PortfolioNumber_updated");

                //match the values
                Assert.assertEquals(counterpartyName, counterpartyName_updated);
                Assert.assertEquals(portfolioNumber, portfolioNumber_updated);
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

    @Then("Verify execution deal is created")
    public void verifyExecutionDealIsCreated() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.expandFirstDealDetail();
                //actual values in the first row
                String dealTypeActual = XAlphaDealEnquiryActions.getFirstDealType();
                String processingStatusActual = XAlphaDealEnquiryActions.getFirstDealProcessingStatus();
                String startAssetActual = XAlphaDealEnquiryActions.getFirstStartAsset();
                String startAssetAmountActual = KeywordUtil.formatDecimalToStr(XAlphaDealEnquiryActions.getFirstStartAssetAmount());
                String endAssetActual = XAlphaDealEnquiryActions.getFirstEndAsset();
                String endAssetAmountActual = XAlphaDealEnquiryActions.getFirstEndAssetAmount();
                String feeAssetActual = XAlphaDealEnquiryActions.getFirstFeeAsset_Execution();
                String feeProportionActual = XAlphaDealEnquiryActions.getFirstFeeProportion();
                String feeAmountActual = XAlphaDealEnquiryActions.getFirstFeeAmount_Execution();
                String counterpartyNameActual = XAlphaDealEnquiryActions.getFirstCounterpartyName();
                String portfolioNumberActual = XAlphaDealEnquiryActions.getFirstPortfolioNumber();

                //expected values from test data
                String dealTypeExpected = dataMap.get("DealType");
                String processingStatusExpected = dataMap.get("ProcessingStatus");
                String startAssetExpected = dataMap.get("StartAsset").split(" | ")[0].trim();
                String startAssetAmountExpected = KeywordUtil.formatDecimalToStr(dataMap.get("StartAssetAmount"));
                String endAssetActualExpected = dataMap.get("EndAsset").split(" | ")[0].trim();
                String endAssetAmountExpected = KeywordUtil.formatDecimalToStr(dataMap.get("EndAssetAmount"));
                String feeAssetExpected = dataMap.get("FeeAsset").split(" | ")[0].trim();
                String feeProportionExpected = KeywordUtil.formatDecimalToStr(dataMap.get("FeeProportion"));
                String feeAmountExpected = KeywordUtil.formatDecimalToStr(dataMap.get("FeeAmount"));
                String counterpartyNameExpected = dataMap.get("CounterpartyName").split(" | ")[0].trim() + " " + dataMap.get("CounterpartyName").split(" | ")[1].trim();
                String portfolioNumberExpected = dataMap.get("PortfolioNumber");

                //match the values
                Assert.assertEquals(dealTypeActual, dealTypeExpected);
                Assert.assertEquals(processingStatusActual, processingStatusExpected);
                Assert.assertEquals(startAssetActual, startAssetExpected);
                Assert.assertEquals(startAssetAmountActual, startAssetAmountExpected);
                Assert.assertEquals(endAssetActual, endAssetActualExpected);
                Assert.assertEquals(endAssetAmountActual, endAssetAmountExpected);
                Assert.assertEquals(feeAssetActual, feeAssetExpected);
                Assert.assertEquals(feeProportionActual, feeProportionExpected + "%");
                Assert.assertEquals(feeAmountActual, feeAmountExpected);
                Assert.assertEquals(feeAmountActual, feeAmountExpected);
                Assert.assertEquals(feeAmountActual, feeAmountExpected);
                Assert.assertEquals(counterpartyNameActual, counterpartyNameExpected);
                Assert.assertEquals(portfolioNumberActual, portfolioNumberExpected);
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

    @And("Change processing status and value date")
    public void changeProcessingStatusAndValueDate() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                //update processing status and value date
                XAlphaDealInputActions.dealInput_ValueDate(dataMap.get("ValueDate"));
                XAlphaDealInputActions.dealInput_ProcessingStatus(dataMap.get("ProcessingStatus_new"));
                XAlphaDealInputActions.dealInput_ProcessingStatus(dataMap.get("ProcessingStatus_new")); //intentional due to existing bug
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

    @Then("Verify the processing type and value date")
    public void verifyTheProcessingTypeAndValueDate() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                Assert.assertEquals(XAlphaDealEnquiryActions.getFirstDealProcessingStatus().toLowerCase(), dataMap.get("ProcessingStatus_new").toLowerCase());

                //do formatting for the date into an acceptable format
                String actualDate = XAlphaDealEnquiryActions.getFirstValueDate_Execution();
                String expectedDate = GlobalUtil.getDateTime_ddMMMyyyy(dataMap.get("ValueDate"));
                Assert.assertEquals(actualDate, expectedDate);
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

    @And("Update execution deal details\\(StartAsset, StartAssetAmount, EndAsset, EndAssetAmount, FeeAsset, FeeProportion, FeeAmount, FeeAdjustment)")
    public void updateExecutionDealDetailsStartAssetStartAssetAmountEndAssetEndAssetAmountFeeAssetFeeProportionFeeAmountFeeAdjustment() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealInputActions.dealInput_StartAsset(dataMap.get("StartAsset_updated"));
                XAlphaDealInputActions.dealInput_StartAssetAmount(dataMap.get("StartAssetAmount_updated"));
                XAlphaDealInputActions.dealInput_EndAsset(dataMap.get("EndAsset_updated"));
                XAlphaDealInputActions.dealInput_EndAssetAmount(dataMap.get("EndAssetAmount_updated"));
                XAlphaDealInputActions.dealInput_FeeAsset(dataMap.get("FeeAsset_updated"));
                XAlphaDealInputActions.dealInput_FeeProportion(dataMap.get("FeeProportion_updated"));
                dealInput_FeeAmount_autoPopulated = XAlphaDealInputActions.get_dealInput_FeeAmount(); //get automated FeeAmount for later use
                XAlphaDealInputActions.dealInput_FeeAdjustment(dataMap.get("FeeAdjustment_updated"));
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

    @And("Update execution deal details\\(CounterpartyName, PortfolioNumber, ValueDate)")
    public void updateExecutionDealDetailsCounterpartyNamePortfolioNumberValueDate() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealInputActions.dealInput_ValueDate(dataMap.get("ValueDate_updated"));
                XAlphaDealInputActions.dealInput_CounterpartyName(dataMap.get("CounterpartyName_updated"));
                XAlphaDealInputActions.dealInput_PortfolioNumber(dataMap.get("PortfolioNumber_updated"));
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

    @Then("Verify updated execution deal details\\(StartAsset, StartAssetAmount, EndAsset, EndAssetAmount, FeeAsset, FeeProportion, FeeAmount)")
    public void verifyUpdatedExecutionDealDetailsStartAssetStartAssetAmountEndAssetEndAssetAmountFeeAssetFeeProportionFeeAmount() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                //actual values in the first row
                String startAsset_actual = XAlphaDealEnquiryActions.getFirstStartAsset();
                String startAssetAmount_actual = XAlphaDealEnquiryActions.getFirstStartAssetAmount();
                String endAsset_actual = XAlphaDealEnquiryActions.getFirstEndAsset();
                String endAssetAmount_actual = XAlphaDealEnquiryActions.getFirstEndAssetAmount();
                String feeAsset_actual = XAlphaDealEnquiryActions.getFirstFeeAsset_Execution();
                String feeProportion_actual = XAlphaDealEnquiryActions.getFirstFeeProportion();
                String feeAmount_actual = XAlphaDealEnquiryActions.getFirstFeeAmount_Execution();

                //expected values along with data formatting as per requirement
                String startAsset_expected = dataMap.get("StartAsset_updated").split(" | ")[0].trim();
                String startAssetAmount_expected = KeywordUtil.formatDecimalToStr(dataMap.get("StartAssetAmount_updated"));
                String endAsset_expected = dataMap.get("EndAsset_updated").split(" | ")[0].trim();
                String endAssetAmount_expected = KeywordUtil.formatDecimalToStr(dataMap.get("EndAssetAmount_updated"));
                String feeAsset_expected = dataMap.get("FeeAsset_updated").split(" | ")[0].trim();
                String feeProportion_expected = KeywordUtil.formatDecimalToStr(dataMap.get("FeeProportion_updated"));
                String feeAmount_expected = KeywordUtil.formatDecimalToStr(dealInput_FeeAmount_autoPopulated);

                //match the values
                Assert.assertEquals(startAsset_actual, startAsset_expected);
                Assert.assertEquals(startAssetAmount_actual, startAssetAmount_expected);
                Assert.assertEquals(endAsset_actual, endAsset_expected);
                Assert.assertEquals(endAssetAmount_actual, endAssetAmount_expected);
                Assert.assertEquals(feeAsset_actual, feeAsset_expected);
                Assert.assertEquals(feeProportion_actual, feeProportion_expected + "%");
                Assert.assertEquals(feeAmount_actual, feeAmount_expected);
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

    @Then("Verify updated execution deal details\\(CounterpartyName, PortfolioNumber, ValueDate)")
    public void verifyUpdatedExecutionDealDetailsCounterpartyNamePortfolioNumberValueDate() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                //actual values in the first row
                String counterpartyName = XAlphaDealEnquiryActions.getFirstCounterpartyName();
                String portfolioNumber = XAlphaDealEnquiryActions.getFirstPortfolioNumber();
                String valueDateActual = XAlphaDealEnquiryActions.getFirstValueDate_Execution();

                //do formatting of the values as per requirement
                String counterpartyName_updated = dataMap.get("CounterpartyName_updated").split(" | ")[0].trim() + " " + dataMap.get("CounterpartyName_updated").split(" | ")[1].trim();
                String portfolioNumber_updated = dataMap.get("PortfolioNumber_updated");
                String valueDate_expected = GlobalUtil.getDateTime_ddMMMyyyy(dataMap.get("ValueDate_updated"));

                //match the values
                Assert.assertEquals(counterpartyName, counterpartyName_updated);
                Assert.assertEquals(portfolioNumber, portfolioNumber_updated);
                Assert.assertEquals(valueDateActual, valueDate_expected);
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

    @And("Apply value date filter")
    public void applyValueDateFilter() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                //update processing status
                XAlphaDealEnquiryActions.chooseFilter_ValueDate("Value Date");
//                XAlphaDealEnquiryActions.filter_StartDate(dataMap.get("StartDate"));
                XAlphaDealEnquiryActions.filter_EndDateNow();
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

    @And("Clear value date")
    public void clearValueDate() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealInputActions.clearDealInput_ValueDate();
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

    @And("Change value date to now")
    public void changeValueDateToNow() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealInputActions.dealInput_ValueDateNow();
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

    @Then("Verify empty value date")
    public void verifyEmptyValueDate() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                String valueDate = XAlphaDealEnquiryActions.getFirstValueDateBlank();
                Assert.assertTrue(valueDate.isEmpty());
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

    @Then("Verify CashFlow deal is created with correct details")
    public void verifyCashFlowDealIsCreatedWithCorrectDetails() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.expandFirstDealDetail();

                //actual values in the first row
                String dealTypeActual = XAlphaDealEnquiryActions.getFirstDealType();
                String processingStatusActual = XAlphaDealEnquiryActions.getFirstDealProcessingStatus();
                String directionActual = XAlphaDealEnquiryActions.getFirstSummary();
                String purposeActual = XAlphaDealEnquiryActions.getFirst_CashFlow_Purpose();
                String assetAmountActual = XAlphaDealEnquiryActions.getFirst_CashFlow_AssetAmount();
                String assetNameActual = XAlphaDealEnquiryActions.getFirst_CashFlow_AssetName();
                String tradeDateActual = XAlphaDealEnquiryActions.getFirst_CashFlow_TradeDate();
                String valueDateActual = XAlphaDealEnquiryActions.getFirst_CashFlow_ValueDate();
                String counterpartyNameActual = XAlphaDealEnquiryActions.getFirstCounterpartyName();
                String portfolioNumberActual = XAlphaDealEnquiryActions.getFirstPortfolioNumber();

                //expected values from test data
                String dealTypeExpected = dataMap.get("DealType");
                String processingStatusExpected = dataMap.get("ProcessingStatus");
                String directionExpected = dataMap.get("Direction");
                String purposeExpected = dataMap.get("CashflowPurpose");
                String assetAmountExpected = KeywordUtil.formatDecimalToStr(dataMap.get("Amount"));
                String assetNameExpected = dataMap.get("Asset").split(" | ")[0].trim();
                String tradeDateExpected = GlobalUtil.getCurrentDateTime_ddMMMyyyy(); //today's date
                String valueDateExpected = GlobalUtil.getCurrentDateTime_ddMMMyyyy(); //today's date
                String counterpartyNameExpected = dataMap.get("CounterpartyName").split(" | ")[0].trim() + " " + dataMap.get("CounterpartyName").split(" | ")[1].trim();
                String portfolioNumberExpected = dataMap.get("PortfolioNumber");

                //match the values
                Assert.assertEquals(dealTypeActual, dealTypeExpected);
                Assert.assertEquals(processingStatusActual, processingStatusExpected);
                Assert.assertEquals(directionActual, directionExpected);
                Assert.assertEquals(purposeActual, purposeExpected);
                Assert.assertEquals(assetAmountActual, assetAmountExpected);
                Assert.assertEquals(assetNameActual, assetNameExpected);
                Assert.assertEquals(tradeDateActual, tradeDateExpected);
                Assert.assertEquals(valueDateActual, valueDateExpected);
                Assert.assertEquals(counterpartyNameActual, counterpartyNameExpected);
                Assert.assertEquals(portfolioNumberActual, portfolioNumberExpected);
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

    @And("Check the status")
    public void checkTheStatus() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(XAlphaDealEnquiryPage.settlement_detail_Click);
                XAlphaDealEnquiryActions.validatestatus();
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

    @And("Update processing status from Settlement detail")
    public void updateProcessingStatusFromSettlementDetail() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealInputActions.clickSettled();
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

    @And("Update deal details\\(Direction)")
    public void updateDealDetailsDirection() {

        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealInputActions.dealInput_CashFlow_Direction(dataMap.get("Direction_Updated"));
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

    @And("Update deal details\\(Asset,Amount,CashflowPurpose)")
    public void updateDealDetailsAssetAmountCashflowPurpose() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                //Updating Asset, Amount, CashflowPurpose
                XAlphaDealInputActions.dealInput_CashFlow_Asset(dataMap.get("Asset_Updated"));
                XAlphaDealInputActions.dealInput_CashFlow_Amount(dataMap.get("Amount_Updated"));
                XAlphaDealInputActions.dealInput_CashFlow_Purpose(dataMap.get("CashflowPurpose_Updated"));
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

    @And("Update deal details\\(CounterpartyName, PortfolioNumber, ValueDate)")
    public void updateDealDetailsCounterpartyNamePortfolioNumberValueDate() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealInputActions.dealInput_CounterpartyName(dataMap.get("CounterpartyName_updated"));
                XAlphaDealInputActions.dealInput_PortfolioNumber(dataMap.get("PortfolioNumber_updated"));
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

    @Then("Verify Updated deal details\\(Direction,Asset,Amount,CashflowPurpose)")
    public void verifyUpdatedDealDetailsDirectionAssetAmountCashflowPurpose() {

        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                //actual values in the first row
                String direction = XAlphaDealEnquiryActions.getFirstSummary();
                String purpose = XAlphaDealEnquiryActions.getFirst_CashFlow_Purpose();
                String Assetname = XAlphaDealEnquiryActions.getFirst_CashFlow_AssetName();
                String Assetamount = XAlphaDealEnquiryActions.getFirst_CashFlow_AssetAmount();

                //do formatting of the values as per requirement
                String directionUpdated = dataMap.get("Direction_Updated").toLowerCase();
                String purpose_updated = dataMap.get("CashflowPurpose_Updated").toLowerCase();
                String Amount_updated = KeywordUtil.formatDecimalToStr(dataMap.get("Amount_Updated"));

                //match the values
                Assert.assertEquals(direction, directionUpdated);
                Assert.assertEquals(purpose, purpose_updated);
                Assert.assertEquals(Assetamount, Amount_updated);

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

    @And("Update CashFlow deal details\\(CounterpartyName, PortfolioNumber)")
    public void updateCashFlowDealDetailsCounterpartyNamePortfolioNumber() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                //counterparty details
                XAlphaDealInputActions.dealInput_CounterpartyName(dataMap.get("CounterpartyName_updated"));
                XAlphaDealInputActions.dealInput_PortfolioNumber(dataMap.get("PortfolioNumber_updated"));
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

    @And("Load a deal wrt processing type, direction and deal type")
    public void loadADealWrtProcessingTypeDirectionAndDealType() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                //clear existing processing statuses from the filter and input the new one
                XAlphaDealEnquiryActions.clearProcessingStatuses();
                XAlphaDealEnquiryActions.inputProcessingStatus(dataMap.get("ProcessingStatus"));

                //clear existing deal types from the filter and input the new one
                XAlphaDealEnquiryActions.clearDealTypes();
                XAlphaDealEnquiryActions.inputDealType(dataMap.get("DealType"));

//                clear existing direction from the filter and input the new one
                XAlphaDealEnquiryActions.clearDirection();
                XAlphaDealEnquiryActions.inputDirection(dataMap.get("Direction"));

                //click load deal button
                XAlphaDealEnquiryActions.clickLoadDealBtn();

                //wait for deals to load
                XAlphaDealEnquiryActions.waitForLoadingIconToAppear();
                XAlphaDealEnquiryActions.waitForLoadingIconToDisappear();

                //wait for success message to appear and disappear
                XAlphaDealEnquiryActions.waitForSuccessMsgToAppear();
                XAlphaDealEnquiryActions.closeSuccessNotification();

                //make sure the first deal have the correct processing status
                Assert.assertEquals(XAlphaDealEnquiryActions.getFirstDealProcessingStatus(), dataMap.get("ProcessingStatus"));
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

    @And("Navigate to Trade Documents Tab")
    public void navigateToTradeDocumentsTab() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.clickDeaTradeDocumentsTab();
                XAlphaDealEnquiryActions.waitForLoadingIconToAppear();
                XAlphaDealEnquiryActions.waitForLoadingIconToDisappear();
                waitForVisible(XAlphaDealEnquiryPage.TradeDocuments_dealRef);
                XAlphaDealEnquiryActions.inputDealRefid_TradeDocuments(XAlphaDealInputSteps.dealRefId);
                XAlphaDealEnquiryActions.clickLoadDealBtnTradeDocument();
                XAlphaDealEnquiryActions.waitForSuccessMsgToAppear();
                delay(5000);
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

    @And("Expand the Current Deal Type")
    public void expandTheCurrentDealType() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.clickExpandbutton();
                XAlphaDealEnquiryActions.waitForLoadingIconToAppear();
                XAlphaDealEnquiryActions.waitForLoadingIconToDisappear();
                //waitForVisible(XAlphaDealEnquiryPage.tradedocuments_editdraft);

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


    @And("Edit the Confirmation status")
    public void editTheConfirmationStatus() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                transfer_instr=XAlphaDealEnquiryActions.getTransferInstructions();
                XAlphaDealEnquiryActions.selectEditDraft();
                waitForPresent(XAlphaDealEnquiryPage.tradedocuments_reviewPagecheckbox);

                XAlphaDealEnquiryActions.selecReview();
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

    @And("Select Prepare Email and send")
    public void selectPrepareEmailAndSend() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
              XAlphaDealEnquiryActions.selectPrepareEmail();
              XAlphaDealEnquiryActions.waitForLoadingIconToAppear();
              XAlphaDealEnquiryActions.waitForLoadingIconToDisappear();
              delay(5000);
              XAlphaDealEnquiryActions.clearAllFileds();
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

    @And("Choose Sender name and send mail")
    public void chooseSenderNameAndSendMail() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.inputSendername(dataMap.get("Sender"));
                waitForPresent(XAlphaDealEnquiryPage.tradedocuments_sendbtn);
                XAlphaDealEnquiryActions.ChooseSendmail();
                XAlphaDealEnquiryActions.waitForSuccessMsgToAppear();
                XAlphaDealEnquiryActions.waitForSuccessMsgToDisappear();
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

    @Then("Verify the Confirmation status")
    public void verifyTheConfirmationStatus() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                    delay(3000);
                  String confirmation_status=  XAlphaDealEnquiryActions.getConfirmationStatus();
                  Assert.assertEquals(confirmation_status,"sent");
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

    @And("Again click the Trade Documents Tab")
    public void againClickTheTradeDocumentsTab() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.clickDeaTradeDocumentsTab();
                XAlphaDealEnquiryActions.waitForLoadingIconToAppear();
                XAlphaDealEnquiryActions.waitForLoadingIconToDisappear();
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

    @Then("Verify the Invoice Tab is Empty")
    public void verifyTheInvoiceTabIsEmpty() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.selectInvoiceTab();
                Assert.assertEquals(XAlphaDealEnquiryActions.getInvoiceDetail(),"No Data");

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

    @And("Click Invoice Tab")
    public void clickInvoiceTab() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.selectInvoiceTab();
                waitForPresent(XAlphaDealEnquiryPage.tradedocuments_editinvoiceDraft);
                transerinstr_invoice=XAlphaDealEnquiryActions.getTransferInstructionsInvoce();
                XAlphaDealEnquiryActions.selectEditInvoiceDraft();
                waitForPresent(XAlphaDealEnquiryPage.tradedocuments_reviewPagecheckbox);
                XAlphaDealEnquiryActions.selecReview();
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

    @And("Edit and generate Invoice")
    public void editAndGenerateInvoice() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.selectgenerateInvoice();
                delay(60000);
                XAlphaDealEnquiryActions.goBacktoMainWindow();
                waitForClickable(XAlphaDealEnquiryPage.tradedocuments_emailbtn);

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

    @And("And Select Prepare Email and send")
    public void andSelectPrepareEmailAndSend() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForClickable(XAlphaDealEnquiryPage.tradedocuments_emailbtn);
                XAlphaDealEnquiryActions.selectPrepareEmail();
                XAlphaDealEnquiryActions.waitForLoadingIconToAppear();
                XAlphaDealEnquiryActions.waitForLoadingIconToDisappear();
                delay(5000);
                XAlphaDealEnquiryActions.clearAllFileds();
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

    @Then("Verify the Invoice status")
    public void verifyTheInvoiceStatus() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(XAlphaDealEnquiryPage.tradedocuments_LoadDealBtn);
                delay(5000);
                String status=  XAlphaDealEnquiryActions.getInvoiceStatus();
                Assert.assertEquals(status,"sent");
                XAlphaDealEnquiryActions.verifyDownloadBtn();
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

    @And("Click Invoice Tab and Add instruction")
    public void clickInvoiceTabAndAddInstruction() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.selectInvoiceTab();
                waitForPresent(XAlphaDealEnquiryPage.tradedocuments_editinvoiceDraft);
                XAlphaDealEnquiryActions.selectEditInvoiceDraft();
                waitForPresent(XAlphaDealEnquiryPage.tradedocuments_reviewPagecheckbox);
                XAlphaDealEnquiryActions.addInstructions();
                XAlphaDealEnquiryActions.selectallReview();
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
    @And("Add the comments")
    public void addTheComments() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.addComments();
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

    @And("click Review Again")
    public void clickReviewAgain() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.selectallReview();
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

    @And("Click the Added Instruction")
    public void clickTheAddedInstruction() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.selectAddedInstructionreview();
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

    @Then("Validate TransferInstruction is same")
    public void validateTransferInstructionIsSame() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                Assert.assertEquals(transfer_instr,transerinstr_invoice);
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

    @Then("Verify the Confirmation and Invoice Status")
    public void verifyTheConfirmationAndInvoiceStatus() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                delay(5000);
            Assert.assertEquals(XAlphaDealEnquiryActions.getStatusforbothTradeDoc(),"void");

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

    @And("Again Change processing status")
    public void againChangeProcessingStatus() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                delay(7000); //to load settled Settlement Details sub-section
                //update processing status
                XAlphaDealInputActions.dealInput_ProcessingStatus(dataMap.get("ProcessingStatus_TradeDocuments"));
                delay(3000);
                XAlphaDealInputActions.dealInput_ProcessingStatus(dataMap.get("ProcessingStatus_TradeDocuments"));

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

    @And("Choose isComplete")
    public void chooseIsComplete() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.chooseIsCompletebutton();
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

    @And("Edit the Confirmation status for Execution Deal")
    public void editTheConfirmationStatusForExecutionDeal() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.selectEditDraft();
                waitForPresent(XAlphaDealEnquiryPage.tradedocuments_comments);

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

    @And("Click the Setting icon and remove fields")
    public void clickTheSettingIconAndRemoveFields() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.clickSettingIcon();
                XAlphaDealEnquiryActions.removeFields();
                waitForPresent(XAlphaDealEnquiryPage.tradedocuments_usermenu);

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

    @And("Add additional comments")
    public void addAdditionalComments() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.addcomments();

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

    @And("Generate Order and prepare Email")
    public void generateOrderAndPrepareEmail() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.selectgenerateOrderExdeal();
                delay(60000);
                XAlphaDealEnquiryActions.goBacktoMainWindow();
                waitForClickable(XAlphaDealEnquiryPage.tradedocuments_emailbtn);

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

    @Then("Verify Email and confirmation is Sent")
    public void verifyEmailAndConfirmationIsSent() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.selectPrepareEmail();
                XAlphaDealEnquiryActions.waitForLoadingIconToAppear();
                XAlphaDealEnquiryActions.waitForLoadingIconToDisappear();
                delay(5000);
                XAlphaDealEnquiryActions.clearAllFileds();

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

    @Then("Verify the Confirmation status for Execution deal")
    public void verifyTheConfirmationStatusForExecutionDeal() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                delay(3000);
                String confirmation_status=  XAlphaDealEnquiryActions.getConfirmationStatusExdeal();
                Assert.assertEquals(confirmation_status,"sent");
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

    @And("Choose Invoice Tab")
    public void chooseInvoiceTab() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.selectInvoiceTab();
                waitForPresent(XAlphaDealEnquiryPage.tradedocuments_editinvoiceDraft);
                XAlphaDealEnquiryActions.selectEditInvoiceDraft();
                waitForPresent(XAlphaDealEnquiryPage.tradedocuments_resetbtn);

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

    @And("Add Instructions and Comments for Execution deal")
    public void addInstructionsAndCommentsForExecutionDeal() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.addInstructionsExDeal();
                XAlphaDealEnquiryActions.addTitle();
                XAlphaDealEnquiryActions.addSubTitle();
                XAlphaDealEnquiryActions.addAddress();
                XAlphaDealEnquiryActions.selecfirstReview();
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
    @And("Select Instruction review")
    public void selectInstructionReview() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.AddInstrReview();
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

    @And("Add Instructions and click Review")
    public void addInstructionsAndClickReview() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaDealEnquiryActions.addInstructions();
                XAlphaDealEnquiryActions.selecReview();
                XAlphaDealEnquiryActions.selectallReview();
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

