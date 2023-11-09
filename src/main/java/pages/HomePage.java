package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class HomePage {
    WebDriver driver;
    private By CountryListButton = By.id("country-btn");
    private By CountryList = By.id("country-selct");
    private By LanguageToEnglish = By.id("translation-btn");

    public HomePage(WebDriver driver) {

        this.driver = driver;
        ChangeLanguageToEnglish();
    }




    public boolean CheckCountry(String searchString) //Get list of countries and Check if the searchString in list
    {
        //open list
        ClickCountryList();

        // give name of all countries
        WebElement countriesMenu = driver.findElement(CountryList);
        List<WebElement> Countries = countriesMenu.findElements(By.tagName("a"));
        List<String> CList = Countries.stream().map(e->e.getText()).collect(Collectors.toList());
        String[] stringArray = CList.toArray(new String[0]);

        // Call the searchArray method and store the result in a variable
        int index = searchArray(stringArray, searchString);

        // Check if the string was found in the array
        if (index != -1) {
            System.out.println("String '" + searchString + "' found at index: " + (index+1));
            return true;
        } else {
            System.out.println("String '" + searchString + "' this Country not Found in list");
            return false;
        }




    }

    public  CountriesPage ClickCountry(String CountryName) // get index and click in country
    {
        WebElement countriesMenu = driver.findElement(CountryList);
        List<WebElement> Countries = countriesMenu.findElements(By.tagName("a"));
        List<String> CList = Countries.stream().map(e->e.getText()).collect(Collectors.toList());
        String[] stringArray = CList.toArray(new String[0]);

        // Call the searchArray method and store the result in a variable
        int index = searchArray(stringArray, CountryName);
        Countries.get(index).click();
        return new CountriesPage(driver);

    }

    private static int searchArray(String[] array, String target) // Search methode
    {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                return i; // Return the index if the string is found
            }
        }
        return -1; // Return -1 if the string is not found in the array
    }

    private void ClickCountryList() //to click Countries list button
    {
        driver.findElement(CountryListButton).click();
    }


    private void ChangeLanguageToEnglish()
    {
        driver.findElement(LanguageToEnglish).click();
    }





}
