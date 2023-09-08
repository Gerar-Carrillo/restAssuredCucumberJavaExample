Feature: Employee feature example

  @CreateEmployeeSuccesful
  Scenario Outline: Create an employee
    Given I have data "<name>", "<salary>" and "<age>"
    And I use employee header
    When I create post request to create an employee
    Then I get status code "<200>" from db

    Examples:
      | name | salary | age |
      | test | 123    | 23  |


  @GetAllEmployee
  Scenario: Get all employees
    Given I use employee header
    When I consume the api
    Then I get status code "<200>" from db