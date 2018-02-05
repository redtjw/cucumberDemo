Feature: AddingMuilty

  Scenario Outline: test muilty
    Given i input "<num1>" and "<num2>"
    When the calculator is run
    Then the output should be "<result>"
    Examples:
    |num1|num2|result|
    |1   |2   |3     |
    |2   |3   |5     |
