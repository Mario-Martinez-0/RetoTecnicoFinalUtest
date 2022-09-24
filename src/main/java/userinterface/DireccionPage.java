package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DireccionPage extends PageObject {


    public static final Target CIUDAD_TXT = Target.the("Click Donde carga la ciudad").located(By.name("city"));

    public static final Target DIRECCION_BTN = Target.the("Boton next de mi direccion").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));


}
