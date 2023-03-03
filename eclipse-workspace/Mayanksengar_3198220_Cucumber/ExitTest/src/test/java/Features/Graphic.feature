@tag_Graphic
Feature: Graphic Functionality

  Scenario: check the AnimateDrawable scenario
  Given Start the Appium service
  And click on Graphic buttton
  Then click on AnimateDrawable button then go back
  Then click on Density button then go back
  And Stop the Appium service
  @tag_Graphic1
  Scenario: check the surfaceview scenario
  Given Start the Appium service
  And click on Graphic buttton
  Then Scroll up in Grapic section
  And click on surfaceview overly
  And Stop the Appium service