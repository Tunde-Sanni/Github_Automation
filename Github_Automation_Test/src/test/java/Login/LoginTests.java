package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    //import selenium Drivers
    private WebDriver driver;
    //import ChromeDriver
    public void setUp()throws InterruptedException{
       System.setProperty ("webdriver.chrome.driver","resources/chromedriver.exe");
       driver =new ChromeDriver ();

       //input project URL = github URL

        driver.get("https://github.com/login");
        //waiting globally
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //maximize the window
        driver.manage().window().maximize();

        //get project title
        System.out.println(driver.getTitle());

        //Locate username fields
        driver.findElement(By.id("login_field")).sendKeys("tundesanni023@gmail.com");

        //locate password fields
        driver.findElement(By.id("password")).sendKeys("digitalpassion1");

        // Click on the login button
        driver.findElement(By.xpath ("//*[@id=\"login\"]/form/div[4]/input[9]")).click();

        Thread.sleep (7000);
        //close the browser after test
        driver.quit();
    }

    //initiate the test run command

    public static void main(String args[]) throws InterruptedException  {
        LoginTests test = new LoginTests();
        test.setUp();
    }
}
