public class Main {
    public static void main(String[] args) {

        String password;
        password = Password.createPassword();
        System.out.printf("Your generated password is: %n %n %s",password);

    }
}
