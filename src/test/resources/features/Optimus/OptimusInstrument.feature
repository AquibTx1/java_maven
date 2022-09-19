Feature: Test Instrument feature

  Background: Login to Optimus
    Given Login to Optimus with Valid Credentials

  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able to Login and Create New Instrument
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Click the Tokens link
    And Open New Token
    And Enter All the field detail
    And Click Create Instrument
    #Login Again with MO Account
    Given Read "Optimus" and "OptimusLogin" and "<loginCredentials>" from test data
    And Logout from Optimus
    And Input Optimus Username and Password
    And Click Optimus Login Button
    Then Verify user is able to login to Optimus successfully
    And Open the Instrument Tab
    And Click Tasks link
    And Navigate to Instrument Task
    And Input the Asset Code
    And Approve the Asset created
    And Logout from MO Account
      #Login and Check the Approved record
    Given Login to Optimus with Valid Credentials
    And Open the Instrument Tab
    And Verify the Token Created

    Examples:
      | TestCaseID                     | SheetName  | loginCredentials  |
      | QA_TestCase_Auto_Optimus_5_1_1 | Instrument | MO_CheckerAccount |

  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able to Login and Update the Created Instrument
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Click the Tokens link
    And Sort the data
    And Search the Instrument to be Updated
    And Edit the Existing fields
    And Click Update Instrument
    #Login Again with MO Account
    Given Read "Optimus" and "OptimusLogin" and "<loginCredentials>" from test data
    And Logout from Optimus
    And Input Optimus Username and Password
    And Click Optimus Login Button
    Then Verify user is able to login to Optimus successfully
    And Open the Instrument Tab
    And Click Tasks link
    And Navigate to Instrument Task
    And Input the Asset
    And Approve the Asset created
    And Logout from MO Account
      #Login and Check the Approved record
    Given Login to Optimus with Valid Credentials
    And Open the Instrument Tab
    And Verify the Token Updated

    Examples:
      | TestCaseID                     | SheetName  | loginCredentials  |
      | QA_TestCase_Auto_Optimus_5_1_2 | Instrument | MO_CheckerAccount |

  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able to Login and delete the Created Instrument
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Click the Tokens link
    And Sort the data
    And Search the Instrument to be deleted
    And Click Edit Button
    And Click delete Instrument
    #Login Again with MO Account
    Given Read "Optimus" and "OptimusLogin" and "<loginCredentials>" from test data
    And Logout from Optimus
    And Input Optimus Username and Password
    And Click Optimus Login Button
    Then Verify user is able to login to Optimus successfully
    And Open the Instrument Tab
    And Click Tasks link
    And Navigate to Instrument Task
    And Input the Asset
    And Approve the Asset created
    And Logout from MO Account
       #Login and Check the Check the deleted  record
    Given Login to Optimus with Valid Credentials
    And Open the Instrument Tab
    And Verify the Token Deleted

    Examples:
      | TestCaseID                     | SheetName  | loginCredentials  |
      | QA_TestCase_Auto_Optimus_5_1_3 | Instrument | MO_CheckerAccount |

  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able to Search a record the from the Instrument List
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Click the Tokens link
    And Search the existing Instrument
    Then Verify the Instrument

    Examples:
      | TestCaseID                     | SheetName  | loginCredentials  |
      | QA_TestCase_Auto_Optimus_5_1_4 | Instrument | MO_CheckerAccount |

  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able to Download list from Portfolio
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Click the Tokens link
    And Click the download csv
    Then Verify the File downloaded CSV Button
    Examples:
      | TestCaseID                     | SheetName  | loginCredentials  |
      | QA_TestCase_Auto_Optimus_5_1_5 | Instrument | MO_CheckerAccount |


  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able Create Trading Instrument
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Click the Trading Instrument
    And Open New Trading Instrument
    And Enter the details in Trading Instrument
    And Click Create Instrument
    #Login Again with MO Account
    Given Read "Optimus" and "OptimusLogin" and "<loginCredentials>" from test data
    And Logout from Optimus
    And Input Optimus Username and Password
    And Click Optimus Login Button
    Then Verify user is able to login to Optimus successfully
    And Open the Instrument Tab
    And Click Tasks link
    And Navigate to Instrument Task
    And Input the Exchange value
    And Approve the Task
    And Wait for sometime
    And Logout from MO Account
      #Login and Check the Approved record
    Given Login to Optimus with Valid Credentials
    And Open the Instrument Tab
    And Click the Trading Instrument
    And Verify the Trading Instrument Approved

    Examples:
      | TestCaseID                     | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_5_2_1 | InstrumentTrading | MO_CheckerAccount |


  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able Edit New Trading Instrument
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Click the Trading Instrument
    And Sort the data
    And Search the Exchange Symbol to be Updated
    And Edit the Existing fields
    And Update existing Trading Instrument fields
    #Login Again with MO Account
    Given Read "Optimus" and "OptimusLogin" and "<loginCredentials>" from test data
    And Logout from Optimus
    And Input Optimus Username and Password
    And Click Optimus Login Button
    Then Verify user is able to login to Optimus successfully
    And Open the Instrument Tab
    And Click Tasks link
    And Navigate to Instrument Task
    And Input the Instrument Ref. id
    And Approve the Task
    And Wait for sometime
    And Logout from MO Account
#      #Login and Check the Approved record
    Given Login to Optimus with Valid Credentials
    And Open the Instrument Tab
    And Click the Trading Instrument
    And Verify the Trading Instrument Updated

    Examples:
      | TestCaseID                     | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_5_2_2 | InstrumentTrading | MO_CheckerAccount |

  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able to Delete the Existing Trading Instrument
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Click the Trading Instrument
    And Sort the data
    And Search the Exchange Symbol to be deleted
    And Edit the Existing fields
    And Click delete Instrument
     #Login Again with MO Account
    Given Read "Optimus" and "OptimusLogin" and "<loginCredentials>" from test data
    And Logout from Optimus
    And Input Optimus Username and Password
    And Click Optimus Login Button
    Then Verify user is able to login to Optimus successfully
    And Open the Instrument Tab
    And Click Tasks link
    And Navigate to Instrument Task
    And Input the Instrument Ref. id
    And Approve the Task
    And Wait for sometime
    And Logout from MO Account
#      #Login and Check the Check the deleted  record
    Given Login to Optimus with Valid Credentials
    And Open the Instrument Tab
    And Click the Trading Instrument
    And Verify the Trading Instrument deleted


    Examples:
      | TestCaseID                     | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_5_2_3 | InstrumentTrading | MO_CheckerAccount |

  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able to Search a record the from the Instrument List
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Click the Trading Instrument
    And Search the existing Trading Instrument
    Then Verify the Trading Instrument

    Examples:
      | TestCaseID                     | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_5_2_4 | InstrumentTrading | MO_CheckerAccount |

  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able to Download list from Instrument
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Click the Trading Instrument
    And Click the download csv
    Then Verify the File downloaded CSV Button
    Examples:
      | TestCaseID                     | SheetName         | loginCredentials  |
      | QA_TestCase_Auto_Optimus_5_2_5 | InstrumentTrading | MO_CheckerAccount |

  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able to Search the Existing Futures from  list of Instrument
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Click the Futures Side Tab Under Instrument
    And Select Exchange from Search Dropdown
    And Search the record
    Then Verify Search Results of Existing Futures
    Examples:
      | TestCaseID                     | SheetName  |
      | QA_TestCase_Auto_Optimus_5_3_1 | Instrument |
      | QA_TestCase_Auto_Optimus_5_3_2 | Instrument |

  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able to check Download CSV button in Search List of Futures under Instrument
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Click the Futures Side Tab Under Instrument
    And Select Exchange from Search Dropdown
    And Search the record
    Then Verify the File downloaded CSV Button
    Examples:
      | TestCaseID                     | SheetName  |
      | QA_TestCase_Auto_Optimus_5_3_3 | Instrument |

  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able to Search the Existing Token Prices with Base from  list of Instrument
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Click the Token Price Side Tab Under Instrument
    And Select Base from Search Dropdown
    Then Verify Base in Search Results of Existing Token Prices

    Examples:
      | TestCaseID                     | SheetName  |
      | QA_TestCase_Auto_Optimus_5_4_1 | Instrument |

  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able to Search the Existing Token Prices with Quote from  list of Instrument
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Click the Token Price Side Tab Under Instrument
    And Select Quote from Search Dropdown
    Then Verify Quote in Search Results of Existing Token Prices

    Examples:
      | TestCaseID                     | SheetName  |
      | QA_TestCase_Auto_Optimus_5_4_2 | Instrument |

  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able to Search the Existing Token Prices with Date from  list of Instrument
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Click the Token Price Side Tab Under Instrument
    And Select Date from Search Dropdown
    And Select Time from Search Dropdown
    Then Verify DateTime in Search Results of Existing Token Prices

    Examples:
      | TestCaseID                     | SheetName  |
      | QA_TestCase_Auto_Optimus_5_4_3 | Instrument |
      | QA_TestCase_Auto_Optimus_5_4_4 | Instrument |

  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able to Search the Existing Token Prices from  list of Instrument
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Click the Token Price Side Tab Under Instrument
    And Select Base from Search Dropdown
    Then Verify downloaded CSV Button in Instrument

    Examples:
      | TestCaseID                     | SheetName  |
      | QA_TestCase_Auto_Optimus_5_4_5 | Instrument |


  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able to Search the Base and Quote in Existing Fiat Prices from  list of Instrument
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Click the Fiat Price Side Tab Under Instrument
    And Select Base from Search Dropdown
    And Reload the List
    Then Verify Base in Search Results of Existing Token Prices
    Examples:
      | TestCaseID                     | SheetName  |
      | QA_TestCase_Auto_Optimus_5_6_1 | Instrument |

  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able to Search the Base and Quote in Existing Fiat Prices from  list of Instrument
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Click the Fiat Price Side Tab Under Instrument
    And Select Quote from Search Dropdown
    And Reload the List
    Then Verify Quote in Search Results of Existing Token Prices

    Examples:
      | TestCaseID                     | SheetName  |
      | QA_TestCase_Auto_Optimus_5_6_2 | Instrument |

  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able to Search the Date and Time in Existing Fiat Prices from  list of Instrument
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Click the Fiat Price Side Tab Under Instrument
    And Select Date from Search Dropdown
    And Select Time from Search Dropdown
    And Reload the List
    Then Verify DateTime in Search Results of Existing Token Prices

    Examples:
      | TestCaseID                     | SheetName  |
      | QA_TestCase_Auto_Optimus_5_6_3 | Instrument |
      | QA_TestCase_Auto_Optimus_5_6_4 | Instrument |

  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able to verify Download CSV button in Search List of Fiat Prices from list of Instrument
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Click the Fiat Price Side Tab Under Instrument
    And Select Base from Search Dropdown
    And Select Quote from Search Dropdown
    Then Verify downloaded CSV Button in Instrument

    Examples:
      | TestCaseID                     | SheetName  |
      | QA_TestCase_Auto_Optimus_5_6_5 | Instrument |


  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able to Open Alert Prices list and Select Auto in Arbitrage section of Instrument
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Click the Alert Price Side Tab Under Instrument
    And Click to open Arbitrage Sub tab
    And Switch to "Manual" Mode for Arbitrage tab
    Then Verify List Switched "Manual" Mode
    And Switch to "Auto" Mode for Arbitrage tab
    Then Verify List Switched "Auto" Mode

    Examples:
      | TestCaseID                       | SheetName  |
      | QA_TestCase_Auto_Optimus_5_7_1_1 | Instrument |

  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able to Open Alert Prices list and Select Update Now in Arbitrage section of Instrument
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Click the Alert Price Side Tab Under Instrument
    And Click to open Arbitrage Sub tab
    And Click Update Now button on Arbitrage tab
    Then Verify Update Now button is clicked

    Examples:
      | TestCaseID                       | SheetName  |
      | QA_TestCase_Auto_Optimus_5_7_1_2 | Instrument |


  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able to Open Alert Prices list and Select Arbitrage Threshold button in Arbitrage section of Instrument
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Click the Alert Price Side Tab Under Instrument
    And Click to open Arbitrage Sub tab
    And Click Arbitrage Threshold button on Arbitrage tab
    Then Verify Arbitrage Threshold modal is open

    Examples:
      | TestCaseID                       | SheetName  |
      | QA_TestCase_Auto_Optimus_5_7_1_3 | Instrument |

# Price ALert
  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able to Open Alert Prices list and create New Price Alert in Price section of Instrument
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Click the Alert Price Side Tab Under Instrument
    And Click to open Price Sub tab
    And Click Create button on Price tab page
    And Enter All the field detail of Price Alert on Create Price modal
    And Click submit button
    Then Search the New Price Alert in the Price List
    Then Verify the Alert Price Pair is Created and Available in List
    Then Verify the Alert Price Comment is Created and Available in List

    Examples:
      | TestCaseID                       | SheetName            |
      | QA_TestCase_Auto_Optimus_5_7_2_1 | InstrumentPriceAlert |

  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able to Open Alert Prices list and Search Existing Price alert in Price Alert section of Instrument
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Click the Alert Price Side Tab Under Instrument
    And Click to open Price Sub tab
    And Search the Price Alert in the Price List
    Then Verify the Alert Price Pair is Created and Available in List
    Then Verify the Alert Price Comment is Created and Available in List

    Examples:
      | TestCaseID                       | SheetName            |
      | QA_TestCase_Auto_Optimus_5_7_2_2 | InstrumentPriceAlert |

  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able to Open Alert Prices list and Search Existing Price alert in  Price Alert section of Instrument
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Click the Alert Price Side Tab Under Instrument
    And Click to open Price Sub tab
    And Search the Price Alert in the Price List
    And Click Reset button in Instrument
    Then Verify the Search box is Reset in Instrument

    Examples:
      | TestCaseID                       | SheetName            |
      | QA_TestCase_Auto_Optimus_5_7_2_3 | InstrumentPriceAlert |

  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able to Open Alert Prices list and Delete Existing Price alert in  Price Alert section of Instrument
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Click the Alert Price Side Tab Under Instrument
    And Click to open Price Sub tab
    And Search the Price Alert in the Price List
    And Take the Price Pair of item to be deleted
    And Click Delete button of Price Alert in Instrument
    Then Search for Deleted Price Alert by pair
    Then verify Item is deleted and Not shown in Search Result

    Examples:
      | TestCaseID                       | SheetName            |
      | QA_TestCase_Auto_Optimus_5_7_2_4 | InstrumentPriceAlert |

#    Balance Alert

  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able to Open Alert Prices list and create New Balance Alert in Price section of Instrument
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Click the Alert Price Side Tab Under Instrument
    And Click to open Balance Sub tab
    And Click Create button on Balance Alert tab page
    And Enter All the field detail of Balance Alert on Create Balance modal
    And Click submit button
    Then Search the Balance Alert in the Price List
    Then Verify the Alert Balance Account ID And Asset is Created and Available in List
    Then Verify the Alert Balance Comment is Created and Available in List

    Examples:
      | TestCaseID                       | SheetName            |
      | QA_TestCase_Auto_Optimus_5_7_3_1 | InstrumentPriceAlert |

  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able to Open Alert Prices list and Search Existing Balance alert by Account ID and Asset in Price Alert section of Instrument
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Click the Alert Price Side Tab Under Instrument
    And Click to open Balance Sub tab
    Then Search the Balance Alert in the Price List
    Then Verify the Alert Balance Account ID And Asset is Created and Available in List

    Examples:
      | TestCaseID                       | SheetName            |
      | QA_TestCase_Auto_Optimus_5_7_3_2 | InstrumentPriceAlert |
      | QA_TestCase_Auto_Optimus_5_7_3_3 | InstrumentPriceAlert |

  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able to Open Alert Prices list and Reset the Search Criteria for Balance alert in  Price Alert section of Instrument
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Click the Alert Price Side Tab Under Instrument
    And Click to open Balance Sub tab
    Then Search the Balance Alert in the Price List
    And Click Reset button in Balance Alert under Instrument
    Then Verify the Empty Search box is Reset in Instrument

    Examples:
      | TestCaseID                       | SheetName            |
      | QA_TestCase_Auto_Optimus_5_7_3_4 | InstrumentPriceAlert |

  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able to Open Alert Prices list and Delete the Existing Balance alert in Price Alert section of Instrument
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Click the Alert Price Side Tab Under Instrument
    And Click to open Balance Sub tab
    Then Search the Balance Alert in the Price List
    Then Verify the Alert Balance Account ID And Asset is Created and Available in List
    And Take the Balance Alert Details of item to be deleted
    And Click Delete button of Balance Alert in Instrument
    Then Search the Balance Alert in the Price List
    Then verify Item is deleted and Not shown in Search Result

    Examples:
      | TestCaseID                       | SheetName            |
      | QA_TestCase_Auto_Optimus_5_7_3_5 | InstrumentPriceAlert |

  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able to Search the Base in Existing Manual Prices from list of Instrument
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Open Manual Price Side Tab Under Instrument
    And Select Base from Search Dropdown in Manual Prices
    And Reload the List
    Then Verify Base in Search Results of Existing Manual Prices
    Examples:
      | TestCaseID                     | SheetName            |
      | QA_TestCase_Auto_Optimus_5_5_1 | InstrumentPriceAlert |

  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able to Search the Quote in Existing Manual Prices from list of Instrument
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Open Manual Price Side Tab Under Instrument
    And Select Quote from Search Dropdown in Manual Prices
    And Reload the List
    Then Verify Quote in Search Results of Existing Manual Prices

    Examples:
      | TestCaseID                     | SheetName            |
      | QA_TestCase_Auto_Optimus_5_5_2 | InstrumentPriceAlert |

  @OptimusInstrument
  Scenario Outline: "<TestCaseID>" Able to Search With the Date in Existing Manual Prices from list of Instrument
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open the Instrument Tab
    And Open Manual Price Side Tab Under Instrument
    And Select Date from Search Dropdown in Manual Prices
    And Reload the List
    Then Verify DateTime in Search Results of Existing Manual Prices

    Examples:
      | TestCaseID                     | SheetName            |
      | QA_TestCase_Auto_Optimus_5_5_3 | InstrumentPriceAlert |
      | QA_TestCase_Auto_Optimus_5_5_4 | InstrumentPriceAlert |
