package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_003Page;

public class tc_003Steps {

    tc_003Page page = new tc_003Page();

    @Given("que el usuario ha accedido a la página de carga de documentos")
    public void acceder_pagina_carga_documentos() {
        page.abrirPaginaCargaDocumentos();
    }

    @When("el usuario selecciona un documento PDF que excede el tamaño máximo permitido")
    public void seleccionar_documento_pdf_excedido() {
        page.seleccionarDocumentoPDF();
    }

    @When("hace clic en 'Cargar documento'")
    public void clic_en_cargar_documento() {
        page.cargarDocumento();
    }

    @Then("el sistema muestra un mensaje de error indicando que el tamaño del archivo es demasiado grande")
    public void verificar_mensaje_error_tamano_excedido() {
        Assert.assertTrue("El mensaje de error no se mostró correctamente", page.verificarMensajeErrorTamanoExcedido());
    }
}