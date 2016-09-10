package lindsay.devon.AliceandBobGreeting;

/**
 * Created by devonlindsay on 9/10/16.
 */
public class compareIdentity {

    public String myName(String name){
        if (name.toUpperCase().equals("ALICE")) {
            return "Hello, " + name + "!";
        }
        else if (name.toUpperCase().equals("BOB")) {
            return "Hello, " + name + "!";
        }
        else {
            return "Hello, mysterious stranger.";
        }
    }
}
