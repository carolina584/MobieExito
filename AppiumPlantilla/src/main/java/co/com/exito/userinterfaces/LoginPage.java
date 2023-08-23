package co.com.exito.userinterfaces;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {


    public static final Target BUTTON_GET_INTO = Target.the("Button Get Into").locatedForAndroid(MobileBy.xpath("//*[@id='AppCompatButton_ingresar']")).locatedForIOS(By.xpath(""));
    public static final Target INPUT_EMAIL = Target.the("Input Email").locatedForAndroid(MobileBy.xpath("//*[@id='TextInputEditText_email']")).locatedForIOS(By.xpath(""));
    public static final Target INPUT_PASSWORD = Target.the("Input Password").locatedForAndroid(MobileBy.xpath("(//*[@class='android.widget.EditText'])[2]")).locatedForIOS(By.xpath(""));

    public static final Target BUTTON_LOGIN = Target.the("Button Login").locatedForAndroid(MobileBy.xpath("//*[@id='AppCompatButton_ingresar']")).locatedForIOS(By.xpath(""));

}
