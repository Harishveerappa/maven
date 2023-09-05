$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/hveer/eclipse-workspace/Maven_Project/src/test/java/com/feature/Google.feature");
formatter.feature({
  "line": 1,
  "name": "google App testing",
  "description": "",
  "id": "google-app-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "To Check The Mail",
  "description": "",
  "id": "google-app-testing;to-check-the-mail",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User Must Launch the\"Chrome\" Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User Must Launch the \"https://www.google.com/\" Url",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 21
    }
  ],
  "location": "Googlestep.user_Must_Launch_the_Browser(String)"
});
formatter.result({
  "duration": 2722419300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.google.com/",
      "offset": 22
    }
  ],
  "location": "Googlestep.user_Must_Launch_the_Url(String)"
});
formatter.result({
  "duration": 1209251200,
  "status": "passed"
});
});