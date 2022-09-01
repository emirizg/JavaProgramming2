package day45_Abstraction.browserTask;

public class DriverObjects {

    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver("Chrome");
        SafariDriver safariDriver = new SafariDriver("Safari");
        EdgeDriver edgeDriver = new EdgeDriver("Edge");
        FireFoxDriver fireFoxDriver = new FireFoxDriver("FireFox");
        OperaDriver operaDriver = new OperaDriver("Opera");

        chromeDriver.get("https://www.google.com");
        chromeDriver.findElement("//div[class='btn']");
        chromeDriver.executeScript("a");
        chromeDriver.getTitle();

        safariDriver.close();

        operaDriver.getBrowserName();
        operaDriver.quit();

        edgeDriver.getBrowserName();

    }

}

/*
7. Create a class named DriverObjects:
				Create objects of each driver

				Test all the methods of each driver
 */