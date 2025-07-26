package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChromeProfileManagerUtility {

    private static final String SOURCE_PROFILE = "C:\\Users\\Diksha\\selenium-profile"; // ✅ your existing profile with AdBlock

    public static WebDriver createChromeWithClonedAdBlockProfile() throws IOException {
        // Timestamped temp profile directory
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String tempProfilePath = "C:\\Users\\Diksha\\selenium-temp-profile-" + timestamp;

        Path source = Paths.get(SOURCE_PROFILE);
        Path target = Paths.get(tempProfilePath);

        if (!Files.exists(source)) {
            throw new IOException("❌ Source Chrome profile not found at: " + SOURCE_PROFILE);
        }

        Files.createDirectories(target);
        copyDirectory(source, target);

        // Launch Chrome with copied profile
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--user-data-dir=" + tempProfilePath);
        options.addArguments("--remote-allow-origins=*");

        return new ChromeDriver(options);
    }

    private static void copyDirectory(Path source, Path target) throws IOException {
        Files.walk(source).forEach(path -> {
            try {
                Path relative = source.relativize(path);
                Path destination = target.resolve(relative);
                if (Files.isDirectory(path)) {
                    Files.createDirectories(destination);
                } else {
                    Files.copy(path, destination, StandardCopyOption.REPLACE_EXISTING);
                }
            } catch (IOException e) {
                System.err.println("❌ Failed copying: " + path);
                e.printStackTrace();
            }
        });
    }
}
