package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_008Page {
    
    WebDriver driver;

    By loginPageUrl = By.id("login-page-url");
    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");
    By successLoginIndicator = By.id("success-login");
    By uploadField = By.id("upload-field");
    By uploadButton = By.id("upload-button");
    By uploadSuccessIndicator = By.id("upload-success");

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarAPaginaDeLogin() {
        driver.get("http://example.com/login");
    }

    public void iniciarSesion(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }
    
    public boolean verificarIngresoExitoso() {
        return driver.findElement(successLoginIndicator).isDisplayed();
    }

    public void cargarDocumento(String filePath) {
        driver.findElement(uploadField).sendKeys(filePath);
        driver.findElement(uploadButton).click();
    }

    public boolean verificarCargaEnHistorial() {
        return driver.findElement(uploadSuccessIndicator).isDisplayed();
    }
}