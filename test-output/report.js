$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Automation/PageObjectModel_Cucumber/src/main/java/com/qa/features/FreeCRM.feature");
formatter.feature({
  "line": 1,
  "name": "Feature of Free CRM Login Page",
  "description": "",
  "id": "feature-of-free-crm-login-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "scenario is to automate the Free CRM Login Page",
  "description": "",
  "id": "feature-of-free-crm-login-page;scenario-is-to-automate-the-free-crm-login-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Check user able to access FreeCRM Site",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Check title page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Enter UserName and Password",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Check user landed in home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage_StepDefinition.check_user_able_to_access_FreeCRM_Site()"
});
formatter.result({
  "duration": 8737863163,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage_StepDefinition.check_title_page()"
});
formatter.result({
  "duration": 77957874,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage_StepDefinition.enter_UserName_and_Password()"
});
formatter.result({
  "duration": 4646080453,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage_StepDefinition.check_user_landed_in_home_page()"
});
formatter.result({
  "duration": 28571696,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage_StepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 662731525,
  "status": "passed"
});
});