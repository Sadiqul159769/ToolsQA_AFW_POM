package AFW_pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AFW_click {
    WebDriver driver;
    @FindBy(xpath = "//div[@class='card mt-4 top-card'][contains(.,'Alerts, Frame & Windows')]")
    WebElement alartClick;
    @FindBy(xpath = "//span[contains(.,'Browser Windows')]")
    WebElement browserClick ;

    //DO_newTab
    @FindBy(xpath = "//button[@type='button'][contains(.,'New Tab')]")
    WebElement newTab;
    //Do_newWindow
    @FindBy(id = "windowButton")
    WebElement newWindow;
    //newWindowMessage
    @FindBy(id="messageWindowButton")
    WebElement newWindowMessage;


    public AFW_click(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    public void do_AFW_click(){
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,350)", "");
        alartClick.click();
        browserClick.click();
    }

    public void do_newTab(){
        newTab.click();
    }
    public void do_NewWindow(){
        newWindow.click();
    }

    public void do_NewWindowMessage(){
        newWindowMessage.click();
    }

}
