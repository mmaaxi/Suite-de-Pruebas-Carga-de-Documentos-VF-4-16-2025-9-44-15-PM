import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import static org.junit.Assert.assertTrue;

public class tc_004Steps {

    private tc_004Page page;

    public tc_004Steps() {
        page = new tc_004Page();
    }

    @Dado("^el sistema está listo para recibir documentos$")
    public void elSistemaEstaListoParaRecibirDocumentos() {
        page.iniciarSistemaDeRecepcionDeDocumentos();
    }

    @Cuando("^el usuario carga un documento PDF válido$")
    public void elUsuarioCargaUnDocumentoPDFVálido() {
        page.cargarDocumentoPDFValido();
    }

    @Entonces("^el documento es enviado al sistema de gestión documental$")
    public void elDocumentoEsEnviadoAlSistemaDeGestionDocumental() {
        assertTrue(page.verificarEnvioAlSistemaDeGestionDocumental());
    }

    @Entonces("^el sistema registra la integración en sus logs correctamente$")
    public void elSistemaRegistraLaIntegracionEnSusLogsCorrectamente() {
        assertTrue(page.verificarRegistroEnLogsDeIntegracion());
    }
}