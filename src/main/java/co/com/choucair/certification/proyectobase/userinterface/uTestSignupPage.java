package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class uTestSignupPage extends PageObject {
    public static final Target JOINTODAY_BUTTON = Target.the("Button that shows us the form to sign up")
            .located(By.xpath("//button[contains(@class, 'unauthenticated-nav.bar__sign-up')]"));
    public static final Target INPUT_FIRSTNAME = Target.the("where do we write the name")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("where do we write the lastname")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write email")
            .located(By.id("email"));
    public static final Target INPUT_CITY = Target.the("where do we write the city")
            .located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("where do we write the zip code")
            .located(By.id("zip"));
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRMPASSWORD = Target.the("where do we confirm the password")
            .located(By.id("confirmPassword"));
    public static final Target INPUT_PRIVACYSETTING = Target.the("where do we check the privacy setting")
            .located(By.id("privacySetting"));
    public static final Target INPUT_TERMOFUSE = Target.the("where do we check the terms of use")
            .located(By.id("termOfUse"));
    public static final Target CONTINUE_BUTTON = Target.the("button to continue to the next page sign up")
            .located(By.xpath("//button[contains(@class, 'btn btn-blue')]"));
    public static Target strBirthMonth;
    public static Target strBirthDay;
    public static Target strBirthYear;
    public static Target strCountry;
    public static Target strCity;
    public static Target strZip;
    public static Target strOSBrand;
    public static Target strOSVersion;
    public static Target strOSLanguage;
    public static Target strMovileDevice;
    public static Target strOSModel;
    public static Target StrOSMovil;

}
