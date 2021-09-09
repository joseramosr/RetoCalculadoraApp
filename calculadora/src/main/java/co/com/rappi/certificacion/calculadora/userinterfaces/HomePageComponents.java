package co.com.rappi.certificacion.calculadora.userinterfaces;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class HomePageComponents {

    public static final Target BTN_DEL = Target.the("Delete button").located(MobileBy.AccessibilityId("delete"));
    public static final Target BTN_NUMBER = Target.the("Number button").locatedBy("//android.widget.Button[@text='{0}']");
    public static final Target BTN_PLUS = Target.the("Plus button").located(MobileBy.AccessibilityId("plus"));
    public static final Target BTN_MINUS = Target.the("Minus button").located(MobileBy.AccessibilityId("minus"));
    public static final Target BTN_MULTIPLY = Target.the("Multiply button").located(MobileBy.AccessibilityId("multiply"));
    public static final Target BTN_DIVIDE = Target.the("Divide button").located(MobileBy.AccessibilityId("divide"));
    public static final Target BTN_EQUALS = Target.the("Equals button").located(MobileBy.AccessibilityId("equals"));
    public static final Target TXT_RESULT = Target.the("Result label").located(By.id("result"));

    private HomePageComponents(){}
}
