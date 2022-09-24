package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MiDispositivoPage extends PageObject {

    public static final Target SISTEMAPC_TXT = Target.the("Seleccionamos el systema operativo").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/span[2]"));

    public static final Target VERSI_TXT = Target.the("Seleccionamos la version del sistema operativo").located(By.xpath("//*[@id=\'web-device\']/div[2]/div[2]/div/div[1]/span"));

    public static final Target LENG_TXT = Target.the("Seleccionamos el lenguage del sistema operativo").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span/i"));

    public static final Target DISPOSITIVO_BTN = Target.the("Boton next de mi dispositivo").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));

}
