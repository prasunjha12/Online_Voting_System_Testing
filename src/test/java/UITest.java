import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UITest {
    public static void main(String[] args) {
        // Set ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.setCapability("browserVersion", "128"); // Match this with your Chrome version
        options.setCapability("platformName", "Windows"); // Or your OS

        // Initialize WebDriver with options
        WebDriver driver = new ChromeDriver(options);

        // Open a website
        driver.get("https://www.google.com");

        // Perform some actions
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Selenium WebDriver");
        element.submit();

        // Print the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}


//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//public class UITest {
//    public static void main(String[] args) {
//        // Set ChromeOptions
//        ChromeOptions options = new ChromeOptions();
//        options.setCapability("browserVersion", "128"); // Match this with your Chrome version
//        options.setCapability("platformName", "Windows"); // Or your OS
//
//        // Initialize WebDriver with options
//        WebDriver driver = new ChromeDriver(options);
//
//        // Open a website
//        driver.get("https://www.google.com");
//
//        // Perform some actions
//        WebElement element = driver.findElement(By.name("q"));
//        element.sendKeys("Selenium WebDriver");
//        element.submit();
//
//        // Print the title of the page
//        System.out.println("Page title is: " + driver.getTitle());
//
//        // Close the browser
//        driver.quit();
//    }
//}
