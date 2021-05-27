$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/sujay workspace/InfoCucumber/src/test/java/myfeatures/mygooglesearch.feature");
formatter.feature({
  "line": 1,
  "name": "Check google search functionality",
  "description": "",
  "id": "check-google-search-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate google search is working fine",
  "description": "",
  "id": "check-google-search-functionality;validate-google-search-is-working-fine",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Browser is open",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user is on google search page",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User enters a text in google search page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "hits Enter button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user is navigated to google search page",
  "keyword": "Then "
});
formatter.match({
  "location": "mygooglesearchsteps.browser_is_open()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "mygooglesearchsteps.User_is_on_google_search_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "mygooglesearchsteps.user_enters_a_text_in_google_search_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "mygooglesearchsteps.hits_Enter_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "mygooglesearchsteps.user_is_navigated_to_google_search_page()"
});
formatter.result({
  "status": "skipped"
});
});