Feature: Background Verification

@Test
Scenario: Verify background color change

Given User is in main page
When User clicks Set SkyBlue Background Button
Then the background color is observed to change successfully to Blue
Then the user Clicks on Set White Background Button and the background color changes to White




