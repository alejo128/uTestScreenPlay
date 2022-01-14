package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.uTestData;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.SignupPage1;
import co.com.choucair.certification.proyectobase.tasks.SignupPage2;
import co.com.choucair.certification.proyectobase.tasks.SignupPage4;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class uTestStepDefinitions {


    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Alejandro Diaz wants to sign up in the uTest webpage, he press the join today button$")
    public void thanAlejandroDiazWantsToSignUpInTheuTestWebpageHePressTheJoinTodayButton(List<uTestData> uTestData) throws Exception {
        OnStage.theActorCalled("Alejandro Diaz").wasAbleTo(OpenUp.thePage(), SignupPage1.
                onThePage(uTestData.get(0).getStrFirstName(),uTestData.get(0).getStrLastName(),uTestData.get(0).getStrEmail()));
    }

    @When("^he fill the information for the step 2$")
    public void heFillTheInformationForTheStep2(List<uTestData> uTestData) throws Exception {
        OnStage.theActorCalled("Alejandro Diaz").wasAbleTo(OpenUp.thePage(), SignupPage2.
                onThePage(uTestData.get(0).getStrCity(),uTestData.get(0).getStrZip()));
    }

    @Then("^he finish the signup picking the password$")
    public void heFinishTheSignupPickingThePassword(List<uTestData> uTestData) throws Exception {
        OnStage.theActorCalled("Alejandro Diaz").wasAbleTo(OpenUp.thePage(), SignupPage4.
                onThePage(uTestData.get(0).getStrPassword(),uTestData.get(0).getStrConfirmPassword()));
    }
}
