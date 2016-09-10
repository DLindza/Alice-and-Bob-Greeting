package lindsay.devon.AliceandBobGreeting;

/**
 * Created by devonlindsay on 9/10/16.
 */
public class Greeting {
    String name = null;

    public void greet() {

            UserIO user = new UserIO();
            String name = user.getUserName();

            compareIdentity id = new compareIdentity();

         user.displayMessage(id.myName(name));

    }
}
