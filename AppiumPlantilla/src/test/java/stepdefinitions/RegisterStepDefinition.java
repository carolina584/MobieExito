package stepdefinitions;

import co.com.exito.tasks.Register;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RegisterStepDefinition {

    @Before
    public void previousConfigurations(Scenario scenario) {
        setTheStage(new OnlineCast());
    }

    @Given("the user wants to log in")
    public void theUserWantsToLogIn() {

        theActorCalled("user");
    }

    @When("user register in Exito app")
    public void userRegisterInExitoApp() {

        theActorInTheSpotlight().attemptsTo(Register.inTheExito());
    }
}
