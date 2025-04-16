package steps;

import pages.tc_007Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertTrue;

public class tc_007Steps {

    tc_007Page page = new tc_007Page();

    @Given("^el usuario autorizado ha iniciado sesión en el sistema$")
    public void usuarioAutorizadoIniciaSesion() {
        page.loginAsAuthorizedUser();
    }

    @When("^se carga un documento PDF en el sistema$")
    public void cargarDocumento() {
        page.uploadDocument();
    }

    @Then("^el usuario puede acceder al documento$")
    public void verificarAccesoDocumentoAutorizado() {
        assertTrue("El usuario autorizado no puede acceder al documento", page.canAccessDocument());
    }

    @Given("^el usuario no autorizado ha iniciado sesión en el sistema$")
    public void usuarioNoAutorizadoIniciaSesion() {
        page.loginAsUnauthorizedUser();
    }

    @When("^intenta acceder al documento$")
    public void intentarAccederDocumento() {
        page.attemptAccessDocument();
    }

    @Then("^el sistema muestra un mensaje de 'Acceso denegado'$")
    public void verificarAccesoDenegado() {
        assertTrue("El usuario no autorizado pudo acceder al documento", page.isAccessDeniedDisplayed());
    }
}