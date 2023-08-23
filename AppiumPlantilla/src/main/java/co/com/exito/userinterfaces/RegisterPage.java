package co.com.exito.userinterfaces;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {

    public static final Target BUTTON_REGISTER= Target.the("Button Register").locatedForAndroid(MobileBy.xpath("//*[@resource-id='com.exito.appcompania:id/AppCompatButton_registrarse']")).locatedForIOS(By.xpath(""));

    public static final Target INPUT_NAME= Target.the("Input Name").locatedForAndroid(MobileBy.xpath("//*[@text='Nombres']")).locatedForIOS(By.xpath(""));

    public static final Target INPUT_LASTNAME= Target.the("Input LastName").locatedForAndroid(MobileBy.xpath("//*[@text='Apellidos']")).locatedForIOS(By.xpath(""));

    public static final Target NUMBER_DOC= Target.the("Number Doc").locatedForAndroid(MobileBy.xpath("//*[@text='Número de documento']")).locatedForIOS(By.xpath(""));

    public static final Target LIST_BIRTHDATE= Target.the("List Birthdate").locatedForAndroid(MobileBy.xpath("//*[@id='filled_exposed_dropdown_anio_registro']")).locatedForIOS(By.xpath(""));


    public static final Target SELECT_LIST_BIRTHDATE= Target.the("Select List Birthdate").locatedForAndroid(MobileBy.xpath("(//*[@id='txtDropDownLabel'])[1]")).locatedForIOS(By.xpath(""));

    public static final Target LIST_MONTH= Target.the("List Month").locatedForAndroid(MobileBy.xpath("//*[@id='filled_exposed_dropdown_mes_registro']")).locatedForIOS(By.xpath(""));

    public static final Target SELECT_LIST_MONTH= Target.the("Select List Month").locatedForAndroid(MobileBy.xpath("(//*[@id='txtDropDownLabel'])[1]")).locatedForIOS(By.xpath(""));

    public static final Target LIST_DAY = Target.the("List Day").locatedForAndroid(MobileBy.xpath("//*[@id='filled_exposed_dropdown_dia_registro']")).locatedForIOS(By.xpath(""));

    public static final Target SELECT_LIST_DAY = Target.the("Select List Day").locatedForAndroid(MobileBy.xpath("(//*[@id='txtDropDownLabel'])[1]")).locatedForIOS(By.xpath(""));

    public static final Target INPUT_PHONE = Target.the("Input Phone").locatedForAndroid(MobileBy.xpath("//*[@id='TextInputEditText_tel']")).locatedForIOS(By.xpath(""));

    public static final Target INPUT_EMAIL = Target.the("Input Email").locatedForAndroid(MobileBy.xpath("(//*[@class='android.widget.EditText'])[5]")).locatedForIOS(By.xpath(""));

    public static final Target ACCEPT_TERMS = Target.the("Input Terms").locatedForAndroid(MobileBy.xpath("//*[@id='AppCompatTextView_terminos_y_condiciones']")).locatedForIOS(By.xpath(""));

    public static final Target ACCEPT_POLICIES = Target.the("Accept Policies").locatedForAndroid(MobileBy.xpath("//*[@id='AppCompatTextView_politicas_tratamiento']")).locatedForIOS(By.xpath(""));
}
