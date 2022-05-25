Feature: Test deal enquiry feature

  Background: Login to XAlpha
    Given Login to XAlpha with valid login credentials

  @XAlphaDealEnquiry
  Scenario Outline: QA-TestCase-Auto-X-Alpha-014_Able to Edit Status to Processed of an Existing FX-Spot Deal in Deal Inquiry
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal enquiry tab
    And Load a deal wrt processing type
    And Open first deal in the row
    And Change processing status
    Then Verify the deal updated success message
    And Navigate to deal enquiry tab
    And Load a deal wrt deal reference id
    Then Verify the processing type

    Examples:
      | SheetName   | TestCaseID                  |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_014 |

  @XAlphaDealEnquiry
  Scenario Outline: QA-TestCase-Auto-X-Alpha-016_Able to Edit Status to Pending of an Existing FX-Spot Deal in Deal Inquiry
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal enquiry tab
    And Load a deal wrt processing type
    And Open first deal in the row
    And Change processing status
    Then Verify the deal updated success message
    And Navigate to deal enquiry tab
    And Load a deal wrt deal reference id
    Then Verify the processing type

    Examples:
      | SheetName   | TestCaseID                  |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_016 |

  @XAlphaDealEnquiry
  Scenario Outline: QA-TestCase-Auto-X-Alpha-017_Able to Edit Status to Settled of an Existing FX-Spot Deal in Deal Inquiry
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal enquiry tab
    And Load a deal wrt processing type
    And Open first deal in the row
    And Change processing status
    Then Verify the deal updated success message
    And Navigate to deal enquiry tab
    And Load a deal wrt deal reference id
    Then Verify the processing type

    Examples:
      | SheetName   | TestCaseID                  |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_017 |