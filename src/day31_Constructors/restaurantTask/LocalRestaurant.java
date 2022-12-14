package day31_Constructors.restaurantTask;

public class LocalRestaurant {

    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("Emir", "Milano", 5);

        Server[] servers = {
                new Server("Yasin", 29, 15, false),
                new Server("Sabryne", 28, 10, false),
                new Server("Karim", 27, 12, false),
                new Server("Aysel", 26, 20, true),
                new Server("Kamal", 25, 23, true),
        };

        Chef[] chefs = {
                new Chef("Halim", 23, 35, true),
                new Chef("Habib", 22, 26, false),
                new Chef("Bojan", 21, 27, true),
        };

        restaurant1.hireChef(chefs);
        restaurant1.hireServer(servers);

        System.out.println(restaurant1);

        Chef chef1=new Chef("Emir",21,35,true);
        Chef chef2=new Chef("Ahmet",21,35,false);
        System.out.println(chef1);
        System.out.println(chef2);

    }

}
/*
6.4. Create a class LocalRestaurant that has a main method with the following:
	       - Make a Restaurant object
	       - Create an array of servers with their information set.
	            Add those initial servers to the ArrayList of Servers in the Restaurant object
	       - Create an array of chefs with their information set.
	            Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information
 */