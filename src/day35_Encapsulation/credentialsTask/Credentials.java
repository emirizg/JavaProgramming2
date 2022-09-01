package day35_Encapsulation.credentialsTask;

public class Credentials {

    private String username, password;

    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public boolean isStrongPassWord(String password){
        int length=password.length();

        char[] ch=password.toCharArray();

        int countLetter=0,
                countSpecial=0,
                countDigit=0;

        for (char c : ch) {
            if (Character.isLetter(c)){
                countLetter++;
            } else if (Character.isDigit(c)) {
                countDigit++;
            }else {
                countSpecial++;
            }
        }

        if (length>=8 && !password.contains(" ") && countDigit>0 && countLetter > 0 && countSpecial > 0 ){
            return true;
        }else {
            return false;
        }

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (!isStrongPassWord(password)){
            System.err.println("Password \""+password+"\" is not a strong password");
            System.exit(1);
        }
        this.password = password;
    }

    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
/*
2. create a class named Credentials
            Variables:
                username, password

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the
                given string is strong password
                            Characteristics of strong passwords are:
                            1. Password MUST be at least have 8 characters long, and should not contain space
                            2. PassWord should at least contain one letter
                            3. Password should at least contain one special characters
                            4. Password should at least contain a digit

                getPassword(): reads the password
                getUsername(): reads the username
                setUsername(): sets the username
                setPassword(): sets a new password
                the new password MUST be a strong password

                toString():

            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)
 */