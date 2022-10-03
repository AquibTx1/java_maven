package step_definitions.NitroX;

import pageFactory.NitroXPages.NitroXHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.NitroXActions.NitroXHome;
import org.testng.Assert;
import step_definitions.BaseStepDefinitions;
import utilities.GlobalUtil;
import utilities.KeywordUtil;
import utilities.LogUtil;

import java.util.HashMap;
import java.util.Locale;

import static utilities.KeywordUtil.*;

public class NitroXHomeSteps {


    public static HashMap<String, String> dataMap = new HashMap<String, String>();

    static Class thisClass = NitroXHomeSteps.class;

    static String firstOpenOrderTime;

    public NitroXHomeSteps() {
        dataMap = BaseStepDefinitions.dataMap;
    }

    @When("Choose mode value using dropdown")
    public void chooseModeValueUsingDropdown() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXHome.selectmode(dataMap);
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

    @When("Choose mode value using input text")
    public void chooseModeValueUsingInputText() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            //execute the step when checkSkipExecutionFlags() returns false
            try {
                NitroXHome.inputMode(dataMap);
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

    @Then("Verify mode value")
    public void verifyModeValue() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            //execute the step when checkSkipExecutionFlags() returns false
            try {
                Assert.assertEquals(getElementText(NitroXHomePage.modeValueAfterSelection), dataMap.get("Mode"));
                LogUtil.infoLog(thisClass, dataMap.get("Mode") + ": mode entered");
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

    @When("Input random mode")
    public void inputRandomMode() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            //execute the step when checkSkipExecutionFlags() returns false
            waitForVisible(NitroXHomePage.modeTextbyID);
            KeywordUtil.inputText(NitroXHomePage.modeTextbyID, "random", "Mode value entered using send keys.");
            KeywordUtil.pressEnter(NitroXHomePage.modeTextbyID);
        }
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }
    }

    @When("Enter the Trading Account")
    public void EnterTheTradingAccount() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXHome.inputTradingAccount(dataMap);
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @Then("Validate Selected Trading Account")
    public void validateSelectedTradingAccount() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                Assert.assertEquals(getElementText(NitroXHomePage.tradingAccountSibling), dataMap.get("TradingAccount"));
                LogUtil.infoLog(thisClass, dataMap.get("TradingAccount") + ": trading account entered");
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @When("Select the Trading Account")
    public void selectTheTradingAccount() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXHome.selectTradingAccount(dataMap);
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

    @And("Enter The Base and Quote Currency")
    public void enterTheBaseAndQuoteCurrency() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXHome.selectBaseCurrency(dataMap);
                NitroXHome.selectQuoteCurrency(dataMap);
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

    @Then("Validate the Base and Quote Currency")
    public void validateTheBaseAndQuoteCurrency() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            Assert.assertTrue(KeywordUtil.verifyInputText(NitroXHomePage.Basecurrency, dataMap.get("Base"), "Base Currency Entered"));
            Assert.assertTrue(KeywordUtil.verifyInputText(NitroXHomePage.Quotecurrency, dataMap.get("Quote"), "Quote Currency Entered"));
        }
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }
    }

    @When("Choose Mode, Trading Account, Base and Quote Currency for execution_bot")
    public void chooseModeTradingAccountBaseAndQuoteCurrencyExecutionBot() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {

                NitroXHome.selectmode(dataMap);
                NitroXHome.inputTradingAccount(dataMap);
                enterTheBaseAndQuoteCurrency();


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


    @When("Choose Mode, Trading Account, Base and Quote Currency")
    public void chooseModeTradingAccountBaseAndQuoteCurrency() {
        try {
            NitroXHome.selectmode(dataMap);
            NitroXHome.inputTradingAccount(dataMap);
            enterTheBaseAndQuoteCurrency();
            NitroXHome.waitForLiveChart();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            e.printStackTrace();
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("Input the Price and Quantity")
    public void InputThePriceAndQuanitiy() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            //execute the step when checkSkipExecutionFlags() returns false
            NitroXHome.InputthePrice();
            NitroXHome.InputQuantity(dataMap);
        }
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }
    }

    @And("Create A buy Order")
    public void createABuyOrder() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            //execute the step when checkSkipExecutionFlags() returns false
            NitroXHome.ClickBuyButton();
        }
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }
    }

    @Then("Validate User do not allowed to buy")
    public void validateUserDoNotAllowedToBuy() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            //execute the step when checkSkipExecutionFlags() returns false
            try {
                NitroXHome.waitForNotifMsg();
                Assert.assertTrue(NitroXHome.getNotifMsg().startsWith("Could not place order."));
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

    @And("Create A buy Order less than Market Price")
    public void createABuyOrderLessThanMarketPrice() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXHome.ClearInputPrice();
                delay(10000);
                NitroXHome.InputOpenOrderBidPrice();
                NitroXHome.ClearOrderQuantity();
                NitroXHome.InputCustomQuantity(dataMap);
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @Then("Validate Order is in Open State")
    public void validateOrderIsInOpenState() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            waitForPresent(NitroXHomePage.validOrder);
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Cancel Nth Open Order")
    public void cancelNthOpenOrder() throws InterruptedException {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            //wait for open order to display
            scrollingToElementofAPage(NitroXHomePage.openOrderTime_first, "Scrolled to element");
            NitroXHome.waitForOpenOrdersTable();
            //get time of Nth open order
            NitroXHome.getTimeofNthOpenOrder(Integer.parseInt(dataMap.get("OpenOrderNumber")));
            //click on cancel button
            NitroXHome.cancelNthOpenOrder(Integer.parseInt(dataMap.get("OpenOrderNumber")));
        }
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }
    }

    @Then("Verify Order Cancelled Based-on Time")
    public void verifyOrderCancelledBasedOnTime() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            //verify the time of very first order changes to verify the order is cancelled
            NitroXHome.verifyOrderCancelledBasedOnTime(Integer.parseInt(dataMap.get("OpenOrderNumber")));
        }
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }
    }

    @Then("Verify Cancel Order Success Message")
    public void verifyCancelOrderSuccessMessage() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                //wait and verify for the success message
                NitroXHome.getOrderCancelledSuccessMsg();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @Then("Verify Order Submitted Success Message")
    public void verifyOrderSubmittedSuccessMessage() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                //wait and verify for the success message
                //verify success message
                NitroXHome.waitForNotifMsg();
                Assert.assertTrue(NitroXHome.getNotifMsg().contains("Order submitted successfully"));
                NitroXHome.waitForInvisibleOrderSubmittedMsg();
                //increase the step counter by 1
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Click Buy Button")
    public void clickBuyButton() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXHome.ClickBuyButton();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
        }
        //increase the step counter by 1
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }
    }

    @And("Create Buy Order Equal to Ask Price")
    public void createBuyOrderEqualToAskPrice() {
        //pick lowest ask price and also store it in a variable to assert later
        //input quantity and also store it in a variable to assert later
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(NitroXHomePage.price);
                NitroXHome.scrollToAskPrices();
                NitroXHome.ClearInputPrice();
                delay(5000);
                NitroXHome.InputthePrice(NitroXHome.getHighestAskPrice());
                NitroXHome.ClearOrderQuantity();
                NitroXHome.InputCustomQuantity(dataMap);
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
        }
    }
    @And("Click Sell Button")
    public void clickSellButton() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                click(NitroXHomePage.sellbtn, "Click sell button");
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
    @Then("Validate Order Moves to Dealt Orders")
    public void validateOrderMovesToDealtOrders() {
        //Assert price and quantity at the time of placing order with first row of dealt orders
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXHome.scrollToOrdersPlaced();
                NitroXHome.waitForInvisibleOrderSubmittedMsg();
                NitroXHome.clickDealtOrdersTab();
                delay(10000);
                Assert.assertEquals(NitroXHome.getSideofNthDealtOrder(1), dataMap.get("Side").toUpperCase(Locale.ROOT));
                //Assert.assertEquals(NitroXHome.getPriceofNthDealtOrder(1), NitroXHome.getOrderFormPrice());
                Assert.assertEquals(NitroXHome.getQuantityofNthDealtOrder(1), NitroXHome.getOrderFormQuantity());
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
        }
    }

    @And("Create Buy Order Greater Than Ask Price")
    public void createBuyOrderGreaterThanAskPrice() {
        //pick lowest ask price and also store it in a variable to assert later
        //input quantity and also store it in a variable to assert later
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                //NitroXHome.InputBuyOrderPrice();
                NitroXHome.scrollToAskPrices();
                NitroXHome.ClearInputPrice();
                NitroXHome.InputthePrice(NitroXHome.getHighestAskPrice() + generateRandomNumber20to40());
                NitroXHome.ClearOrderQuantity();
                NitroXHome.InputCustomQuantity(dataMap);
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
        }
    }

    @And("Create Sell Order With Selling Price > Bid Price")
    public void createSellOrderWithSellingPriceBidPrice() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                // get the highest bid price add some amount into the highest bid price and also store it in a variable to use later
                NitroXHome.scrollToBidPrices();
                NitroXHome.ClearInputPrice();
                delay(10000);
                NitroXHome.InputthePrice(NitroXHome.getHighestBidPrice()+10000);
                NitroXHome.ClearOrderQuantity();
                NitroXHome.InputCustomQuantity(dataMap);
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
        }
        //increase the step counter by 1
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }
    }

    @Then("Validate Order Moves to Open Orders")
    public void validateOrderMovesToOpenOrders() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                //verify side, bidPrice and quantity
                NitroXHome.scrollToOrdersPlaced();
                NitroXHome.waitForInvisibleOrderSubmittedMsg();
                Assert.assertEquals(NitroXHome.getSideofNthOpenOrder(1), dataMap.get("Side").toUpperCase(Locale.ROOT));
                Assert.assertEquals(NitroXHome.getPriceofNthOpenOrder(1), NitroXHome.getOrderFormPrice());
                Assert.assertEquals(NitroXHome.getQuantityofNthOpenOrder(1), NitroXHome.getOrderFormQuantity());
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
        }
        //increase the step counter by 1
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }
    }

    @And("Cancel First Open Buy Order")
    public void cancelFirstOpenBuyOrder() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXHome.scrollToOrdersPlaced();
                NitroXHome.cancelFirstBuyOrder();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
        }
        //increase the step counter by 1
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }
    }

    @And("Cancel First Open Sell Order")
    public void cancelFirstOpenSellOrder() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXHome.scrollToOrdersPlaced();
                firstOpenOrderTime = NitroXHome.getTimeofNthOpenOrder(1);
                NitroXHome.cancelFirstSellOrder();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
        }
        //increase the step counter by 1
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }
    }

    @Then("Verify First Order Removed From Orders List")
    public void verifyOrderRemovedFromOrdersList() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXHome.waitForInvisibleOrderCancelledMsg();
                Assert.assertNotEquals(firstOpenOrderTime, NitroXHome.getTimeofNthOpenOrder(1));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
        }
        //increase the step counter by 1
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }
    }

    @And("Create Sell Order With Selling Price Equal to Bid Price")
    public void createSellOrderWithSellingPriceEqualToBidPrice() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                // get the highest bid price and also store it in a variable to use later
                NitroXHome.scrollToBidPrices();
                NitroXHome.ClearInputPrice();
                delay(10000);
                NitroXHome.InputthePrice(NitroXHome.getHighestBidPrice());
                NitroXHome.ClearOrderQuantity();
                NitroXHome.InputCustomQuantity(dataMap);
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
        }
        //increase the step counter by 1
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }
    }

    @And("Create {string} Sell Order With Selling Price > Bid Price")
    public void createSellOrderWithSellingPriceBidPrice(String arg0) {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                // get the highest bid price add some amount into the highest bid price and also store it in a variable to use later
                for (int i = 0; i < Integer.parseInt(arg0); i++) {
                    NitroXHome.ClearInputPrice();
                    delay(8000);
                    double bidPrice = NitroXHome.getHighestBidPrice();
//                    if (NitroXHome.isPresentOrderListener()) {
//                        NitroXHome.closeBottomRightNotif();
//                    }
                        waitForVisible(NitroXHomePage.price);
                        NitroXHome.InputthePrice(bidPrice + generateRandomNumber20to40());
                        NitroXHome.ClearOrderQuantity();
                        delay(8000);
                        NitroXHome.InputCustomQuantity(dataMap);
                        NitroXHome.ClickSellButton();

                        //verify success message
                        NitroXHome.waitForNotifMsg();
                        Assert.assertTrue(NitroXHome.getNotifMsg().contains("Order submitted successfully"));
                        NitroXHome.waitForInvisibleOrderSubmittedMsg();

                }
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
        }
        //increase the step counter by 1
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }
    }

    @And("Create {string} buy Order less than Market Price")
    public void createBuyOrderLessThanMarketPrice(String arg0) {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                for (int i = 0; i < Integer.parseInt(arg0); i++) {
                    NitroXHome.ClearInputPrice();
                    NitroXHome.InputthePrice(NitroXHome.getLowestAskPrice() - generateRandomNumber20to40());
                    NitroXHome.ClearOrderQuantity();
                    delay(8000);
                    NitroXHome.InputCustomQuantity(dataMap);
                    NitroXHome.ClickBuyButton();

                    //verify success message
                    NitroXHome.waitForNotifMsg();
                    Assert.assertTrue(NitroXHome.getNotifMsg().contains("Order submitted successfully"));
                    NitroXHome.waitForInvisibleOrderSubmittedMsg();
                }
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Click Buy Button and Verify the Success Message")
    public void clickBuyButtonAndVerifyTheSuccessMessage() {
        boolean flag = false;
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                //click buy button
                NitroXHome.ClickBuyButton();

                //wait and verify for the success message
                NitroXHome.waitForNotifMsg();
                int i = 0;
                while (i < 2) {
                    if (NitroXHome.getNotifMsg().contains("Could not place order.")) {
                        NitroXHome.waitForNotifMsgToDisappear();
                        delay(4000);
                        //click sell button again
                        NitroXHome.ClickBuyButton();
                        LogUtil.infoLog(thisClass, "BUY button click counter=" + i);
                        NitroXHome.waitForNotifMsg();
                        i++;
                    } else {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    Assert.assertTrue(NitroXHome.getNotifMsg().contains("Order submitted successfully"));
                    NitroXHome.waitForInvisibleOrderSubmittedMsg();
                } else {
                    LogUtil.errorLog(thisClass, "Could you not place BUY order two times in a row");
                    assert false;
                }
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
        }
        //increase the step counter by 1
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }
    }


    @And("Click Sell Button and Verify the Success Message")
    public void clickSellButtonAndVerifyTheSuccessMessage() {
        boolean flag = false;
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXHome.ClickSellButton();

                //wait and verify for the success message
                NitroXHome.waitForNotifMsg();
                int i = 0;
                while (i < 2) {
                    if (NitroXHome.getNotifMsg().contains("Could not place order.")) {
                        NitroXHome.waitForNotifMsgToDisappear();
                        delay(4000);
                        //click sell button again
                        NitroXHome.ClickSellButton();
                        LogUtil.infoLog(thisClass, "SELL button click counter=" + i);
                        NitroXHome.waitForNotifMsg();
                        i++;
                    } else {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    Assert.assertTrue(NitroXHome.getNotifMsg().contains("Order submitted successfully"));
                    NitroXHome.waitForInvisibleOrderSubmittedMsg();
                } else {
                    LogUtil.errorLog(thisClass, "Could you not place SELL order two times in a row");
                    assert false;
                }
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
    @And("Input the Price and Quantity >Available Balance")
    public void InputThePriceAndQuanitiyforSellOrder() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            //execute the step when checkSkipExecutionFlags() returns false
            try {
                delay(10000);
                NitroXHome.InputthePrice(NitroXHome.getHighestBidPrice());
                NitroXHome.InputQuantity(dataMap);
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            NitroXHome.InputQuantity(dataMap);
        }
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }
    }

    @Then("Validate User do not allowed to Sell")
    public void validateUserDoNotAllowedToSell() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            //execute the step when checkSkipExecutionFlags() returns false
            try {
                NitroXHome.waitForNotifMsg();
                Assert.assertTrue(NitroXHome.getNotifMsg().startsWith("Could not place order."));
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

    @And("Select OTC Price")
    public void selectOTCPrice() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXHome.selectOTCPrice();
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

    @And("Select Base and Input Quantity ,DeliveryTime")
    public void selectBaseAndInputQuantityDeliveryTime() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            //execute the step when checkSkipExecutionFlags() returns false
            try {
                waitForVisible(NitroXHomePage.OTCPriceWindow);
                NitroXHome.inputOTCPriceQuantity();
                NitroXHome.inputOTCPriceTime();

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


    @And("Click Calculate")
    public void clickCalculate() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            //execute the step when checkSkipExecutionFlags() returns false
            try {
                NitroXHome.selectCalculate();
                waitForPresent(NitroXHomePage.OTCTimedate);
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

    @And("Verify the Ask and Bid Price displayed")
    public void verifyTheAskAndBidPriceDisplayed() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            //execute the step when checkSkipExecutionFlags() returns false
            try {
                NitroXHome.validateOTCPrice();
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

    @And("Input Participation and No Reference")
    public void inputParticipationAndReferenceAsNA() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            //execute the step when checkSkipExecutionFlags() returns false
            try {
                NitroXHome.inputOTCPriceParticipation();
                //NitroXHome.selectRefrence();
                NitroXHome.click_Reference(dataMap.get("Reference"));
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

    @And("Select Quote from OTC Window")
    public void selectQuoteFromOTCWindow() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            //execute the step when checkSkipExecutionFlags() returns false
            try {
                NitroXHome.selectQuote(dataMap.get("Reference Coin"));
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

    @And("Select Reference Range")
    public void selectReferenceRange() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            //execute the step when checkSkipExecutionFlags() returns false
            try {
               NitroXHome.selectRefRange(dataMap);
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
}
