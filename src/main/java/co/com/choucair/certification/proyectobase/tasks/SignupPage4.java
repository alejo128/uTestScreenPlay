package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.uTestSignupPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SignupPage4 implements Task {
    private String strPassword;
    private String strConfirmPassword;


    public static SignupPage4 onThePage(String strPassword, String strConfirmPassword) {
        return Tasks.instrumented(SignupPage4.class,strPassword, strConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strPassword).into(uTestSignupPage.INPUT_PASSWORD),
                Enter.theValue((strConfirmPassword)).into(uTestSignupPage.INPUT_CONFIRMPASSWORD),
                Click.on(uTestSignupPage.INPUT_PRIVACYSETTING),
                Click.on(uTestSignupPage.INPUT_TERMOFUSE),
                Click.on(uTestSignupPage.CONTINUE_BUTTON)
        );
    }
}
