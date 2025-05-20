package commons;

public class GlobalConstants {
    //System info
    public static final String PROJECT_PATH = System.getProperty("user.dir");
    public static final String OS_NAME = System.getProperty("os.name");

    //Enviroment
    public static final String DEV_USER_URL = "http://dev.techpanda.org/";
    public static final String STAGIN_USER_URL = "http://stagin.techpanda.org/";
    public static final String LIVE_USER_URL = "http://live.techpanda.org/";

    public static final String DEV_ADMIN_URL = "http://dev.techpanda.org/";
    public static final String STAGIN_ADMIN_URL = "http://stagin.techpanda.org/";
    public static final String LIVE_ADMIN_URL = "https://admin-demo.nopcommerce.com/";


    //Wait for
    public static final long SHORT_TIMEOUT = 10;
    public static final long LONG_TIMEOUT = 30;

    //User info
    public static final String ADMIN_TECH_USERNAME = "user01";
    public static final String ADMIN_TECH_PASS = "guru99com";
    public static final String ADMIN_NOP_USERNAME = "admin@yourstore.com";
    public static final String ADMIN_NOP_PASS = "admin";

    //download/upload path
    public static final String UPLOAD_PATH = PROJECT_PATH + "/uploadFiles/";
    public static final String DOWNLOAD_PATH = PROJECT_PATH + "/downloadFiles/";

    //retry case fail
    public static final int RETRY_TIME = 3;

    //Browser log/extension
    public static final String BROWSER_LOG_PATH = PROJECT_PATH + "/browserLogs/";
    public static final String BROWSER_ETENSION_PATH = PROJECT_PATH + "/browserExtensions/";

    //HTML report
    public static final String REPORT_PATH = PROJECT_PATH + "/htmlReportNG/";
    public static final String EXTENT_PATH = PROJECT_PATH + "/htmlExtent/";
    public static final String ALLURE_PATH = PROJECT_PATH + "/htmlAllure/";

    //Data test
    public static  final String DATA_TEST_PATH = PROJECT_PATH + "/dataTest/";
    public static final String ENVIRONMENT_CONFIG_PATH = PROJECT_PATH + "/environmentConfig/";







}
