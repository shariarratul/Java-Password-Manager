import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StoredPasswords {
    String appData = System.getenv("LOCALAPPDATA");
    String passPath = appData+"\\savedpass.txt";
    public void showSavedPasswords(){
        try(BufferedReader reader = new BufferedReader(new FileReader(passPath))){
            System.out.println("\nYour Saved Passwords:");
            // Peek the first line
            if (!reader.ready()) {
                System.out.println("No Saved Passwords! ");
                return;
            }
            System.out.println("-----------------------------------------------------------------------");
            System.out.printf("| %-3s | %-15s | %-20s | %-20s |\n", "No", "Website", "Email", "Password");
            System.out.println("-----------------------------------------------------------------------");
            int i = 1;
            String line;
            while ((line = reader.readLine()) != null) {
                String[] myArray = line.split(",");

                if (myArray.length == 3) {
                    System.out.printf("| %-3d | %-15s | %-20s | %-20s |\n", i, myArray[0], myArray[1], myArray[2]);
                    i++;
                }
            }
            System.out.println("-----------------------------------------------------------------------");
        }
        catch (FileNotFoundException e){
            System.out.println("Could Not Locate Saved Passwords File");
        }
        catch(IOException e){
            System.out.println("Something went wrong while reading saved file");
        }
    }

}
