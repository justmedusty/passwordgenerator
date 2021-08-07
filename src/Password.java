import java.util.Scanner;
import java.util.Random;

public class Password {
    //Characters for the generator to pick from
    public static char[] characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_}{><`123456789".toCharArray();
    public static int passwordLength = 0;
    public static final Random rand = new Random();

    public static String createPassword() {
        String finalPassword;
        passwordLength = getInteger("How many characters do you want your password to contain?");
        checkLength();
        finalPassword = generateLetters();
        return finalPassword;

    }


    public static int getInteger(String message) {
        Scanner scan = new Scanner(System.in);

        System.out.println(message);

        if (scan.hasNextInt()) return scan.nextInt();
        else {
            System.out.println("Invalid input, whole numbers only!");
            return getInteger(message);
        }
    }

    private static int checkLength() {
        //doesnt allow extremely large numbers
        if (passwordLength > 50)
            passwordLength = 50;

        return passwordLength;

    }

    private static String generateLetters() {
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