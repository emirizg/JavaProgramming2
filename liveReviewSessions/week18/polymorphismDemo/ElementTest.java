package week18.polymorphismDemo;

public class ElementTest {

    public static void main(String[] args) {

        Links links = new Links();

        links.click();
        System.out.println("links.getText() = " + links.getText());
        links.sendKeys("EU09");

        System.out.println("------------------------------------------------------");

        WebElementUtility.clickElement(links);

        System.out.println("------------------------------------------------------");

        InputFields inputFieldsOne = new InputFields();
        WebElementUtility.clickElement(inputFieldsOne);

        System.out.println("------------------------------------------------------");

        WebElement linksPoly = new Links();

        //  In order to reach a method which is NOT in the object reference type class/interface,
        //  you have to CAST your reference to child class type
        ((Links)linksPoly).getLinkHref();

    }

}
