#Author: josejulian_ramos@hotmail.com
Feature: Validate the subtraction functionality in the calculator app
  As a Certification Analyst for the Calculator app
  I need to test the subtraction functionality
  to validate its correct operation

  Background:
    Given that the Analyst opens the calculator app

  Scenario Outline: Validate the subtraction of two numbers where one of them is zero
    When he performs the subtraction of <number1> minus <number2>
    Then he should see that a number minus zero results in that same number <result>

    Examples:
      | number1 | number2 | result |
      | 9       | 0       | 9      |
      | - 9     | 0       | −9     |

  Scenario Outline: Validate the subtraction of two positive numbers
    When he performs the subtraction of <number1> minus <number2>
    Then he should see that the result of the subtraction is <result>

    Examples:
      | number1 | number2 | result |
      | 8       | 2       | 6      |
      | 2       | 8       | −6     |

  Scenario Outline: Validate the subtraction of two numbers where the first number is negative
    When he performs the subtraction of <number1> minus <number2>
    Then he should see that the result of the subtraction is <result>

    Examples:
      | number1 | number2 | result |
      | - 8     | 2       | −10    |




