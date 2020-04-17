import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarRentClass extends BaseClass {
    public CarRentClass(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@data-name='cars']")
    private WebElement carsBtn;

    @FindBy(xpath = "//div[@id='s2id_autogen1']")
    private WebElement pickUpBtn;

    @FindBy(xpath = "//div[@id='select2-drop']/div")
    private WebElement inputField1;

    @FindBy(xpath = "//li[contains(@class,'select2-highlighted')]/div")
    private WebElement dropDownItem;

    @FindBy(xpath = "//a[contains(@class, 'select2-choice select2-default')]//span[text()='Drop off']")
    private WebElement dropDownBtn;

    @FindBy(xpath = "//div[contains(@class,'form-group')]//input[contains(@class,' CarTrawlerStart')]")
    private WebElement departDate;

    @FindBy(xpath = "//div[contains(@class,'chosen-container-active')]//span")
    private WebElement departTime;

    @FindBy(xpath = "//div[contains(@class,'form-group')]//input[contains(@class,' CarTrawlerEnd')]")
    private WebElement returnDate;

    @FindBy(xpath = "//div[contains(@class,'col-md-2 col-xs-12')]//button[contains(@class,'btn-primary btn btn-block')]")
    private WebElement serachBtn;

    @FindBy(xpath = "//div[contains(@class,'ct-pickup ct-grid')]")
    private WebElement confirmCarsText;

    public CarRentClass carBtn() {
        this.carsBtn.click();
        return this;
    }
    /*
    @FindBy(xpath = "//div[@id='select2-drop']/div/input")
    private WebElement pickUp;

    @FindBy(id = "s2id_autogen1")
    private WebElement field;

    private CarRentClass setValueIntoDestination(String destination) {
        this.field.click();
        this.pickUp.sendKeys(destination);
        return this;
    }

    public CarRentClass selectValueFromList(String destination) {
        setValueIntoDestination(destination);
        this.pickUp.click();
        return this;
    }*/

    public CarRentClass setPickUpField(String pickUp) {
        this.inputField1.click();
        this.pickUpBtn.sendKeys(pickUp);
        return this;
    }

    public CarRentClass selectValueFromPaickUpList(String pickUp){
    setPickUpField(pickUp);
    this.dropDownItem.click();
    return this;
    }

    public CarRentClass setdropDownField(String dropDown) {
        this.inputField1.click();
        this.dropDownBtn.sendKeys(dropDown);
        return this;
    }
    public CarRentClass selectValueFromDropDownList(String dropDown){
        setdropDownField(dropDown);
        this.dropDownItem.click();
        return this;
    }

    public CarRentClass departDate(String value) {
        this.departDate.click();
        this.departDate.clear();
        this.departDate.sendKeys(value);
        return this;
    }

    public CarRentClass departTime(String value) {
        this.departTime.click();
        this.departTime.sendKeys(value);
        return this;
    }

    public CarRentClass returnDate(String value) {
        this.returnDate.click();
        this.returnDate.clear();
        this.returnDate.sendKeys(value);
        return this;
    }

    public Cars searchClick() {
        serachBtn.click();
        return new Cars(driver);
    }

    public String confirmCarsText() {
        return confirmCarsText.getText();
    }
}
