import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option = 0;
        while(option!=3){
            System.out.println("\n\n====Java Passwords Manager====");
            System.out.println("1. Generate New Password ");
            System.out.println("2. View Saved Passwords ");
            System.out.println("3. Exit Program..");
            System.out.print("Your Option: " );
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();
            sc.nextLine();

            switch(option) {
                case 1->{
                    clearScreen();
                    genPass();
                }
                case 2->{
                    clearScreen();
                    StoredPasswords SP = new StoredPasswords();
                    SP.showSavedPasswords();
                }
                case 3-> System.out.println("Exiting Program...");
                default-> System.out.println("invalid option!");
            }
        }

        System.out.println("Thank You!");
    }

    public static void genPass(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n===Generate new Password:===\n");

        System.out.print("Website:  ");
        String website = sc.nextLine();

        System.out.print("Email:  ");
        String email = sc.nextLine();

        System.out.print("Pass length:  ");
        int len = sc.nextInt();

        PassGenerator p1 = new PassGenerator(len);
        String newPass = p1.generatePass();
        SinglePass s1 = new SinglePass(website,email,newPass);
        s1.saveSinglePass();
    }


    public static void clearScreen() {
        try {
            final String os = System.getProperty("os.name").toLowerCase();
            ProcessBuilder pb;

            if (os.contains("windows")) {
                pb = new ProcessBuilder("cmd", "/c", "cls");
            } else {
                pb = new ProcessBuilder("clear");
            }

            pb.inheritIO().start().waitFor();
        } catch (final Exception e) {
            System.err.println("Error clearing console: " + e.getMessage());
        }
    }
}
