Feature: Test Bots features on NitroX HomePage

  Background: Login to application
    Given Login to NitroX app with valid login credentials
#
#  @NitroXBotFutureMode
#  Scenario Outline: <TestCaseID>_Start Execution_Bot for Buy Order-Future Mode
#    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
#    When Choose Mode, Trading Account and Instrument
#    And Validate No previous position
#    And Verify total Bots Before staring the Buy execution
#    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
#    And Select Buy Order and Select the MinTime and MaxTime Break
#    And Input the Time, Quantity and Submit the Order for FutureMode
#    Then Verify Bot Count in Total Filtered
#    And Click total filtered bots and click the detail bot
#   Then Verify new Bot in detail and config for FutureMode
#    Then Verify the Order in Dealt Order for FutureMode
#    Examples:
#      | SheetName  |  TestCaseID                  |
#      | NitroXBots  | QA_TestCase_Auto_NitroX_046 |
#      | NitroXBots  | QA_TestCase_Auto_NitroX_047 |
#
#  @NitroXBotFutureMode
#  Scenario Outline: <TestCaseID>_Start New SNIPER_BOT for FutureMode Buy Order
#    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
#    When Choose Mode, Trading Account and Instrument
#    And Validate No previous position
#    And Verify total Bots before starting the Sniper Bot execution
#    And Click Start Bot and select the Service,Method and Input Bot Quantity
#    And Select Buy Order ,Side and Min,Max Price and MaxSlippageThreashold
#    And Enter Quantity and submit the order
#    Then Verify Bots in Total Filtered on HomePage
#    And Click Total Filtered Bots and check the Bot in Detail and Config
#    Then Verify new Bot in detail and config for Snipper Bot-FutureMode
#    Then Verify the Order in Dealt Order for Sniper Bot-FutureMode
#
#    Examples:
#      | SheetName  |  TestCaseID                |
#      | NitroXBots  | QA_TestCase_Auto_NitroX_048 |
#
#  @NitroXBotFutureMode
#  Scenario Outline: <TestCaseID>_Start New SNIPER_BOT for FutureMode Buy Order
#    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
#    When Choose Mode, Trading Account and Instrument
#    And Validate No previous position
#    And Verify total Bots before starting the Sniper Bot execution
#    And Click Start Bot and select the Service,Method and Input Bot Quantity
#    And Select Buy Order ,Side and Min,Max Price and MaxSlippageThreashold
#    And Enter Quantity and submit the order
#    Then Verify Bots in Total Filtered on HomePage
#    And Click Total Filtered Bots and check the Bot in Detail and Config
#    Then Verify new Bot in detail and config for Snipper Bot-FutureMode
#    Then Verify the Order in Dealt Order for Sniper Bot Sell Order-FutureMode
#
#    Examples:
#      | SheetName   |  TestCaseID                  |
#      | NitroXBots  | QA_TestCase_Auto_NitroX_049 |
#
#  @NitroXBotFutureMode
#  Scenario Outline: <TestCaseID>_Start New Twap_BOT For Buy and Sell Order-FutureMode
#    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
#    When Choose Mode, Trading Account and Instrument
#    And Validate No previous position
#    And Verify total Bots before starting the Twap_Bot execution
#    And Click start Bot and select the Service,Method and Choose Bot Quantity
#    And Choose Side,Quantity,and Duration
#    And Provide Deal Ref and submit
#    Then Verify Bots in Total Filtered on HomePage
#    And Click Total Filtered Bots tab & check the Bot in Detail and Config for Twap Bot
#    Then Verify new Bot in detail and config for Twap_Bot
#    Examples:
#      | SheetName  |  TestCaseID                  |
#      | NitroXBots  | QA_TestCase_Auto_NitroX_050 |
#     | NitroXBots  | QA_TestCase_Auto_NitroX_051 |
#
#  @NitroXBotFutureMode
#  Scenario Outline: <TestCaseID>_Start New PairTrading_BOT For Buy and Sell Order-FutureMode
#    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
#    When Choose Mode, Trading Account and Instrument
#    And Validate No previous position
#    And Verify total Bots before starting the Pair_Trading Bot execution
#    And Click start Bot and select the Service,Method and Choose Bot Quantity
#    And Choose Side,Quantity,and Slice_Size
#    And Input AccountId,Quote and Side
#    And submit the order
#    And Verify Pair_Trading Bot in Total Filtered on homePage
#    Then Click Total Filtered Bots tab & check the Bot in Detail and Config for Pair_Trading Bot
#    Then Verify the Order in Dealt Order for PairTrading Bot
#    And Click Total Filtered Bots tab & check the Bot in Detail and Config for Leg Pair_Trading Bot
#    Then Verify the Order in Dealt Order for PairTrading Bot
#    Examples:
#      | SheetName  |  TestCaseID                  |
#      | NitroXBots  | QA_TestCase_Auto_NitroX_052 |
#      | NitroXBots  | QA_TestCase_Auto_NitroX_053 |
#      | NitroXBots  | QA_TestCase_Auto_NitroX_054 |
#      | NitroXBots  | QA_TestCase_Auto_NitroX_055 |
#
#  @NitroXBotFutureModeParticipation
#  Scenario Outline: <TestCaseID>_Start Execution_Bot for Buy Order-Future Mode
#    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
#    When Choose Mode, Trading Account and Instrument
#    And Pause all the Bots
#    And Verify total Bots Before staring the Buy execution
#    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
#    And Input Side,Quantity and Stop and Triger condition
#    And submit the order
#    Then Verify Bot Count in Total Filtered
#    And Click total filtered bots and click the detail bot
#    Examples:
#      | SheetName  |  TestCaseID                  |
#      | NitroXBots  | QA_TestCase_Auto_NitroX_126 |
#      | NitroXBots  | QA_TestCase_Auto_NitroX_127 |


  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Count list of Running Bots-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode and Trading Account
    And Check if No Current running Bot fo FutureMode
    Then Verify the list of running bots is displayed

    Examples:
      | SheetName   |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_042 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Verify Empty Bot List-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode and Trading Account
    Then Validate the Bots for Future Mode
    Then Verify the bot list is empty

    Examples:
      | SheetName   |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_043 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Count list of Running Bots-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Check if No Current running Bot for FutureMode
    Then Verify the list of running bots is displayed

    Examples:
      | SheetName   |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_044 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Verify Empty Bot List-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    Then Validate the Bots for Future Mode
    Then Verify the bot list is empty

    Examples:
      | SheetName   |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_045 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Pause Existing Running Execution_Bot for Buy Order-FutureMode
  Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
  When Choose Mode, Trading Account and Instrument
  And wait for Ten Seconds
  And Stop All the Bots on Homepage
  And Verify total Bots Before staring the Buy execution
  And Click Start Bot ,Select the Service,Method and Input Bot Quantity
  And Input the value in Account Position
  And submit the order
  And Wait for sometime to get the Bots Updated
  And Click Total Filtered Bots and pause the Bot
  Then Verify current running Bot is paused

  Examples:
  | SheetName   |  TestCaseID                 |
  | NitroXBots  | QA_TestCase_Auto_NitroX_073 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Resume Existing Execution_Bot for Buy Order--FutureMode
  Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
  When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Stop All the Bots on Homepage
  And Verify total Bots Before staring the Buy execution
  And Click Start Bot ,Select the Service,Method and Input Bot Quantity
  And Input the value in Account Position
  And submit the order
  And Wait for sometime to get the Bots Updated
  And Click Total Filtered Bots and pause the Bot
  Then Verify Bot is Paused
  And Resume the Bot again
  Then Verify Bot has started again

  Examples:
  | SheetName   |  TestCaseID                 |
  | NitroXBots  | QA_TestCase_Auto_NitroX_074 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Restart Existing Running Execution_Bot for Buy Order--FutureMode
  Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
  When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Stop All the Bots on Homepage
  And Verify total Bots Before staring the Buy execution
  And Click Start Bot ,Select the Service,Method and Input Bot Quantity
  And Input the value in Account Position
  And submit the order
  And Wait for sometime to get the Bots Updated
  And Click Total Filtered Bots and restart the Bot
  And Click on Persist Yes
  Then Verify current running Bot is restarted
  Examples:
  | SheetName  |  TestCaseID                  |
  | NitroXBots  | QA_TestCase_Auto_NitroX_075 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Restart Existing Running Execution_Bot for Buy Order--FutureMode
  Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
  When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Stop All the Bots on Homepage
  And Verify total Bots Before staring the Buy execution
  And Click Start Bot ,Select the Service,Method and Input Bot Quantity
  And Input the value in Account Position
  And submit the order
  And Wait for sometime to get the Bots Updated
  And Click Total Filtered Bots and restart the Bot
  And Click Persist Status No
  Then Verify current running Bot is restarted
  Examples:
  | SheetName  |  TestCaseID                  |
  | NitroXBots  | QA_TestCase_Auto_NitroX_077 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Stop Existing Running Execution_Bot for Buy Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Verify total Bots Before staring the Buy execution
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Input the value in Account Position
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Click Total Filtered Bots and stop current running Bot
    Then Verify current running Bot is stopped
    Examples:
      | SheetName  |  TestCaseID               |
      | NitroXBots  | QA_TestCase_Auto_NitroX_079 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Edit the Execution_Bot for Buy Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And  wait for Ten Seconds
    And Stop All the Bots on Homepage
    And Verify total Bots Before staring the Buy execution
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Input the value in Account Position
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Click total filtered bots and click the latest running bot to edit
    And Input any field with new value and again submit
    Then Verify the Bot is updated
    Then Verify the Config Tab for modified field

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_080 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Edit the SNIPER_BOT for Buy Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
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
      | NitroXBots  | QA_TestCase_Auto_NitroX_082 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Edit PairTrading BOT For Buy and Sell Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Pause all the Bots
    And Click Start Bot and select the Service,Method and Input Bot Quantity
    And Choose Side,Quantity,and Slice_Size
    And Input AccountId,Quote and Side
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Click total filtered bots and click the latest running bot to edit
    And Input any field with new value and again submit for PairTrading Bot
    Then Verify the Bot is updated
    Then Verify the Config Tab for modified field in PairTrading Bot

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_084 |
  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Duplicate the Execution_Bot for Buy Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Stop All the Bots on Homepage
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Buy Order and Select the MinTime and MaxTime Break
    And Input the value in Account Position
    And Input the Time, Quantity and Submit the Order
    And Click total filtered bots and click the latest running bot and create duplicate Bot
    And Input any field with new value and again submit
    Then Verify duplicate bot is created
    Then Verify the Config Tab for modified field

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_086 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Duplicate the Sniper_Bot for Buy Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Pause all the Bots
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Buy Order ,Side and Min,Max Price and MaxSlippageThreashold
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Click total filtered bots and click the latest running bot and create duplicate Bot
    And Input any field with new value and again submit for Sniper Bot
    Then Verify duplicate bot is created
    Then Verify the Config Tab for modified field in Sniper Bot

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_087 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Duplicate PairTrading BOT For Buy and Sell Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Stop All the Bots on Homepage
    And Click start Bot and select the Service,Method and Choose Bot Quantity
    And Choose Side,Quantity,and Slice_Size
    And Input AccountId,Quote and Side
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Click total filtered bots and click the latest running bot and create duplicate Bot
    And Input any field with new value and again submit for PairTrading Bot
    Then Verify duplicate bot is created
    Then Verify the Config Tab for modified field in PairTrading Bot

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_088 |
  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Duplicate TWAP BOT For Buy and Sell Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
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
      | NitroXBots  | QA_TestCase_Auto_NitroX_089 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Restart Existing Paused Execution_Bot for Buy Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Buy Order and Select the MinTime and MaxTime Break
    And Input the value in Account Position
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Pause the Current running bot
    And Click on Persist Yes
    Then Verify current running Bot is restarted
    Examples:
      | SheetName  |  TestCaseID               |
      | NitroXBots  | QA_TestCase_Auto_NitroX_076 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Restart Existing Paused Execution_Bot for Buy Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Pause all the Bots
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Buy Order and Select the MinTime and MaxTime Break
    And Input the value in Account Position
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Pause the Current running bot
    And Click Persist Status No
    Then Verify current running Bot is restarted
    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_078 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Edit the Execution_Bot for Buy -FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Buy Order and Select the MinTime and MaxTime Break
    And Input the value in Account Position
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Pause the Bot
    And Input any field with new value and again submit
    Then Verify the Bot is updated
    Then Verify the Config Tab for modified field

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_081 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Edit the SNIPER_BOT  Buy Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Click Start Bot and select the Service,Method and Input Bot Quantity
    And Select Buy Order ,Side and Min,Max Price and MaxSlippageThreashold
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Pause the Bot
    And Input any field with new value and again submit for Sniper Bot
    Then Verify the Bot is updated
    Then Verify fields are updated in BotDetail

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_083 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Edit PairTrading BOT For Buy and Sell Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Pause all the Bots
    And Click start Bot and select the Service,Method and Choose Bot Quantity
    And Choose Side,Quantity,and Slice_Size
    And Input AccountId,Quote and Side
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Click total filtered bots and choose latest bot and pause it
    And Input any field with new value and again submit for PairTrading Bot
    Then Verify the Bot is updated
    Then Verify the Config Tab for modified field in PairTrading Bot

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_085 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Edit the Execution_Bot for Buy Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode and Trading Account
#    And Check if No Current running Bot fo FutureMode
#    And Close the total filtered
    And Choose the instrument
    And wait for Ten Seconds
    And Stop All the Bots on Homepage
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Input the value in Account Position
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Click total filtered bots and click the latest running bot to edit
    And Input any field with new value and again submit
    Then Verify the Bot is updated
    Then Verify the Config Tab for modified field
    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_097 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Edit and Pause the Execution_Bot for Buy Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode and Trading Account
#    And Check if No Current running Bot fo FutureMode
#    And Close the total filtered
    And Choose the instrument
    And wait for Ten Seconds
    And Stop All the Bots on Homepage
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Input the value in Account Position
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Pause the Bot
    And Input any field with new value and again submit
    Then Verify the Bot is updated
    Then Verify the Config Tab for modified field

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_098 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Edit and Pause the SNIPER_BOT  Buy Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode and Trading Account
#    And Check if No Current running Bot fo FutureMode
#    And Close the total filtered
    And Choose the instrument
    And wait for Ten Seconds
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
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_099 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Edit the SNIPER_BOT  Buy Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode and Trading Account
#    And Check if No Current running Bot fo FutureMode
#    And Close the total filtered
    And Choose the instrument
    And wait for Ten Seconds
    And Click Start Bot and select the Service,Method and Input Bot Quantity
    And Select Buy Order ,Side and Min,Max Price and MaxSlippageThreashold
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Click total filtered bots
    And Click edit button
    And Input any field with new value and again submit for Sniper Bot
    Then Verify the Bot is updated
    Then Verify fields are updated in BotDetail

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_100 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Edit PairTrading BOT For Buy and Sell Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Stop All the Bots on Homepage
    And Click start Bot and select the Service,Method and Choose Bot Quantity
    And Choose Side,Quantity,and Slice_Size
    And Input AccountId,Quote and Side
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Logout and again login & select Mode,Trading account
    And Click total filtered bots and click the latest running bot to edit
    And Input any field with new value and again submit for PairTrading Bot
    Then Verify the Bot is updated
    Then Verify the Config Tab for modified field in PairTrading Bot


    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_101 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Edit PairTrading BOT For Buy and Sell Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Stop All the Bots on Homepage
    And Click start Bot and select the Service,Method and Choose Bot Quantity
    And Choose Side,Quantity,and Slice_Size
    And Input AccountId,Quote and Side
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Logout and again login & select Mode,Trading account
    And Click total filtered bots and choose latest bot and pause it
    And Input any field with new value and again submit for PairTrading Bot
    Then Verify the Bot is updated
    Then Verify the Config Tab for modified field in PairTrading Bot

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_102 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Duplicate the Execution_Bot for Buy Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Stop All the Bots on Homepage
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Buy Order and Select the MinTime and MaxTime Break
    And Input the value in Account Position
    And Input the Time, Quantity and Submit the Order
    And Logout and again login & select Mode,Trading account
    And Click total filtered bots and click the latest running bot and create duplicate Bot
    And Input any field with new value and again submit
    Then Verify duplicate bot is created
    Then Verify the Config Tab for modified field

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_103 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Duplicate the Sniper_Bot for Buy Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Stop All the Bots on Homepage
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Buy Order ,Side and Min,Max Price and MaxSlippageThreashold
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Logout and again login & select Mode,Trading account
    And Click total filtered bots and click the latest running bot and create duplicate Bot
    And Input any field with new value and again submit for Sniper Bot
    And Click total filtered
    And Choose latest bot
    Then Verify the Config Tab for modified field in Sniper Bot

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_104 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Duplicate PairTrading BOT For Buy and Sell Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Click start Bot and select the Service,Method and Choose Bot Quantity
    And Choose Side,Quantity,and Slice_Size
    And Input AccountId,Quote and Side
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Logout and again login & select Mode,Trading account
    And Click total filtered bots and click the latest running bot and create duplicate Bot
    And Input any field with new value and again submit for PairTrading Bot
    And Click total filtered
    And Choose latest bot
    Then Verify the Config Tab for modified field in PairTrading Bot

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_105 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Duplicate TWAP BOT For Buy and Sell Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Stop All the Bots on Homepage
    And Click start Bot and select the Service,Method and Choose Bot Quantity
    And Choose Side,Quantity,and Duration
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Logout and again login & select Mode,Trading account
    And Click total filtered bots and click the latest running bot and create duplicate Bot
    And Input any field with new value and again submit for Twap Bot
    And Click total filtered
    And Choose latest bot
    Then Verify the Config Tab for modified field in Twap Bot
    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_106 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Pause the Execution_Bot for Buy Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Stop All the Bots on Homepage
    And Verify total Bots Before staring the Buy execution
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Input the value in Account Position
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Logout and again login & select Mode,Trading account
    And Click Total Filtered Bots and pause the Bot
    Then Verify current running Bot is paused

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_107 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Resume Existing Execution_Bot for Buy Order--FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Verify total Bots Before staring the Buy execution
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Input the value in Account Position
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Logout and again login & select Mode,Trading account
    And Click Total Filtered Bots and pause the Bot
    Then Verify Bot is Paused
    And Resume the Bot again
    Then Verify Bot has started again

    Examples:
      | SheetName   |  TestCaseID                 |
      | NitroXBots  | QA_TestCase_Auto_NitroX_108 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Restart Existing Running Execution_Bot for Buy Order--FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And Stop All the Bots on Homepage
    And Verify total Bots Before staring the Buy execution
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Input the value in Account Position
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Logout and again login & select Mode,Trading account
    And Click Total Filtered Bots and restart the Bot
    And Click on Persist Yes
    Then Verify current running Bot is restarted
    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_109 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Restart Existing Paused Execution_Bot for Buy Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Buy Order and Select the MinTime and MaxTime Break
    And Input the value in Account Position
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Logout and again login & select Mode,Trading account
    And Pause the Current running bot
    And Click on Persist Yes
    Then Verify current running Bot is restarted
    Examples:
      | SheetName  |  TestCaseID               |
      | NitroXBots  | QA_TestCase_Auto_NitroX_110 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Restart Existing Running Execution_Bot for Buy Order--FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Verify total Bots Before staring the Buy execution
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Input the value in Account Position
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Logout and again login & select Mode,Trading account
    And Click Total Filtered Bots and restart the Bot
    And Click Persist Status No
    Then Verify current running Bot is restarted
    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_111 |


  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Restart Existing Paused Execution_Bot for Buy Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Stop All the Bots on Homepage
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Buy Order and Select the MinTime and MaxTime Break
    And Input the value in Account Position
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Logout and again login & select Mode,Trading account
    And Pause the Current running bot
    And Click Persist Status No
    Then Verify current running Bot is restarted
    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_112 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Stop Existing Running Execution_Bot for Buy Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode and Trading Account
    And Check if No Current running Bot fo FutureMode
    And Close the total filtered
    And Click Total Filtered Bots and stop current running Bot
    Then Verify current running Bot is stopped
    Examples:
      | SheetName  |  TestCaseID               |
      | NitroXBots  | QA_TestCase_Auto_NitroX_113 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Edit the Execution_Bot for Buy Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Stop All the Bots on Homepage
    And Start Bot ,Select the Service,Method and Input Bot Quantity
    And Input the value in Account Position
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Logout and again login & select Mode,Trading account
    And Click total filtered bots and click the latest running bot to edit
    And Input any field with new value and again submit
    Then Verify the Bot is updated
    Then Verify the Config Tab for modified field

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_114 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Edit and Pause the Execution_Bot for Buy -FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Stop All the Bots on Homepage
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Buy Order and Select the MinTime and MaxTime Break
    And Input the value in Account Position
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Logout and again login & select Mode,Trading account
    And Pause the Bot
    And Input any field with new value and again submit
    Then Verify the Bot is updated
    Then Verify the Config Tab for modified field

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_115 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Edit the SNIPER_BOT for Buy Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Stop All the Bots on Homepage
    And Click Start Bot and select the Service,Method and Input Bot Quantity
    And Select Buy Order ,Side and Min,Max Price and MaxSlippageThreashold
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Logout and again login & select Mode,Trading account
    And Click total filtered bots and click the latest running bot to edit
    And Input any field with new value and again submit for Sniper Bot
    Then Verify the Bot is updated
    Then Verify the Config Tab for modified field in Sniper Bot

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_116 |


  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Edit the SNIPER_BOT  Buy Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Stop All the Bots on Homepage
    And Click Start Bot and select the Service,Method and Input Bot Quantity
    And Select Buy Order ,Side and Min,Max Price and MaxSlippageThreashold
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Logout and again login & select Mode,Trading account
    And Pause the Bot
    And Input any field with new value and again submit for Sniper Bot
    Then Verify the Bot is updated
    Then Verify fields are updated in BotDetail

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_117 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Edit PairTrading BOT For Buy and Sell Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Stop All the Bots on Homepage
    And Click Start Bot and select the Service,Method and Input Bot Quantity
    And Choose Side,Quantity,and Slice_Size
    And Input AccountId,Quote and Side
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Logout and again login & select Mode,Trading account
    And Click total filtered bots and click the latest running bot to edit
    And Input any field with new value and again submit for PairTrading Bot
    Then Verify the Bot is updated
    And wait for Ten Seconds
    Then Verify the Config Tab for modified field in PairTrading Bot

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_118 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Edit PairTrading BOT For Buy and Sell Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Stop All the Bots on Homepage
    And Click start Bot and select the Service,Method and Choose Bot Quantity
    And Choose Side,Quantity,and Slice_Size
    And Input AccountId,Quote and Side
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Logout and again login & select Mode,Trading account
    And Click total filtered bots and choose latest bot and pause it
    And Input any field with new value and again submit for PairTrading Bot
    Then Verify the Bot is updated
    Then Verify the Config Tab for modified field in PairTrading Bot

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_119 |
  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Duplicate the Execution_Bot for Buy Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Stop All the Bots on Homepage
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Buy Order and Select the MinTime and MaxTime Break
    And Input the value in Account Position
    And Input the Time, Quantity and Submit the Order
    And Logout and again login & select Mode,Trading account
    And Click total filtered bots and click the latest running bot and create duplicate Bot
    And Input any field with new value and again submit
    Then Verify duplicate bot is created
    Then Verify the Config Tab for modified field

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_120 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Duplicate the Sniper_Bot for Buy Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Select Buy Order ,Side and Min,Max Price and MaxSlippageThreashold
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Logout and again login & select Mode,Trading account
    And Click total filtered bots and click the latest running bot and create duplicate Bot
    And Input any field with new value and again submit for Sniper Bot
    Then Verify duplicate bot is created
    Then Verify the Config Tab for modified field in Sniper Bot

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_121 |

  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Duplicate PairTrading BOT For Buy and Sell Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Stop All the Bots on Homepage
    And Click start Bot and select the Service,Method and Choose Bot Quantity
    And Choose Side,Quantity,and Slice_Size
    And Input AccountId,Quote and Side
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Logout and again login & select Mode,Trading account
    And Click total filtered bots and click the latest running bot and create duplicate Bot
    And Input any field with new value and again submit for PairTrading Bot
    Then Verify duplicate bot is created
    Then Verify the Config Tab for modified field in PairTrading Bot

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_122 |
  @NitroXBotFutureMode
  Scenario Outline: <TestCaseID>_Duplicate TWAP BOT For Buy and Sell Order-FutureMode
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And wait for Ten Seconds
    And Stop All the Bots on Homepage
    And Click start Bot and select the Service,Method and Choose Bot Quantity
    And Choose Side,Quantity,and Duration
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Logout and again login & select Mode,Trading account
    And Click total filtered bots and click the latest running bot and create duplicate Bot
    And Input any field with new value and again submit for Twap Bot
    Then Verify duplicate bot is created
    Then Verify the Config Tab for modified field in Twap Bot
    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_123 |

  @NitroXParticipationBot
  Scenario Outline: <TestCaseID>_Edit Future Participation_Bot for Buy Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And Pause all the Bots
    And Verify total Bots Before staring the Buy execution
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Input Side,Quantity and Stop and Triger condition
    And submit the order
    Then Verify Bot Count in Total Filtered
    And Pause the Bot
    And Edit the Participation Bot fields
    Then Verify the Bot is updated
    Then Verify updated fields in config
#    Then Verify new Bot in detail and config
#    Then Verify the Buy Order in Dealt Order
    Examples:
      | SheetName   |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_131 |
      | NitroXBots  | QA_TestCase_Auto_NitroX_132 |

  @NitroXParticipationBot
  Scenario Outline: <TestCaseID>_Duplicate the Future Participation_Bot for Buy/Sell Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And Pause all the Bots
    And Verify total Bots Before staring the Buy execution
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Input Side,Quantity and Stop and Triger condition
    And submit the order
    Then Verify Bot Count in Total Filtered
    And Click total filtered bots and click the latest running bot and create duplicate Bot
    And Input any value for Participation Bot
    And submit the order
    Then Verify duplicate bot is created
    Then Verify config tab for Participation bot

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_133 |

  @NitroXParticipationBot
  Scenario Outline: <TestCaseID>_Duplicate the Future Participation_Bot for Buy/Sell Order
    Given Read "NitroX" and "<SheetName>" and "<TestCaseID>" from test data
    When Choose Mode, Trading Account and Instrument
    And Pause all the Bots
    And Click Start Bot ,Select the Service,Method and Input Bot Quantity
    And Input Side,Quantity and Stop and Triger condition
    And submit the order
    And Wait for sometime to get the Bots Updated
    And Logout and again login & select Mode,Trading account
    And Click total filtered bots and click the latest running bot and create duplicate Bot
    And Input any value for Participation Bot
    And submit the order
    Then Verify duplicate bot is created
    Then Verify config tab for Participation bot

    Examples:
      | SheetName  |  TestCaseID                  |
      | NitroXBots  | QA_TestCase_Auto_NitroX_139 |
