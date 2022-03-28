package com.challenge.bdd.orderingbook;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import static java.lang.Math.abs;

public class OrderingBookStepDefinations {

    public WebDriver driver;
    public OrderingPage orderingPage;
    public String bookname;
    public String units;
    public String price;
    public String discount=null;

    @Given("User launch chrome browser")
    public void userIsAWholesaleUser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        orderingPage = new OrderingPage(driver);
    }

    @When("User opens URl {string}")
    public void userOpensURl(String arg0) {
        driver.get(arg0);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @And("User select category as {string}")
    public void userSelectCategoryAs(String arg0) {
        orderingPage.selectCategory(arg0);
    }

    @And("User select book as {string}")
    public void userSelectBookAs(String arg0) {
        bookname = arg0;
        orderingPage.selectBook(bookname);
    }

    @And("User enters Unit as {string}")
    public void userEntersUnitAs(String arg0) {
        units = arg0;
        orderingPage.setBookUnits(units);
    }

    @And("User enters Price as {string}")
    public void userEntersPriceAs(String arg0) {
        price = arg0;
        orderingPage.setBookPrice(price);
    }

    @And("User click on SUBMIT")
    public void userClickOnSUBMIT() throws InterruptedException {
        orderingPage.clickSubmit();
        Thread.sleep(1000);
        /*
        if (orderingPage.getInvalidInput())
            Assert.assertTrue(false);
        if(orderingPage.getInvalidPrice())
            Assert.assertTrue(false);

         */
        if (driver.getPageSource().contains("Input is not valid")) {
            driver.close();
            Assert.assertTrue(false);
        }
        if(driver.getPageSource().contains("Invalid price")) {
            driver.close();
            Assert.assertTrue(false);
        }
    }

    @Then("Transaction Record should be generated as {string}")
    public void transactionRecordShouldBeGeneratedAs(String arg0) {
        String td[]= arg0.split(",");
        if (!td[2].equals(units)){
            Assert.assertTrue(false);
        }
        price="$"+price;
        if(!td[3].equals(price)){
            System.out.println(price+"  "+td[3]);
            Assert.assertTrue(false);
        }
        int iUnits = Integer.parseInt(units);
        double dPrice = Double.parseDouble(price.substring(1));
        double amount = iUnits*dPrice;
        double finalAmount = amount;
        //
        if (discount!=null){
            double dDiscount= Double.parseDouble(discount);
            double disCountAmount = amount*dDiscount/100;
            finalAmount = amount-disCountAmount;
        }

        if (Math.abs(finalAmount-Double.parseDouble(td[6].substring(1)))>0.0000001d)
            Assert.assertTrue(false);
    }


    @And("User select discount")
    public void userSelectDiscount() {
        orderingPage.clickDiscount();
    }

    @And("User enter discount as {string}")
    public void userEnterDiscountAs(String arg0) {
        discount = arg0;
        orderingPage.inputDiscount(discount);
    }

    @Then("User delete the record")
    public void userDeleteTheRecord() {
        orderingPage.clickRemoveBtn();
    }

    @And("User confirm to delete the record")
    public void userConfirmToDeleteTheRecord() {
         orderingPage.deleteConfirm();
    }

    @Then("User close the browser")
    public void userCloseTheBrowser() {
        driver.quit();
    }
}
