import java.util.Scanner;
import java.util.Random;

public class Password {
    //Characters for the generator to pick from
    private static char[] characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_}{><`123456789".toCharArray();
    private static int passwordLength = 0;
    private static final Random rand = new Random();
    private static String finalPassword;



    public static String getFinalPassword() {
        return finalPassword;
    }


    public static void clearPassword(){
        finalPassword = null;
    }

    public static String createPassword() {

        passwordLength = getInteger("How many characters do you want your password to contain?");
        checkLength();
        finalPassword = generateCharacters();
        return finalPassword;

    }

    //Method for ensuring that input is integer and not of any other data type
    public static int getInteger(String message) {
        Scanner scan = new Scanner(System.in);

        System.out.println(message);

        if (scan.hasNextInt()) return scan.nextInt();
        else {
            System.out.println("Invalid input, whole numbers only!");
            return getInteger(message);
        }
    }
    //Method for ensuring the password length makes sense, is not below 1 and is not above 50 as that is unreasonable
    private static int checkLength() {

        if (passwordLength > 50 || passwordLength < 1)
            passwordLength = 50;

        return passwordLength;

    }
    // Method for generating a String by randomly indexing the character array, up to the specified password length
    private static String generateCharacters() {
        int i = 0;
        int random = 0;
        StringBuilder password = new StringBuilder("");
        for (i = 0; i < passwordLength; i++) {
            random = rand.nextInt(77);
            password.append(characters[random]);
        }

        return password.toString();
    }
}