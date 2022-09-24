package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UltimoPasoPage extends PageObject  {

    public static final Target TXT_CONTRA = Target.the("Contrasena").located(By.id("password"));

    public static final Target TXT_CONTRAS = Target.the("Confirmar Contrasena").located(By.id("confirmPassword"));

    public static final Target CH_ACEPTA = Target.the("Aceptar terminos").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target CH_ACEPTAR = Target.the("Aceptar").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target BTN_COMPLETAR = Target.the("Boton fin de registro").located(By.id("laddaBtn"));

    public static final Target RESULTA = Target.the("Resultado Final").located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));



}
