package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.bouncycastle.util.Properties.getPropertyValue;

public class HomePage {

    @FindBy(id = "textUsername") private WebElement userName;

    @FindBy(id = "textPassword") private WebElement password;
    @FindBy(id = "btnLogin") private WebElement loginbutton;


    public void login() {
        userName. sendKeys(getPropertyValue( "userName"));
        password. sendKeys(getPropertyValue("password"));
        loginbutton.click();
    }

}
