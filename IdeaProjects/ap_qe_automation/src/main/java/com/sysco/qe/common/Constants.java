package com.sysco.qe.common;

public class Constants {
    public static final String TEST_ENV = System.getProperty("test.env", "QA");
    public static final String TEST_RELEASE = System.getProperty("test.release", "<your release>");
    public static final String TEST_PROJECT = System.getProperty("test.project", "<your project>");
    public static final boolean UPDATE_DASHBOARD = Boolean.parseBoolean(System.getProperty("update.dashboard", "true"));
    public static final boolean RUN_LOCALLY = Boolean.parseBoolean(System.getProperty("run.locally", "true"));
    public static final String APP_URL = System.getProperty("app.url", "https://www.google.com");
    public static final String APP_OS = System.getProperty("app.os", "WIN10");
    public static final String APP_BROWSER = System.getProperty("app.browser", "chrome");


}