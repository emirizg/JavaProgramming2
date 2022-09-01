package day38_Inheritance.browserTask;

public class Test {

    public static void main(String[] args) {

        Browser browser = new Browser();
        browser.openBrowser();
        browser.closeBrowser();

        Chrome chrome = new Chrome();
        chrome.openBrowser();
        chrome.closeBrowser();

        Safari safari=new Safari();
        safari.openBrowser();
        safari.closeBrowser();

        Opera opera = new Opera();
        opera.openBrowser();
        opera.closeBrowser();

        Firefox firefox = new Firefox();
        firefox.openBrowser();
        firefox.closeBrowser();



    }

}
