Feature: Login

  Scenario Outline: Login
    Given Open the website <website>
    When I click on submit button
    Then I verify that I already in login page
    When I type to email field the <email>
    Then I verify that the email
    Examples:
      | email                           | website                 |
      | nguyenphuongnhung2705@gmail.com | https://www.office.com/ |