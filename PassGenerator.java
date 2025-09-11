import java.util.Random;
import java.util.Scanner;

public class PassGenerator {
    int length;

    public PassGenerator(int length) {
        this.length = length;
    }

    public String generatePass() {
        Scanner sc = new Scanner(System.in);

        System.out.println("What Type Of Password Do You Want? ");
        System.out.println("1. Only String (A-Z, a-z)");
        System.out.println("2. String (A-Z, a-z) + Numbers (0-9)");
        System.out.println("3. String (A-Z, a-z) + Numbers (0-9) + Symbols(*&^)");
        System.out.print("Enter your choice: ");

        int typeOfPass = sc.nextInt();

        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String symbols = "@&*$*_";

        String passChars = "";
        if(typeOfPass == 1) passChars += letters;
        else if (typeOfPass == 2) passChars += letters + numbers;
        else passChars += letters + numbers + symbols;
        int passCharLen = passChars.length();

        StringBuilder password = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(passCharLen);
            password.append(passChars.charAt(index));
        }

        return password.toString();
    }
}
