package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testcase.DownloadFileTest;

public class DownloadPage extends DownloadFileTest {

    private final WebDriver driver;

    public DownloadPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//*[@id='table-files']/tbody/tr[2]/td[5]/a[1]")
    @CacheLookup
    WebElement downloadDocFile;

    public void clickOnDownloadFile() {
        downloadDocFile.click();
    }


}
