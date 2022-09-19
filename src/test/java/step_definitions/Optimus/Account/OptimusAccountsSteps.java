package step_definitions.Optimus.Account;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import modules.OptimusActions.*;
import org.testng.Assert;
import pageFactory.OptimusPages.Account.OptimusAccountMainPage;
import pageFactory.OptimusPages.Account.OptimusNitroAccountPage;
import step_definitions.BaseStepDefinitions;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

import java.util.HashMap;

public class OptimusAccountsSteps {

    public static HashMap<String, String> dataMap;

    public OptimusAccountsSteps() {
        dataMap = BaseStepDefinitions.dataMap;
    }

    String mainAccID;
    String accName;
    String accID;
    String accIDinNotif;
    String nitroAccountName;
    String nitroAccountNamefromDetails;
    String nitroAccountNameFromList;

    @And("Open Account main tab")
    public void openAccountMainTab() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountActions.openAccountMainTab();
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

    @And("Open Accounts side tab")
    public void openAccountsSideTab() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountActions.openAccountsSideTab();
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

    @And("Open Accounts List tab")
    public void openAccountsListTab() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountActions.openAccountListTab();
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

    @And("Search for existing Account in List")
    public void searchForExistingAccountInList() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusMainActions.searchForItem(dataMap.get("AccountLogin"));
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

    @Then("Verify Search Results of Existing Accounts")
    public void verifySearchResultsOfExistingAccounts() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountActions.waitForEditLinkinResult();
                Assert.assertTrue(OptimusAccountActions.getAccountNameFromList().contains(dataMap.get("AccountName")), "Account contains TXAAccount Name");
                Assert.assertTrue(OptimusAccountActions.getAccountLoginFromList().contains(dataMap.get("AccountLogin")), "Account contains TXAAccountLogin");
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

    @And("Open Create New Accounts Page")
    public void openCreateNewAccountsPage() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountActions.openAccountCreateTab();
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

    @And("Enter Mandatory And Text Fields in Accounts")
    public void enterMandatoryAndTextFieldsInAccounts() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                mainAccID = dataMap.get("MainAccountID") + KeywordUtil.generateRandomNumber200to500();
                OptimusAccountActions.account_MainAccountID(mainAccID);
                OptimusAccountActions.account_Exchange(dataMap.get("Exchange"));
                accName = dataMap.get("AccountName") + KeywordUtil.generateRandomNumber200to500();
                OptimusAccountActions.account_AccountName(accName);
                OptimusAccountActions.account_AccountLogin(dataMap.get("AccountLogin"));
                OptimusAccountActions.account_Owner(dataMap.get("Owner"));
                OptimusAccountActions.account_Comment(dataMap.get("Comment"));
                OptimusAccountActions.account_Channel1(dataMap.get("Channel1"));
                OptimusAccountActions.account_Address1(dataMap.get("Address1"));
                OptimusAccountActions.account_Memo1(dataMap.get("Memo1"));
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

    @And("Enter Dropdown Fields for Account")
    public void enterDropdownFieldsForAccount() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountActions.account_AccountSource(dataMap.get("AccountSource"));
                OptimusAccountActions.account_AccountType(dataMap.get("AccountType"));
                OptimusAccountActions.account_Function(dataMap.get("Function"));
                OptimusAccountActions.account_Permission(dataMap.get("Permission"));
                OptimusAccountActions.account_Entity(dataMap.get("Entity"));
                OptimusAccountActions.account_WalletController(dataMap.get("WalletController"));
                OptimusAccountActions.account_PortfolioNumber(dataMap.get("PortfolioNumber"));
                OptimusAccountActions.account_CounterpartyRef(dataMap.get("CounterpartyRef"));

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

    @And("Click Create button to create Account")
    public void clickCreateButtonToCreateAccount() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountActions.click_Account_Create_btn();
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

    @And("Search for Account tasks to approve")
    public void searchForAccountTasksToApprove() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusMainActions.searchTasks(accName);
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

    @And("Approve searched tasks")
    public void approveSearchedTasks() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusMainActions.selectFirstTask();
                OptimusMainActions.selectAllTasks();
                OptimusMainActions.approveAllSelectedTasks();
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

    @And("Search for created Account in List")
    public void searchForCreatedAccountInList() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusMainActions.searchForItem(accName);
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

    @Then("Verify Search Results of added or updated Accounts")
    public void verifySearchResultsOfAddedOrUpdatedAccounts() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountActions.waitForEditLinkinResult();
                Assert.assertEquals(OptimusAccountActions.getAccountNameFromList(), accName, "Account Name Matches");
                Assert.assertTrue(OptimusAccountActions.getAccountNameFromList().contains(dataMap.get("AccountName")), "Account contains TXAAccount Name");
                Assert.assertTrue(OptimusAccountActions.getAccountLoginFromList().contains(dataMap.get("AccountLogin")), "Account contains TXAAccountLogin");
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

    @And("Click on Edit Link in Search Results to Load Account details")
    public void clickOnEditLinkInSearchResultsToLoadAccountDetails() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountActions.waitForEditLinkinResult();
                OptimusAccountActions.clickEditLinkinResult();
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

    @And("Take Account ID for Reference")
    public void takeAccountIDForReference() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                accID = OptimusAccountActions.get_account_AccountID();
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

    @And("Enter Dropdown Fields to Update Account")
    public void enterDropdownFieldsToUpdateAccount() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountActions.account_AccountSource_update(dataMap.get("AccountSource"));
                OptimusAccountActions.account_AccountType_update(dataMap.get("AccountType"));
                OptimusAccountActions.account_Function_update(dataMap.get("Function"));
                OptimusAccountActions.account_Permission_update(dataMap.get("Permission"));
                OptimusAccountActions.account_Entity_update(dataMap.get("Entity"));
                OptimusAccountActions.account_WalletController_update(dataMap.get("WalletController"));
                OptimusAccountActions.account_PortfolioNumber_update(dataMap.get("PortfolioNumber"));
                OptimusAccountActions.account_CounterpartyRef_update(dataMap.get("CounterpartyRef"));
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

    @And("Search for Account ID in tasks to approve")
    public void searchForAccountIDInTasksToApprove() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusMainActions.searchTasks(accID);
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

    @And("Search for Updated Account in List")
    public void searchForUpdatedAccountInList() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusMainActions.searchForItem(accID);
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

    @Then("Verify Account ID in search results")
    public void verifyAccountIDInSearchResults() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountActions.waitForEditLinkinResult();
                Assert.assertEquals(OptimusAccountActions.account_GetAccountIDFromList(), accID, "Account ID Matches");
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

    @And("Take Account Name for reference")
    public void takeAccountNameForReference() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                accName = OptimusAccountActions.getAccountNameFromDetails();
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

    @And("Open Create New Nitro Accounts Page")
    public void openCreateNewNitroAccountsPage() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountNitroActions.clickCreateNewNitro_btn();
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

    @And("Open Nitro Accounts side tab")
    public void openNitroAccountsSideTab() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusMainActions.clickNitroSideTab();
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

    @And("Enter details in Nitro Account")
    public void enterDetailsInNitroAccount() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                nitroAccountName = dataMap.get("AccountName") + KeywordUtil.generateRandomNumber200to500();
                OptimusAccountNitroActions.nitroAccount_AccountName(nitroAccountName);
                OptimusAccountNitroActions.nitroAccount_Exchange(dataMap.get("Exchange"));
                OptimusAccountNitroActions.nitroAccount_APIAccess(dataMap.get("APIAccess"));
                OptimusAccountNitroActions.nitroAccount_APISecret(dataMap.get("APISecret"));
                OptimusAccountNitroActions.nitroAccount_AccountType(dataMap.get("AccountType"));
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

    @And("Take Nitro Account ID from Success Message")
    public void takeNitroAccountIDFromSuccessMessage() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                accIDinNotif = OptimusAccountNitroActions.getAccountIDFromNotif();
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

    @And("Click Edit button for Nitro Account")
    public void clickEditButtonForNitroAccount() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountNitroActions.clickEditNitro_Listbtn();
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

    @And("Search for existing Nitro Account in List")
    public void searchForExistingNitroAccountInList() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusMainActions.searchForItem(dataMap.get("Search"));
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

    @And("Take Account Name from Nitro Account")
    public void takeAccountNameFromNitroAccount() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                nitroAccountNamefromDetails = OptimusAccountNitroActions.nitroAccount_Get_AccountName();
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

    @And("Edit details in Nitro Account")
    public void editDetailsInNitroAccount() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountNitroActions.nitroAccount_APIAccess(dataMap.get("APIAccess"));
                OptimusAccountNitroActions.nitroAccount_APISecret(dataMap.get("APISecret"));
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

    @And("Click Edit IP Binding button for Nitro Account")
    public void clickEditIPBindingButtonForNitroAccount() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountNitroActions.click_NitroAccount_IPBindingBtn();
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

    @And("Edit IP Binding details in Nitro Account")
    public void editIPBindingDetailsInNitroAccount() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountNitroActions.click_NitroAccount_Modal_Clear();
                OptimusAccountNitroActions.add_NitroAccount_IPBinding(dataMap.get("Search"));
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

    @And("Take Account Name from Nitro Account List")
    public void takeAccountNameFromNitroAccountList() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                nitroAccountNameFromList = OptimusAccountNitroActions.get_NitroAccount_AccountName_List();
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

    @And("Search for updated Nitro Account in List")
    public void searchForUpdatedNitroAccountInList() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusMainActions.searchForItem(nitroAccountNameFromList);
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

    @Then("Verify Values of IP Binding is Updated For Nitro Account")
    public void verifyValuesOfIPBindingIsUpdatedForNitroAccount() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                String ipBinding = OptimusAccountNitroActions.get_NitroAccount_IPBinding_List();
                Assert.assertEquals(ipBinding, dataMap.get("Search"));

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

    @And("Click Unlock button in List for Nitro Account")
    public void clickUnlockButtonInListForNitroAccount() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountNitroActions.click_NitroAccount_UnlockSwitch_List();
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

    @And("Click Run Broker button in List for Nitro Account")
    public void clickRunBrokerButtonInListForNitroAccount() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountNitroActions.click_NitroAccount_RunBroker_List();
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

    @And("Click Run Balance Listener button in List for Nitro Account")
    public void clickRunBalanceListenerButtonInListForNitroAccount() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountNitroActions.click_NitroAccount_RunBalanceListener_List();
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

    @And("Click Run Order Listener button in List for Nitro Account")
    public void clickRunOrderListenerButtonInListForNitroAccount() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountNitroActions.click_NitroAccount_RunOrderListener_List();
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

    @And("Verify Nitro Account Name in Search Result")
    public void verifyNitroAccountNameInSearchResult() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountActions.waitForEditLinkinResult();
                Assert.assertTrue(OptimusAccountNitroActions.get_NitroAccount_AccountName_List().contains(dataMap.get("Search")), "Account contains TXAAccount Name");
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

    @Then("Click Lock button in Nitro Account List")
    public void clickLockButtonInNitroAccountList() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountNitroActions.click_NitroAccount_UnlockSwitch_List();
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

    @And("Click View Configuration button in List for Nitro Account")
    public void clickViewConfigurationButtonInListForNitroAccount() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountNitroActions.click_ConfigurationSettings_ListBtn();
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

    @Then("Verify Configuration Settings is shown")
    public void verifyConfigurationSettingsIsShown() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountNitroActions.viewConfigurationSettings_modal();
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

    @And("Open Configurations side tab in Accounts")
    public void openConfigurationsSideTabInAccounts() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountActions.click_Configurations_SideTab();
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

    @And("open Recording Accounts tab in Configurations under Accounts")
    public void openRecordingAccountsTabInConfigurationsUnderAccounts() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountActions.click_Configurations_RecordingAccounts_Tab();
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

    @And("Open Create New Recording Accounts Page")
    public void openCreateNewRecordingAccountsPage() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountActions.click_CreateAccount_ConfigurationAccounts();
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

    @And("Enter details in Recording Account")
    public void enterDetailsInRecordingAccount() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountActions.accountConfigurations_Recording_Exchange(dataMap.get("RecordingAccountExchange"));
                OptimusAccountActions.accountConfigurations_Recording_AccountName(dataMap.get("RecordingAccountName"));
                OptimusAccountActions.accountConfigurations_Recording_ProductName(dataMap.get("RecordingAccountProductName"));

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

    @And("Click Create button to create Recording Account")
    public void clickCreateButtonToCreateRecordingAccount() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountActions.clickCreateBtn_RecordingAccount();
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

    @And("Search for Existing Recording Account in List")
    public void searchForExistingRecordingAccountInList() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountActions.accountConfigurations_Search(dataMap.get("Search"));
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

    @Then("Verify Recording Account is created and shown in List Page")
    public void verifyRecordingAccountIsCreatedAndShownInListPage() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                Assert.assertEquals(OptimusAccountActions.getRecordingAccountNameFromRecordingList(), "test_sub3@ftx");
                Assert.assertEquals(OptimusAccountActions.getProductAccountNameFromRecordingList(), "test_sub3@ftx");
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

    @And("Delete the Searched Recording Account in List")
    public void deleteTheSearchedRecordingAccountInList() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountActions.deleteAccount_ConfigurationAccounts();
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

    @And("open Recording Wallet Address tab in Configurations under Accounts")
    public void openRecordingWalletAddressTabInConfigurationsUnderAccounts() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountActions.click_Configurations_RecordingWalletAddress_Tab();
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

    @And("Search for {string} Existing Recording Wallet in List")
    public void searchForExistingRecordingWalletInList(String item) {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountActions.accountConfigurations_RecordingWallet_Search(item);
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

    @Then("Verify Search Result in list")
    public void verifySearchResultInList() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                Assert.assertEquals(OptimusAccountActions.get_accountConfigurations_RecordingWallet_NoData_List(), "No Data");
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

    @Then("Verify Search Result has {string} in list")
    public void verifySearchResultHasInList(String item) {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                if (item.equalsIgnoreCase("No Data")) {
                    Assert.assertEquals(OptimusAccountActions.get_accountConfigurations_RecordingWallet_NoData_List(), item);
                }
                else {
                    Assert.assertEquals(OptimusAccountActions.get_accountConfigurations_RecordingWallet_Chain_List(), item);
                }
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
