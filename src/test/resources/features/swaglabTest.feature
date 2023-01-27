Feature: Testing Login Functionality

  Scenario: Login
    Given Swaglab app started on mobile phone emulator
    When User logins with valid credentials
    Then Verify that user logged in