@tag_Animation
Feature: Animation Functionality

  Scenario: check the Animation scenario
    Given Start the Appium service
    And First click on Animation button
    Then Click on Hide-Show Animation button
    And  Check the Hide button Working
    Then Check the Show button Working
    And Stop the Appium service
	 
	 Scenario: check the custom Animation scenario
    Given Start the Appium service
    And First click on Animation button
    Then Click on Hide-Show Animation button
    And  Check the Custom button Working
    And Stop the Appium service