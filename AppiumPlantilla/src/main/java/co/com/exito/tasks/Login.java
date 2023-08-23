package co.com.exito.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.exito.userinterfaces.LoginPage.*;
import static co.com.exito.userinterfaces.MyAccountPage.*;

public class Login implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BUTTON_GET_INTO),
                Enter.theValue("yiina190@gmail.com").into(INPUT_EMAIL),
                Enter.theValue("Carolina1995.").into(INPUT_PASSWORD),
                Click.on(BUTTON_LOGIN),
                Click.on(BUTTON_MY_ACCOUNT));
    }
    public static Login inTheExito(){
        return Tasks.instrumented(Login.class);
    }
 }

