$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/ordering/ordering_book.feature");
formatter.feature({
  "name": "Customer order books",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "wholesale user order books",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "OrderingBookStepDefinations.userIsAWholesaleUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URl \"https://react.simprocloud.com/build/index.html\"",
  "keyword": "When "
});
formatter.match({
  "location": "OrderingBookStepDefinations.userOpensURl(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select category as \"Fiction\"",
  "keyword": "And "
});
formatter.match({
  "location": "OrderingBookStepDefinations.userSelectCategoryAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select book as \"Harry Potter\"",
  "keyword": "And "
});
formatter.match({
  "location": "OrderingBookStepDefinations.userSelectBookAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Unit as \"50\"",
  "keyword": "And "
});
formatter.match({
  "location": "OrderingBookStepDefinations.userEntersUnitAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Price as \"35.8\"",
  "keyword": "And "
});
formatter.match({
  "location": "OrderingBookStepDefinations.userEntersPriceAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on SUBMIT",
  "keyword": "And "
});
formatter.match({
  "location": "OrderingBookStepDefinations.userClickOnSUBMIT()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\n\tat org.junit.Assert.fail(Assert.java:86)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat org.junit.Assert.assertTrue(Assert.java:52)\n\tat com.challenge.bdd.orderingbook.OrderingBookStepDefinations.userClickOnSUBMIT(OrderingBookStepDefinations.java:82)\n\tat ✽.User click on SUBMIT(src/test/resources/features/ordering/ordering_book.feature:9)\n",
  "status": "failed"
});
formatter.step({
  "name": "Transaction Record should be generated as \"1,Harry Potter,50,$35,$1750,$0.00,$1750\"",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderingBookStepDefinations.transactionRecordShouldBeGeneratedAs(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "book-lover user order books",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "OrderingBookStepDefinations.userIsAWholesaleUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URl \"https://react.simprocloud.com/build/index.html\"",
  "keyword": "When "
});
formatter.match({
  "location": "OrderingBookStepDefinations.userOpensURl(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select category as \"Drama\"",
  "keyword": "And "
});
formatter.match({
  "location": "OrderingBookStepDefinations.userSelectCategoryAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select book as \"The Rainbow\"",
  "keyword": "And "
});
formatter.match({
  "location": "OrderingBookStepDefinations.userSelectBookAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Unit as \"1\"",
  "keyword": "And "
});
formatter.match({
  "location": "OrderingBookStepDefinations.userEntersUnitAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Price as \"125\"",
  "keyword": "And "
});
formatter.match({
  "location": "OrderingBookStepDefinations.userEntersPriceAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select discount",
  "keyword": "And "
});
formatter.match({
  "location": "OrderingBookStepDefinations.userSelectDiscount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter discount as \"10\"",
  "keyword": "And "
});
formatter.match({
  "location": "OrderingBookStepDefinations.userEnterDiscountAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on SUBMIT",
  "keyword": "And "
});
formatter.match({
  "location": "OrderingBookStepDefinations.userClickOnSUBMIT()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Transaction Record should be generated as \"1,The Rainbow,1,$125,$125,$12.5,$112.50\"",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderingBookStepDefinations.transactionRecordShouldBeGeneratedAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User delete the record",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderingBookStepDefinations.userDeleteTheRecord()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User confirm to delete the record",
  "keyword": "And "
});
formatter.match({
  "location": "OrderingBookStepDefinations.userConfirmToDeleteTheRecord()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderingBookStepDefinations.userCloseTheBrowser()"
});
formatter.result({
  "status": "passed"
});
});