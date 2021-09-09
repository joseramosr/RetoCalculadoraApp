#Author: josejulian_ramos@hotmail.com
Feature: Validate the sum functionality in the calculator app
  As a Certification Analyst from the Calculator app
  I need to test the sum functionality
  to validate its correct operation

  Background:
    Given that the Analyst opens the calculator app

  Scenario Outline: Validate the sum of two numbers where one of them is zero
    When he performs the sum of <number1> plus <zero>
    Then he should see that a number plus zero results in that same number <result>

    Examples:
      | number1 | zero | result |
      | 9       | 0    | 9      |
      | - 2     | 0    | −2     |

  Scenario Outline: Validate sum of two positive numbers
    When he performs the sum of <number1> plus <number2>
    Then he should see that the result of the sum is <result>

      Examples:
        | number1 | number2 | result |
        | 8       | 2       | 10     |
        | 2       | 8       | 10     |


  Scenario Outline: Validate the sum of two numbers where the first number is negative
    When he performs the sum of <number1> plus <number2>
    Then he should see that the result of the sum is <result>

    Examples:
      | number1 | number2 | result |
      | - 3     | 5       | 2      |
      | - 7     | 1       | −6     |




