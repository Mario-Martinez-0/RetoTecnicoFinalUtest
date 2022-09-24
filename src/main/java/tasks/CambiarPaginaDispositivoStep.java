package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import userinterface.DireccionPage;
import userinterface.FormularioPage;
import userinterface.MiDispositivoPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.MiDispositivoPage.*;

public class CambiarPaginaDispositivoStep implements Task {

    private static final Target TXT_OPTION = Target.the("opcion").locatedBy("(//div[@ng-bind-html='device.name | highlight: $select.search'])[2]");
    private static final Target TXT_OPTION1 = Target.the("opcion").locatedBy("(//div[@ng-bind-html='version.name | highlight: $select.search'])[17]");
    private static final Target TXT_OPTION2 = Target.the("opcion").locatedBy("(//div[@ng-bind-html='language.name | highlight: $select.search'])[38]");



    public static CambiarPaginaDispositivoStep cambiarPaginaDispositivoStep() {
        return Tasks.instrumented(CambiarPaginaDispositivoStep.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Click.on(SISTEMAPC_TXT),
                WaitUntil.the(TXT_OPTION, isVisible()),
                JavaScriptClick.on(TXT_OPTION),
                Click.on(VERSI_TXT),
                WaitUntil.the(TXT_OPTION1, isVisible()),
                JavaScriptClick.on(TXT_OPTION1),
                Click.on(LENG_TXT),
                WaitUntil.the(TXT_OPTION2, isVisible()),
                JavaScriptClick.on(TXT_OPTION2),
                Click.on(MiDispositivoPage.DISPOSITIVO_BTN)
        );

    }

}
