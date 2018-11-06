$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/CoreNav.feature");
formatter.feature({
  "name": "Core Navigation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "\u003cScenarioID\u003e:  \u003cRegion\u003e user can access option  to navigate to another room from the \u003croom\u003e screen",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "\"\u003cRegion\u003e\" user selects to view the \"\u003croom\u003e\" scene",
  "keyword": "Given "
});
formatter.step({
  "name": "the miniature dolls house is clicked",
  "keyword": "When "
});
formatter.step({
  "name": "the House image overlay appears",
  "keyword": "Then "
});
formatter.step({
  "name": "user can Select another room",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ScenarioID",
        "Region",
        "room"
      ]
    },
    {
      "cells": [
        "TH-69-2.1",
        "UK",
        "Living Room"
      ]
    },
    {
      "cells": [
        "TH-69-2.2",
        "UK",
        "Kitchen"
      ]
    },
    {
      "cells": [
        "TH-69-2.3",
        "UK",
        "Bedroom"
      ]
    }
  ]
});
formatter.scenario({
  "name": "TH-69-2.1:  UK user can access option  to navigate to another room from the Living Room screen",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "\"UK\" user selects to view the \"Living Room\" scene",
  "keyword": "Given "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.userHasSelectedToViewTheScreen(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the miniature dolls house is clicked",
  "keyword": "When "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.theMiniatureDollsHouseIsClicked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the House image overlay appears",
  "keyword": "Then "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.theHouseImageOverlayAppears()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can Select another room",
  "keyword": "And "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.userCanSelectAnotherRoom()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\".dolls-house-room-bedroom\"}\n  (Session info: chrome\u003d69.0.3497.100)\n  (Driver info: chromedriver\u003d2.41.578706 (5f725d1b4f0a4acbf5259df887244095596231db),platform\u003dMac OS X 10.13.6 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027ldnmbl-mac3htd6.emea.corp.ipgnetwork.com\u0027, ip: \u0027fe80:0:0:0:10ed:ee7:6348:b22d%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.6\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.41.578706 (5f725d1b4f0a4a..., userDataDir: /var/folders/79/_r01hrwj1qq...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:62589}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 69.0.3497.100, webStorageEnabled: true}\nSession ID: 469d519eb8ec42ceb13516394f210f9c\n*** Element info: {Using\u003dcss selector, value\u003d.dolls-house-room-bedroom}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:317)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:411)\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:431)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:309)\n\tat Helpers.DriverHelpers.findElementbyCSS(DriverHelpers.java:225)\n\tat Amazon_AlexaTestDefs.userCanSelectAnotherRoom(Amazon_AlexaTestDefs.java:374)\n\tat ✽.user can Select another room(src/test/resources/CoreNav.feature:9)\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TH-69-2.2:  UK user can access option  to navigate to another room from the Kitchen screen",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "\"UK\" user selects to view the \"Kitchen\" scene",
  "keyword": "Given "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.userHasSelectedToViewTheScreen(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the miniature dolls house is clicked",
  "keyword": "When "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.theMiniatureDollsHouseIsClicked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the House image overlay appears",
  "keyword": "Then "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.theHouseImageOverlayAppears()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can Select another room",
  "keyword": "And "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.userCanSelectAnotherRoom()"
});
formatter.write("Hover over bedroom  did not display preview info");
formatter.write("Hover over Living room  did not display preview info");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TH-69-2.3:  UK user can access option  to navigate to another room from the Bedroom screen",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "\"UK\" user selects to view the \"Bedroom\" scene",
  "keyword": "Given "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.userHasSelectedToViewTheScreen(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the miniature dolls house is clicked",
  "keyword": "When "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.theMiniatureDollsHouseIsClicked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the House image overlay appears",
  "keyword": "Then "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.theHouseImageOverlayAppears()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can Select another room",
  "keyword": "And "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.userCanSelectAnotherRoom()"
});
formatter.write("Hover over Living Room  did not display preview info");
formatter.write("Hover over Kitchen  did not display preview info");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "\u003cScenarioID\u003e:  \"\u003croom\u003e\" previews shown on mouse over dolls house",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am a \"\u003cRegion\u003e\" user who has accesses the Advert",
  "keyword": "Given "
});
formatter.step({
  "name": "the Mouse is placed over the \"\u003croom\u003e\" section of the House",
  "keyword": "When "
});
formatter.step({
  "name": "the \"\u003croom\u003e\" preview information is displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ScenarioID",
        "Region",
        "room"
      ]
    },
    {
      "cells": [
        "TH-59-1.2",
        "UK",
        "Living Room"
      ]
    },
    {
      "cells": [
        "TH-59-1.3",
        "UK",
        "Kitchen"
      ]
    },
    {
      "cells": [
        "TH-59-1.1",
        "UK",
        "Bedroom"
      ]
    }
  ]
});
formatter.scenario({
  "name": "TH-59-1.2:  \"Living Room\" previews shown on mouse over dolls house",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am a \"UK\" user who has accesses the Advert",
  "keyword": "Given "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.iAmAUserWhoHasAccessesTheAdvert(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Mouse is placed over the \"Living Room\" section of the House",
  "keyword": "When "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.theMouseIsPlacedOverTheSectionOfTheHouse(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Living Room\" preview information is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.thePreviewInformationIsDisplayed(String)"
});
formatter.write("url(\"https://s3-eu-west-1.amazonaws.com/avs-experience-frontend-v2-dev/03cb675733c4eff0df563b7ff25d60cd.png\")");
formatter.write("\"Living Room\" Hover - Expected: \"Ask Alexa to:\" ; Found : Ask Alexa to:");
formatter.write("\"Living Room\" Hover - Expected: \"and much more...\" ; Found : and much more...");
formatter.write("\"Living Room\" Utterance - Expected: \"Turn up the heating\" ; Found : Turn up the heating");
formatter.write("\"Living Room\" Utterance - Expected: \"Play some music\" ; Found : Play some music");
formatter.write("\"Living Room\" Utterance - Expected: \"Turn on the lights\" ; Found : Turn on the lights");
formatter.write("\"Living Room\" Hover - Expected: \"Try out the Echo\" ; Found : Try out the Echo");
formatter.write("\"Living Room\" Hover button - Expected: \"Go to the living room\" ; Found : \"Go to the living room\"");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TH-59-1.3:  \"Kitchen\" previews shown on mouse over dolls house",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am a \"UK\" user who has accesses the Advert",
  "keyword": "Given "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.iAmAUserWhoHasAccessesTheAdvert(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Mouse is placed over the \"Kitchen\" section of the House",
  "keyword": "When "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.theMouseIsPlacedOverTheSectionOfTheHouse(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Kitchen\" preview information is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.thePreviewInformationIsDisplayed(String)"
});
formatter.write("url(\"https://s3-eu-west-1.amazonaws.com/avs-experience-frontend-v2-dev/03cb675733c4eff0df563b7ff25d60cd.png\")");
formatter.write("\"Kitchen\" Hover - Expected: \"Ask Alexa to:\" ; Found : Ask Alexa to:");
formatter.write("\"Kitchen\" Hover - Expected: \"and much more...\" ; Found : and much more...");
formatter.write("\"Kitchen\" Utterance - Expected: \"Manage your shopping\" ; Found : Manage your shopping");
formatter.write("\"Kitchen\" Utterance - Expected: \"Set a timer\" ; Found : Set a timer");
formatter.write("\"Kitchen\" Utterance - Expected: \"Clean your floor\" ; Found : Clean your floor");
formatter.write("\"Kitchen\" Hover - Expected: \"Try out the Echo Show\" ; Found : Try out the Echo Show");
formatter.write("\"Kitchen\" Hover button - Expected: \"Go to the kitchen\" ; Found : \"Go to the kitchen\"");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TH-59-1.1:  \"Bedroom\" previews shown on mouse over dolls house",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am a \"UK\" user who has accesses the Advert",
  "keyword": "Given "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.iAmAUserWhoHasAccessesTheAdvert(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Mouse is placed over the \"Bedroom\" section of the House",
  "keyword": "When "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.theMouseIsPlacedOverTheSectionOfTheHouse(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Bedroom\" preview information is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.thePreviewInformationIsDisplayed(String)"
});
formatter.write("\"Bedroom\" Hover - Expected: \"Try using\" ; Found : Try using");
formatter.write("url(\"https://s3-eu-west-1.amazonaws.com/avs-experience-frontend-v2-dev/03cb675733c4eff0df563b7ff25d60cd.png\")");
formatter.write("\"Bedroom\" Hover - Expected: \"Ask Alexa to:\" ; Found : Ask Alexa to:");
formatter.write("\"Bedroom\" Hover - Expected: \"and much more...\" ; Found : and much more...");
formatter.write("\"Bedroom\" Utterance - Expected: \"Start your day\" ; Found : Start your day");
formatter.write("\"Bedroom\" Utterance - Expected: \"Read you a book\" ; Found : Read you a book");
formatter.write("\"Bedroom\" Utterance - Expected: \"Help you sleep\" ; Found : Help you sleep");
formatter.write("\"Bedroom\" Hover - Expected: \"Try out the Echo Show\" ; Found : Try out the Echo Show");
formatter.write("\"Bedroom\" Hover button - Expected: \"Go to the bedroom\" ; Found : \"Go to the bedroom\"");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "\u003cScenarioID\u003e:  user selects to view the \u003croom\u003e from the Banner/overlay (House image)",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "\"\u003cRegion\u003e\" user selects to view the \"\u003croom\u003e\" scene",
  "keyword": "Given "
});
formatter.step({
  "name": "the \"\u003croom\u003e\" Screen loads",
  "keyword": "When "
});
formatter.step({
  "name": "the \"\u003croom\u003e\" screen is displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ScenarioID",
        "Region",
        "room"
      ]
    },
    {
      "cells": [
        "TH-60-1.1",
        "UK",
        "Living Room"
      ]
    },
    {
      "cells": [
        "TH-60-1.2",
        "UK",
        "Kitchen"
      ]
    },
    {
      "cells": [
        "TH-60-1.3",
        "UK",
        "Bedroom"
      ]
    }
  ]
});
formatter.scenario({
  "name": "TH-60-1.1:  user selects to view the Living Room from the Banner/overlay (House image)",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "\"UK\" user selects to view the \"Living Room\" scene",
  "keyword": "Given "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.userHasSelectedToViewTheScreen(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Living Room\" Screen loads",
  "keyword": "When "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.theScreenLoads(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Living Room\" screen is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.theScreenIsDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TH-60-1.2:  user selects to view the Kitchen from the Banner/overlay (House image)",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "\"UK\" user selects to view the \"Kitchen\" scene",
  "keyword": "Given "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.userHasSelectedToViewTheScreen(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Kitchen\" Screen loads",
  "keyword": "When "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.theScreenLoads(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Kitchen\" screen is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.theScreenIsDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TH-60-1.3:  user selects to view the Bedroom from the Banner/overlay (House image)",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "\"UK\" user selects to view the \"Bedroom\" scene",
  "keyword": "Given "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.userHasSelectedToViewTheScreen(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Bedroom\" Screen loads",
  "keyword": "When "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.theScreenLoads(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Bedroom\" screen is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.theScreenIsDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "\u003cScenarioID\u003e:  \"\u003cReqion\u003e\" user has option to navigate to other room",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "\"\u003cRegion\u003e\" user selects to view the \"\u003croom\u003e\" scene",
  "keyword": "Given "
});
formatter.step({
  "name": "the \"\u003croom\u003e\" Screen loads",
  "keyword": "When "
});
formatter.step({
  "name": "the miniature dolls house is displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ScenarioID",
        "Region",
        "room"
      ]
    },
    {
      "cells": [
        "TH-69-1.1",
        "UK",
        "Living Room"
      ]
    },
    {
      "cells": [
        "TH-69-1.1",
        "UK",
        "Kitchen"
      ]
    },
    {
      "cells": [
        "TH-69-1.1",
        "UK",
        "Bedroom"
      ]
    }
  ]
});
formatter.scenario({
  "name": "TH-69-1.1:  \"\u003cReqion\u003e\" user has option to navigate to other room",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "\"UK\" user selects to view the \"Living Room\" scene",
  "keyword": "Given "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.userHasSelectedToViewTheScreen(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Living Room\" Screen loads",
  "keyword": "When "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.theScreenLoads(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the miniature dolls house is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.theMiniatureDollsHouseIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TH-69-1.1:  \"\u003cReqion\u003e\" user has option to navigate to other room",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "\"UK\" user selects to view the \"Kitchen\" scene",
  "keyword": "Given "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.userHasSelectedToViewTheScreen(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Kitchen\" Screen loads",
  "keyword": "When "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.theScreenLoads(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the miniature dolls house is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.theMiniatureDollsHouseIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TH-69-1.1:  \"\u003cReqion\u003e\" user has option to navigate to other room",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "\"UK\" user selects to view the \"Bedroom\" scene",
  "keyword": "Given "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.userHasSelectedToViewTheScreen(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Bedroom\" Screen loads",
  "keyword": "When "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.theScreenLoads(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the miniature dolls house is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Amazon_AlexaTestDefs.theMiniatureDollsHouseIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});