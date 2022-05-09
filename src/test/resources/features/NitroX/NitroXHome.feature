Feature: Test buys sell features

  Background: Login to application
    Given Login to NitroX app with valid login credentials

  @NitroXHome
  Scenario Outline: NitroXHome-004_Verify spot mode field data entry
    Given Read test data "<SheetName>" and "<TestCaseID>" from Excel file
    When Choose mode value using dropdown
    Then Verify mode value
    Examples:
      | SheetName  | TestCaseID                  |
      | NitroXHome | QA_TestCase_Auto_NitroX_004 |
      | NitroXHome | QA_TestCase_Auto_NitroX_006 |

  @NitroXHome
  Scenario Outline: NitroXHome-005_Verify spot mode field data entry
    Given Read test data "<SheetName>" and "<TestCaseID>" from Excel file
    When Choose mode value using input text
    Then Verify mode value
    Examples:
      | SheetName  | TestCaseID                  |
      | NitroXHome | QA_TestCase_Auto_NitroX_005 |
      | NitroXHome | QA_TestCase_Auto_NitroX_007 |
