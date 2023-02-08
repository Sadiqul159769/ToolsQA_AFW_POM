package AFW_pages;

import org.testng.annotations.Test;

public class TestRunner extends Setup{
    AFW_click objectAfw;

    @Test
    public void doLogin(){
        driver.get("https://demoqa.com/");
        objectAfw= new AFW_click(driver);

        objectAfw.do_AFW_click();
        objectAfw.do_newTab();
        objectAfw.do_NewWindow();
        objectAfw.do_NewWindowMessage();
    }
}
