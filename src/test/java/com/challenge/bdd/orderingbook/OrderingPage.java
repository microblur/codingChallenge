package com.challenge.bdd.orderingbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrderingPage {
    public WebDriver ldriver;
    public OrderingPage(WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(id = "radioselect1")
    @CacheLookup
    WebElement fictionRadio;

    @FindBy(xpath="//input[@value='Drama']")
    @CacheLookup
    WebElement dramaRadio;

    @FindBy(className = "bookoptions")
    @CacheLookup
    WebElement bookOptions;

    @FindBy(name = "units")
    @CacheLookup
    WebElement bookUnits;
    @FindBy(name= "price")
    @CacheLookup
    WebElement bookPrice;

    @FindBy(name = "discount")
    @CacheLookup
    WebElement discountCheckBox;

    @FindBy(name = "discountvalue")
    @CacheLookup
    WebElement discountInput;

    @FindBy(name = "submit")
    @CacheLookup
    WebElement btnSubmit;

    @FindBy(xpath = "//table[@id='transactionsection']/tr/td[0]")
    @CacheLookup
    WebElement recordItem;

    @FindBy(xpath = "//table[@id='transactionsection']/tr/td[1]")
    @CacheLookup
    WebElement recordBook;

    @FindBy(xpath = "//table[@id='transactionsection']/tr/td[2]")
    @CacheLookup
    WebElement recordUnits;

    @FindBy(xpath = "//table[@id='transactionsection']/tr/td[3]")
    @CacheLookup
    WebElement recordPrice;

    @FindBy(xpath = "//table[@id='transactionsection']/tr/td[4]")
    @CacheLookup
    WebElement recordAmount;

    @FindBy(xpath = "//table[@id='transactionsection']/tr/td[5]")
    @CacheLookup
    WebElement recordDiscount;

    @FindBy(xpath = "//table[@id='transactionsection']/tr/td[6]")
    @CacheLookup
    WebElement recordFinalAmount;

    @FindBy(xpath= "//p[normalize-space()='Input is not valid']")
    @CacheLookup
    WebElement inValidInput;

    @FindBy(xpath= "//p[normalize-space()='Invalid price']")
    @CacheLookup
    WebElement inValidPrice;

    @FindBy(xpath="//span[@class='removeRecord']")
    @CacheLookup
    WebElement removeBtn;

    @FindBy(xpath = "//div[@id='react-confirm-alert']/div/div/div/button[1]")
    @CacheLookup
    WebElement deleteBtn;
    public void selectCategory(String type){

        if (type.equals("Fiction")){
           fictionRadio.click();
        }
        else{
            dramaRadio.click();
        }
    }

    public void  selectBook(String name){
        Select books= new Select(bookOptions);
        books.selectByValue(name);
    }

    public void setBookUnits(String units){
        bookUnits.clear();
        bookUnits.sendKeys(units);
    }

    public void setBookPrice(String price){
        bookPrice.clear();
        bookPrice.sendKeys(price);
    }

    public void clickSubmit(){
        btnSubmit.click();
    }
    public void clickDiscount(){
        discountCheckBox.click();
    }
    public void inputDiscount(String discount){
        discountInput.clear();
        discountInput.sendKeys(discount);
    }
    public boolean getInvalidInput(){
        if(inValidInput.isDisplayed())
            return true;
        else
            return false;
    };
    public boolean getInvalidPrice(){
        if(inValidPrice.isDisplayed())
            return true;
        else
            return false;
    };

    public String getRecordRow() {
        String record;
        record=recordItem+","+recordBook+","+recordAmount+","+recordDiscount+","+recordFinalAmount;
        return record;
    }
    public void clickRemoveBtn(){
        removeBtn.click();
    }
    public void deleteConfirm(){
        deleteBtn.click();
    }

}
