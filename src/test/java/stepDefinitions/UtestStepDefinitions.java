package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ValidarRegistroStep;
import tasks.*;

import java.util.List;

public class UtestStepDefinitions {

    @Before
    public  void setStage(){
        OnStage.setTheStage((new OnlineCast()));
    }

    @Dado("^que mario ingresar a la pagina Utest\\.com$")
    public void queMarioIngresarALaPaginaUtestCom() throws Exception {
        OnStage.theActorCalled("Mario").wasAbleTo(AbrirAppUtest.abrirApp());
    }


    @Cuando("^damos click en un boton Join Today, diligenciamos el formulario con los datos de usuario y le damos click en el boton Complete Setup$")
    public void damosClickEnUnBotonJoinTodayDiligenciamosElFormularioConLosDatosDeUsuarioYLeDamosClickEnElBotonCompleteSetup(List<String> datos) {
        OnStage.theActorCalled("Mario").attemptsTo(DiligenciarelformularioUtestStep.diligenciarelformularioUtestStep(datos.get(0), datos.get(1), datos.get(2), datos.get(3), datos.get(4), datos.get(5)));
        OnStage.theActorCalled("Mario").attemptsTo(CambiarPaginaDireccionStep.cambiarPaginaDireccionStep());
        OnStage.theActorCalled("Mario").wasAbleTo(CambiarPaginaDispositivoStep.cambiarPaginaDispositivoStep());
        OnStage.theActorCalled("Mario").wasAbleTo(FinalizarRegistroStep.finalizarRegistroStep(datos.get(6), datos.get(7)));

    }

    @Entonces("^El usuario debera ver en la pantallan Welcome to the world's largest community$")
    public void elUsuarioDeberaVerEnLaPantallanWelcomeToTheWorldSLargestCommunity(List<String> datos) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                ValidarRegistroStep.confirmarResultado(datos.get(0))));
    }


}
