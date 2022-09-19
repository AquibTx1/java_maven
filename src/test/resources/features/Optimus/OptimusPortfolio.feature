Feature: Test Portfolio feature as mentioned in Test Case

  Background: Login to Optimus
    Given Login to Optimus with Valid Credentials


  @OptimusPortfolio
  Scenario Outline: "<TestCaseID>" Able to Login and Create New Portfolio
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Click the Portfolio Tab
    And Choose New Portfolio
    And Enter the Portfolio detail
    And Enter the Portfolio Hierarchy detail
    And Enter the Portfolio Reporting Information detail
    And Enter Portfolio Settlement Information
    And Enter Portfolio Accounting Information
    Then Click Create Portfolio and verify the Settlement Forwarded for Approval
    #Login Again with MO Account
    Given Read "Optimus" and "OptimusLogin" and "<loginCredentials>" from test data
    And Logout from Optimus
    And Input Optimus Username and Password
    And Click Optimus Login Button
    Then Verify user is able to login to Optimus successfully
    And Click the Portfolio Tab
    And Click Tasks link
    And Navigate to Portfolio Task
    And Approve the Portfolio Task
    And Click CounterParty Tab
    And Logout from MO Account
        #Login and Check the Approved record
    Given Login to Optimus with Valid Credentials
    And Click the Portfolio Tab
    And Input the changes and click Search

    Examples:
      | TestCaseID                      | SheetName |loginCredentials  |
      | QA_TestCase_Auto_Optimus_4_1_1 | Portfolio | MO_CheckerAccount|

  @OptimusPortfolio
  Scenario Outline: "<TestCaseID>" Able to Login and Edit existing Portfolio Created
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Click the Portfolio Tab
    And Sort the Portfolio
    And Search the Portfolio to be Updated
    And Click Edit Button
    And Update the user detail in the Portfolio list
    Then Click Update Portfolio and verify the Settlement Forwarded for Approval
    #Login Again with MO Account
    Given Read "Optimus" and "OptimusLogin" and "<loginCredentials>" from test data
    And Logout from Optimus
    And Input Optimus Username and Password
    And Click Optimus Login Button
    Then Verify user is able to login to Optimus successfully
    And Click the Portfolio Tab
    And Click Tasks link
    And Navigate to Portfolio Task input value and Click Search
    And Approve the Portfolio Task
    And Click CounterParty Tab
    And Logout from MO Account
       #Login and Check the Approved record
    Given Login to Optimus with Valid Credentials
    And Click the Portfolio Tab
    Then Verify the Portfolio is updated

    Examples:
      | TestCaseID                      | SheetName |loginCredentials  |
      | QA_TestCase_Auto_Optimus_4_1_2 | Portfolio | MO_CheckerAccount|

  @OptimusPortfolio
  Scenario Outline: "<TestCaseID>" Able to Login and Delete existing Portfolio
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Click the Portfolio Tab
    And Sort the Portfolio
    And Search the Portfolio to be deleted
    And Click Edit Button
    And Get the Portfolio ref id
    Then Delete the Portfolio record and login with MO Account for Approval
        #login with checker user and approve the deal processing status
    Given Read "Optimus" and "OptimusLogin" and "<loginCredentials>" from test data
    And Logout from Optimus
    And Input Optimus Username and Password
    And Click Optimus Login Button
    Then Verify user is able to login to Optimus successfully
    And Click the Portfolio Tab
    And Click Tasks link
    And Input the Portfolio Number to be approved
    And Approve the Settlement
    And Click CounterParty Tab
    And Logout from MO Account
#    Login and Check the Approved record

    Given Login to Optimus with Valid Credentials
    And Click the Portfolio Tab
    Then Verify the Portfolio is deleted

    Examples:
      | TestCaseID                      | SheetName |loginCredentials  |
      | QA_TestCase_Auto_Optimus_4_1_3 | Portfolio | MO_CheckerAccount|

  @OptimusPortfolio
  Scenario Outline: "<TestCaseID>" Able to Search a record the from the Portfolio List
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Click the Portfolio Tab
    And Search the Existing record
    Then Verify the record is available

    Examples:
      | TestCaseID                      | SheetName |loginCredentials  |
      | QA_TestCase_Auto_Optimus_4_1_4 | Portfolio | MO_CheckerAccount|

  @OptimusPortfolio
  Scenario Outline: "<TestCaseID>" Able to Download list from Portfolio
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Click the Portfolio Tab
    And Click the download csv
    Then Verify the File downloaded CSV Button
    Examples:
      | TestCaseID                      | SheetName |loginCredentials  |
      | QA_TestCase_Auto_Optimus_4_1_5 | Portfolio | MO_CheckerAccount|