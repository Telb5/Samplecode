package class23;

public class WebDriverTester {

    public static void main(String[] args) {

    WebDriver webDriver = new Chrome();
    webDriver.startBrowser();
    webDriver.openURL();
    webDriver.testLoginPage();
    webDriver.closeBrowser();


    // an Array of type parent class can hold th eobj of all child classes
        /*Chrome chrome = new Chrome();
        Firefox firefox = new Firefox();
        Safari safari = new Safari();
         */

        //Webdriver [] browsers = {chrome, firefox, safari};
        WebDriver [] browsers = {new Chrome(), new Firefox(), new Safari()};

        for(WebDriver browser : browsers)
        {
         browser.startBrowser();
         browser.openURL();
         browser.testLoginPage();
         browser.closeBrowser();
        }

    }
}
