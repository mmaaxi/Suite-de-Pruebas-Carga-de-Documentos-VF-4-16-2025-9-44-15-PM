package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_003Page {

    WebDriver driver;

    public tc_003Page() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }

    public void abrirPaginaCargaDocumentos() {
        driver.get("URL_DE_LA_PAGINA_DE_CARGA");
    }

    public void seleccionarDocumentoPDF() {
        WebElement uploadElement = driver.findElement(By.id("file-upload"));
        uploadElement.sendKeys("ruta/completa/al/documento_excedido.pdf");
    }

    public void cargarDocumento() {
        WebElement uploadButton = driver.findElement(By.id("upload-button"));
        uploadButton.click();
    }

    public boolean verificarMensajeErrorTamanoExcedido() {
        WebElement errorMessage = driver.findElement(By.id("error-message"));
        return errorMessage.getText().contains("demasiado grande");
    }

    public void cerrarNavegador() {
        driver.quit();
    }
}