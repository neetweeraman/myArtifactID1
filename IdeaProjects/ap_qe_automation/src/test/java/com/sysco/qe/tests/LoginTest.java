package com.sysco.qe.tests;


import com.sysco.qe.data.LoginData;
import com.sysco.qe.functions.Login;
import com.sysco.qe.utils.ExcelUtil;
import com.sysco.qe.utils.TestBase;
import com.syscolabs.sus.functions.terminal5250.StartApplication;
import com.syscolabs.sus.functions.terminal5250.T5250Home;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LoginTest extends TestBase {

    @BeforeClass
    public void init(ITestContext iTestContext) {
        iTestContext.setAttribute("feature", "Login - ValidLogin");
    }

    @Test
    public void testLogin() throws Exception {
        LoginData loginData = ExcelUtil.getLoginData("$as238l");
        //Login to sus
//        StartApplication.loginToSUS(loginData.box, loginData.box, loginData.userName, loginData.password);
        StartApplication.loginToSUS("as240d", "10.240.36.31", "IQMXW000", "Msysco@5");
        T5250Home.navigateToQuickAccessPage();
        StartApplication.disconnectBox();

        // UI Automation  sample
//        Login.loadLoginPage();
//        Login.quiteDriver();

    }
}