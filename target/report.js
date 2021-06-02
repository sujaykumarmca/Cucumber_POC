$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/sujay workspace/InfoCucumber/src/test/java/myfeatures/mygooglesearch.feature");
formatter.feature({
  "line": 1,
  "name": "Check google search functionality",
  "description": "",
  "id": "check-google-search-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 789334,
  "status": "passed"
});
formatter.before({
  "duration": 361545,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Validate google search is working fine",
  "description": "",
  "id": "check-google-search-functionality;validate-google-search-is-working-fine",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@One"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Browser is open",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on google search page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enters a text in google search page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "hits Enter button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user is navigated to google search page",
  "keyword": "Then "
});
formatter.match({
  "location": "mygooglesearchsteps.browser_is_open()"
});
formatter.result({
  "duration": 5527292439,
  "status": "passed"
});
formatter.match({
  "location": "mygooglesearchsteps.User_is_on_google_search_page()"
});
formatter.result({
  "duration": 3908266969,
  "status": "passed"
});
formatter.match({
  "location": "mygooglesearchsteps.user_enters_a_text_in_google_search_page()"
});
formatter.result({
  "duration": 30068182698,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"*[name\u003d\u0027q1\u0027]\"}\n  (Session info: chrome\u003d90.0.4430.212)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-MIGN9DL\u0027, ip: \u0027192.168.43.247\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 90.0.4430.212, chrome: {chromedriverVersion: 90.0.4430.24 (4c6d850f087da..., userDataDir: C:\\Users\\SUJAY\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:60784}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 907be1389c65f2b807434783c4e2666e\n*** Element info: {Using\u003dname, value\u003dq1}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:404)\r\n\tat org.openqa.selenium.By$ByName.findElement(By.java:284)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat mystepdef.mygooglesearchsteps.user_enters_a_text_in_google_search_page(mygooglesearchsteps.java:59)\r\n\tat ✽.When User enters a text in google search page(D:/sujay workspace/InfoCucumber/src/test/java/myfeatures/mygooglesearch.feature:7)\r\n",
  "status": "failed"
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
formatter.after({
  "duration": 174008,
  "status": "passed"
});
formatter.after({
  "duration": 152549,
  "status": "passed"
});
formatter.before({
  "duration": 246317,
  "status": "passed"
});
formatter.before({
  "duration": 147883,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Check the page title",
  "description": "",
  "id": "check-google-search-functionality;check-the-page-title",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Two"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "Compare page titles",
  "keyword": "Given "
});
formatter.match({
  "location": "mygooglesearchsteps.compare_page_title()"
});
formatter.result({
  "duration": 25538131,
  "status": "passed"
});
formatter.after({
  "duration": 2301758,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003cGoogle[ Test]\u003e but was:\u003cGoogle[]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat mystepdef.mygooglesearchsteps.after_scenario(mygooglesearchsteps.java:91)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:40)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:768)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 118027,
  "status": "passed"
});
formatter.after({
  "duration": 183338,
  "status": "passed"
});
});