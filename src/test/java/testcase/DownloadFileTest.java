package testcase;

import PageFactory.DownloadPage;
import Utils.ReadInputData;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DownloadFileTest extends BaseSetup {

    private DownloadPage downloadPage;

    ReadInputData readInputData = new ReadInputData();
    public String baseUrl = readInputData.getBaseUrl();
    public String getDownloadLocation = readInputData.getDownloadLocation();

    @BeforeClass
    public void initObject() {
        downloadPage = new DownloadPage(driver);
    }

    @Test(priority = 1)
    public void downloadFile() {
        try {
            driver.get(baseUrl);
            downloadPage.clickOnDownloadFile();
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
