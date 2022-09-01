package day38_Inheritance.browserTask;

public class Chrome extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("opening chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing chrome browser");
    }


}
/*
1. ChromeBrowser
					methods:
						openBrowser(): prints "opening chrome browser"
						closeBrowser():  prints "closing chrome browser"
 */