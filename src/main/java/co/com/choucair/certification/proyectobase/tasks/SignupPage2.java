package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.uTestSignupPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SignupPage2 implements Task {
    private String strCity;
    private String strZip;

    public static SignupPage2 onThePage(String strFirstName, String strCity, String strZip) {
        return Tasks.instrumented(SignupPage2.class,strCity,strZip);
    }

    public static Performable onThePage(String strCity, String strZip) {
        return null;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(uTestSignupPage.JOINTODAY_BUTTON),
                Enter.theValue(strCity).into(uTestSignupPage.INPUT_CITY),
                Enter.theValue((strZip)).into(uTestSignupPage.INPUT_ZIP),
                Click.on(uTestSignupPage.strCountry),
                Click.on(uTestSignupPage.CONTINUE_BUTTON)
        );
    }
}
