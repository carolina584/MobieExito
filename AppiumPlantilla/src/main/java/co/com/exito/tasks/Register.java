package co.com.exito.tasks;

import static co.com.exito.userinterfaces.RegisterPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import javax.naming.Name;

public class Register implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        int email = (int)(Math.random()*99)+1000;
        String emailConvert = ""+ email;

        actor.attemptsTo(Click.on(BUTTON_REGISTER),
                Enter.theValue("Carolina").into(INPUT_NAME),
                Enter.theValue("Munoz").into(INPUT_LASTNAME),
                Enter.theValue("1000089793").into(NUMBER_DOC),
                Click.on(LIST_BIRTHDATE),
                Click.on(SELECT_LIST_BIRTHDATE),
                Click.on(LIST_MONTH),
                Click.on(SELECT_LIST_MONTH),
                Click.on(LIST_DAY),
                Click.on(SELECT_LIST_DAY),
                Enter.theValue("3174588792").into(INPUT_PHONE),
                Enter.theValue(emailConvert + "@gmail.com").into(INPUT_EMAIL),
                WaitUntil.the(ACCEPT_TERMS, isVisible()),
                Click.on(ACCEPT_TERMS),
                WaitUntil.the(ACCEPT_POLICIES, isVisible()),
                Click.on(ACCEPT_POLICIES));
    }

    public static Register inTheExito(){
        return Tasks.instrumented(Register.class);
    }
}
