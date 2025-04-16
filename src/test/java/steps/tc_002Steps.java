package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.TC_002Page;

public class TC_002Steps {

    WebDriver driver = new ChromeDriver();
    TC_002Page page = new TC_002Page(driver);

    @Given("que un usuario intenta cargar un archivo")
    public void que_un_usuario_intenta_cargar_un_archivo() {
        driver.get("http://example.com/upload");
    }

    @When("selecciona un archivo con formato .exe")
    public void selecciona_un_archivo_con_formato_exe() {
        page.uploadFile("path/to/invalidfile.exe");
    }

    @Then("el sistema debe rechazar el archivo y mostrar un mensaje de error")
    public void el_sistema_debe_rechazar_el_archivo_y_mostrar_un_mensaje_de_error() {
        Assert.assertTrue(page.isErrorMessageDisplayed());
    }

    @Then("no se debe permitir la carga del archivo")
    public void no_se_debe_permitir_la_carga_del_archivo() {
        Assert.assertFalse(page.isUploadSuccessful());
        driver.quit();
    }
}