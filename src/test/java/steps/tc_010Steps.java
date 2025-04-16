package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;
import pages.tc_010Page;

public class tc_010Steps {
    WebDriver driver;
    tc_010Page page;

    @Given("el usuario ha iniciado la carga de un documento")
    public void iniciarCargaDocumento() {
        page = new tc_010Page(driver);
        page.iniciarCarga();
    }

    @When("la red se desconecta")
    public void desconectarRed() {
        page.desconectarRed();
    }

    @Then("el sistema detiene la carga y muestra un mensaje de error por interrupción de conexión")
    public void verificarInterrupcionCarga() {
        assertTrue(page.seMuestraMensajeErrorConexion());
    }

    @When("la conexión se restaura")
    public void restaurarConexion() {
        page.restaurarConexion();
    }

    @When("el usuario intenta reanudar la carga")
    public void reanudarCarga() {
        page.reanudarCarga();
    }

    @Then("el sistema permite reintentar la carga sin duplicar el proceso anterior")
    public void verificarReanudacionSinRepeticion() {
        assertTrue(page.cargaReanudadaSinDuplicacion());
    }
}