package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.FormularioPage;
import userinterface.UltimoPasoPage;

public class FinalizarRegistroStep implements Task {

    private String contrasena, contrasenas;

    public FinalizarRegistroStep (String contrasena, String contrasenas) {
        this.contrasena = contrasena;
        this.contrasenas = contrasenas;
    }

    public static FinalizarRegistroStep finalizarRegistroStep(String contrasena, String contrasenas) {
        return Tasks.instrumented(FinalizarRegistroStep.class, contrasena, contrasenas);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(contrasena).into(UltimoPasoPage.TXT_CONTRA),
                Enter.theValue(contrasenas).into(UltimoPasoPage.TXT_CONTRAS),
                Click.on(UltimoPasoPage.CH_ACEPTA),
                Click.on(UltimoPasoPage.CH_ACEPTAR),
                Click.on(UltimoPasoPage.BTN_COMPLETAR)
        );
    }

}
