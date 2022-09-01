package day38_Inheritance.browserTask;

public class Opera extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("opening Opera browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing Opera browser");
    }
}
/*
3. Opera extends Browser
					methods:
						openBrowser(): prints "opening opera browser"
						closeBrowser(): prints "closing opera browser"
 */