Feature: Test Account feature

  Background: Login to Optimus
    Given Login to Optimus with Valid Credentials

  @OptimusAccount
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Create New Account
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open Account main tab
    And Open Accounts side tab
    And Open Create New Accounts Page
    And Enter Mandatory And Text Fields in Accounts
    And Enter Dropdown Fields for Account
    And Click Create button to create Account
    Then Verify Success Message on Create and Update Page
     #login with checker user and approve the CounterParty
    Given Read "Optimus" and "OptimusLogin" and "<loginCredentials>" from test data
    And Logout from Optimus
    And Input Optimus Username and Password
    And Click Optimus Login Button
    Then Verify user is able to login to Optimus successfully
    And Open Account main tab
    And Open CounterParty Tasks sub tab
    And Search for Account tasks to approve
    And Approve searched tasks
    Then Verify Success Message on Create and Update Page
    And Logout from MO Account
    #Login and Check the Approved record
    Given Login to Optimus with Valid Credentials
    And Open Account main tab
    And Open Accounts side tab
    And Open Accounts List tab
    And Search for created Account in List
    Then Verify Search Results of added or updated Accounts

    Examples:
      | TestCaseID                     | SheetName | loginCredentials  |
      | QA_TestCase_Auto_Optimus_6_1_1 | Accounts  | MO_CheckerAccount |

  @OptimusAccount
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Edit Existing Account
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open Account main tab
    And Open Accounts side tab
    And Search for existing Account in List
    And Click on Edit Link in Search Results to Load Account details
    And Take Account ID for Reference
    And Enter Mandatory And Text Fields in Accounts
    And Enter Dropdown Fields to Update Account
    And Click Create button to create Account
    Then Verify Success Message on Create and Update Page
     #login with checker user and approve the CounterParty
    Given Read "Optimus" and "OptimusLogin" and "<loginCredentials>" from test data
    And Logout from Optimus
    And Input Optimus Username and Password
    And Click Optimus Login Button
    Then Verify user is able to login to Optimus successfully
    And Open Account main tab
    And Open CounterParty Tasks sub tab
    And Search for Account ID in tasks to approve
    And Approve searched tasks
    Then Verify Success Message on Create and Update Page
    And Logout from MO Account
    #Login and Check the Approved record
    Given Login to Optimus with Valid Credentials
    And Open Account main tab
    And Open Accounts side tab
    And Open Accounts List tab
    And Search for Updated Account in List
    Then Verify Account ID in search results
    Then Verify Search Results of added or updated Accounts

    Examples:
      | TestCaseID                     | SheetName | loginCredentials  |
      | QA_TestCase_Auto_Optimus_6_1_2 | Accounts  | MO_CheckerAccount |


  @OptimusAccount
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Search Existing Account
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open Account main tab
    And Open Accounts side tab
    And Open Accounts List tab
    And Search for existing Account in List
    Then Verify Search Results of Existing Accounts

    Examples:
      | TestCaseID                     | SheetName |
      | QA_TestCase_Auto_Optimus_6_1_4 | Accounts  |

  @OptimusAccount
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Delete Existing Account
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open Account main tab
    And Open Accounts side tab
    And Search for existing Account in List
    And Click on Edit Link in Search Results to Load Account details
    And Take Account ID for Reference
    And Take Account Name for reference
    And Click Delete Optimus Button and Confirm
    Then Verify Success Message on Create and Update Page
     #login with checker user and approve the CounterParty
    Given Read "Optimus" and "OptimusLogin" and "<loginCredentials>" from test data
    And Logout from Optimus
    And Input Optimus Username and Password
    And Click Optimus Login Button
    Then Verify user is able to login to Optimus successfully
    And Open Account main tab
    And Open CounterParty Tasks sub tab
    And Search for Account ID in tasks to approve
    And Approve searched tasks
    Then Verify Success Message on Create and Update Page
    And Logout from MO Account
    #Login and Check the Approved record
    Given Login to Optimus with Valid Credentials
    And Open Account main tab
    And Open Accounts side tab
    And Open Accounts List tab
    And Search for Updated Account in List
    Then verify Item is deleted and Not shown in Search Result

    Examples:
      | TestCaseID                     | SheetName | loginCredentials  |
      | QA_TestCase_Auto_Optimus_6_1_3 | Accounts  | MO_CheckerAccount |


  @OptimusAccount
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Search Account and check Download button
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open Account main tab
    And Open Accounts side tab
    And Open Accounts List tab
    And Search for existing Account in List
    Then Verify Download CSV button is clickable in the search list

    Examples:
      | TestCaseID                     | SheetName |
      | QA_TestCase_Auto_Optimus_6_1_5 | Accounts  |


  @OptimusAccount
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Create New Nitro Account
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open Account main tab
    And Open Nitro Accounts side tab
    And Open Create New Nitro Accounts Page
    And Enter details in Nitro Account
    And Click Create button to create Account
    And Take Nitro Account ID from Success Message
    Then Verify Success Message on Create and Update Page

    Examples:
      | TestCaseID                     | SheetName    |
      | QA_TestCase_Auto_Optimus_6_2_1 | NitroAccount |

  @OptimusAccount
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Edit Existing Nitro Account
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open Account main tab
    And Open Nitro Accounts side tab
    And Search for existing Nitro Account in List
    And Click Edit button for Nitro Account
    And Edit details in Nitro Account
    And Take Account Name from Nitro Account
    And Click Create button to create Account
    And Take Nitro Account ID from Success Message
    Then Verify Success Message on Create and Update Page

    Examples:
      | TestCaseID                     | SheetName    |
      | QA_TestCase_Auto_Optimus_6_2_2 | NitroAccount |

  @OptimusAccount
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Edit Existing IP Binding of Nitro Account
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open Account main tab
    And Open Nitro Accounts side tab
    And Search for existing Nitro Account in List
    And Take Account Name from Nitro Account List
    And Click Edit IP Binding button for Nitro Account
    And Edit IP Binding details in Nitro Account
    And Click Create button to create Account
    And Search for updated Nitro Account in List
    And Click Edit IP Binding button for Nitro Account
    Then Verify Values of IP Binding is Updated For Nitro Account

    Examples:
      | TestCaseID                     | SheetName    |
      | QA_TestCase_Auto_Optimus_6_2_3 | NitroAccount |


  @OptimusAccount
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Unlock and Run Broker for Nitro Account
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open Account main tab
    And Open Nitro Accounts side tab
    And Search for existing Nitro Account in List
    And Click Unlock button in List for Nitro Account
#    And Click Run Broker button in List for Nitro Account
#    Then Verify Success Message on Create and Update Page
    Then Click Lock button in Nitro Account List

    Examples:
      | TestCaseID                     | SheetName    |
      | QA_TestCase_Auto_Optimus_6_2_4 | NitroAccount |

  @OptimusAccount
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Unlock and Run Balance Listener for Nitro Account
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open Account main tab
    And Open Nitro Accounts side tab
    And Search for existing Nitro Account in List
    And Click Unlock button in List for Nitro Account
#    And Click Run Balance Listener button in List for Nitro Account
#    Then Verify Success Message on Create and Update Page
    Then Click Lock button in Nitro Account List

    Examples:
      | TestCaseID                     | SheetName    |
      | QA_TestCase_Auto_Optimus_6_2_5 | NitroAccount |

  @OptimusAccount
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Unlock and Run Order Listener for Nitro Account
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open Account main tab
    And Open Nitro Accounts side tab
    And Search for existing Nitro Account in List
    And Click Unlock button in List for Nitro Account
#    And Click Run Order Listener button in List for Nitro Account
#    Then Verify Success Message on Create and Update Page
    Then Click Lock button in Nitro Account List

    Examples:
      | TestCaseID                     | SheetName    |
      | QA_TestCase_Auto_Optimus_6_2_6 | NitroAccount |

  @OptimusAccount
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and view the configuration for Nitro Account
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open Account main tab
    And Open Nitro Accounts side tab
    And Search for existing Nitro Account in List
    And Click View Configuration button in List for Nitro Account
    Then Verify Configuration Settings is shown

    Examples:
      | TestCaseID                     | SheetName    |
      | QA_TestCase_Auto_Optimus_6_2_7 | NitroAccount |

  @OptimusAccount
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Search for existing Nitro Account
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open Account main tab
    And Open Nitro Accounts side tab
    And Search for existing Nitro Account in List
    And Verify Nitro Account Name in Search Result

    Examples:
      | TestCaseID                     | SheetName    |
      | QA_TestCase_Auto_Optimus_6_2_8 | NitroAccount |

  @OptimusAccount
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Create Recording Accounts Configurations in Account
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open Account main tab
    And Open Configurations side tab in Accounts
    And open Recording Accounts tab in Configurations under Accounts
    And Open Create New Recording Accounts Page
    And Enter details in Recording Account
    And Click Create button to create Recording Account
    And Verify Success Message on Create and Update Page

    Examples:
      | TestCaseID                     | SheetName    |
      | QA_TestCase_Auto_Optimus_6_3_4 | NitroAccount |

  @OptimusAccount
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Search Recording Accounts Configurations in Account
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open Account main tab
    And Open Configurations side tab in Accounts
    And open Recording Accounts tab in Configurations under Accounts
    And Search for Existing Recording Account in List
    Then Verify Recording Account is created and shown in List Page

    Examples:
      | TestCaseID                     | SheetName    |
      | QA_TestCase_Auto_Optimus_6_3_5 | NitroAccount |

  @OptimusAccount
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Delete Recording Accounts Configurations in Account
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open Account main tab
    And Open Configurations side tab in Accounts
    And open Recording Accounts tab in Configurations under Accounts
    And Search for Existing Recording Account in List
    And Delete the Searched Recording Account in List
    Then Verify Success Message on Create and Update Page

    Examples:
      | TestCaseID                     | SheetName    |
      | QA_TestCase_Auto_Optimus_6_3_6 | NitroAccount |


#  @OptimusAccount
#  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Delete Recording Accounts Configurations in Account
#    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
#    And Open Account main tab
#    And Open Configurations side tab in Accounts
#    And open Recording Accounts tab in Configurations under Accounts
#    And Add
#
#    Examples:
#      | TestCaseID                     | SheetName    |
#      | QA_TestCase_Auto_Optimus_6_3_1 | NitroAccount |
#      | QA_TestCase_Auto_Optimus_6_3_2 | NitroAccount |


  @OptimusAccount
  Scenario Outline: "<TestCaseID>" Able to Login to Optimus and Delete Recording Accounts Configurations in Account
    Given Read "Optimus" and "<SheetName>" and "<TestCaseID>" from test data
    And Open Account main tab
    And Open Configurations side tab in Accounts
    And open Recording Wallet Address tab in Configurations under Accounts
    And Search for "BTC1" Existing Recording Wallet in List
    Then Verify Search Result has "No Data" in list
    And Search for "BTC" Existing Recording Wallet in List
    Then Verify Search Result has "BTC" in list

    Examples:
      | TestCaseID                     | SheetName    |
      | QA_TestCase_Auto_Optimus_6_3_2 | NitroAccount |