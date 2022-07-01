Feature: Test deal enquiry feature

  Background: Login to XAlpha
    Given Login to XAlpha with valid login credentials

  @XAlphaDealEnquiryFXSpot
  Scenario Outline: "<TestCaseID>" Able to Edit Status "<FromStatus>" to "<ToStatus>" of an Existing FX-Spot Deal in Deal Inquiry
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal enquiry tab
    And Load a deal wrt processing type and deal type
    And Open first deal in the row
    And Change processing status
    And Click update deal button
    Then Verify the deal updated success message
    And Navigate to deal enquiry tab
    And Load a deal wrt deal reference id
    Then Verify the processing type

    Examples:
      | SheetName   | TestCaseID                  | FromStatus | ToStatus  |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_014 | Confirmed  | Processed |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_015 | Pending    | Processed |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_019 | Pending    | Confirmed |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_020 | Confirmed  | Pending   |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_026 | Confirmed  | Cancelled |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_027 | Pending    | Cancelled |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_030 | Cancelled  | Pending   |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_031 | Cancelled  | Confirmed |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_032 | Cancelled  | Processed |

  @XAlphaDealEnquiryFXSpot
  Scenario Outline: "<TestCaseID>" Able to Edit Status "<FromStatus>" to "<ToStatus>" of an Existing FX-Spot Deal in Deal Inquiry
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal enquiry tab
    And Load a deal wrt processing type and deal type
    And Open first deal in the row
    And Change processing status
    And Wait for deal to get settled
    And Click update deal button
    Then Verify the deal updated success message
    And Navigate to deal enquiry tab
    And Load a deal wrt deal reference id
    Then Verify the processing type

    Examples:
      | SheetName   | TestCaseID                  | FromStatus | ToStatus |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_023 | Pending    | Settled  |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_024 | Confirmed  | Settled  |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_025 | Processed  | Settled  |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_033 | Cancelled  | Settled  |

  @XAlphaDealEnquiryFXSpot
  Scenario Outline: "<TestCaseID>" Able to Edit Status "<FromStatus>" to "<ToStatus>" of an Existing FX-Spot Deal in Deal Inquiry
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal enquiry tab
    And Load a deal wrt processing type and deal type
    And Open first deal in the row
    And Change processing status
    And Click update deal button
    Then Verify the deal forwarded to MO for approval
    #login with checker user and approve the deal processing status
    Given Read "XAlpha" and "XAlphaLogin" and "<loginCredentials>" from test data
    And Logout from XAlpha
    And Input XAlpha Username and Password
    And Click XAlpha Login Button
    And Verify User is Able to Login to XAlpha Successfully
    And Navigate to deal processing tab
    And Search for the deal to approve
    And Approve the deal
    #login again with system user and verify the deal processing status
    And Logout from XAlpha
    Given Login to XAlpha with valid login credentials
    And Navigate to deal enquiry tab
    And Load a deal wrt deal reference id
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    Then Verify the processing type

    Examples:
      | SheetName   | TestCaseID                  | loginCredentials  | FromStatus | ToStatus  |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_016 | MO_CheckerAccount | Settled    | Processed |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_017 | MO_CheckerAccount | Processed  | Confirmed |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_018 | MO_CheckerAccount | Settled    | Confirmed |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_021 | MO_CheckerAccount | Processed  | Pending   |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_022 | MO_CheckerAccount | Settled    | Pending   |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_028 | MO_CheckerAccount | Processed  | Cancelled |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_029 | MO_CheckerAccount | Settled    | Cancelled |

  @XAlphaDealEnquiryFXSpot
  Scenario Outline: "<TestCaseID>" Able to Edit fields where Status is "<Status>" on an Existing FX-Spot Deal in Deal Inquiry
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal enquiry tab
    And Load a deal wrt processing type and deal type
    And Open first deal in the row
    And Update deal details(Direction, BaseAssetAmount, BaseAsset, QuoteAsset, UnitPrice, QuoteAssetAmount, FeeAsset, FeeAmount, ReferencePrice)
    And Update deal details(CounterpartyName, PortfolioNumber, ValueDate)
    And Click update deal button
    Then Verify the deal updated success message
    And Navigate to deal enquiry tab
    And Load a deal wrt deal reference id
    Then Verify Updated deal details(Direction, BaseAssetAmount, BaseAsset, QuoteAsset, UnitPrice, QuoteAssetAmount, FeeAsset, FeeAmount, ReferencePrice)
    Then Verify Updates deal details(CounterpartyName, PortfolioNumber)

    Examples:
      | SheetName   | TestCaseID                  | Status  |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_034 | Pending |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_035 | Pending |

  @XAlphaDealEnquiryFXSpot
  Scenario Outline: "<TestCaseID>" Able to Edit fields where Status is "<Status>" on an Existing FX-Spot Deal in Deal Inquiry
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal enquiry tab
    And Load a deal wrt processing type and deal type
    And Open first deal in the row
    And Update deal details(Direction, BaseAssetAmount, BaseAsset, QuoteAsset, UnitPrice, QuoteAssetAmount, FeeAsset, FeeAmount, ReferencePrice)
    And Update deal details(CounterpartyName, PortfolioNumber, ValueDate)
    And Click update deal button
    Then Verify the deal forwarded to MO for approval
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
    And Navigate to deal enquiry tab
    And Load a deal wrt deal reference id
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    Then Verify Updated deal details(Direction, BaseAssetAmount, BaseAsset, QuoteAsset, UnitPrice, QuoteAssetAmount, FeeAsset, FeeAmount, ReferencePrice)
    Then Verify Updates deal details(CounterpartyName, PortfolioNumber)

    Examples:
      | SheetName   | TestCaseID                  | loginCredentials  | Status    |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_036 | MO_CheckerAccount | Processed |
      | XAlphaDeals | QA_TestCase_Auto_XAlpha_037 | MO_CheckerAccount | Settled   |

  @XAlphaDealEnquiryExecutionDeal
  Scenario Outline: "<TestCaseID>" Able to Edit Status and Insert Value Date from "<FromStatus>" to "<ToStatus>" of an Existing Execution Deal in Deal Inquiry
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal enquiry tab
    And Load a deal wrt processing type and deal type
    And Open first deal in the row
    And Change processing status and value date
    And Click update deal button
    Then Verify the deal updated success message
    And Navigate to deal enquiry tab
    And Load a deal wrt deal reference id
    Then Verify the processing type and value date

    Examples:
      | SheetName     | TestCaseID                  | FromStatus | ToStatus  |
      | ExecutionDeal | QA_TestCase_Auto_XAlpha_043 | Confirmed  | Processed |
      | ExecutionDeal | QA_TestCase_Auto_XAlpha_044 | Confirmed  | Settled   |
      | ExecutionDeal | QA_TestCase_Auto_XAlpha_045 | Pending    | Processed |
      | ExecutionDeal | QA_TestCase_Auto_XAlpha_046 | Pending    | Settled   |

  @XAlphaDealEnquiryExecutionDeal
  Scenario Outline: "<TestCaseID>" Able to Edit fields where Status is "<Status>" on an Existing Execution Deal in Deal Inquiry
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal enquiry tab
    And Load a deal wrt processing type and deal type
    And Open first deal in the row
    And Update execution deal details(StartAsset, StartAssetAmount, EndAsset, EndAssetAmount, FeeAsset, FeeProportion, FeeAmount, FeeAdjustment)
    And Update execution deal details(CounterpartyName, PortfolioNumber, ValueDate)
    And Click update deal button
    Then Verify the deal forwarded to MO for approval
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
    And Navigate to deal enquiry tab
    And Load a deal wrt deal reference id
    Then Verify updated execution deal details(StartAsset, StartAssetAmount, EndAsset, EndAssetAmount, FeeAsset, FeeProportion, FeeAmount)
    Then Verify updated execution deal details(CounterpartyName, PortfolioNumber, ValueDate)

    Examples:
      | SheetName     | TestCaseID                  | loginCredentials  | Status    |
      | ExecutionDeal | QA_TestCase_Auto_XAlpha_065 | MO_CheckerAccount | Processed |
      | ExecutionDeal | QA_TestCase_Auto_XAlpha_066 | MO_CheckerAccount | Settled   |

  @XAlphaDealEnquiryExecutionDeal
  Scenario Outline: "<TestCaseID>" Able to Edit Status "<FromStatus>" to "<ToStatus>" of an Existing Execution Deal in Deal Inquiry
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal enquiry tab
    And Load a deal wrt processing type and deal type
    And Open first deal in the row
    And Change processing status
    And Click update deal button
    Then Verify the deal forwarded to MO for approval
    #login with checker user and approve the deal processing status
    Given Read "XAlpha" and "XAlphaLogin" and "<loginCredentials>" from test data
    And Logout from XAlpha
    And Input XAlpha Username and Password
    And Click XAlpha Login Button
    And Verify User is Able to Login to XAlpha Successfully
    And Navigate to deal processing tab
    And Search for the deal to approve
    And Approve the deal
    #login again with system user and verify the deal processing status
    And Logout from XAlpha
    Given Login to XAlpha with valid login credentials
    And Navigate to deal enquiry tab
    And Load a deal wrt deal reference id
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    Then Verify the processing type

    Examples:
      | SheetName     | TestCaseID                  | loginCredentials  | FromStatus | ToStatus  |
      | ExecutionDeal | QA_TestCase_Auto_XAlpha_051 | MO_CheckerAccount | Processed  | Confirmed |
      | ExecutionDeal | QA_TestCase_Auto_XAlpha_052 | MO_CheckerAccount | Processed  | Pending   |
      | ExecutionDeal | QA_TestCase_Auto_XAlpha_053 | MO_CheckerAccount | Settled    | Confirmed |
      | ExecutionDeal | QA_TestCase_Auto_XAlpha_054 | MO_CheckerAccount | Settled    | Pending   |
      | ExecutionDeal | QA_TestCase_Auto_XAlpha_057 | MO_CheckerAccount | Processed  | Cancelled |
      | ExecutionDeal | QA_TestCase_Auto_XAlpha_058 | MO_CheckerAccount | Settled    | Cancelled |

  @XAlphaDealEnquiryExecutionDeal
  Scenario Outline: "<TestCaseID>" Able to Edit Status from "<FromStatus>" to "<ToStatus>" of an Existing Execution Deal in Deal Inquiry
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal enquiry tab
    And Load a deal wrt processing type and deal type
    And Open first deal in the row
    And Change processing status
    And Click update deal button
    Then Verify the deal updated success message
    And Navigate to deal enquiry tab
    And Load a deal wrt deal reference id
    Then Verify the processing type

    Examples:
      | SheetName     | TestCaseID                  | FromStatus | ToStatus  |
      | ExecutionDeal | QA_TestCase_Auto_XAlpha_055 | Pending    | Cancelled |
      | ExecutionDeal | QA_TestCase_Auto_XAlpha_056 | Confirmed  | Cancelled |
      | ExecutionDeal | QA_TestCase_Auto_XAlpha_059 | Cancelled  | Pending   |
      | ExecutionDeal | QA_TestCase_Auto_XAlpha_060 | Cancelled  | Confirmed |
      | ExecutionDeal | QA_TestCase_Auto_XAlpha_061 | Cancelled  | Processed |
      | ExecutionDeal | QA_TestCase_Auto_XAlpha_062 | Cancelled  | Settled   |

  @XAlphaDealEnquiryExecutionDeal
  Scenario Outline: "<TestCaseID>" Able to Edit fields where Status is "<Status>" on an Existing Execution Deal in Deal Inquiry
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal enquiry tab
    And Load a deal wrt processing type and deal type
    And Open first deal in the row
    And Update execution deal details(StartAsset, StartAssetAmount, EndAsset, EndAssetAmount, FeeAsset, FeeProportion, FeeAmount, FeeAdjustment)
    And Update execution deal details(CounterpartyName, PortfolioNumber, ValueDate)
    And Click update deal button
    Then Verify the deal updated success message
    And Navigate to deal enquiry tab
    And Load a deal wrt deal reference id
    Then Verify updated execution deal details(StartAsset, StartAssetAmount, EndAsset, EndAssetAmount, FeeAsset, FeeProportion, FeeAmount)
    Then Verify updated execution deal details(CounterpartyName, PortfolioNumber, ValueDate)

    Examples:
      | SheetName     | TestCaseID                  | Status    |
      | ExecutionDeal | QA_TestCase_Auto_XAlpha_063 | Pending   |
      | ExecutionDeal | QA_TestCase_Auto_XAlpha_064 | Confirmed |

  @XAlphaDealEnquiryExecutionDeal
  Scenario Outline: "<TestCaseID>" Able to Edit Status while Value Date is not populated from "<FromStatus>" to "<ToStatus>" of an Existing Execution Deal in Deal Inquiry
    Given Read "XAlpha" and "<SheetName>" and "<TestCaseID>" from test data
    When Move to X-Alpha page
    And Navigate to deal enquiry tab
    #generate test data
    And Load a deal wrt processing type and deal type
    And Open first deal in the row
    And Change value date to now
    And Click update deal button
    Then Verify the deal updated success message
    #actual test case
    And Navigate to deal enquiry tab
    And Apply value date filter
    And Load deals
    And Open first deal in the row
    And Clear value date
    And Change processing status
    And Click update deal button
    Then Verify the deal updated success message
    And Navigate to deal enquiry tab
    And Load a deal wrt deal reference id
    Then Verify the processing type
    Then Verify empty value date

    Examples:
      | SheetName     | TestCaseID                  | FromStatus | ToStatus  |
      | ExecutionDeal | QA_TestCase_Auto_XAlpha_050 | Pending    | Settled   |
      | ExecutionDeal | QA_TestCase_Auto_XAlpha_047 | Confirmed  | Processed |
      | ExecutionDeal | QA_TestCase_Auto_XAlpha_048 | Confirmed  | Settled   |
      | ExecutionDeal | QA_TestCase_Auto_XAlpha_049 | Pending    | Processed |