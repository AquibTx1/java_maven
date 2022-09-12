Feature: Test Bots features on NitroX HomePage

  Background: Login to application
    Given Login to NitroX app with valid login credentials

  @NitroXBot
  Scenario Outline: <TestCaseID>_Start Execution_Bot for Buy Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Pause all the Bots
    And Verify total Bots Before staring the Buy execution
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Buy Order and Select the MinTime and MaxTime Break
    And Input the Quantity
    And submit the order
    Then Verify Bot Count in Total Filtered
    And Click total filtered bots and click the detail bot
    Then Verify new Bot in detail and config
    Then Verify the Buy Order in Dealt Order
    Examples:
       | SheetName   |  TestCaseID                  |
       | NitroXBots  | QA_TestCase_Auto_NitroX_024 |

  @NitroXBotEdit
  Scenario Outline: <TestCaseID>_Start Execution_Bot for Sell Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Verify total Bots Before starting Sell execution
    And Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Sell Order and Select the MinTime and MaxTime Break
    And Input the Quantity
    And submit the order
    Then Verify Bot Count in Total Filtered
    And Click total filtered bots and click the detail bot
    Then Verify new Bot in detail and config
    Then Verify the Sell Order in Dealt Order
    Examples:
      | SheetName   |  TestCaseID               |
      | NitroXBots  | QA_TestCase_Auto_NitroX_025 |

  @NitroXBot
  Scenario Outline: <TestCaseID>_Start New SNIPER_BOT for SpotMode Buy Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Pause all the Bots
    And Verify total Bots before starting the Sniper Bot execution
    And Click Start Bot and select the Service,Method and Input Bot Quantity
    And Select Buy Order ,Side and Min,Max Price and MaxSlippageThreashold
    And Enter Quantity and submit the order
    Then Verify Bots in Total Filtered on HomePage
    And Click Total Filtered Bots and check the Bot in Detail and Config
    Then Verify new Bot in detail and config for Snipper Bot
    Then Verify the Order in Dealt Order for Sniper Bot
    Examples:
      | SheetName  |  TestCaseID               |
      | NitroXBots  | QA_TestCase_Auto_NitroX_026 |

  @NitroXBotEdit
  Scenario Outline: <TestCaseID>_Start New SNIPER_BOT for Sell Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Pause all the Bots
    And Verify total Bots before starting the Sniper Bot execution
    And Click Start Bot and select the Service,Method and Input Bot Quantity
    And Select Sell Order ,Side and Min,Max Price and MaxSlippageThreashold
    And Enter Quantity and submit the order
    Then Verify Bots in Total Filtered on HomePage
    And Click Total Filtered Bots and check the Bot in Detail and Config
    Then Verify new Bot in detail and config for Snipper Bot
    Then Verify the Order in Dealt Order for Sniper Bot Sell Order
    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_027 |
  @NitroXBot
  Scenario Outline: <TestCaseID>_Start New Twap_BOT For Buy and Sell Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Verify total Bots before starting the Twap_Bot execution
    And Click start Bot and select the Service,Method and Choose Bot Quantity
    And Choose Side,Quantity,and Duration
    And Provide Deal Ref and submit
    Then Verify Bots in Total Filtered on HomePage
    And Click Total Filtered Bots tab & check the Bot in Detail and Config for Twap Bot
    Then Verify new Bot in detail and config for Twap_Bot
    Examples:
      | SheetName  |  TestCaseID               |
      | NitroXBots  | QA_TestCase_Auto_NitroX_028 |
      | NitroXBots  | QA_TestCase_Auto_NitroX_029 |

  @NitroXBot
  Scenario Outline: <TestCaseID>_Start New Pair_Trading BOT For Buy and Sell Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Verify total Bots before starting the Pair_Trading Bot execution
    And Click start Bot and select the Service,Method and Choose Bot Quantity
    And Choose Side,Quantity,and Slice_Size
    And Choose AccountId,Base,Quote and Side in Pair leg and submit
    And Verify Pair_Trading Bot in Total Filtered on homePage
#    Then Click Total Filtered Bots tab & check the Bot in Detail and Config for Pair_Trading Bot
#    Then Verify the Order in Dealt Order for PairTrading Bot
#    And Click Total Filtered Bots tab & check the Bot in Detail and Config for Leg Pair_Trading Bot
#    Then Verify the Order in Dealt Order for PairTrading Bot

    Examples:
      | SheetName  |  TestCaseID                  |
     | NitroXBots  | QA_TestCase_Auto_NitroX_030 |
      | NitroXBots  | QA_TestCase_Auto_NitroX_031 |
     | NitroXBots  | QA_TestCase_Auto_NitroX_032 |
      | NitroXBots  | QA_TestCase_Auto_NitroX_033 |

  @NitroXBot
  Scenario Outline: <TestCaseID>_Pause Existing Running Execution_Bot for Buy Order-SpotMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Stop All the Bots on Homepage
    And Verify total Bots Before staring the Buy execution
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Buy Order and Select the MinTime and MaxTime Break
    And Input the Quantity
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Click Total Filtered Bots and pause the Bot
    Then Verify current running Bot is paused

    Examples:
      | SheetName   |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_056 |

    @NitroXBot
    Scenario Outline: <TestCaseID>_Resume Existing Execution_Bot for Buy Order-SpotMode
      Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
      When Choose Mode, Trading Account, Base and Quote Currency
      And Stop All the Bots on Homepage
      And Click Start Bot ,Select the Service,Method and Input Bot Quantity
      And Select Buy Order and Select the MinTime and MaxTime Break
      And Input the Quantity
      And submit the order
      And Wait for sometime to get the Bots Updated
      And Click Total Filtered Bots and pause the Bot
      Then Verify Bot is Paused
      And Resume the Bot again
      Then Verify Bot has started again

    Examples:
      | SheetName  |  TestCaseID               |
      | NitroXBots  | QA_TestCase_Auto_NitroX_057 |

  @NitroXBot
  Scenario Outline: <TestCaseID>_Restart Existing Running Execution_Bot for Buy Order-SpotMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Stop All the Bots on Homepage
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Buy Order and Select the MinTime and MaxTime Break
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Click Total Filtered Bots and restart the Bot
    And Click on Persist Yes
    Then Verify current running Bot is restarted
    Examples:
      | SheetName  |  TestCaseID               |
      | NitroXBots  | QA_TestCase_Auto_NitroX_058 |

  @NitroXBot
  Scenario Outline: <TestCaseID>_Restart Existing Paused Execution_Bot for Buy Order-SpotMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Stop All the Bots on Homepage
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Buy Order and Select the MinTime and MaxTime Break
    And Input the Time, Quantity and Submit the Order
    And Pause the Current running bot
    And Click on Persist Yes
    Then Verify current running Bot is restarted
    Examples:
      | SheetName  |  TestCaseID               |
      | NitroXBots  | QA_TestCase_Auto_NitroX_059 |

  @NitroXBot
  Scenario Outline: <TestCaseID>_Restart Existing Running Execution_Bot for Buy Order-SpotMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Stop All the Bots on Homepage
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Buy Order and Select the MinTime and MaxTime Break
    And Input the Time, Quantity and Submit the Order
    And Click Total Filtered Bots and restart the Bot
    And Click Persist Status No
    Then Verify current running Bot is restarted
    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_060 |

  @NitroXBot
  Scenario Outline: <TestCaseID>_Restart Existing Paused Execution_Bot for Buy Order-SpotMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Stop All the Bots on Homepage
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Buy Order and Select the MinTime and MaxTime Break
    And Input the Time, Quantity and Submit the Order
    And Pause the Current running bot
    And Click Persist Status No
    Then Verify current running Bot is restarted
    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_061 |
  @NitroXBot
  Scenario Outline: <TestCaseID>_Stop Existing Running Execution_Bot for Buy Order-SpotMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Stop All the Bots on Homepage
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Buy Order and Select the MinTime and MaxTime Break
    And Input the Time, Quantity and Submit the Order
    And Click Total Filtered Bots and stop current running Bot
    Then Verify current running Bot is stopped
    Examples:
      | SheetName  |  TestCaseID               |
      | NitroXBots  | QA_TestCase_Auto_NitroX_062 |

  @NitroXBot
  Scenario Outline: <TestCaseID>_Edit the Execution_Bot for Buy Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Stop All the Bots on Homepage
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Buy Order and Select the MinTime and MaxTime Break
    And Input the Time, Quantity and Submit the Order
    And Click total filtered bots and click the latest running bot to edit
    And Input any field with new value and again submit
    Then Verify the Bot is updated
    Then Verify the Config Tab for modified field

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_063 |

  @NitroXBot
  Scenario Outline: <TestCaseID>_Edit the Execution_Bot for Buy Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Stop All the Bots on Homepage
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Buy Order and Select the MinTime and MaxTime Break
    And Input the Time, Quantity and Submit the Order
    And Pause the Bot
    And Input any field with new value and again submit
    Then Verify the Bot is updated
    Then Verify the Config Tab for modified field

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_064 |

  @NitroXBot
  Scenario Outline: <TestCaseID>_Edit the SNIPER_BOT for SpotMode Buy Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Stop All the Bots on Homepage
    And Click Start Bot and select the Service,Method and Input Bot Quantity
    And Select Buy Order ,Side and Min,Max Price and MaxSlippageThreashold
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Click total filtered bots and click the latest running bot to edit
    And Input any field with new value and again submit for Sniper Bot
    Then Verify the Bot is updated
    Then Verify the Config Tab for modified field in Sniper Bot

    Examples:
      | SheetName  |  TestCaseID               |
      | NitroXBots  | QA_TestCase_Auto_NitroX_065 |

  @NitroXBot
  Scenario Outline: <TestCaseID>_Edit the SNIPER_BOT for SpotMode Buy Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Stop All the Bots on Homepage
    And Click Start Bot and select the Service,Method and Input Bot Quantity
    And Select Buy Order ,Side and Min,Max Price and MaxSlippageThreashold
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Pause the Bot
    And Input any field with new value and again submit for Sniper Bot
    Then Verify the Bot is updated
    Then Verify fields are updated in BotDetail

    Examples:
      | SheetName  |  TestCaseID               |
      | NitroXBots  | QA_TestCase_Auto_NitroX_066 |

  @NitroXBot
  Scenario Outline: <TestCaseID>_Edit PairTrading BOT For Buy and Sell Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Stop All the Bots on Homepage
    And Click start Bot and select the Service,Method and Choose Bot Quantity
    And Choose Side,Quantity,and Slice_Size
    And Choose AccountId,Base,Quote and Side in Pair leg and submit
    And Click total filtered bots and click the latest running bot to edit
    And Input any field with new value and again submit for PairTrading Bot
    Then Verify the Bot is updated
    Then Verify the Config Tab for modified field in PairTrading Bot

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_067 |

  @NitroXBot
  Scenario Outline: <TestCaseID>_Edit PairTrading BOT For Buy and Sell Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Stop All the Bots on Homepage
    And Click start Bot and select the Service,Method and Choose Bot Quantity
    And Choose Side,Quantity,and Slice_Size
    And Choose AccountId,Base,Quote and Side in Pair leg and submit
    And Wait for sometime to get the Bots Updated
    And Click total filtered bots and choose latest bot and pause it
    And Input any field with new value and again submit for PairTrading Bot
    Then Verify the Bot is updated
    Then Verify the Config Tab for modified field in PairTrading Bot

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_068 |
  @NitroXBot
  Scenario Outline: <TestCaseID>_Duplicate the Execution_Bot for Buy Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Stop All the Bots on Homepage
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Buy Order and Select the MinTime and MaxTime Break
    And Input the Time, Quantity and Submit the Order
    And Wait for sometime to get the Bots Updated
    And Click total filtered bots and click the latest running bot and create duplicate Bot
    And Input any field with new value and again submit
    Then Verify duplicate bot is created
    Then Verify the Config Tab for modified field

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_069 |

  @NitroXBot
  Scenario Outline: <TestCaseID>_Duplicate the Sniper_Bot for Buy Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Stop All the Bots on Homepage
    And Click Start Bot and select the Service,Method and Input Bot Quantity
    And Select Buy Order ,Side and Min,Max Price and MaxSlippageThreashold
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Click total filtered bots and click the latest running bot and create duplicate Bot
    And Input any field with new value and again submit for Sniper Bot
    Then Verify duplicate bot is created
    Then Verify the Config Tab for modified field in Sniper Bot

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_070 |
  @NitroXBot
  Scenario Outline: <TestCaseID>_Duplicate PairTrading BOT For Buy and Sell Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Pause all the Bots
    And Click start Bot and select the Service,Method and Choose Bot Quantity
    And Choose Side,Quantity,and Slice_Size
    And Choose AccountId,Base,Quote and Side in Pair leg and submit
    And Click total filtered bots and click the latest running bot and create duplicate Bot
    And Input any field with new value and again submit for PairTrading Bot
    Then Verify duplicate bot is created
    Then Verify the Config Tab for modified field in PairTrading Bot

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_071 |
  @NitroXBot72
  Scenario Outline: <TestCaseID>_Duplicate TWAP BOT For Buy and Sell Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Stop All the Bots on Homepage
    And Click start Bot and select the Service,Method and Choose Bot Quantity
    And Choose Side,Quantity,and Duration
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Click total filtered bots and click the latest running bot and create duplicate Bot
    And Input any field with new value and again submit for Twap Bot
    Then Verify duplicate bot is created
    Then Verify the Config Tab for modified field in Twap Bot
    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_072 |

  @NitroXBot
  Scenario Outline: <TestCaseID>_Pause Existing Running Execution_Bot for Buy Order-SpotMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode,Trading Account
    And Validate the Bots
    And Close the Detailed Bot
    And Input Base and Quote Currency
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Buy Order and Select the MinTime and MaxTime Break
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Clear the Base and Quote
    And Click Total Filtered Bots and pause the Bot
    Then Verify current running Bot is paused

    Examples:
      | SheetName   |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_090 |

  @NitroXBot
  Scenario Outline: <TestCaseID>_Resume The Existing Paused Execution_Bot for Buy Order-SpotMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode,Trading Account
    And Validate the Bots
    And Close the Detailed Bot
    And Input Base and Quote Currency
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Buy Order and Select the MinTime and MaxTime Break
    And Input the Time, Quantity and Submit the Order
    And Clear the Base and Quote
    And Click Total Filtered Bots and pause the Bot
    Then Verify Bot is Paused
    And Resume the Bot again
    Then Verify Bot has started again

    Examples:
      | SheetName   |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_091 |

  @NitroXBot
  Scenario Outline: <TestCaseID>_Restart Existing Paused Execution_Bot for Buy Order-SpotMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode,Trading Account
    And Validate the Bots
    And Close the Detailed Bot
    And Input Base and Quote Currency
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Buy Order and Select the MinTime and MaxTime Break
    And Input the Time, Quantity and Submit the Order
    And Clear the Base and Quote
    And Click Total Filtered Bots and restart the Bot
    And Click on Persist Yes
    Then Verify current running Bot is restarted
    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_092 |

  @NitroXBot
  Scenario Outline: <TestCaseID>_Restart Existing Paused Execution_Bot for Buy Order-SpotMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode,Trading Account
    And Validate the Bots
    And Close the Detailed Bot
    And Input Base and Quote Currency
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Buy Order and Select the MinTime and MaxTime Break
    And Input the Time, Quantity and Submit the Order
    And Clear the Base and Quote
    And Pause the Current running bot
    And Click on Persist Yes
    Then Verify current running Bot is restarted
    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_093 |

  @NitroXBot
  Scenario Outline: <TestCaseID>_Restart Existing running Execution_Bot for Buy Order-SpotMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode,Trading Account
    And Validate the Bots
    And Close the Detailed Bot
    And Input Base and Quote Currency
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Buy Order and Select the MinTime and MaxTime Break
    And Input the Time, Quantity and Submit the Order
    And Clear the Base and Quote
    And Click Total Filtered Bots and restart the Bot
    And Click Persist Status No
    Then Verify current running Bot is restarted
    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_094 |

#  @NitroXBot
#  Scenario Outline: <TestCaseID>_Restart Existing Paused Execution_Bot for Buy Order-SpotMode
#    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
#    When Choose Mode,Trading Account
##    And Validate the Bots
##    And Close the Detailed Bot
#    And Input Base and Quote Currency
#    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
#    And Select Buy Order and Select the MinTime and MaxTime Break
#    And Input the Time, Quantity and Submit the Order
#    And Clear the Base and Quote
#    And Pause the Current running bot
#    And Click Persist Status No
#    Then Verify current running Bot is restarted
#    Examples:
#      | SheetName  |  TestCaseID                  |
#      | NitroXBots  | QA_TestCase_Auto_NitroX_095 |
  @NitroXBot
  Scenario Outline: <TestCaseID>_Stop Existing Running Execution_Bot for Buy Order-SpotMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode,Trading Account
    And Validate the Bots
    And Close the Detailed Bot
    And Input Base and Quote Currency
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Buy Order and Select the MinTime and MaxTime Break
    And Input the Time, Quantity and Submit the Order
    And Click Total Filtered Bots and stop current running Bot
    Then Verify current running Bot is stopped
    Examples:
      | SheetName  |  TestCaseID               |
      | NitroXBots  | QA_TestCase_Auto_NitroX_096 |

  @NitroXBot
  Scenario Outline: <TestCaseID>_Count list of Running Bots
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode,Trading Account
    And Check if No Current running Bot
    Then Verify the list of running bots is displayed

    Examples:
      | SheetName   |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_020 |

  @NitroXBot
  Scenario Outline: <TestCaseID>_Verify Empty Bot List
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode,Trading Account
    And Validate the Bots
    Then Verify the bot list is empty

    Examples:
      | SheetName   |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_021 |

  @NitroXBot
  Scenario Outline: <TestCaseID>_Count list of Running Bots
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Check the Current running Bot
    Then Verify the list of running bots is displayed

    Examples:
      | SheetName   |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_022 |

  @NitroXBot
  Scenario Outline: <TestCaseID>_No Bot in List for Base and Quote
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account, Base and Quote Currency
    And Validate the Bots
    Then Verify the bot list is empty

    Examples:
      | SheetName   |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_023 |

