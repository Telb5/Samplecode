package class23;

 public class WebDriver {

        public void startBrowser(){
        System.out.println("Starting the Browser");
        }

        public void openURL()
        {
        System.out.println("Opening a URL");
        }

        public void testLoginPage()
        {
        System.out.println("Checking if Login page works");
        }

        public void closeBrowser()
        {
        System.out.println("Closing the Browser");
        }

}





class Chrome extends WebDriver {

        public void startBrowser()
        {
            System.out.println("Starting Google Chrome");
        }

        public void openURL()
        {
            System.out.println("Opening a url in Google Chrome");
        }

        public void testLoginPage()
        {
            System.out.println("Testing the login page in Chrome");
        }

        public void closeBrowser()
        {
            System.out.println("Closing the Google Chrome");
        }

    }



class Safari extends WebDriver {

        public void startBrowser()
        {
            System.out.println("Starting Safari");
        }

        public void openURL()
        {
            System.out.println("Opening a url in Safari");
        }

        public void testLoginPage()
        {
            System.out.println("Testing the login page in Safari");
        }

        public void closeBrowser()
        {
            System.out.println("Closing the Safari");
        }

}



class Firefox extends WebDriver {

        public void startBrowser()
        {
            System.out.println("Starting Firefox");
        }

        public void openURL()
        {
            System.out.println("Opening a url in Firefox");
        }

        public void testLoginPage()
        {
            System.out.println("Testing the login page in Firefox");
        }

        public void closeBrowser()
        {
            System.out.println("Closing the Firefox");
        }

    }
