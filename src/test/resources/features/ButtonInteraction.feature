Feature: Button Interaction Functionality

  @smoke
  Scenario: Verify Single click functionality
    When User clicks on Single Click button
    Then Single click sucess message should be displayed

  @smoke
  Scenario: Verify Double Click button functionality
    When User double clicks on Double Click button
    Then Double Click success message should be displayed

  @smoke
  Scenario: Verify Right Click button functionality
    When User right clicks on Right Click button
    Then Right click sucess message should be displayed

  @Smoke
  Scenario: Verify Disabled button functionality
    When User tries to click Disabled button
    Then Disabled button should remain disabled

  @Regression
  Scenario: Verify button is enabled after 3 seconds
    When User clicks on Start 3s Timer button
    Then Enable button should be enabled after 3 seconds
