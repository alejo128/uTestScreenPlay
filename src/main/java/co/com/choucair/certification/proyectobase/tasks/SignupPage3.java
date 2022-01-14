package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.uTestSignupPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SignupPage3 implements Task {
    private String strFirstName;

    public static SignupPage3 onThePage() {
        return Tasks.instrumented(SignupPage3.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(uTestSignupPage.JOINTODAY_BUTTON),
                Click.on(uTestSignupPage.strOSBrand),
                Click.on(uTestSignupPage.strOSVersion),
                Click.on(uTestSignupPage.strOSLanguage),
                Click.on(uTestSignupPage.strMovileDevice),
                Click.on(uTestSignupPage.strOSModel),
                Click.on(uTestSignupPage.StrOSMovil),
                Click.on(uTestSignupPage.CONTINUE_BUTTON)
        );
    }
}
