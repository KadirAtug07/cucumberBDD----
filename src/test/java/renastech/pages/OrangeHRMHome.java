package renastech.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utils.BrowserUtils;

public class OrangeHRMHome extends BrowserUtils {
    public OrangeHRMHome(){ PageFactory.initElements(driver,this); }

    @FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
    private WebElement dashboardMessage;
    @FindBy(id = "menu_pim_viewPimModule")
    private WebElement PIM;
    @FindBy(id = "menu_pim_addEmployee")
    private WebElement addEmployee;
    @FindBy(id = "firstName")
    private WebElement Name;
    @FindBy(id = "lastName")
    private WebElement LastName;
    @FindBy(id = "btnSave")
    private WebElement saveButton;
    @FindBy(xpath = "//h1[.='Personal Details']")
    private WebElement ProfileHeader;

    public void setDashboardMessage(){
        Assert.assertEquals("Dashboard",dashboardMessage.getText());
    }
    public void setPIM(){ PIM.click(); }
    public void setAddEmployee(){ addEmployee.click(); }
    public void setName(String name){ Name.sendKeys(name); }
    public void setLastName(String lastname){ LastName.sendKeys(lastname); }

    public void setSaveButton(){ clickWithWait(saveButton); }

    public void setProfileHeader(String expectedHeader){
        Assert.assertEquals(expectedHeader,ProfileHeader.getText());
    }

}
