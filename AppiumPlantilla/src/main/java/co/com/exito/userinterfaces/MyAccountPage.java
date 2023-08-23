package co.com.exito.userinterfaces;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MyAccountPage {

    public static final Target BUTTON_MY_ACCOUNT = Target.the("Button My Account").locatedForAndroid(MobileBy.xpath("(//*[@id='navigation_bar_item_small_label_view'])[4]")).locatedForIOS(By.xpath(""));

    public static final Target PROFILE = Target.the("Profile").locatedForAndroid(MobileBy.xpath("//*[@id='AppCompatTextView_hola']")).locatedForIOS(By.xpath(""));

    public static final Target CLOSE_ACCOUNT = Target.the("Closed Account").locatedForAndroid(MobileBy.xpath("(//*[@id='appCompatTextView'])[7]")).locatedForIOS(By.xpath(""));

    public static final Target ACEPT_ALERT = Target.the("Acept Alert").locatedForAndroid(MobileBy.xpath("//*[@id='AppCompatTextView_confirmar']")).locatedForIOS(By.xpath(""));


}
