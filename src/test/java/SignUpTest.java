import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SignUpTest {
    @Test(priority = 1)
    public void testSignUp(){
        BaseClass baseClass=new BaseClass();

        String actualResult=baseClass
                .openHomePage()
                .SignUpPage()
                .setFirstName("Adolf")
                .setLastName("Hitler")
                .setPhone("88005553535")
                .setEmail("adolfisnice"+(int)Math.random()*1000+"@germany.war")
                .setPassword("AdolfIsGod")
                .setConfirmPassword("AdolfIsGod")
                .clickSignUpButton()
                .confirmSignUpText();

        Assert.assertEquals(actualResult, "Hi, Adolf Hitler");
    }
}
