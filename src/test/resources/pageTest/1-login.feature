Feature: Login
  As a User I would like to login using my credentials

  Scenario Outline: '<scenario>'
    Given I write my '<username>' in the username field
    And I write my '<password>' in the password field
    When I click on the login button
    Then I am taken to Home page

    Examples:
      | scenario      | username  | password  |
      | Login Success | test      | test      |


  Scenario Outline: '<scenario>'
    Given I write my '<username>' in the username field
    And I write my '<password>' in the password field
    When I click on the login button
    Then I remain at Login page

    Examples:
      | scenario      | username  | password  |
      | Login Fail    | asd       | asd       |