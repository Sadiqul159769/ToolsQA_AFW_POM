package AFW_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Setup {
    WebDriver driver;
    @BeforeTest
    public void baseSetup(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://store.steampowered.com/");
        //driver.get("https://demoqa.com/");
    }
//    @AfterTest
//    public void quitSetup(){
//        driver.close();
//    }
}
