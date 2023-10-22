import org.example.LogIn;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Login_Test {
    WebDriver Driver ;
    LogIn login ;
    @DataProvider(name = "userCredentials")
    public Object[][] getUserCredentials() {
        return new Object[][] {
                {"standard_user", "secret_sauce"},
                {"problem_user", "secret_sauce"},
                {"error_user", "secret_sauce"},
                {"visual_user", "secret_sauce"},
                {"performance_glitch_user", "secret_sauce"}

        };
    }
    @BeforeClass
    public void setUp() {
        Driver = new ChromeDriver();
        Driver.manage().window().maximize();
        login = new LogIn(Driver);
        login.open();
    }
    @Test(dataProvider = "userCredentials")
    public void testLogin(String username, String password) {
        login.enterUserName(username);
        login.enterPassword(password);
        login.LogOut();
    }

  @AfterClass
    public void Exit() {
       Driver.quit();
   }
}



