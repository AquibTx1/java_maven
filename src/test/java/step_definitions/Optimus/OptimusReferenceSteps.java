package step_definitions.Optimus;

import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import modules.OptimusActions.OptimusMainActions;
import modules.OptimusActions.OptimusPortfolioCreateActions;
import modules.OptimusActions.OptimusReferencesMainActions;
import org.jmock.expectation.Null;
import org.testng.Assert;
import pageFactory.OptimusPages.OptimusReferenceMasterPage;
import step_definitions.BaseStepDefinitions;
import step_definitions.RunCukesTest;
import utilities.GlobalUtil;
import utilities.HTMLReportUtil;
import utilities.KeywordUtil;

import java.util.HashMap;

public class OptimusReferenceSteps {

    public static HashMap<String, String> dataMap;

    static String ref_Name = null, ref_Description = null;

    public OptimusReferenceSteps()    {
        dataMap = BaseStepDefinitions.dataMap;
    }

    @And("Open Reference side tab")
    public void openReferenceSideTab() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusReferencesMainActions.open_Reference_SideTab();
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

    @And("Open {string} Reference Type Subtab")
    public void OpenReferenceTypeSubTab(String tabName) {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusReferencesMainActions.open_Reference_SubTab(tabName);
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

    @And("Open Create Reference Type Page")
    public void openCreateReferenceTypePage() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusReferencesMainActions.click_New_ReferenceType_SubTab_Page();
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

    @And("Enter Detail fields of Reference Type")
    public void enterDetailFieldsOfReferenceType() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
//                Generating Names and Description with Random Number
                ref_Name = dataMap.get("Name") + KeywordUtil.generateRandomNumber200to500();
                ref_Description = dataMap.get("Description") + KeywordUtil.generateRandomNumber200to500();

                OptimusReferencesMainActions.input_New_ReferenceType_Name(dataMap.get("Index"), ref_Name);
                OptimusReferencesMainActions.input_New_ReferenceType_Description(dataMap.get("Index"), ref_Description);

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

    @And("Click Create Reference Type Button")
    public void clickCreateReferenceTypeButton() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusReferencesMainActions.referenceType_Submit_Createbtn(dataMap.get("Index"));
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

    @And("Open Reference Tasks Sub Tab")
    public void openReferenceTasksSubTab() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusReferencesMainActions.open_ReferenceTasksTab_MO_Checker();
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

    @And("Approve the Reference Task")
    public void approveTheReferenceTask() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
//Approve All tasks
                OptimusReferencesMainActions.referenceTask_MOCheckerSearch(ref_Name);
                OptimusReferencesMainActions.select_FirstReferenceTasks();
                OptimusReferencesMainActions.select_All_ReferenceTasks();
                OptimusReferencesMainActions.approve_AllSelected_ReferenceTasks();
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

    @And("Open Reference List tab")
    public void openReferenceListTab() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusReferencesMainActions.open_Reference_ListTab();
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

    @And("Search for Reference Results in List")
    public void searchForReferenceResultsInList() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                if(ref_Name != null)
                    OptimusReferencesMainActions.reference_List_SearchBox(ref_Name);
                else
                    OptimusReferencesMainActions.reference_List_SearchBox(dataMap.get("Name"));
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

    @Then("verify Reference is Created or Updated")
    public void verifyReferenceIsCreatedOrUpdated() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                if (ref_Name != null) {
                    RunCukesTest.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringGreyColor("Compare Name Element "));
                    Assert.assertEquals(OptimusReferencesMainActions.get_Name_ReferenceList(), ref_Name);
                    RunCukesTest.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringGreyColor("Compare Description Element"));
                    Assert.assertEquals(OptimusReferencesMainActions.get_Description_ReferenceList(), ref_Description);
                }
                else {
                    RunCukesTest.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringGreyColor("Compare Name Element "));
                    Assert.assertTrue(OptimusReferencesMainActions.get_Name_ReferenceList().contains(dataMap.get("Name")), "Condition Matches");
                    RunCukesTest.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringGreyColor("Compare Description Element"));
                    Assert.assertTrue(OptimusReferencesMainActions.get_Description_ReferenceList().contains(dataMap.get("Description")), "Condition Matches");
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
