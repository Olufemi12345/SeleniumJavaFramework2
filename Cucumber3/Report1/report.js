$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:FEATURE/EBAY.feature");
formatter.feature({
  "name": "Ebay Home Page Scenario",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Home Page Link",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@45"
    }
  ]
});
formatter.step({
  "name": "I am on Ebay Home Page",
  "keyword": "Given "
});
formatter.step({
  "name": "I click on \u0027\u003clink\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "I validate that the page navigate to \u0027\u003curl\u003e\u0027and title contains \u0027\u003ctitle\u003e\u0027",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "link",
        "url",
        "title"
      ]
    },
    {
      "cells": [
        "motors",
        "https://www.ebay.com/b/Auto-Parts-and-Vehicles/6000/bn_1865334",
        "eBay Motors"
      ]
    },
    {
      "cells": [
        "Fasions",
        "https://www.ebay.com/b/Fashion/bn_7000259856",
        "Fashions"
      ]
    },
    {
      "cells": [
        "Toys",
        "https://www.ebay.com/b/Toys-Hobbies/220/bn_1865497",
        "Toys"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Home Page Link",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@45"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "I am on Ebay Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.EBAY_HOME_STEP.i_am_on_Ebay_Home_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on \u0027motors\u0027",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I validate that the page navigate to \u0027https://www.ebay.com/b/Auto-Parts-and-Vehicles/6000/bn_1865334\u0027and title contains \u0027eBay Motors\u0027",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Home Page Link",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@45"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "I am on Ebay Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.EBAY_HOME_STEP.i_am_on_Ebay_Home_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on \u0027Fasions\u0027",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I validate that the page navigate to \u0027https://www.ebay.com/b/Fashion/bn_7000259856\u0027and title contains \u0027Fashions\u0027",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Home Page Link",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@45"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "I am on Ebay Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.EBAY_HOME_STEP.i_am_on_Ebay_Home_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on \u0027Toys\u0027",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I validate that the page navigate to \u0027https://www.ebay.com/b/Toys-Hobbies/220/bn_1865497\u0027and title contains \u0027Toys\u0027",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});