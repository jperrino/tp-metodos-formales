Feature: Login
  As a User I would like to login using my credentials

  Scenario Outline: '<scenario>'
    Given I write my '<username>' in the username field
    Given I write my '<password>' in the password field
    When I click on the login button
    Then I should be taken to '<page>' page

    Examples:
      | scenario      | username  | password  | page  |
      | Login Success | test      | test      | Home  |
      | Login Fail    | asd       | asd       | Login |