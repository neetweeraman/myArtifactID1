package com.sysco.qe.pages;

import com.syscolab.qe.core.ui.SyscoLabUI;
import com.syscolab.qe.core.ui.web.SyscoLabWUI;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;

/**
 * Created by Rifad on 5/21/18.
 */
public class LoginPage {
    protected static SyscoLabUI syscoLabUi;
    private By txtGoogleSearch = By.id("lst-ib");


    public static void loadLoginPage(Capabilities capabilities, String url) {
        syscoLabUi = new SyscoLabWUI(capabilities);
        syscoLabUi.navigateTo(url);
        syscoLabUi.driver.manage().window().maximize();
    }

    public void quitDriver() {
        if (syscoLabUi != null) {
            syscoLabUi.quit();
        }
    }


    public void enterText(String searchString) {
        syscoLabUi.sendKeys(txtGoogleSearch, searchString);
    }

}
