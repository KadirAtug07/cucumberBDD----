package renastech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utils.BrowserUtils;

public class Payment extends BrowserUtils {
    public Payment(){ PageFactory.initElements(driver,this); }


    @FindBy(id = "card_nmuber")
    private WebElement cardnumber;
    @FindBy(id = "month")
    private WebElement month;
    @FindBy(id = "year")
    private WebElement year;
    @FindBy(id = "cvv_code")
    private WebElement cvvCode;
    @FindBy(xpath = "//input[@value='Pay $20.00']")
    private WebElement payButton;


    public void setCardnumber(String CardNumber){
        staticWait(1);
        cardnumber.sendKeys(CardNumber);
    }

    public void setMonth(String Month){
        staticWait(1);
        month.sendKeys(Month);
    }

}
