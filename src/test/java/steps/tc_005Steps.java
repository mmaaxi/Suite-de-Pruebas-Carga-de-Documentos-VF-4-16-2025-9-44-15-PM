package steps;

import pages.tc_005Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class tc_005Steps {

    tc_005Page page = new tc_005Page();

    @Given("el usuario está en la página de carga de documentos")
    public void usuarioEnPaginaCargaDocumentos() {
        page.navigateToUploadPage();
    }

    @When("carga un documento PDF de tamaño medio")
    public void cargaDocumentoPDF() {
        page.uploadMediumSizedPDF();
    }

    @Then("el sistema procesa la carga en un tiempo inferior a 5 segundos")
    public void sistemaProcesaCargaEnTiempoEsperado() {
        assertTrue("El tiempo de carga es mayor a 5 segundos", page.isUploadTimeUnderLimit(5));
    }
    
    @Then("el tiempo registrado cumple con el SLA")
    public void tiempoRegistradoCumpleConSLA() {
        assertTrue("El tiempo registrado no cumple con el SLA", page.checkSLALogs());
    }
}