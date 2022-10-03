package step_definitions.NitroX;

import com.gargoylesoftware.htmlunit.NicelyResynchronizingAjaxController;
import modules.NitroXActions.NitroXBuySellFutureAction;
import modules.NitroXActions.NitroXHome;
import pageFactory.NitroXPages.NitroXBotsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.NitroXActions.NitroXBotsAction;
import org.testng.Assert;
import pageFactory.NitroXPages.NitroXHomePage;
import pageFactory.NitroXPages.NitroXLoginPage;
import step_definitions.BaseStepDefinitions;
import utilities.ConfigReader;
import utilities.GlobalUtil;

import java.util.HashMap;
import java.util.Locale;

import static modules.NitroXActions.NitroXBotsAction.getTargetAccountPosition;
import static modules.NitroXActions.NitroXBotsAction.serviceidAfter;
import static utilities.KeywordUtil.*;

public class NitroXBotsSteps {


    public static int totalbotbefore, finalbotvalue, serviceIdbefore;

    public static double botdetailquantity;
    public static HashMap<String, String> dataMap;

    public NitroXBotsSteps() {
        dataMap = BaseStepDefinitions.dataMap;
    }

    @And("Verify total Bots Before staring the Buy execution")
    public void verifyCountNumberOfBotsBeforeBuyingSelling() {
        // Count the Total Bots before Starting Bot Execution

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(NitroXBotsPage.startbtn, "Scrolled to Total Bot Bot Filtered");
                totalbotbefore = NitroXBotsAction.getTotalFilteredBots();//to be Used later
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

    @And("Click Start Bot ,Select the Service,Method and Input Bot Quantity")
    public void clickStartBotSelectTheServiceMethodAndInputBotQuantity() {
        // Start the Bot Execution for Buy Order
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(NitroXBotsPage.startbtn, "Scrolled to start element");
                NitroXBotsAction.clickStart();
                NitroXBotsAction.waitforBotWindow();
//                NitroXBotsAction.inputService(dataMap.get("Service"));
                NitroXBotsAction.inputMethod(dataMap.get("Method"));
                NitroXBotsAction.inputBotQuantity(dataMap.get("Bot Quantity"));
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

    @When("Select Buy Order and Select the MinTime and MaxTime Break")
    public void select_buy_order_and_select_the_min_time_and_max_time_break() {
        //input Max Price and Min Price
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(NitroXBotsPage.orderdirection);
                NitroXBotsAction.inputOrderDirection(dataMap.get("Order Direction"));
                NitroXBotsAction.inputMinTime(dataMap.get("Min Time Break"));
                NitroXBotsAction.inputMaxTime(dataMap.get("Max Time Break"));
                NitroXBotsAction.inputMinPrice(dataMap.get("Min Price"));
                NitroXBotsAction.inputMaxPrice(dataMap.get("Max Price"));

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

    @When("Input the Time, Quantity and Submit the Order")
    public void input_the_time_quantity_and_submit_the_order() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {

                NitroXBotsAction.inputOrderAmount(dataMap.get("Order Amount"));
                // NitroXBotsAction.inputTrigerCondtion();
                NitroXBotsAction.clickSubmit();
                delay(35000);
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

    @Then("Verify Bot Count in Total Filtered")
    public void verifyBotCountInTotalFiltered() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.getBotSubmitSuccessMsg();
                delay(30000);
                Assert.assertEquals(NitroXBotsAction.getTotalFilteredBots() - 1, totalbotbefore);
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

    @And("Click total filtered bots and click the detail bot")
    public void clickTotalFilteredBotsAndClickTheDetailBot() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(NitroXBotsPage.startbtn, "Scrolled to start element");
                NitroXBotsAction.selecttotalBots();
                waitForVisible(NitroXBotsPage.BotTime);
                NitroXBotsAction.sortStartTime();
                NitroXBotsAction.selectLatestBotName();
                NitroXBotsAction.selectConfig();
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

    @Then("Verify new Bot in detail and config")
    public void verifyNewBotInDetaiilAndConfig() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                Assert.assertEquals(dataMap.get("Mode"), NitroXBotsAction.getModefromBotDetailPage());
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

    @And("Verify the Buy Order in Dealt Order")
    public void CloseConfigTabandVerifyOrderinDealttoBuy() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.CloseConfig2();
                NitroXBotsAction.CloseBotDetail();
                NitroXBotsAction.clickDealtOrdersTab();
                delay(15000);
                Assert.assertEquals(NitroXHome.getSideofNthDealtOrder(1), dataMap.get("Order Direction"));
                Assert.assertEquals(NitroXHome.getPriceofNthDealtOrder(1), NitroXBotsAction.getPrice());
                NitroXBotsAction.stopalltheBot();
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


    /*******************************Steps For Sell**************************************************************************/

    @And("Verify total Bots Before starting Sell execution")
    public void verifyCountNumberOfBotsBeforeSelling() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.pauseAllBots();
                scrollingToElementofAPage(NitroXBotsPage.startbtn, "Scrolled to Total Bot Before");
                totalbotbefore = NitroXBotsAction.getTotalFilteredBots();
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


    @And("Start Bot ,Select the Service,Method and Input Bot Quantity")
    public void clickStartBotSelectServiceAndInputBotQuantity() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(NitroXBotsPage.startbtn, "Scrolled to start element");
                NitroXBotsAction.clickStart();
                NitroXBotsAction.waitforBotWindow();
               // NitroXBotsAction.inputService(dataMap.get("Service"));
                NitroXBotsAction.inputMethod(dataMap.get("Method"));
                NitroXBotsAction.inputBotQuantity(dataMap.get("Bot Quantity"));
                waitForVisible(NitroXBotsPage.orderdirection);

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

    @When("Select Sell Order and Select the MinTime and MaxTime Break")
    public void select_sell_order_and_select_the_min_time_and_max_time_break() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(NitroXBotsPage.orderdirection);
                NitroXBotsAction.inputOrderDirection(dataMap.get("Order Direction"));
                NitroXBotsAction.inputMinTime(dataMap.get("Min Time Break"));
                NitroXBotsAction.inputMaxTime(dataMap.get("Max Time Break"));
                NitroXBotsAction.inputMinPrice(dataMap.get("Min Price"));
                NitroXBotsAction.inputMaxPrice(dataMap.get("Max Price"));

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

    @And("Verify the Sell Order in Dealt Order")
    public void CloseConfigTabandVerifyOrderinDealt() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.CloseConfig2();
                NitroXBotsAction.CloseBotDetail();
                NitroXBotsAction.clickDealtOrdersTab();
                delay(15000);
                Assert.assertEquals(NitroXHome.getSideofNthDealtOrder(1), dataMap.get("Order Direction"));
                Assert.assertEquals(NitroXHome.getPriceofNthDealtOrder(1), NitroXBotsAction.getBidPrice());
                NitroXBotsAction.stopalltheBot();
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


    /****************************************SNIPER BOT****************************************************************/

    @And("Verify total Bots before starting the Sniper Bot execution")
    public void CountNumberOfBotsBeforeBuyingSelling() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(NitroXBotsPage.startbtn, "Scrolled to Total Bot Filtered");
                totalbotbefore = NitroXBotsAction.getTotalFilteredBots();
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

    @And("Click Start Bot and select the Service,Method and Input Bot Quantity")
    public void StartBotSelectTheServiceMethodAndInputBotQuantity() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(NitroXBotsPage.startbtn, "Scrolled to start element");
                NitroXBotsAction.clickStart();
                NitroXBotsAction.waitforBotWindow();
                //NitroXBotsAction.inputService(dataMap.get("Service"));
                NitroXBotsAction.inputMethod(dataMap.get("Method"));
                NitroXBotsAction.inputBotQuantity(dataMap.get("Bot Quantity"));
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

    @When("Select Buy Order ,Side and Min,Max Price and MaxSlippageThreashold")
    public void selectSideMinPriceandMaxPrice() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {

                NitroXBotsAction.inputTotalAmount(dataMap.get("TotalAmount"));
                NitroXBotsAction.selectSide(dataMap);
                NitroXBotsAction.inputMinPriceforSniper(dataMap);
                NitroXBotsAction.inputMaxPriceforSniper(dataMap);
                NitroXBotsAction.inputMaxThreshold(dataMap);
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
    @And("Enter Quantity and submit the order")
    public void enterQuantityAndSubmitTheOrder() {
        //Snipper Sell Order
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.clickSubmit();
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
    @Then("Verify Bots in Total Filtered on HomePage")
    public void verifyBotCountTotalFiltered() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.getBotSubmitSuccessMsg();
                delay(20000);
                Assert.assertEquals(NitroXBotsAction.getTotalFilteredBots() - 1, totalbotbefore);
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
    @And("Click Total Filtered Bots and check the Bot in Detail and Config")
    public void clickTotalFilteredBotsValidatetheBot() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(NitroXBotsPage.startbtn, "Scrolled to start element");
                NitroXBotsAction.selecttotalBots();
                waitForVisible(NitroXBotsPage.BotTime);
                NitroXBotsAction.sortStartTime();
                delay(10000);
                NitroXBotsAction.selectLatestBotName();

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
    @Then("Verify new Bot in detail and config for Snipper Bot")
    public void verifyNewBotInDetaiilAndConfigTab() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                Assert.assertEquals(NitroXBotsAction.getAmountfromBotDetailSnipper(), dataMap.get("TotalAmount"));
                NitroXBotsAction.selectConfig();
                Assert.assertEquals(NitroXBotsAction.getBotDetailSide(),dataMap.get("Side"));
                // Assert.assertEquals();
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

    @And("Verify the Order in Dealt Order for Sniper Bot")
    public void CloseConfigTabandVerifyOrderinDealtOrderSniper() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.CloseConfig2();
                NitroXBotsAction.CloseBotDetail();
                NitroXBotsAction.clickDealtOrdersTab();
                delay(20000);
               // Assert.assertEquals(NitroXBotsAction.dealtamount, dataMap.get("TotalAmount"));
                Assert.assertEquals(NitroXHome.getSideofNthDealtOrder(1),dataMap.get("Side"));
                NitroXBotsAction.stopalltheBot();
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

    /***SNiper Sell Order**************************************/
    @When("Select Sell Order ,Side and Min,Max Price and MaxSlippageThreashold")
    public void selectSideMinPriceandMaxPriceforSellOrder() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.inputTotalAmount(dataMap.get("TotalAmount"));
                NitroXBotsAction.selectSide(dataMap);
                NitroXBotsAction.inputMinPriceforSniper(dataMap);
                NitroXBotsAction.inputMaxPriceforSniper(dataMap);
                NitroXBotsAction.inputMaxThreshold(dataMap);
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

    @And("Verify the Order in Dealt Order for Sniper Bot Sell Order")
    public void CloseConfigTabandVerifyOrderinDealtOrderSniperSell() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.CloseConfig2();
                NitroXBotsAction.CloseBotDetail();
                NitroXBotsAction.clickDealtOrdersTab();
                delay(20000);
                Assert.assertEquals(NitroXHome.getSideofNthDealtOrder(1),dataMap.get("Side"));
                NitroXBotsAction.stopalltheBot();
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


    /************TWAP BOT*************************************************/

    @And("Verify total Bots before starting the Twap_Bot execution")
    public void CountNumberOfBotsBeforeBuyingSellingTwap() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(NitroXBotsPage.startbtn, "Scrolled to Total Bot Filtered");
                totalbotbefore = NitroXBotsAction.getTotalFilteredBots();
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

    @And("Choose Side,Quantity,and Duration")
    public void chooseSideQuantityAndDuration() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.selectSideTwapBot(dataMap);
                NitroXBotsAction.inputTwapBotQuantity(dataMap.get("Quantity"));
                NitroXBotsAction.inputDuration(dataMap);
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

    @And("Provide Deal Ref and submit")
    public void provideDealRefAndSubmit() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.inputDealRefNumber();
                NitroXBotsAction.clickSubmit();
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

    @And("Click Total Filtered Bots tab & check the Bot in Detail and Config for Twap Bot")
    public void clickTotalFilteredBotsTabCheckTheBotInDetailAndConfigForTwapBot() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(NitroXBotsPage.startbtn, "Scrolled to start element");
                NitroXBotsAction.selecttotalBots();
                waitForVisible(NitroXBotsPage.BotTime);
                NitroXBotsAction.sortStartTime();
                NitroXBotsAction.selectLatestBotName();
                NitroXBotsAction.validateStatus();
                NitroXBotsAction.CloseConfig2();
                NitroXBotsAction.CloseBotDetail();

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

    @Then("Verify new Bot in detail and config for Twap_Bot")
    public void verifyNewBotInDetaiilAndConfigTabforTwapBot() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.refreshPage();
                NitroXBotsAction.selecttotalBots();
                NitroXBotsAction.sortStartTime();
                NitroXBotsAction.selectLatestBotName();
                NitroXBotsAction.selectConfig();
                Assert.assertEquals(NitroXBotsAction.getDealRef(), NitroXBotsAction.dealref);
               // Assert.assertEquals(NitroXBotsAction.getQuantity(), dataMap.get("Quantity"));
                NitroXBotsAction.CloseConfig2();
                NitroXBotsAction.CloseBotDetail();
                NitroXBotsAction.stopCurrentBot();
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

    @Then("Verify the Order in Dealt Order for Twap Bot")
    public void verifyTheOrderInDealtOrderForTwapBot() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(NitroXBotsPage.DealtOrderTab, "Scrolled to Twap Order");
                NitroXBotsAction.clickDealtOrdersTab();
                Assert.assertEquals(NitroXBotsAction.getSide(), dataMap.get("Side"));
                NitroXBotsAction.stopCurrentBot();
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

    /***************************************Pair Trading BOT************************************/
    @And("Verify total Bots before starting the Pair_Trading Bot execution")
    public void CountNumberOfBotsBeforeBuyingSellingPairTrading() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(NitroXBotsPage.startbtn, "Scrolled to Total Bot Filtered");
                totalbotbefore = NitroXBotsAction.getTotalFilteredBots();
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

    @And("Click start Bot and select the Service,Method and Choose Bot Quantity")
    public void startBotSelectServiceMethodandInputBotQuantityTradingBot() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(NitroXBotsPage.startbtn, "Scrolled to start element");
                NitroXBotsAction.clickStart();
                NitroXBotsAction.waitforBotWindow();
                //NitroXBotsAction.inputService(dataMap.get("Service"));
                NitroXBotsAction.inputMethod(dataMap.get("Method"));
                NitroXBotsAction.inputBotQuantity(dataMap.get("Bot Quantity"));
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

    @And("Choose Side,Quantity,and Slice_Size")
    public void chooseSideQuantityAndSlice_Size() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.selectMainPairTradingSide(dataMap);
                NitroXBotsAction.inputPairBotQuantity(dataMap.get("Quantity"));
                NitroXBotsAction.inputSliceSize(dataMap.get("SliceSize"));
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

    @And("Choose AccountId,Base,Quote and Side in Pair leg and submit")
    public void chooseAccountIdBaseQuoteAndSideInPairLegAndSubmit() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.selectmodePairTradingBot(dataMap);
                NitroXBotsAction.inputTradingAccount(dataMap);
                NitroXBotsAction.inputBaseCurrency(dataMap);
                NitroXBotsAction.inputQuoteCurrency(dataMap);
                NitroXBotsAction.selectSubPairSide(dataMap);
                scrollingToElementofAPage(NitroXBotsPage.submitbtn, "Scrolled to Submit Button");
                NitroXBotsAction.clickSubmit();

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

    @Then("Verify Pair_Trading Bot in Total Filtered on homePage")
    public void verifyPairTradingBotCountTotalFiltered() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(NitroXBotsPage.botsuccessMsg);
                NitroXBotsAction.getBotSubmitSuccessMsg();
                delay(40000);
                Assert.assertEquals(NitroXBotsAction.getTotalFilteredBots() - 1, totalbotbefore);
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

    @And("Click Total Filtered Bots tab & check the Bot in Detail and Config for Pair_Trading Bot")
    public void clickTotalFilteredBotsTabCheckTheBotInDetailAndConfigForPairTradingBot() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(NitroXBotsPage.startbtn, "Scrolled to start element");
                NitroXBotsAction.selecttotalBots();
                NitroXBotsAction.sortStartTime();
                NitroXBotsAction.selectLatestBotName();
                NitroXBotsAction.validatePairTradingStatus();
                Assert.assertTrue((NitroXBotsAction.getPairBotNotifMsg()));
                NitroXBotsAction.selectConfig();
                delay(2000);
                //botdetailquantity=NitroXBotsAction.getBotDetailQuantity();
                //Assert.assertEquals(botdetailquantity,dataMap.get("Quantity"));
                NitroXBotsAction.CloseConfig();
                NitroXBotsAction.CloseBotDetail();

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

    @And("Collect the Target Account Position")
    public void collectTheTargetAccountPosition() {
        {
            if (BaseStepDefinitions.checkSkipExecutionFlags()) {
                BaseStepDefinitions.skipThisStep();
            } else {
                try {

                    NitroXBotsAction.getTargetAccountPosition(dataMap);
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

    @When("Input the Time, Quantity and Submit the Order for FutureMode")
    public void input_the_time_quantity_and_submit_the_order_FutureMode() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.inputOrderAmount(dataMap.get("Order Amount"));
                NitroXBotsAction.inputTrigerCondtion();
                NitroXBotsAction.inputTargetAccountPosition(dataMap);
                NitroXBotsAction.clickSubmit();
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


    @Then("Verify new Bot in detail and config for FutureMode")
    public void verifyNewBotInDetaiilAndConfigforFutureMode() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(NitroXBotsPage.trrigger_futuremode);
                Assert.assertEquals(NitroXBotsAction.getTrigerConditionvalueforFutureMode(), NitroXBotsAction.trrigervalue);

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

    @And("Verify the Order in Dealt Order for FutureMode")
    public void CloseConfigTabandVerifyOrderinDealttoBuyforFuture() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.CloseConfig();
                NitroXBotsAction.CloseBotDetail();
                scrollingToElementofAPage(NitroXBotsPage.DealtOrderTab, "Scrolled to Recent Orders");
                NitroXBotsAction.clickDealtOrdersTab();
                delay(20000);
                Assert.assertEquals(NitroXHome.getSideofNthDealtOrder(1), dataMap.get("Order Direction"));
                // Assert.assertEquals(NitroXHome.getPriceofNthDealtOrder(1), NitroXBotsAction.getPrice());
                NitroXBotsAction.stopCurrentBot();

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

    @Then("Verify new Bot in detail and config for Snipper Bot-FutureMode")
    public void verifyNewBotInDetaiilAndConfigTabFutureMode() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                delay(10000);
                waitForVisible(NitroXBotsPage.botdetail_snipper);
                Assert.assertEquals(NitroXBotsAction.getAmountfromBotDetailSnipper(), dataMap.get("TotalAmount"));
                NitroXBotsAction.selectConfig();
                Assert.assertEquals(NitroXBotsAction.getTrigerConditionvalueforFutureMode(), NitroXBotsAction.trrigervalue);

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

    @And("Verify the Order in Dealt Order for Sniper Bot-FutureMode")
    public void CloseConfigTabandVerifyOrderinDealtOrderSniperFutureMode() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.CloseConfig();
                NitroXBotsAction.CloseBotDetail();
                NitroXBotsAction.clickDealtOrdersTab();
                delay(10000);
                Assert.assertEquals(NitroXHome.getSideofNthDealtOrder(1),dataMap.get("Side"));
                //Assert.assertEquals(NitroXBotsAction.dealtamount, dataMap.get("TotalAmount"));
                NitroXBotsAction.stopCurrentBot();

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

    @And("Verify the Order in Dealt Order for Sniper Bot Sell Order-FutureMode")
    public void CloseConfigTabandVerifyOrderinDealtOrderSniperFutureModeSell() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.CloseConfig();
                NitroXBotsAction.CloseBotDetail();
                NitroXBotsAction.clickDealtOrdersTab();
                delay(10000);
                Assert.assertEquals(NitroXHome.getSideofNthDealtOrder(1),dataMap.get("Side"));
                NitroXBotsAction.stopCurrentBot();

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
    @And("Click Total Filtered Bots and pause the Bot")
    public void clickTotalFilteredBotsPauseBots() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(NitroXBotsPage.startbtn, "Scrolled to start element");
                NitroXBotsAction.selecttotalBots();
                waitForVisible(NitroXBotsPage.BotTime);
                NitroXBotsAction.sortStartTime();
                NitroXBotsAction.selectLatestBot();
                NitroXBotsAction.pauseCurrentBot();

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

    @Then("Verify current running Bot is paused")
    public void verifyCurrentRunningBotIsPaused() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXHome.waitForNotifMsg();
                Assert.assertTrue(NitroXHome.getNotifMsg().contains("1 bots have been queued to be paused."));
                waitForInVisibile(NitroXHomePage.bottomRightNotifText);
                NitroXBotsAction.stopCurrentRunningBot();
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

    @Then("Verify the Order in Dealt Order for PairTrading Bot")
    public void verifyTheOrderInDealtOrderForSameBot() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(NitroXBotsPage.DealtOrderTab,"Scrolled to Page");
                NitroXBotsAction.clickDealtOrdersTab();
                delay(2000);
                Assert.assertEquals(Double.toString(NitroXBotsAction.getDealtOrderQuantity()), dataMap.get("SliceSize"));
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

    @And("Click Total Filtered Bots and Resume the Bot")
    public void clickTotalFilteredBotsAndResumeTheBot() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(NitroXBotsPage.startbtn, "Scrolled to start element");
                NitroXBotsAction.selecttotalBots();
                NitroXBotsAction.sortStartTime();
                NitroXBotsAction.selectLatestBot();
                NitroXBotsAction.resumeCurrentBot();
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

    @Then("Verify Bot has started again")
    public void verifyBotHasStartedAgain() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXHome.waitForNotifMsg();
                Assert.assertTrue(NitroXHome.getNotifMsg().contains("1 bots have been queued to be resumed."));
                waitForInVisibile(NitroXHomePage.bottomRightNotifText);
                NitroXBotsAction.stopCurrentRunningBot();
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

    @And("Click Total Filtered Bots and restart the Bot")
    public void clickTotalFilteredBotsRestartBots() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(NitroXBotsPage.startbtn, "Scrolled to start element");
                NitroXBotsAction.selecttotalBots();
                waitForVisible(NitroXBotsPage.BotTime);
                NitroXBotsAction.sortStartTime();
                delay(2000);
                NitroXBotsAction.selectLatestBot();
                //serviceIdbefore=NitroXBotsAction.getServiceIDBefore();
                NitroXBotsAction.restartCurrentBot();
                waitForVisible(NitroXBotsPage.persist);
                //delay(10000);
                //int serviceidafter=NitroXBotsAction.getServiceIDAfter();
                // Assert.assertNotEquals(serviceIdbefore,serviceidafter);
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

    @Then("Verify current running Bot is restarted")
    public void verifyCurrentRunningBotIsrestarted() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXHome.waitForNotifMsg();
                Assert.assertTrue(NitroXHome.getNotifMsg().contains("1 bots have been queued to be restarted."));
                waitForInVisibile(NitroXHomePage.bottomRightNotifText);
                NitroXBotsAction.stopCurrentRunningBot();
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
    @And("Click Persist Status No")
    public void clickPersistStatusNo() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.clickPersistNo();
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

    @And("Click on Persist Yes")
    public void clickOnPersistYes() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.clickPersistyes();
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

    @And("Click Total Filtered Bots and stop current running Bot")
    public void clickTotalFilteredBotsAndStopCurrentRunningBot() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(NitroXBotsPage.startbtn, "Scrolled to start element");
                NitroXBotsAction.selecttotalBots();
                waitForVisible(NitroXBotsPage.BotTime);
                NitroXBotsAction.sortStartTime();
                delay(2000);
                NitroXBotsAction.selectLatestBot();
                NitroXBotsAction.stopCurrentRunningBot();

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

    @Then("Verify current running Bot is stopped")
    public void verifyCurrentRunningBotIsStopped() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXHome.waitForNotifMsg();
                Assert.assertTrue(NitroXHome.getNotifMsg().contains("1 bots have been queued to be stopped."));
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

    @And("Click Total Filtered Bots tab & check the Bot in Detail and Config for Leg Pair_Trading Bot")
    public void clickTotalFilteredBotsTabCheckTheBotInDetailAndConfigForLegPair_TradingBot() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(NitroXBotsPage.startbtn, "Scrolled to start element");
                NitroXBotsAction.selecttotalBots();
                NitroXBotsAction.sortStartTime();
                NitroXBotsAction.selectLatestBotName();
                NitroXBotsAction.validateLegPairTradingStatus();
                NitroXBotsAction.CloseConfig();
                NitroXBotsAction.CloseBotDetail();
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
    @And("Click total filtered bots and click the latest running bot to edit")
    public void clickTotalFilteredBotsAndClickTheLatestRunningBotToEdit() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(NitroXBotsPage.startbtn, "Scrolled to start element");
                NitroXBotsAction.selecttotalBots();
                waitForVisible(NitroXBotsPage.BotTime);
                NitroXBotsAction.sortStartTime();
                delay(2000);
                NitroXBotsAction.selectLatestBot();
                NitroXBotsAction.editLatestBot();

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

    @Then("Input any field with new value and again submit")
    public void inputAnyFieldWithNewValueAndAgainSubmit() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.inputNewOrderAmount(dataMap);
                NitroXBotsAction.clickSubmit();
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
    @Then("Verify the Bot is updated")
    public void verifyTheBotIsEdit() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXHome.waitForNotifMsg();
                Assert.assertTrue(NitroXHome.getNotifMsg().startsWith("Bot has queued to be updated."));
                NitroXBotsAction.refreshPage();
                waitForVisible(NitroXBotsPage.totalfilered);
                NitroXBotsAction.selecttotalBots();
                waitForVisible(NitroXBotsPage.BotTime);
                delay(15000);
                NitroXBotsAction.sortStartTime();
                NitroXBotsAction.selectLatestBotName();
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

    @Then("Verify the Config Tab for modified field")
    public void verifyTheConfigTabForModifiedField() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.selectConfig();
                Assert.assertEquals(Double.toString(NitroXBotsAction.getOrderAmount()), dataMap.get("New Order Amount"));
                NitroXBotsAction.CloseConfig2();
                delay(2000);
                NitroXBotsAction.stopCurrentRunningBot();
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

    @And("Input any field with new value and again submit for Sniper Bot")
    public void inputAnyFieldWithNewValueAndAgainSubmitForSniperBot() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.inputTotalAmount(dataMap.get("S_UpdatedTotalAmount"));
                NitroXBotsAction.clickSubmit();
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

    @Then("Verify the Config Tab for modified field in Sniper Bot")
    public void verifyTheConfigTabForModifiedFieldInSniperBot() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                Assert.assertEquals(NitroXBotsAction.getAmountfromBotDetailSnipper(), dataMap.get("S_UpdatedTotalAmount"));
                NitroXBotsAction.selectConfig();
                Assert.assertEquals(NitroXBotsAction.getBotDetailSide(),dataMap.get("Side"));
                NitroXBotsAction.CloseConfig2();
                delay(2000);
                NitroXBotsAction.movetoListandStopBots();
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

    @And("submit the order")
    public void submitTheOrder() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.clickSubmit();
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

    @And("Input any field with new value and again submit for PairTrading Bot")
    public void inputAnyFieldWithNewValueAndAgainSubmitForPairTradingBot() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.inputSliceSize(dataMap.get("UpdatedSliceSize"));
                NitroXBotsAction.clickSubmit();
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

    @Then("Verify the Config Tab for modified field in PairTrading Bot")
    public void verifyTheConfigTabForModifiedFieldInPairTradingBot() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.selectConfig();
                Assert.assertEquals(NitroXBotsAction.getSliceSize(), dataMap.get("UpdatedSliceSize"));
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

    @And("Click total filtered bots and click the latest running bot and create duplicate Bot")
    public void clickTotalFilteredBotsAndClickTheLatestRunningBotAndCreateDuplicateBot() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(NitroXBotsPage.startbtn, "Scrolled to start element");
                NitroXBotsAction.selecttotalBots();
                NitroXBotsAction.sortStartTime();
                NitroXBotsAction.selectLatestBot();
                NitroXBotsAction.duplicateLatestBot();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
        }
    }
    @Then("Verify duplicate bot is created")
    public void verifyDuplicateBotIsCreated() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXHome.waitForNotifMsg();
                Assert.assertTrue(NitroXHome.getNotifMsg().startsWith("1 Bot(s) were suceessfully started."));
                NitroXBotsAction.refreshPage();
                delay(2000);
                NitroXBotsAction.selecttotalBots();
                delay(15000);
                waitForVisible(NitroXBotsPage.BotTime);
                NitroXBotsAction.sortStartTime();
                NitroXBotsAction.selectLatestBotName();
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

    @And("Input any field with new value and again submit for Twap Bot")
    public void inputAnyFieldWithNewValueAndAgainSubmitForTwapBot()
    {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.inputTwapBotQuantity(dataMap.get("T_UpdatedQuantity"));
                NitroXBotsAction.clickSubmit();
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
    @Then("Verify the Config Tab for modified field in Twap Bot")
    public void verifyTheConfigTabForModifiedFieldInTwapBot() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.selectConfig();
               Assert.assertEquals(Double.toString(NitroXBotsAction.getBotDetailQuantity()),dataMap.get("T_UpdatedQuantity"));
                NitroXBotsAction.CloseConfig2();
                delay(2000);
                NitroXBotsAction.movetoListandStopBots();
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
    @And("Click total filtered bots")
    public void clickTotalFilteredBots()
    {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                delay(10000);
                NitroXBotsAction.selecttotalBots();
                NitroXBotsAction.sortStartTime();
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
    @Then("Verify the list of running bots is displayed")
    public void verifyTheListOfRunningBotsIsDisplayed()
    {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                //Assert.assertTrue(NitroXBotsAction.getAllBots());
               Assert.assertTrue(NitroXBotsAction.validaterunningbot());
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

    @And("Stop All the Bots")
    public void stopAllTheBots()
    {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.CheckBotStatus();
                NitroXBotsAction.stopAllBots();
                NitroXBotsAction.closeBot();
                NitroXBotsAction.refreshPage();
                NitroXBotsAction.selecttotalBots();
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

    @Then("Verify the bot list is empty")
    public void verifyTheBotListIsEmpty() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(NitroXBotsPage.nodatabotdetail);
                Assert.assertTrue(NitroXBotsAction.validateEmptyList());
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

    @And("Pause all the Bots")
    public void pauseAllTheBots() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.pauseAllBots();
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

    @When("Choose Mode,Trading Account")
    public void chooseModeAndTradingAccount() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXHome.selectmode(dataMap);
                NitroXHome.inputTradingAccount(dataMap);
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

    @Then("Verify the count of Bots in Total Filtered")
    public void verifyTheCountOfBotsInTotalFiltered() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                Assert.assertTrue(NitroXBotsAction.validateBotDisplayed());
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

    @And("Check if No Current running Bot")
    public void checkIfNoCurrentRunningBot() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                delay(2000);
                NitroXBotsAction.validateBots(dataMap);
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
    @And("Validate the Bots")
    public void validateTheBots() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.selecttotalBots();
                waitForVisible(NitroXBotsPage.BotTime);
                while (NitroXHome.isBotPresent())
                {
                    NitroXBotsAction.sortStartTime();
                    NitroXBotsAction.selectCheckBoxList();
                    NitroXBotsAction.stopBots();
                    delay(10000);
                }
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

    @And("Check the Current running Bot")
    public void checkTheCurrentRunningBot() {

            if (BaseStepDefinitions.checkSkipExecutionFlags()) {
                BaseStepDefinitions.skipThisStep();
            } else {
                try {
                    NitroXBotsAction.countBots(dataMap);
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

    @And("Pause the Current running bot")
    public void pauseTheCurrentRunningBot()
    {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(NitroXBotsPage.startbtn, "Scrolled to start element");
                NitroXBotsAction.selecttotalBots();
                waitForVisible(NitroXBotsPage.BotTime);
                NitroXBotsAction.sortStartTime();
                delay(2000);
                NitroXBotsAction.selectLatestBot();
                NitroXBotsAction.pauseCurrentBot();
                NitroXHome.waitForNotifMsg();
                Assert.assertTrue(NitroXHome.getNotifMsg().startsWith("1 bots have been queued to be paused."));
                NitroXHome.waitForNotifMsg();
                waitForInVisibile(NitroXHomePage.bottomRightNotifText);
                NitroXBotsAction.restartCurrentBot();
                waitForVisible(NitroXBotsPage.persist);
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

    @And("Pause the Bot")
    public void pauseTheBot() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(NitroXBotsPage.startbtn, "Scrolled to start element");
                NitroXBotsAction.selecttotalBots();
                NitroXBotsAction.sortStartTime();
                delay(2000);
                NitroXBotsAction.selectLatestBot();
                NitroXBotsAction.pauseCurrentBot();
                NitroXHome.waitForNotifMsg();
                Assert.assertTrue(NitroXHome.getNotifMsg().startsWith("1 bots have been queued to be paused."));
                waitForInVisibile(NitroXHomePage.bottomRightNotifDesc);
                NitroXBotsAction.editLatestBot();
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

    @Then("Verify fields are updated in BotDetail")
    public void verifyFieldsAreUpdated() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                Assert.assertEquals(NitroXBotsAction.getTotalAmountfromBotDetailSnipper(), dataMap.get("S_UpdatedTotalAmount"));
                NitroXBotsAction.selectConfig();
                Assert.assertEquals(NitroXBotsAction.getBotDetailSide(),dataMap.get("Side"));
                NitroXBotsAction.CloseConfig2();
                delay(2000);
                NitroXBotsAction.movetoListandStopBots();
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

    @And("Close the Detailed Bot")
    public void closeTheDetailedBot() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.closeBot();
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

    @And("Input Base and Quote Currency")
    public void inputBaseAndQuoteCurrency()
    {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(NitroXHomePage.Basecurrency);
                NitroXHome.selectBaseCurrency(dataMap);
                NitroXHome.selectQuoteCurrency(dataMap);
               // NitroXHome.waitForLiveChart();
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

    @And("Clear the Base and Quote")
    public void chooseClearTheBaseAndQuote()
    {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXHome.clearBaseCurrency();
                NitroXHome.clearQuoteCurrency();
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

    @And("Wait for sometime to get the Bots Updated")
    public void waitForSometimeToGetTheBotsUpdated() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
               delay(25000);
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

    @And("Input the Quantity")
    public void inputTheQuantity() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {

                NitroXBotsAction.inputOrderAmount(dataMap.get("Order Amount"));
                // NitroXBotsAction.inputTrigerCondtion();
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

    @And("Input the value in Account Position")
    public void inputTheValueInAccountPosition()
    {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.inputTargetAccountPosition(dataMap);
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

    @Then("Verify Bot is Paused")
    public void verifyBotIsPaused() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXHome.waitForNotifMsg();
                Assert.assertTrue(NitroXHome.getNotifMsg().contains("1 bots have been queued to be paused."));
                waitForInVisibile(NitroXHomePage.bottomRightNotifText);
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

    @And("Resume the Bot again")
    public void resumeTheBotAgain()
    {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.resumeCurrentBot();
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

    @And("Input AccountId,Quote and Side")
    public void inputAccountIdQuoteAndSide()
    {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.inputTradingAccount(dataMap);
                NitroXBotsAction.inputBaseCurrency(dataMap);
                NitroXBotsAction.inputQuoteCurrency(dataMap);
                NitroXBotsAction.selectSubPairSide(dataMap);
                scrollingToElementofAPage(NitroXBotsPage.submitbtn, "Scrolled to Submit Button");
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

    @And("Validate the Bots for Future Mode")
    public void validateTheBotsForFutureMode()
    {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                delay(5000);
                NitroXBotsAction.selecttotalBots();
                waitForVisible(NitroXBotsPage.BotTime);
                while (NitroXHome.isBotPresent()) {
                    NitroXBotsAction.sortStartTime();
                    NitroXBotsAction.selectCheckBoxList();
                    NitroXBotsAction.stopBots();
                    NitroXHome.waitForNotifMsg();
                    waitForInVisibile(NitroXHomePage.bottomRightNotifText);
                    delay(15000);
                }

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

    @And("Check if No Current running Bot fo FutureMode")
    public void checkIfNoCurrentRunningBotFoFutureMode()
    {
            if (BaseStepDefinitions.checkSkipExecutionFlags()) {
                BaseStepDefinitions.skipThisStep();
            } else {
                try {
                    waitForVisible(NitroXBotsPage.totalfilered);
                    delay(5000);
                    NitroXBotsAction.validateFutureModeBots(dataMap);
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

    @And("Check if No Current running Bot for FutureMode")
    public void checkIfNoCurrentRunningBotFoFutureModewithInstrument()
    {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(NitroXBotsPage.totalfilered);
                NitroXBotsAction.validateFutureModeBotswithInstrument(dataMap);
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

    @When("Choose Mode and Trading Account")
    public void chooseModeAndTradingAccountforFutureMode()
    {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBuySellFutureAction.selectmode(dataMap);
                NitroXBuySellFutureAction.inputTradingAccount(dataMap);
                delay(5000);
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

    @And("Click total filtered bots and choose latest bot and pause it")
    public void clickTotalFilteredBotsAndChooseLatestBotAndPauseIt()
    {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(NitroXBotsPage.startbtn, "Scrolled to start element");
                NitroXBotsAction.selecttotalBots();
                waitForVisible(NitroXBotsPage.BotTime);
                NitroXBotsAction.sortStartTime();
                delay(2000);
                NitroXBotsAction.selectLatestBot();
                NitroXBotsAction.pauseCurrentBot();
                delay(5000);
                NitroXBotsAction.editLatestBot();

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

    @And("Close the total filtered")
    public void closeTheTotalFiltered() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
            NitroXBotsAction.closeBot();
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

    @And("Choose the instrument")
    public void chooseTheInstrument() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBuySellFutureAction.inputInstrument(dataMap);
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

    @And("Click edit button")
    public void clickEditButton() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.editLatestBot();
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

    @And("Clear the Instrument field")
    public void clearTheInstrumentField() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(NitroXHomePage.tradingaccount,"Scrolled to Account");
                NitroXBotsAction.clearInstrument();
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
    @And("Logout and again login & select Mode,Trading account")
    public void logoutAndAgainLoginSelectModeTradingAccount() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.logout();
                waitForVisible(NitroXLoginPage.username);
                inputText(NitroXLoginPage.username, ConfigReader.getValue("nitroxUsername"), "Enter the username");
                inputText(NitroXLoginPage.password, ConfigReader.getValue("nitroxPassword"), "Enter the password");
                click(NitroXLoginPage.loginbtn, "Click on Sign on Button");
                NitroXBuySellFutureAction.selectmode(dataMap);
                NitroXBuySellFutureAction.selectTradingAccount(dataMap);
                waitForVisible(NitroXBotsPage.totalbotaccount);
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

    @And("Click total filtered")
    public void clickTotalFiltered()
    {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXHome.waitForNotifMsg();
                waitForInVisibile(NitroXHomePage.bottomRightNotifText);
//                NitroXBotsAction.closeBot();
                NitroXBotsAction.refreshPage();
                delay(8000);
              NitroXBotsAction.selecttotalBots();
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

    @And("Choose latest bot")
    public void chooseLatestBot()
    {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(NitroXBotsPage.BotTime);
                NitroXBotsAction.sortStartTime();
                delay(8000);
                NitroXBotsAction.selectLatestBotName();
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

    @And("Check if Bot Available")
    public void checkIfBotAvailable()
    {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.validateFutureModeBots(dataMap);
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

    @And("Stop All the Bots on Homepage")
    public void stopAllTheBotsOnHomepage()
    {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.stopalltheBot();
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

    @And("wait for Ten Seconds")
    public void waitForTenSeconds() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
               delay(10000);
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

    @And("Input Side,Quantity and Stop and Triger condition")
    public void inputSideQuantityAndStopAndTrigerCondition() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.selectSide(dataMap);
                NitroXBotsAction.inputPairBotQuantity(dataMap.get("Quantity"));
                NitroXBotsAction.selectAdvancedSetting();
                //NitroXBotsAction.inputTrigerCondtion();
               // NitroXBotsAction.inputStopCondtion();

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

    @And("Edit the Participation Bot fields")
    public void editTheParticipationBotFields() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.inputupdatedThresholdPrice();
                NitroXBotsAction.clickSubmit();
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

    @Then("Verify updated fields in config")
    public void verifyUpdatedFieldsInConfig() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.selectConfig();
               Assert.assertEquals(NitroXBotsAction.getBotDetailSide(),dataMap.get("Side"));
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

    @And("Input any value for Participation Bot")
    public void inputAnyValueForParticipationBot() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
            NitroXBotsAction.inputupdatedThresholdPrice();
            NitroXBotsAction.inputPairBotQuantity(dataMap.get("S_UpdatedTotalAmount"));
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

    @Then("Verify config tab for Participation bot")
    public void verifyConfigTabForParticipationBot() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.selectConfig();
                Assert.assertEquals(Double.toString(NitroXBotsAction.getThresholdPrice()),"2.0");

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



