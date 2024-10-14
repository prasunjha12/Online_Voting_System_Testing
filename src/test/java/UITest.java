import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UITest {
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

            // Test each sidebar option
            testDashboard(driver);
            testVotes(driver);
            testVoters(driver);
            testPositions(driver);
            testCandidates(driver);
            testBallotPosition(driver);
//            testElectionTitle(driver);

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

    // Test 'Dashboard' option
    public static void testDashboard(WebDriver driver) throws InterruptedException {
        WebElement dashboardLink = driver.findElement(By.xpath("//a[contains(@href, 'home.php')]"));
        dashboardLink.click();

        // Add delay for visibility
        Thread.sleep(2000);

        // Print confirmation for debugging
        System.out.println("Navigated to Dashboard: " + driver.getTitle());
    }

    // Test 'Votes' option
    public static void testVotes(WebDriver driver) throws InterruptedException {
        WebElement votesLink = driver.findElement(By.xpath("//a[contains(@href, 'votes.php')]"));
        votesLink.click();

        // Add delay for visibility
        Thread.sleep(2000);

        // Print confirmation for debugging
        System.out.println("Navigated to Votes: " + driver.getTitle());
    }

    // Test 'Voters' option
    public static void testVoters(WebDriver driver) throws InterruptedException {
        WebElement votersLink = driver.findElement(By.xpath("//a[contains(@href, 'voters.php')]"));
        votersLink.click();

        // Add delay for visibility
        Thread.sleep(2000);

        // Print confirmation for debugging
        System.out.println("Navigated to Voters: " + driver.getTitle());
    }

    // Test 'Positions' option
    public static void testPositions(WebDriver driver) throws InterruptedException {
        WebElement positionsLink = driver.findElement(By.xpath("//a[contains(@href, 'positions.php')]"));
        positionsLink.click();

        // Add delay for visibility
        Thread.sleep(2000);

        // Print confirmation for debugging
        System.out.println("Navigated to Positions: " + driver.getTitle());
    }

    // Test 'Candidates' option
    public static void testCandidates(WebDriver driver) throws InterruptedException {
        WebElement candidatesLink = driver.findElement(By.xpath("//a[contains(@href, 'candidates.php')]"));
        candidatesLink.click();

        // Add delay for visibility
        Thread.sleep(2000);

        // Print confirmation for debugging
        System.out.println("Navigated to Candidates: " + driver.getTitle());
    }

    // Test 'Ballot Position' option
    public static void testBallotPosition(WebDriver driver) throws InterruptedException {
        WebElement ballotLink = driver.findElement(By.xpath("//a[contains(@href, 'ballot.php')]"));
        ballotLink.click();

        // Add delay for visibility
        Thread.sleep(2000);

        // Print confirmation for debugging
        System.out.println("Navigated to Ballot Position: " + driver.getTitle());
    }
}
