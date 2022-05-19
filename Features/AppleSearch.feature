Feature: perform an apple search

Scenario Outline: simple keyword search
    
    Given I am on apple homepage
    When  I enter search "<Iphone13>
    And I click on apple search button
    Then I see the number of results return
    
    Examples:
    |Iphone13|
    |Quality assurance|
    |Software|