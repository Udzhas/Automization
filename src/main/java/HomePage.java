import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends  BaseClass {
    public HomePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[contains(@class, 'dropdown-login')]//a[contains (text(), 'Sign Up')]")
    private WebElement signUpElement;

    @FindBy(className = "dropdown-login")
    private WebElement logInDropDown;

    @FindBy(xpath = "//a[@data-name='cars']")
    private WebElement carsBtn;

    public SignUpPage SignUpPage(){
        this.logInDropDown.click();
        this.signUpElement.click();
        return new SignUpPage(driver);
    }
    public CarRentClass carRentClass(){
        this.carsBtn.click();
        return new CarRentClass(driver);
    }
}
