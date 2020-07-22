$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Featurefolder/TitanLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Login feature for Titan site",
  "description": "",
  "id": "login-feature-for-titan-site",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login scenario for titan",
  "description": "",
  "id": "login-feature-for-titan-site;login-scenario-for-titan",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user launcheshe browser google",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "he browserlaunches he enters the username and password \"jaiprashanth2504@gmail.com\"  \"J@i250493\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "he clicks the sign in  button tologin",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginsteps.user_launcheshe_browser_google()"
});
formatter.result({
  "duration": 70527695118,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jaiprashanth2504@gmail.com",
      "offset": 56
    },
    {
      "val": "J@i250493",
      "offset": 86
    }
  ],
  "location": "Loginsteps.he_browserlaunches_he_enters_the_username_and_password(String,String)"
});
formatter.result({
  "duration": 18764861638,
  "status": "passed"
});
formatter.match({
  "location": "Loginsteps.he_clicks_the_sign_in_button_tologin()"
});
formatter.result({
  "duration": 34284321454,
  "status": "passed"
});
});