$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/eclipse/techfioscucumberframework.qa/src/test/java/feature/login.feature");
formatter.feature({
  "name": "Background Verification",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify background color change",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.step({
  "name": "User is in main page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.user_is_in_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Set SkyBlue Background Button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_clicks_Set_SkyBlue_Background_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the background color is observed to change successfully to Blue",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.the_background_color_is_observed_to_change_successfully_to_Blue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user Clicks on Set White Background Button and the background color changes to White",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.the_user_Clicks_on_Set_White_Background_Button_and_the_background_color_changes_to_White()"
});
formatter.result({
  "status": "passed"
});
});