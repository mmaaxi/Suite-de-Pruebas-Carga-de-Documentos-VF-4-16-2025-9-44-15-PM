package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_006Page {

    WebDriver driver;
    WebDriverWait wait;

    By mensajeErrorConexion = By.id("mensajeErrorConexion");
    By botonReintentar = By.id("botonReintentar");
    By mensajeExito = By.id("mensajeExito");
    By mensajeDuplicado = By.id("mensajeDuplicado");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void irAPaginaCargaDocumentos() {
        driver.get("http://url-de-la-pagina-de-carga-de-documentos");
    }

    public void simularErrorConexion() {
        // Lógica para simular la desconexión de red
    }

    public boolean mostrarMensajeErrorConexion() {
        WebElement mensajeError = wait.until(ExpectedConditions.visibilityOfElementLocated(mensajeErrorConexion));
        return mensajeError.isDisplayed();
    }

    public boolean verificarOpcionReintentar() {
        WebElement boton = wait.until(ExpectedConditions.elementToBeClickable(botonReintentar));
        return boton.isDisplayed() && boton.isEnabled();
    }

    public void restaurarConexion() {
        // Lógica para restaurar la conexión de red
    }

    public void reintentarCargaDocumento() {
        WebElement boton = wait.until(ExpectedConditions.elementToBeClickable(botonReintentar));
        boton.click();
    }

    public boolean verificarCargaExitosa() {
        WebElement mensajeExitoElement = wait.until(ExpectedConditions.visibilityOfElementLocated(mensajeExito));
        return mensajeExitoElement.isDisplayed();
    }

    public boolean verificarDuplicacionDatos() {
        WebElement mensajeDuplicadoElement = wait.until(ExpectedConditions.visibilityOfElementLocated(mensajeDuplicado));
        return mensajeDuplicadoElement.isDisplayed();
    }
}