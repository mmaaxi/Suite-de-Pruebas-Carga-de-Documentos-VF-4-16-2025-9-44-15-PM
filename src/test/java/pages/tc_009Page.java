package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_009Page {

    WebDriver driver;

    By uploadButton = By.id("upload-btn");
    By notificationBell = By.id("notification-bell");
    By notificationMessage = By.xpath("//div[@class='notification-message']");

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("https://example.com/upload");
    }

    public void uploadValidPDF() {
        WebElement uploadBtn = driver.findElement(uploadButton);
        uploadBtn.sendKeys("/path/to/valid/document.pdf");
    }

    public boolean isUploadSuccessNotificationDisplayed() {
        return driver.findElement(notificationBell).isDisplayed();
    }

    public void checkNotifications() {
        driver.findElement(notificationBell).click();
    }

    public boolean isConfirmationMessageDisplayed() {
        return driver.findElement(notificationMessage).getText().contains("Carga exitosa");
    }
}