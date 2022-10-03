Feature: Test Bots features on NitroX HomePage

  Background: Login to application
    Given Login to NitroX app with valid login credentials

  @NitroXOTCPrice
  Scenario Outline: <TestCaseID>_Calculate OTC Price for Base without Reference
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Select OTC Price
    And Select Base and Input Quantity ,DeliveryTime
    And Input Participation and No Reference
    And Click Calculate
    And Verify the Ask and Bid Price displayed

    Examples:
      | SheetName  |  TestCaseID                     |
      | NitroXBuySell  | QA_TestCase_Auto_NitroX_140 |

  @NitroXOTCPrice
  Scenario Outline: <TestCaseID>_Calculate OTC Price for Quote without Reference
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Select OTC Price
    And Select Quote from OTC Window
    And Select Base and Input Quantity ,DeliveryTime
    And Input Participation and No Reference
    And Click Calculate
    And Verify the Ask and Bid Price displayed

    Examples:
      | SheetName  |  TestCaseID                     |
      | NitroXBuySell  | QA_TestCase_Auto_NitroX_141 |

  @NitroXOTCPrice
  Scenario Outline: <TestCaseID>_Calculate OTC Price for Base with Reference as Spot
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Select OTC Price
    And Select Quote from OTC Window
    And Select Base and Input Quantity ,DeliveryTime
    And Input Participation and No Reference
    And Select Reference Range
    And Click Calculate
    And Verify the Ask and Bid Price displayed

    Examples:
      | SheetName  |  TestCaseID                     |
      | NitroXBuySell  | QA_TestCase_Auto_NitroX_142 |
      | NitroXBuySell  | QA_TestCase_Auto_NitroX_143 |


  @NitroXOTCPrice
  Scenario Outline: <TestCaseID>_Calculate OTC Price for Future Mode with Base without Reference
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And Select OTC Price
    And Select Base and Input Quantity ,DeliveryTime
    And Input Participation and No Reference
    And Click Calculate
    And Verify the Ask and Bid Price displayed

    Examples:
      | SheetName  |  TestCaseID                     |
      | NitroXBuySell  | QA_TestCase_Auto_NitroX_144 |
  @NitroXOTCPrice
  Scenario Outline: <TestCaseID>_Calculate OTC Price for Future Mode and Base with Reference as Spot
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And Select OTC Price
    And Select Quote from OTC Window
    And Select Base and Input Quantity ,DeliveryTime
    And Input Participation and No Reference
    And Click Calculate
    And Verify the Ask and Bid Price displayed

    Examples:
      | SheetName  |  TestCaseID                     |
      | NitroXBuySell  | QA_TestCase_Auto_NitroX_145 |
      | NitroXBuySell  | QA_TestCase_Auto_NitroX_146 |