package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioPage extends PageObject {

    public static final Target JOINTODAY_BTN = Target.the("Boton que muestra el formularo de registro").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));

    public static final Target NOMBRE_TXT = Target.the("Donde escribimos el nombre").located(By.name("firstName"));

    public static final Target APELLIDO_TXT = Target.the("Donde escribimos el apellido").located(By.name("lastName"));

    public static final Target CORREO_TXT = Target.the("Donde escribimos el correo").located(By.name("email"));

    public static final Target MES_TXT = Target.the("Donde elegimos el mes de nacimiento").located(By.name("birthMonth"));

    public static final Target DIA_TXT = Target.the("Donde elegimos el dia de nacimiento").located(By.name("birthDay"));

    public static final Target ANO_TXT = Target.the("Donde elegimos el anho de nacimiento").located(By.name("birthYear"));

    public static final Target NEXT_BTN = Target.the("Boton segueinte del formulario").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));


}
