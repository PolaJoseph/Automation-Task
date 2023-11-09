package TestCase;

import org.testng.annotations.DataProvider;

public class CountriesDataProvider {


    @DataProvider(name = "CountryData")
    public static Object [] [] EnterData ()
    {
        Object [] [] data = new Object [3] [4];

      data [0] [0] = "UAE";		    data [0] [1] = "10.00"; 		data [0] [2] = "week";     data [0] [3] = "AED";
      data [1] [0] = "Egypt";		data [1] [1] = "10.00";		    data [1] [2] = "month";      data [1] [3] = "Egyptian";
      data [2] [0] = "Jordan";		data [2] [1] = "0.99";		    data [2] [2] = "week";      data [2] [3] = "JOD";


        return data;
    }
}
