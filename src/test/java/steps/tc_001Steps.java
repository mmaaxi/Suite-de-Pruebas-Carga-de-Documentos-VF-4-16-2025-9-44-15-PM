package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.tc_001Page;

public class tc_001Steps {
    WebDriver driver;
    tc_001Page page;

    public tc_001Steps() {
        this.driver = Hooks.getDriver();
        this.page = new tc_001Page(driver);
    }

    @Given("el usuario ha seleccionado el archivo PDF válido para cargar")
    public void elUsuarioHaSeleccionadoElArchivoPDFValidoParaCargar() {
        page.selectValidPDFFile();
        page.verifyFilePreviewIsDisplayed();
    }

    @When("el usuario hace clic en el botón 'Cargar documento'")
    public void elUsuarioHaceClicEnElBotónCargarDocumento() {
        page.clickUploadButton();
    }

    @Then("el documento debe procesarse y almacenarse correctamente mostrando un mensaje de éxito")
    public void elDocumentoDebeProcesarseYAlmacenarseCorrectamenteMostrandoUnMensajeDeExito() {
        page.verifySuccessfulUploadMessageIsDisplayed();
    }
}