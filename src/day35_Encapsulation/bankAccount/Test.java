package day35_Encapsulation.bankAccount;

public class Test {

    public static void main(String[] args) {

        BankAccount user1 = new BankAccount("Emir",889999,500);

        System.out.println(user1);

        user1.withdraw(600);

        System.out.println(user1);

    }


}
