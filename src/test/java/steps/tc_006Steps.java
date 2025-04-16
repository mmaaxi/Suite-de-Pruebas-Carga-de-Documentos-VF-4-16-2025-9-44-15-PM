package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_006Page;

public class tc_006Steps {

    tc_006Page page = new tc_006Page();

    @Given("que estoy en la página de carga de documentos")
    public void abrirPaginaCargaDocumentos() {
        page.irAPaginaCargaDocumentos();
    }

    @When("simulo un error en la conexión durante la carga del documento")
    public void simularErrorConexion() {
        page.simularErrorConexion();
    }

    @Then("el sistema muestra mensaje de error de conexión y permite reintentar la acción")
    public void verificarMensajeErrorYReintentar() {
        Assert.assertTrue(page.mostrarMensajeErrorConexion());
        Assert.assertTrue(page.verificarOpcionReintentar());
    }

    @Given("que estoy en la página de carga de documentos con conexión restaurada")
    public void abrirPaginaCargaDocumentosConRed() {
        page.irAPaginaCargaDocumentos();
        page.restaurarConexion();
    }

    @When("reintento la carga del documento")
    public void reintentarCarga() {
        page.reintentarCargaDocumento();
    }

    @Then("el documento se carga exitosamente sin duplicación de datos")
    public void verificarCargaExitosa() {
        Assert.assertTrue(page.verificarCargaExitosa());
        Assert.assertFalse(page.verificarDuplicacionDatos());
    }
}