$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature/Paralogin.feature");
formatter.feature({
  "name": "Login",
  "description": "Login using valid username and password.",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login into to application",
  "description": "User should login using valid credentials.",
  "keyword": "Scenario"
});
formatter.scenarioOutline({
  "name": "The one where user logins with different user data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "I want to write a step with \u003cname\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "Larry login with below set of \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Larry login successfully to TestMeApp",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Lalitha",
        "Password123"
      ]
    },
    {
      "cells": [
        "Larry29",
        "Password123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "The one where user logins with different user data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "I want to write a step with \u003cname\u003e",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Larry login with below set of \"Lalitha\" and \"Password123\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Larry login successfully to TestMeApp",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "The one where user logins with different user data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "I want to write a step with \u003cname\u003e",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Larry login with below set of \"Larry29\" and \"Password123\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Larry login successfully to TestMeApp",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("file:Feature/addtocart.feature");
formatter.feature({
  "name": "Add to Cart",
  "description": "Product you wish to buy add that to cart",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful adding of product to cart",
  "description": "User should add the desired product to cart",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I want to add product to cart",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I click on add to cart option",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Product is added to cart",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "proceed with payment",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("file:Feature/imagepost.feature");
formatter.feature({
  "name": "Sharing of Instagram images to Whatsapp",
  "description": "The image should be shared in minimum clicks.",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Should be able to share the image even if its private or public account",
  "description": "A notification should be sent to the private account holder if his/her image is shared",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have choosen to share the image",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I click the forward button",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I should receive a option of Whatsapp",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I should successfully share the image on Whatsapp",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("file:Feature/login.feature");
formatter.feature({
  "name": "Login",
  "description": "Login using valid username and password.",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login into to application",
  "description": "User should login using valid credentials.",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have to login in Testmeapp",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.LoginTest.i_have_to_login_in_Testmeapp() in file:/C:/Users/A07216trng_M7A.05.19/eclipse-workspace/Shubh/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have to enter username and password",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.LoginTest.i_have_to_enter_username_and_password() in file:/C:/Users/A07216trng_M7A.05.19/eclipse-workspace/Shubh/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login Button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginTest.click_on_login_Button() in file:/C:/Users/A07216trng_M7A.05.19/eclipse-workspace/Shubh/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Directed to new page",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.LoginTest.directed_to_new_page() in file:/C:/Users/A07216trng_M7A.05.19/eclipse-workspace/Shubh/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Feature/registration.feature");
formatter.feature({
  "name": "Registration",
  "description": "Registering new user with firstname,lastname,phone no,email,etc",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful Registration",
  "description": "User should enter valid personal details",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have register in Testmeapp",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I have to enter all fields with valid data",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click on register on",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Directed to login page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("file:Feature/search.feature");
formatter.feature({
  "name": "Search a product",
  "description": "Search a product which you want to purchase",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful searching of product",
  "description": "User should enter the name of product to be searched",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have to search a product in testmeapp",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Enter product name in search field",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click on Search Buttom",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I am shown an option to add to cart",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});