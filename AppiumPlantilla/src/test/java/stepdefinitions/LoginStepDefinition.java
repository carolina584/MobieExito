package stepdefinitions;

import co.com.exito.questions.AccountLogin;
import co.com.exito.tasks.Login;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoginStepDefinition {

    @Before
    public void previousConfigurations(Scenario scenario) {
        setTheStage(new OnlineCast());
    }

    @Given("The user wants to log in")
    public void theUserWantsToLogIn() {
        theActorCalled("user");
    }

    @When("enter the credentials")
    public void enterTheCredentials() {
        theActorInTheSpotlight().attemptsTo(Login.inTheExito());
    }

    @Then("validate profile")
    public void validateProfile() {
        theActorInTheSpotlight().should(seeThat(AccountLogin.inExit()));
    }
}
