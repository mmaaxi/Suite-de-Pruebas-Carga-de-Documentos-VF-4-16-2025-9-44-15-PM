package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
import pages.tc_009Page;

public class tc_009Steps {

    tc_009Page page = new tc_009Page();

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_está_en_la_página_de_carga_de_documentos() {
        page.navigateToUploadPage();
    }

    @When("el usuario carga un documento PDF válido")
    public void el_usuario_carga_un_documento_PDF_válido() {
        page.uploadValidPDF();
    }

    @Then("el sistema envía una notificación de carga exitosa al usuario")
    public void el_sistema_envía_una_notificación_de_carga_exitosa_al_usuario() {
        assertTrue(page.isUploadSuccessNotificationDisplayed());
    }

    @When("el usuario revisa la bandeja de notificaciones")
    public void el_usuario_revisa_la_bandeja_de_notificaciones() {
        page.checkNotifications();
    }

    @Then("se muestra el mensaje de confirmación de la carga")
    public void se_muestra_el_mensaje_de_confirmación_de_la_carga() {
        assertTrue(page.isConfirmationMessageDisplayed());
    }
}