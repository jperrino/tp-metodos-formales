Feature: Login
  As a User I would like to login using my credentials

  Scenario Outline: Successful Login
    Given I write my '<username>' in the username field
    Given I write my '<password>' in the password field
    When I click on the login button
    Then I should be taken to Home page

    Examples:
      | username  | password  |
      | test      | test      |

  Scenario Outline: Failed Login
    Given I write my '<username>' in the username field
    Given I write my '<password>' in the password field
    When I click on the login button
    Then I should be taken to Taller page

    Examples:
      | username  | password  |
      | test      | test      |