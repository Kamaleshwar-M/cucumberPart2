Feature: Verifying Adactine Details
Scenario Outline: Verifying Adactine Details with valid credential
    Given User in on Adactine Login Page
    When User should enter "<userName>" and "<password>"
    And On Search Hotel Page User should enter "<location>","<hotels>" and "<roomType>"
    And On Select Hotel page User should select Hotel and click Continue
    And On Booking Page User should enter "<firstName>","<lastName>","<billingAddress>","<ccNum>","<ccType>","<expiryMonth>","<expiryYear>" and "<cvvNum>"
    And user should print Booking order number
    Then user should verify success message

    Examples: 
      | userName    | password   | firstName   | lastName | billingAddress     | location | hotels         | roomType | ccNum            | ccType | expiryMonth | expiryYear | cvvNum |
      | Kamaleshwar | Kamal@2017 | Kamaleshwar | Murthy   | Chennai, Tamilnadu | Brisbane | Hotel Sunshine | Deluxe   | 1111222233334444 | VISA   | August      |       2021 |    123 |

@Reg
Scenario Outline: Verifying Adactine Details with valid credential
    Given User in on Adactine Login Page
    When User should enter "<userName>" and "<password>"
    And On Search Hotel Page User should enter "<location>","<hotels>" and "<roomType>"
    And On Select Hotel page User should select Hotel and click Continue
    Then user should verify success message
    
    Examples: 
      | userName    | password   | location | hotels         | roomType |
      | Kamaleshwar | Kamal@2017 | Brisbane | Hotel Sunshine | Deluxe   |
    