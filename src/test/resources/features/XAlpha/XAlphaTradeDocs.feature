Feature: Test Trade Documents

  Background: Login to XAlpha
    Given Login to XAlpha with valid login credentials

  @TradeDocuments
  Scenario Outline: "<TestCaseID>"_Not Able to Complete Flow of Invoice for FX-Spot Deal
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal input tab
    And Choose FX Spot
    And Provide FX Spot deal input details
    And Click create deal button
    Then Verify the deal success message
    And Navigate to deal enquiry tab
    And Load a deal wrt deal reference id from deal input
    Then Verify the deal is created
    And Navigate to Trade Documents Tab
    And Expand the Current Deal Type
    And Edit the Confirmation status
    And Select Prepare Email and send
    And Choose Sender name and send mail
    Then Verify the Confirmation status
    And Navigate to deal enquiry tab
    And Open first deal in the row
    And Change processing status
    And Click update deal button
    And Again click the Trade Documents Tab
    And Expand the Current Deal Type
    Then Verify the Invoice Tab is Empty

    Examples:
      | SheetName   | TestCaseID                          | Direction | Status    |
      | XAlphaDealsTradeDoc | QA_TestCase_Auto_XAlpha_101 | Buy       | Confirmed |

  @TradeDocuments
  Scenario Outline: "<TestCaseID>"_Able to Complete Flow of Invoice for FX-Spot Deal
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal input tab
    And Choose FX Spot
    And Provide FX Spot deal input details
    And Click create deal button
    Then Verify the deal success message
    And Navigate to deal enquiry tab
    And Load a deal wrt deal reference id from deal input
    Then Verify the deal is created
    And Navigate to Trade Documents Tab
    And Expand the Current Deal Type
    And Edit the Confirmation status
    And Select Prepare Email and send
    And Choose Sender name and send mail
    Then Verify the Confirmation status
    And Navigate to deal enquiry tab
    And Open first deal in the row
    And Change processing status
    And Click update deal button
    And Again click the Trade Documents Tab
    And Expand the Current Deal Type
    And Click Invoice Tab
    Then Validate TransferInstruction is same
    And Edit and generate Invoice
   And And Select Prepare Email and send
    And Choose Sender name and send mail
    Then Verify the Invoice status
    Examples:
      | SheetName   | TestCaseID                          | Direction | Status    |
      | XAlphaDealsTradeDoc | QA_TestCase_Auto_XAlpha_102| Buy       | Confirmed |
      | XAlphaDealsTradeDoc | QA_TestCase_Auto_XAlpha_103| Buy       | Confirmed |

  @TradeDocuments
  Scenario Outline: "<TestCaseID>"Able to Complete Flow of Invoice for FX-Spot Deal With Add Instruction
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal input tab
    And Choose FX Spot
    And Provide FX Spot deal input details
    And Click create deal button
    Then Verify the deal success message
    And Navigate to deal enquiry tab
    And Load a deal wrt deal reference id from deal input
    Then Verify the deal is created
    And Navigate to Trade Documents Tab
    And Expand the Current Deal Type
    And Edit the Confirmation status
    And Add the comments
    And click Review Again
    And Select Prepare Email and send
    And Choose Sender name and send mail
    Then Verify the Confirmation status
    And Navigate to deal enquiry tab
    And Open first deal in the row
    And Change processing status
    And Click update deal button
    And Again click the Trade Documents Tab
    And Expand the Current Deal Type
    And Click Invoice Tab and Add instruction
    And Click the Added Instruction
    And Add the comments
    And click Review Again
    And Edit and generate Invoice
    And And Select Prepare Email and send
    And Choose Sender name and send mail
    Then Verify the Invoice status

    Examples:
      | SheetName   | TestCaseID                          | Direction | Status    |
      | XAlphaDealsTradeDoc | QA_TestCase_Auto_XAlpha_104| Buy       | Confirmed |
      | XAlphaDealsTradeDoc | QA_TestCase_Auto_XAlpha_105| Buy       | Confirmed |

  @TradeDocuments
  Scenario Outline: "<TestCaseID>"_Able to Complete Flow of Invoice and Confirmation for FX-Spot Deal and Cancel the Deal
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal input tab
    And Choose FX Spot
    And Provide FX Spot deal input details
    And Click create deal button
    Then Verify the deal success message
    And Navigate to deal enquiry tab
    And Load a deal wrt deal reference id from deal input
    Then Verify the deal is created
    And Navigate to Trade Documents Tab
    And Expand the Current Deal Type
    And Edit the Confirmation status
    And Select Prepare Email and send
    And Choose Sender name and send mail
    Then Verify the Confirmation status
    And Navigate to deal enquiry tab
    And Open first deal in the row
    And Change processing status
    And Click update deal button
    And Again click the Trade Documents Tab
#    And Expand the Current Deal Type
#    And Click Invoice Tab
#    Then Validate TransferInstruction is same
#    And Edit and generate Invoice
#    And And Select Prepare Email and send
#    And Choose Sender name and send mail
#    Then Verify the Invoice status
#    And Navigate to deal enquiry tab
#    And Open first deal in the row
#    And Again Change processing status
#    And Click update deal button
#    And Again click the Trade Documents Tab
#    And Expand the Current Deal Type
    Then Verify the Confirmation and Invoice Status

    Examples:
      | SheetName   | TestCaseID                          | Direction | Status    |
      | XAlphaDealsTradeDoc | QA_TestCase_Auto_XAlpha_106| Buy       | Confirmed |
      | XAlphaDealsTradeDoc | QA_TestCase_Auto_XAlpha_107| Buy       | Confirmed |

  @TradeDocuments
  Scenario Outline: "<TestCaseID>"Able to Complete Flow of Invoice for FX-Spot Deal With Add Instruction
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal input tab
    And Choose FX Spot
    And Provide FX Spot deal input details
    And Click create deal button
    Then Verify the deal success message
    And Navigate to deal enquiry tab
    And Load a deal wrt deal reference id from deal input
    Then Verify the deal is created
    And Open first deal in the row
    And Change processing status
    And Click update deal button
    And Navigate to Trade Documents Tab
    And Expand the Current Deal Type
    And Edit the Confirmation status
    And Add the comments
    And click Review Again
    And Select Prepare Email and send
    And Choose Sender name and send mail
    Then Verify the Confirmation status
    And Choose Invoice Tab
    And Add Instructions and click Review
    And Edit and generate Invoice
    And And Select Prepare Email and send
    And Choose Sender name and send mail
    Then Verify the Invoice status

    Examples:
      | SheetName   | TestCaseID                          | Direction | Status    |
      | XAlphaDealsTradeDoc | QA_TestCase_Auto_XAlpha_108| Buy       | Confirmed |
      | XAlphaDealsTradeDoc | QA_TestCase_Auto_XAlpha_109| Buy       | Confirmed |


  @TradeDocumentsExecutionDeal
  Scenario Outline: "<TestCaseID>"_Not Able to Complete Flow of Invoice for Execution Deal
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal input tab
    And Choose Execution deal tab
    And Provide execution deal input details
    And Choose isComplete
    And Click create deal button
    Then Verify the deal success message
    And Navigate to deal enquiry tab
    And Load a deal wrt deal reference id from deal input
    Then Verify execution deal is created
    And Navigate to Trade Documents Tab
    And Expand the Current Deal Type
    And Edit the Confirmation status for Execution Deal
    And Click the Setting icon and remove fields
    And Add additional comments
    And Generate Order and prepare Email
    And Verify Email and confirmation is Sent
    And Choose Sender name and send mail
    Then Verify the Confirmation status for Execution deal
    And Navigate to deal enquiry tab
    And Open first deal in the row
    And Change processing status
    And Click update deal button
    And Again click the Trade Documents Tab
    And Expand the Current Deal Type
    Then Verify the Invoice Tab is Empty

    Examples:
      | SheetName             | TestCaseID                  | Direction | Status    |
      | TradeDocExecutionDeal | QA_TestCase_Auto_XAlpha_110 | Buy       | Confirmed |

  @TradeDocumentsExecutionDeal
  Scenario Outline: "<TestCaseID>"_Able to Complete Flow of Invoice for Execution Deal
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal input tab
    And Choose Execution deal tab
    And Provide execution deal input details
    And Choose isComplete
    And Click create deal button
    Then Verify the deal success message
    And Navigate to deal enquiry tab
    And Load a deal wrt deal reference id from deal input
    Then Verify execution deal is created
    And Navigate to Trade Documents Tab
    And Expand the Current Deal Type
    And Edit the Confirmation status for Execution Deal
    And Click the Setting icon and remove fields
    And Add additional comments
    And Generate Order and prepare Email
    And Verify Email and confirmation is Sent
    And Choose Sender name and send mail
    Then Verify the Confirmation status for Execution deal
    And Navigate to deal enquiry tab
    And Open first deal in the row
    And Change processing status
    And Click update deal button
    And Again click the Trade Documents Tab
    And Expand the Current Deal Type
    And Choose Invoice Tab
    And Edit and generate Invoice
    And And Select Prepare Email and send
    And Choose Sender name and send mail
    Then Verify the Invoice status

    Examples:
      | SheetName             | TestCaseID                  | Direction | Status    |
      | TradeDocExecutionDeal | QA_TestCase_Auto_XAlpha_111 | Buy       | Confirmed |
      | TradeDocExecutionDeal | QA_TestCase_Auto_XAlpha_112 | Buy       | Confirmed |

  @TradeDocumentsExecutionDeal
  Scenario Outline: "<TestCaseID>"_Able to Cancel Flow of Invoice for Execution Deal
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal input tab
    And Choose Execution deal tab
    And Provide execution deal input details
    And Choose isComplete
    And Click create deal button
    Then Verify the deal success message
    And Navigate to deal enquiry tab
    And Load a deal wrt deal reference id from deal input
    Then Verify execution deal is created
    And Navigate to Trade Documents Tab
    And Expand the Current Deal Type
    And Edit the Confirmation status for Execution Deal
    And Click the Setting icon and remove fields
    And Add additional comments
    And Generate Order and prepare Email
    And Verify Email and confirmation is Sent
    And Choose Sender name and send mail
    Then Verify the Confirmation status for Execution deal
    And Navigate to deal enquiry tab
    And Open first deal in the row
    And Change processing status
    And Click update deal button
    And Again click the Trade Documents Tab
    And Expand the Current Deal Type
    And Choose Invoice Tab
    And Add Instructions and Comments for Execution deal
    And Edit and generate Invoice
    And And Select Prepare Email and send
    And Choose Sender name and send mail
    Then Verify the Invoice status

    Examples:
      | SheetName             | TestCaseID                  | Direction | Status    |
      | TradeDocExecutionDeal | QA_TestCase_Auto_XAlpha_113| Buy       | Confirmed |
      | TradeDocExecutionDeal | QA_TestCase_Auto_XAlpha_114 | Buy       | Confirmed |


  @TradeDocumentsExecutionDeal
  Scenario Outline: "<TestCaseID>"_Able to Complete Flow of Invoice for Execution Deal and Change Status to Void
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal input tab
    And Choose Execution deal tab
    And Provide execution deal input details
    And Choose isComplete
    And Click create deal button
    Then Verify the deal success message
    And Navigate to deal enquiry tab
    And Load a deal wrt deal reference id from deal input
    Then Verify execution deal is created
    And Open first deal in the row
    And Change processing status
    And Click update deal button
    And Navigate to Trade Documents Tab
    And Expand the Current Deal Type
    And Edit the Confirmation status for Execution Deal
    And Click the Setting icon and remove fields
    And Add additional comments
    And Generate Order and prepare Email
    And Verify Email and confirmation is Sent
    And Choose Sender name and send mail
    Then Verify the Confirmation status for Execution deal
    And Navigate to deal enquiry tab
    And Open first deal in the row
    And Again Change processing status
    And Click update deal button
    And Verify the deal forwarded to MO for approval
    #login with checker user and approve the deal processing status
    Given Read "XAlpha" and "XAlphaLogin" and "<loginCredentials>" from test data
    And Logout from XAlpha
    And Input XAlpha Username and Password
    And Click XAlpha Login Button
    And Verify User is Able to Login to XAlpha Successfully
    And Navigate to deal processing tab
    And Search for the deal to approve
    And Approve the deal
    And Logout from XAlpha
     #login again with system user and verify the deal processing status
    Given Login to XAlpha with valid login credentials
    And Navigate to Trade Documents Tab
    Then Verify the Confirmation and Invoice Status
    Examples:
      | SheetName             | TestCaseID                  | Direction | Status    |loginCredentials  |
      | TradeDocExecutionDeal | QA_TestCase_Auto_XAlpha_115| Buy       | Confirmed |MO_CheckerAccount  |
      | TradeDocExecutionDeal | QA_TestCase_Auto_XAlpha_116 | Buy       | Confirmed |MO_CheckerAccount|

  @TradeDocumentsExecutionDeal
  Scenario Outline: "<TestCaseID>"_Able to Complete Flow of Invoice for Execution Deal
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal input tab
    And Choose Execution deal tab
    And Provide execution deal input details
    And Choose isComplete
    And Click create deal button
    Then Verify the deal success message
    And Navigate to deal enquiry tab
    And Load a deal wrt deal reference id from deal input
    Then Verify execution deal is created
    And Open first deal in the row
    And Change processing status
    And Click update deal button
    And Navigate to Trade Documents Tab
    And Expand the Current Deal Type
    And Edit the Confirmation status for Execution Deal
    And Click the Setting icon and remove fields
    And Add additional comments
    And Generate Order and prepare Email
    And Verify Email and confirmation is Sent
    And Choose Sender name and send mail
    Then Verify the Confirmation status for Execution deal
    And Choose Invoice Tab
    And Add Instructions and Comments for Execution deal
    And Select Instruction review
    And Edit and generate Invoice
    And And Select Prepare Email and send
    And Choose Sender name and send mail
    Then Verify the Invoice status

    Examples:
      | SheetName             | TestCaseID                  | Direction | Status    |
     | TradeDocExecutionDeal | QA_TestCase_Auto_XAlpha_117 | Buy       | Confirmed |
      | TradeDocExecutionDeal | QA_TestCase_Auto_XAlpha_118 | Buy       | Confirmed |



