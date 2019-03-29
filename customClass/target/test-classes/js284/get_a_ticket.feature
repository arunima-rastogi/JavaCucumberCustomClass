Feature: Get a ticket
  You must have a ticket to enter
  
  Scenario: Get a ticket
    Given buyer has $10
    When buyer pays for "ticket to blablaland"
    Then buyer should get a new ticket
