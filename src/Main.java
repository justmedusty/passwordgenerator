import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password;
        boolean repeat = false;
        String yesOrNo;

        password = Password.createPassword();
        System.out.printf("Your generated password is: %n %n%s %n %n", password);

        System.out.println("Do you want to generate another password? (Y/N)");
        yesOrNo = scan.nextLine();
        if (yesOrNo.equalsIgnoreCase("y") || yesOrNo.equalsIgnoreCase("yes"))
            main(args);

        Password.clearPassword();

    }


}


