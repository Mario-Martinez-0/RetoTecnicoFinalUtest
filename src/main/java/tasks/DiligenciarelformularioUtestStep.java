package tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.FormularioPage;

public class DiligenciarelformularioUtestStep implements Task {

    private String nombre, apellido, correo, mes, dia, ano;

    public DiligenciarelformularioUtestStep(String nombre, String apellido, String correo, String mes, String dia, String ano) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }

    public static DiligenciarelformularioUtestStep diligenciarelformularioUtestStep(String nombre, String apellido, String correo, String mes, String dia, String ano) {
        return Tasks.instrumented(DiligenciarelformularioUtestStep.class, nombre,apellido, correo, mes, dia, ano);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FormularioPage.JOINTODAY_BTN),
                Enter.theValue(nombre).into(FormularioPage.NOMBRE_TXT),
                Enter.theValue(apellido).into(FormularioPage.APELLIDO_TXT),
                Enter.theValue(correo).into(FormularioPage.CORREO_TXT));
                actor.attemptsTo(SelectFromOptions.byVisibleText(mes).from(FormularioPage.MES_TXT));
                actor.attemptsTo(SelectFromOptions.byVisibleText(dia).from(FormularioPage.DIA_TXT));
                actor.attemptsTo(SelectFromOptions.byVisibleText(ano).from(FormularioPage.ANO_TXT),
                Click.on(FormularioPage.NEXT_BTN)
        );
    }

}
