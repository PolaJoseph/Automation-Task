package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class CountriesPage {
    private WebDriver driver;
    private  String Price;
    private String Type;
    private String Currency;

    private By ReturnBackButton = By.id("jawwy-logo-web");
    private By MainButton = By.xpath("//*[@id=\"main\"]/div/div[1]/div[3]/a");
    private By AlternativeButton = By.id("classic-selection");
    private By StringMainButton = By.id("order-total-price");
    private By StringAlternativeButton = By.id("order-tier-price");



    public CountriesPage(WebDriver driver)
    {
        this.driver = driver;
        Spilt();
    }


    public void ReturnBack() // to return back to homepage
    {
        driver.findElement(ReturnBackButton).click();
    }




    public String GetPrice() // return Price
    {
        return Price;

    }
    public String GetCurrency() // return Currency
    {

        return Currency;

    }
    public String GetType() // return type
    {
     return Type;

    }
    private void Spilt() // to spilt the line to three price/Currency/Type
    {
        String input = GetInformation();

        // Split the input string based on "/"
        String[] parts = input.split("/");

        // Extract values into separate variables
        String firstPart = parts[0].trim(); // Trim removes leading/trailing spaces
         Type = parts[1].trim(); //Type

        // Split the first part to get the number and currency
        String[] numberAndCurrency = firstPart.split(" ");
         Price = numberAndCurrency[0].trim(); //Price
         Currency = numberAndCurrency[1].trim();//Currency
    }



    private String GetInformation() //Get information data in one line
    {

        try {
            //click in link of international package
            WebElement button = driver.findElement(MainButton);
            button.click();
            //get line of string
            String input = driver.findElement(StringMainButton).getText();
            return input;

        } catch (org.openqa.selenium.NoSuchElementException e) {
            //click in link of international package
            WebElement alternativeButton = driver.findElement(AlternativeButton);
            alternativeButton.click();
            //get line of string
            String input = driver.findElement(StringAlternativeButton).getText();
            return input;
        }
    }





}
