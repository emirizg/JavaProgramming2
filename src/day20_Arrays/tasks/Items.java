package day20_Arrays.tasks;

public class Items {

    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        // 1  find out the first index number of "Gloves"
        int indexNumberGloves=0;
        for (int i = 0; i < items.length; i++) {

            String str=items[i];
            if (str.equals("Gloves")){
                indexNumberGloves=i;
            }

        }

        System.out.println("indexNumberGloves = " + indexNumberGloves);

        // 2 find out if "iPad" is contained in the item list
        boolean isContainedIpad=false;
        for (int i = 0; i < items.length; i++) {

            String str=items[i];
            if (str.equals("iPad")){
                isContainedIpad=true;
            }

        }

        System.out.println("isContainedIpad = " + isContainedIpad);

        // 3 Print the report of each shopping item

        for (int i = 0; i < items.length; i++) {

            String item=items[i];
            double price=prices[i];
            int id=itemIDs[i];

            System.out.println("\t\t\t"+item+"\t\t\t - $"+price+"\t\t\t - #"+id);

        }

    }

}
/*
3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"
        2. find out if "iPad" is contained in the item list
        3. Print the report of each shopping item
            name - price - #ID
 */