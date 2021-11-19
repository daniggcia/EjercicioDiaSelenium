package Prueba;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EjercicioDia {

    private WebDriver driver;
    private WebDriverWait wait;

    @Test
    public void testDiaSelenium() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();

        WebDriverManager.chromedriver().version("95").setup();


        options.addArguments("disable-notifications");
        options.addArguments("disable-geolocation");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-gpu");
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        driver.get("https://www.dia.es");
        // presionamos boton de cookies
        driver.findElement(By.xpath("//div/button[@id='onetrust-accept-btn-handler']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Inicio Sesión']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("search")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='price']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='price']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='hamburger-icon']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div/button[@class='btn-close-menu']")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("search")).sendKeys("leche"+ Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//select[@name='sort']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//option[@value='price-asc']")).click();
        Thread.sleep(5000);
        driver.quit();


    }


}
