import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        int strength = 0;

        if (password.length() >= 8) strength++;
        if (password.matches(".*[A-Z].*")) strength++;
        if (password.matches(".*[0-9].*")) strength++;
        if (password.matches(".*[@#$%^&+=].*")) strength++;

        if (strength == 4) {
            System.out.println("Strong Password 💪");
        } else if (strength == 3) {
            System.out.println("Medium Password 👍");
        } else {
            System.out.println("Weak Password ⚠️");
        }
    }
}
