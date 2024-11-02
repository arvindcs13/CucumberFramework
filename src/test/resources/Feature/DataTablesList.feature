Feature: Login Action

@Arvind
  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
      And User enters Credentials to LogIn
      | UserName                | Password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
     Then Message displayed Login Successfully


#  I am Good