package lindsay.devon.AliceandBobGreeting;
import java.util.Scanner;
/**
 * Created by devonlindsay on 9/10/16.
 */
public class UserIO {

    public String getUserName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        return scan.next();
    }


    public void displayMessage(String output) {
        System.out.println(output);
    }
}


