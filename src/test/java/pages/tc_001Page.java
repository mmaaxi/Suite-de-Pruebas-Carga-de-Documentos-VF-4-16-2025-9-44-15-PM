package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_001Page {
    WebDriver driver;

    By fileInput = By.id("file-upload-input");
    By filePreview = By.id("file-preview");
    By uploadButton = By.id("upload-button");
    By successMessage = By.id("success-message");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void selectValidPDFFile() {
        WebElement fileInputElement = driver.findElement(fileInput);
        fileInputElement.sendKeys("/path/to/valid/file.pdf");
    }

    public void verifyFilePreviewIsDisplayed() {
        WebElement preview = driver.findElement(filePreview);
        if (!preview.isDisplayed()) {
            throw new AssertionError("File preview is not displayed");
        }
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public void verifySuccessfulUploadMessageIsDisplayed() {
        WebElement message = driver.findElement(successMessage);
        if (!message.isDisplayed()) {
            throw new AssertionError("Success message is not displayed");
        }
    }
}