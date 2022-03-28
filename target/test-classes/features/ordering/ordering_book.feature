Feature: Customer order books
  Scenario: wholesale user order books
    Given User launch chrome browser
    When User opens URl "https://react.simprocloud.com/build/index.html"
    And User select category as "Fiction"
    And User select book as "Harry Potter"
    And User enters Unit as "50"
    And User enters Price as "35.8"
    And User click on SUBMIT
    Then Transaction Record should be generated as "1,Harry Potter,50,$35,$1750,$0.00,$1750"

  Scenario: book-lover user order books
    Given User launch chrome browser
    When User opens URl "https://react.simprocloud.com/build/index.html"
    And User select category as "Drama"
    And User select book as "The Rainbow"
    And User enters Unit as "1"
    And User enters Price as "125"
    And User select discount
    And User enter discount as "10"
    And User click on SUBMIT
    Then Transaction Record should be generated as "1,The Rainbow,1,$125,$125,$12.5,$112.50"
    Then User delete the record
    And User confirm to delete the record
    Then User close the browser