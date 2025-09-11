import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class SinglePass {
    String Website;
    String Email;
    String Password;

    public SinglePass(String website, String email, String password) {
        Website = website;
        Email = email;
        Password = password;
    }

    void saveSinglePass(){
        String fileContent = Website+","+Email+","+Password+"\n";
        String appData = System.getenv("LOCALAPPDATA");
        String passPath = appData+"\\savedpass.txt";
        try{
            FileWriter fw = new FileWriter(passPath, true);
            fw.write(fileContent);
            fw.close();

            System.out.println("\n\nYour Password Has Been Saved!");
            System.out.println("Website: " + Website + ", Email: " + Email + ", Password: " + Password);
        }
        catch (FileNotFoundException e){
            System.out.println("Could Not Locate Saved Passwords File");
        }
        catch (IOException e){
            System.out.println("Could Not Save Password.");
        }
    }
}


