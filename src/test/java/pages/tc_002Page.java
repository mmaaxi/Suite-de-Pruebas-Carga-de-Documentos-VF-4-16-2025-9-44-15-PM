package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_002Page {

    WebDriver driver;

    By uploadInput = By.id("file-upload");
    By uploadButton = By.id("upload-button");
    By errorMessage = By.id("error-message");

    public TC_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile(String filePath) {
        driver.findElement(uploadInput).sendKeys(filePath);
        driver.findElement(uploadButton).click();
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }

    public boolean isUploadSuccessful() {
        // Additional logic to verify upload success
        return false;
    }
}