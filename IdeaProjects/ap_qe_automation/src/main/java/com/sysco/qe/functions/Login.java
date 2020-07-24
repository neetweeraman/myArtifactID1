package com.sysco.qe.functions;

import com.sysco.qe.common.Constants;
import com.sysco.qe.pages.LoginPage;
import com.sysco.qe.utils.DriverSetUpUtil;
import com.syscolabs.sus.functions.terminal5250.T5250Home;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.syscolabs.functions.TN5250FunctionBase;
/**
 * Created by Rifad on 5/21/18.
 */
public class Login extends T5250Home {

    public static LoginPage loginPage = new LoginPage();


    public static void loadLoginPage() {

        if (Constants.RUN_LOCALLY) {
            DriverSetUpUtil.setToRunLocally();
            DesiredCapabilities capabilities = null;
            loginPage.loadLoginPage(capabilities, Constants.APP_URL);
        } else {
            loginPage.loadLoginPage(DriverSetUpUtil.setToRunRemotely(Constants.APP_OS), Constants.APP_URL);
        }
    }


    public static void quiteDriver() {
        loginPage.quitDriver();
    }

    public static void loginToFtr() {

    }
}
