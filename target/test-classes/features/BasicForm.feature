Feature: Basic Form Validation

  Background:
    Given User lauches the application
    And User in on basic Form page

  Scenario: Submit form with valh validation
    When User enters name "Bhushan"
    And User enters password "Test@123"
    And User enters email "bhushan@gmail.com"
    And User enters phone "9876543210"
    And User enters description "Automation Test Engineer"
    And User clicks Submit button
    Then Form should be submitted successfully
    
    
