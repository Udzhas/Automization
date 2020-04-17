import org.testng.Assert;
import org.testng.annotations.Test;

public class CarRentTest {
    @Test(priority = 2)
    public void testCarRent(){
        String pickUp="London";
        String departDate="22/04/2020";
        String departTime="12:00";
        String returnDate="30/04/2020";
        BaseClass baseClass=new BaseClass();
        Cars actualResult=baseClass
                .openHomePage()
                .carRentClass()
                .selectValueFromPaickUpList(pickUp)
                //.selectValueFromDropDownList(pickUp)
                .departDate(departDate)
                .departTime(departTime)
                .returnDate(returnDate)
                .searchClick();
    }

}
