package StepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import testBase.BaseClass;
import utilities.ExtentReportManager;
import utilities.ScreenshotUtility;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class Hooks extends BaseClass {

    @Before(order = 0)
    public void setupDriver() throws Exception {
        System.out.println("🟢 Setting up driver...");
        setup("windows", "chrome");
    }

    @Before(order = 1)
    public void startExtentReport(Scenario scenario) {
        System.out.println("📄 Starting Extent report for scenario: " + scenario.getName());
        ExtentReportManager.test = ExtentReportManager.getExtent().createTest(scenario.getName());
    }

    @After(order = 1)
    public void logResult(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                String screenshotPath = ScreenshotUtility.captureScreenshot(driver, scenario.getName());
                ExtentReportManager.test
                        .log(Status.FAIL, "❌ Scenario Failed: " + scenario.getName())
                        .addScreenCaptureFromPath(screenshotPath);
            } catch (Exception e) {
                ExtentReportManager.test.log(Status.FAIL, "⚠️ Failed to take screenshot. Error: " + e.getMessage());
            }
        } else {
            ExtentReportManager.test.log(Status.PASS, "✅ Scenario Passed: " + scenario.getName());
        }
    }

    @After(order = 2)
    public void cleanOldTempProfiles() throws IOException {
        System.out.println("🧹 Cleaning up old Chrome temp profiles...");

        Path baseDir = Paths.get("C:\\Users\\Diksha");
        try {
            Files.list(baseDir)
                .filter(path -> path.getFileName().toString().startsWith("selenium-temp-profile-"))
                .forEach(path -> {
                    try {
                        Files.walk(path)
                             .sorted(Comparator.reverseOrder())
                             .map(Path::toFile)
                             .forEach(File::delete);
                        System.out.println("✅ Deleted: " + path);
                    } catch (IOException e) {
                        System.out.println("❌ Failed to delete: " + path);
                        e.printStackTrace();
                    }
                });
        } catch (IOException e) {
            System.out.println("⚠️ No temp profiles found or error accessing directory.");
        }
    }

    @After(order = 0)
    public void tearDownDriver() {
        System.out.println("🔴 Tearing down driver...");
        tearDown();
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("📁 Flushing extent report...");
        ExtentReportManager.flushReport();
    }
}
