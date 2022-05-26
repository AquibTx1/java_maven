Feature: Test buys sell features using Future Mode

  Background: Login to application
    Given Login to NitroX app with valid login credentials

  @NitroXBuySellFuture
  Scenario Outline: NitroXHome-034_Create an Open Order When Price is Less Than Market Price
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And Choose Position Mode,Leverage and Margin Type
    And Create A buy Order less than Market Price for Future Mode
     And Click Buy Order and Validate
    Then Validate order is in Open State for Future Mode
    Examples:
      | SheetName     | TestCaseID                  | Number |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_034 | 2      |

  @NitroXBuySellFuture
  Scenario Outline: NitroXHome-035_Cancel An Open-Buy Order-Future Mode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And Go to Open Order & Cancel First Open Buy Order
    Then Verify Cancel Order Success Message
    Examples:
      | SheetName     | TestCaseID                  |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_035 |

  @NitroXBuySellFuture
  Scenario Outline: QA_TestCase_Auto_NitroX_036_Create A Dealt Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And Validate No previous postion
    And Choose Position Mode,Leverage and Margin Type
    And Create Buy Order Equal to Ask Price for Future Mode
    Then Verify Order Submitted Success Message-Future Mode
    Then Validate Order Moves to Dealt Orders-Future Mode
    Examples:
      | SheetName     | TestCaseID                  | Number |
      | NitroXBuySell | QA_TestCase_Auto_NitroX_036 | 2      |

#  @NitroXBuySellFuture
#  Scenario Outline: QA_TestCase_Auto_NitroX_037_Create A Dealt Order
#    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
#    When Choose Mode, Trading Account and Instrument
#    And Choose Position Mode,Leverage and Margin Type
#    And Create Buy Order Equal to Ask Price for Future Mode
#    And Click Buy Order and Validate
#    Then Verify Order Submitted Success Message-Future Mode
#    Then Validate Order Moves to Dealt Orders-Future Mode
#    Examples:
#      | SheetName     | TestCaseID                  | Number |
#      | NitroXBuySell | QA_TestCase_Auto_NitroX_036 | 2      |