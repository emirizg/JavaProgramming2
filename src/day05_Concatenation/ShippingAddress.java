package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        /*
        String name="James";
        String buildingNumber="1123B"; */


        String name="James King",
                buildingNumber="31",
                streetName="Via Arnaldo Vassallo",
                city="Milano",
                state="Lombardia",
                zipCode="22031A";

/*
        String name="James King";
        String buildingNumber="1123B";
        String streetName="Via Arnaldo Vassallo";
        String city="Milano";
        String state="Lombardia";
        String zipCode="22031A";

 */
        //System.out.println(name+"\n"+buildingNumber+" "+streetName+"\n"+city+", "+state+" "+zipCode);

        String address=name+"\n"+buildingNumber+" "+streetName+"\n"+city+", "+state+" "+zipCode;
        System.out.println(address);


    }

}
/*
2. Declare the following variables:
    1. name
    2. buildingNumber
    3. streetName
    4. city
    5. state
    6. zipCode
3. Use concatenation to print the full address
 */