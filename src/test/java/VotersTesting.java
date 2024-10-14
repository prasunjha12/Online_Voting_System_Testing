import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VotersTesting {

    public static void main(String[] args) {
        // Set ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.setCapability("browserVersion", "128");
        options.setCapability("platformName", "Windows");

        // Initialize WebDriver with options
        WebDriver driver = new ChromeDriver(options);

        try {
            // Log in to the system
            login(driver);

            // Test adding a voter
            addVoter(driver);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }

    // Log in to the system
    public static void login(WebDriver driver) throws InterruptedException {
        // Open the admin login page
        driver.get("http://localhost/voting%20management%20system/votesystem/votesystem/admin/index.php");

        // Add delay for visibility
        Thread.sleep(2000);

        // Enter username and password
        WebElement username = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        username.sendKeys("crce");
        password.sendKeys("password");

        // Add delay for visibility
        Thread.sleep(2000);

        // Click the login button
        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();

        // Wait for the dashboard to load
        Thread.sleep(3000);
    }

    // Test adding a voter
    public static void addVoter(WebDriver driver) throws InterruptedException {
        // Navigate to the Voters section
        WebElement votersLink = driver.findElement(By.xpath("//a[contains(@href, 'voters.php')]"));
        votersLink.click();

        // Add delay for visibility
        Thread.sleep(2000);

        // Click the 'New' button to open the modal
        WebElement newVoterButton = driver.findElement(By.xpath("//a[contains(@href, '#addnew') and @data-toggle='modal']"));
        newVoterButton.click();

        // Add delay for visibility
        Thread.sleep(2000);

        // Fill in voter details
        WebElement firstNameInput = driver.findElement(By.name("firstname")); // Change the name attribute based on the actual input name
        WebElement lastNameInput = driver.findElement(By.name("lastname")); // Change the name attribute based on the actual input name
        WebElement passwordInput = driver.findElement(By.name("password")); // Change the name attribute based on the actual input name

        firstNameInput.sendKeys("Rajiv");
        lastNameInput.sendKeys("Sahni");
        passwordInput.sendKeys("12345");

        // Add delay for visibility
        Thread.sleep(2000);

        // Click the Save button
        WebElement saveButton = driver.findElement(By.xpath("//button[contains(text(), 'Save')]")); // Change the button text based on the actual Save button text
        saveButton.click();

        // Wait for a while to observe the result
        Thread.sleep(5000);

        // Optional: You can add verification logic here to check if the voter was added successfully

        // Close the modal (if necessary, depends on your implementation)
        WebElement closeModalButton = driver.findElement(By.xpath("//button[contains(@class, 'close')]")); // Adjust if there's a specific close button
        closeModalButton.click();
    }
}
