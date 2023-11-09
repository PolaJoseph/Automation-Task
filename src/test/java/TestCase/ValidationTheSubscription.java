package TestCase;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CountriesPage;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static org.testng.AssertJUnit.assertEquals;


public class ValidationTheSubscription extends BaseTest {

    CountriesPage Country ;


    @Test(dataProviderClass = CountriesDataProvider.class, dataProvider = "CountryData")
    public void ValidateCountry(String CountryName, String Price , String Type , String Currency) throws IOException {

        if (homePage.CheckCountry(CountryName))
        {
            Country = homePage.ClickCountry(CountryName);
            assertEquals("Alert text is Price incorrect",Country.GetPrice(), Price);
            assertEquals("Alert text is Type incorrect",Country.GetType(), Type);
            assertEquals("Alert text is Type incorrect",Country.GetCurrency(), Currency);

            // Write validation results to Notepad file
            BufferedWriter writer = new BufferedWriter(new FileWriter("test-output/Validation_results.txt", true));
            writer.write("Country: " + CountryName);
            writer.newLine();
            writer.write("Validation Result: Validation successfully"); // Assume validation success
            writer.newLine();
            writer.write("Price: " +Country.GetPrice()+ "   Currency: " +Country.GetCurrency()+ "   Package Type: " +Country.GetType()); // Assume validation success
            writer.newLine();
            writer.write("==============================================");
            writer.newLine();
            writer.close();

            Country.ReturnBack();

        }
    }



}
