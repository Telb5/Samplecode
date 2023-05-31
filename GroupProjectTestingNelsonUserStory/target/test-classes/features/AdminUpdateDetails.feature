Feature: Editing Employees profiles

  Scenario: Admin edit Employees profiles
    When  Admin enters valid credentials
    And   Admin Clicks on login button
    Then  Admin Clicks on PIM option
    And   AdminClicks on Employee List option
    Then  AdminClicks on Employee Name SearchBar
    And   Admin Clicks on search button
    Then  Admin Clicks on Employee's name
    And   Admin Clicks on Job option
    And   Admin Clicks on Edit button
    And   Admin makes edit on Employee's profile
    Then  Admin clicks on Save button


