package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.uTestSignupPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SignupPage1 implements Task {
    private String strFirstName;
    private String strLastName;
    private String strEmail;

    public static SignupPage1 onThePage(String strFirstName, String strLastName, String strEmail) {
        return Tasks.instrumented(SignupPage1.class,strFirstName,strLastName, strEmail);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(uTestSignupPage.JOINTODAY_BUTTON),
                Enter.theValue(strFirstName).into(uTestSignupPage.INPUT_FIRSTNAME),
                Enter.theValue((strLastName)).into(uTestSignupPage.INPUT_LASTNAME),
                Enter.theValue((strEmail)).into(uTestSignupPage.INPUT_EMAIL),
                Click.on(uTestSignupPage.strBirthMonth),
                Click.on(uTestSignupPage.strBirthDay),
                Click.on(uTestSignupPage.strBirthYear),
                Click.on(uTestSignupPage.CONTINUE_BUTTON)
        );
    }
}
