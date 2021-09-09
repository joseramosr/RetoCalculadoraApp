#Author: josejulian_ramos@hotmail.com
Feature: Validate the division functionality in the calculator app
  As a Certification Analyst for the Calculator app
  I need to test the division functionality
  to validate its correct operation

  Background:
    Given that the Analyst opens the calculator app

  Scenario Outline: Validate the division by zero
    When he performs the division of <number1> by <number2>
    Then he should see that the result of division by zero is <result>

    Examples:
      | number1 | number2 | result            |
      | 7       | 0       | Can't divide by 0 |
      | 0       | 3       | 0                 |

  Scenario Outline: Validate the division of two positive numbers
    When he performs the division of <number1> by <number2>
    Then he should see that the result of the division is <result>

    Examples:
      | number1 | number2 | result |
      | 6       | 2       | 3      |
      | 7       | 1       | 7      |
      | 1       | 2       | 0.5    |

  Scenario Outline: Validate the division with negative numbers
    When he performs the division of <number1> by <number2>
    Then he should see that the result of the division is <result>

    Examples:
      | number1 | number2 | result |
      | 8       | - 2     | −4     |
      | - 1     | - 2     | 0.5    |





