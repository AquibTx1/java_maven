package step_definitions.NitroX;

import NitroXPages.NitroXHomePage;
import NitroXPages.NitroXLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javassist.compiler.ast.Keyword;
import modules.NitroXActions.NitroXHome;
import org.testng.Assert;
import step_definitions.BaseStepDefinitions;
import utilities.ConfigReader;
import utilities.GlobalUtil;
import utilities.KeywordUtil;
import utilities.LogUtil;

import java.time.Clock;
import java.util.HashMap;
import java.util.Locale;

import static utilities.KeywordUtil.*;

public class NitroXHomeSteps {


    public static HashMap<String, String> dataMap = new HashMap<String, String>();

    static Class thisClass = NitroXHomeSteps.class;

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

    @When("Choose Mode, Trading Account, Base and Quote Currency")
    public void chooseModeTradingAccountBaseAndQuoteCurrency() {
        try {
            NitroXHome.selectmode(dataMap);
            NitroXHome.inputTradingAccount(dataMap);
            NitroXHome.selectBaseCurrency(dataMap);
            NitroXHome.selectQuoteCurrency(dataMap);
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
            NitroXHome.CreateOrder();
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
            waitForVisible(NitroXHomePage.invalidOrder);
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
                NitroXHome.InputOpenOrderBidPrice();
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
            waitForVisible(NitroXHomePage.validOrder);
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
            //wait and verify for the success message
            NitroXHome.getOrderCancelledSuccessMsg();
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
                NitroXHome.getOrderSubmittedSuccessMsg();
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
            NitroXHome.CreateOrder();
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
                NitroXHome.InputBuyOrderAskPrice();
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
        //get price and quantity of the first row under dealt orders
        //Assert price and quantity at the time of placing order with first row of dealt orders
        waitForVisible(NitroXHomePage.validOrder);
        KeywordUtil.click(NitroXHomePage.DealtOrderTab, "Clicked Dealt Order");
        // Assert.assertEquals(getElementText(NitroXHomePage.recentDealtOrder),NitroXHome.getSide((dataMap.get("OpenOrderNumber"))));
        //Assert.assertEquals(getElementText(NitroXHomePage.recentDealtOrder),NitroXHome.getPrice(Integer.parseInt(dataMap.get("Price"))));
        //Assert.assertEquals(getElementText(NitroXHomePage.recentDealtOrder),KeywordUtil.getCurrentSystemDateandTime());
    }

    @And("Create Buy Order Greater Than Ask Price")
    public void createBuyOrderGreaterThanAskPrice() {
        //pick lowest ask price and also store it in a variable to assert later
        //input quantity and also store it in a variable to assert later
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXHome.InputBuyOrderPrice();
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
    public void createSellOrderWithSellingPriceBidPrice() throws InterruptedException {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                // get the highest bid price add some amount into the highest bid price and also store it in a variable to use later
                NitroXHome.scrollToBidPrices();
                NitroXHome.InputthePrice(NitroXHome.getHighestBidPrice() + 100.0);
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

}
