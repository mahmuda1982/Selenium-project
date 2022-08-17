package browser;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Browser {
    WebDriver driver;

    private String getPropertyValue(String propertyName){
        String propertyValue = "";

        try {
            InputStream inputStream = new FileInputStream("src/main/resources/info.properties");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        return propertyValue;
    }
    public void setDriver(){
        String driverValue = getPropertyValue((String)
    }
}


