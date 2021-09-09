#Author: josejulian_ramos@hotmail.com
Feature: Validate the multiplication functionality in the calculator app
  As a Certification Analyst for the Calculator app
  I need to test the multiplication functionality
  to validate its correct operation

  Background:
    Given that the Analyst opens the calculator app

  Scenario Outline: Validate the multiplication of two numbers where one of them is zero
    When he performs the multiplication of <number1> by <zero>
    Then he should see that a number multiplied by zero results in <zero>

    Examples:
      | number1 | zero |
      | 5       | 0    |
      | - 7     | 0    |

  Scenario Outline: Validate the multiplication of two positive numbers
    When he performs the multiplication of <number1> by <number2>
    Then he should see that the result of the multiplication is <result>

    Examples:
      | number1 | number2 | result |
      | 5       | 6       | 30     |
      | 2       | 1       | 2      |


  Scenario Outline: Validate the multiplication with negative numbers
    When he performs the multiplication of <number1> by <number2>
    Then he should see that the result of the multiplication is <result>

    Examples:
      | number1 | number2 | result |
      | - 5     | 6       | −30    |
      | - 2     | - 8     | 16     |
