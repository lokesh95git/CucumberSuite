Feature: 

  Scenario: 
    Given User should be in the telecom home pagess.
    And click add tariff buttonss
    When User enter all  datas
    And click on submit buttons.
    Then user should be displayed home button is enteredd.

  Scenario: 
    Given User should be in the telecom home pagess.
    And click add tariff buttonss
    When User enter all  datas.
      | 6995 | 120 | 120 | 100 | 1 | 1 | 1 |
      |  500 |  50 | 300 |  58 | 2 | 3 | 4 |
      |  200 |  90 |  80 |  40 | 4 | 5 | 6 |
      |  300 | 100 |  20 |  70 | 6 | 7 | 8 |
    And click on submit buttons.
    Then user should be displayed home button is enteredd.

  Scenario: 
    Given User should be in the telecom home pagess.
    And click add tariff buttonss
    When User enter all  datass.
      | rent | freeloc | freeint | freesms | locchr | intchr | sms |
      | 6995 |     120 |     120 |     100 |      1 |      1 |   1 |
      |  500 |      50 |     300 |      58 |      2 |      3 |   4 |
      |  200 |      90 |      80 |      40 |      4 |      5 |   6 |
      |  300 |     100 |      20 |      70 |      6 |      7 |   8 |
    And click on submit buttons.
    Then user should be displayed home button is enteredd.

  Scenario Outline: 
    Given User should be in the telecom home pagess.
    And click add tariff buttonss
    When User enter all  data."<rent>","<freeloc>","<freeint>","<freesms>","<locchr>","<intchr>","<sms>"
    And click on submit buttons.
    Then user should be displayed home button is enteredd.

    Examples: 
      | rent | freeloc | freeint | freesms | locchr | intchr | sms |
      | 6995 |     120 |     120 |     100 |      1 |      1 |   1 |
      |  500 |      50 |     300 |      58 |      2 |      3 |   4 |
      |  200 |      90 |      80 |      40 |      4 |      5 |   6 |
      |  300 |     100 |      20 |      70 |      6 |      7 |   8 |
