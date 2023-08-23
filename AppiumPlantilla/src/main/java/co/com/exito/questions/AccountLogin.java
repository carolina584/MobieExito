package co.com.exito.questions;

import co.com.exito.userinterfaces.MyAccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;

public class AccountLogin implements Question<Boolean> {

    @Step("{0} Show Account Login")
    @Override
    public Boolean answeredBy(Actor actor) {

        return MyAccountPage.PROFILE.resolveFor(actor).isVisible();
    }
    public static AccountLogin inExit() {
        return new AccountLogin();
    }
}
