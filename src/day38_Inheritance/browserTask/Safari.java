package day38_Inheritance.browserTask;

public class Safari extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("opening Safari browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing Safari browser");
    }

}
/*
4. Safari extends Browser
					methods:
						openBrowser(): prints "opening safari browser"
						closeBrowser(): prints "closing safari browser"
 */