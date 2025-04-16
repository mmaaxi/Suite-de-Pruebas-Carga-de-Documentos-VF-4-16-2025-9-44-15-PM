package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_007Page {

    WebDriver driver;

    private By uploadButton = By.id("uploadButton");
    private By documentLink = By.id("documentLink");
    private By accessDeniedMessage = By.id("accessDeniedMessage");

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void loginAsAuthorizedUser() {
        // Implementar lógica para iniciar sesión como usuario autorizado
    }

    public void loginAsUnauthorizedUser() {
        // Implementar lógica para iniciar sesión como usuario no autorizado
    }

    public void uploadDocument() {
        driver.findElement(uploadButton).click();
        // Implementar lógica para cargar un documento PDF
    }

    public boolean canAccessDocument() {
        return driver.findElement(documentLink).isDisplayed();
    }

    public void attemptAccessDocument() {
        driver.findElement(documentLink).click();
        // Implementar lógica para intentar acceder al documento
    }

    public boolean isAccessDeniedDisplayed() {
        return driver.findElement(accessDeniedMessage).isDisplayed();
    }
}