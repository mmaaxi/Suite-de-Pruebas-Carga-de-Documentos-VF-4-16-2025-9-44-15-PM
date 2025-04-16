package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_008Page;
import static org.junit.Assert.assertTrue;

public class tc_008Steps {
    
    WebDriver driver = new ChromeDriver();
    tc_008Page page = new tc_008Page(driver);

    @Given("el usuario está en la página de inicio de sesión")
    public void elUsuarioEstaEnLaPaginaDeInicioDeSesion() {
        page.navegarAPaginaDeLogin();
    }

    @When("intenta iniciar sesión con credenciales válidas")
    public void intentaIniciarSesionConCredencialesValidas() {
        page.iniciarSesion("usuarioValido", "contrasenaValida");
    }

    @Then("el usuario ingresa al sistema correctamente")
    public void elUsuarioIngresaAlSistemaCorrectamente() {
        assertTrue(page.verificarIngresoExitoso());
    }

    @Then("después de autenticarse, realiza una carga de documento")
    public void realizaUnaCargaDeDocumento() {
        page.cargarDocumento("ruta/del/documento");
    }

    @Then("la carga se permite y se registra en el historial de usuario")
    public void laCargaSePermiteYSeRegistraEnElHistorialDeUsuario() {
        assertTrue(page.verificarCargaEnHistorial());
    }
}