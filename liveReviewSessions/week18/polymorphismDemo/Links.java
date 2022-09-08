package week18.polymorphismDemo;

public class Links implements WebElement {

    public void getLinkHref(){
        System.out.println("https://www.java.com");
    }

    @Override
    public void click() {
        System.out.println("Clicking the link");
    }

    @Override
    public void sendKeys(String input) {
        System.out.println("Unsupported Action");
    }

    @Override
    public String getText() {
        System.out.println("Getting Link Text");
        return "Oracle Java";
    }
}
