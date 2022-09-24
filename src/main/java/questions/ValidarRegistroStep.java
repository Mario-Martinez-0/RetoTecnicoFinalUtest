package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.UltimoPasoPage;

public class ValidarRegistroStep implements Question<Boolean> {

    private String respuesta;

    public ValidarRegistroStep(String respuesta) {
        this.respuesta = respuesta;
    }

    public static ValidarRegistroStep confirmarResultado (String respuesta) {
        return new ValidarRegistroStep(respuesta);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean resul;
        String resultado = Text.of(UltimoPasoPage.RESULTA).viewedBy(actor).asString();
            if(respuesta.equals(resultado)){
                resul = true;
            }else{
                resul = false;
            }
            return resul;
    }

}
