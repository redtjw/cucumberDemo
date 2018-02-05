Feature: Adding Test

  Scenario: Test Add
    Given i input "2" and "2"
    When the calculator is run
    Then the output should be "4"
