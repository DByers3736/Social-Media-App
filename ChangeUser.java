
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class ChangeUser here.
 *
 * @author Dominic Byers
 * @version v1
 */
public class ChangeUser
{
    // Creates an arraylist of the User class and the scanner that will be used in the methods below
     ArrayList<User> users = new ArrayList<User>();
     Scanner in = new Scanner(System.in);
    // User object is the current user
     User currentUser;
    /**
     * Makes sure it runs the correct code for registering or signing up
     */
    public  void runUser()
    {
        System.out.println("Do you want to sign in or register? (sign in should be seperate)");
        String statement = in.nextLine();
        if (statement.equalsIgnoreCase("sign in")|| statement.equalsIgnoreCase("signin"))
        {
            changeUser();
        }
        else if (statement.equalsIgnoreCase("register"))
        {
            register();
        }
        else
        {
            runUser();
        }
    }
    /**
     * Signs in the user if no user is signed in or changes the user if one is already signed in
     */
    public void changeUser()
    {
        System.out.println("Type your username");
        String username = in.nextLine();
        System.out.println("Type your password");
        String password = in.nextLine();
        // Iterates through the arraylist
        for (int i = 0; i < users.size(); i++)
        {
            // Checks to see if the username exists
            if (username.equalsIgnoreCase(users.get(i).getUsername()))
            {
                // If it does, it checks the password
                // If the password is right, it signs in the current user
                // If not, it says that was an incorrect password
                if (password.equalsIgnoreCase(users.get(i).getPassword()))
                {
                    System.out.println("Signed in successfully");
                    currentUser = users.get(i);
                    break;
                }
                else
                {
                    System.out.println("The password did not match");
                    changeUser();
                }
            }
            else if (i == users.size() - 1) // Checks to see if we're at the end of the iteration, if we are, and the username hasn't equaled any of the users, then it says that the user doesn't exist
            {
                System.out.println("That user does not exist");
                changeUser();
            }
        }
    }
    /**
     * Registers a new user to the arraylist
     */
    public  void register()
    {
        System.out.println("Choose a username for your account");
        String regUser = in.nextLine();
        System.out.println("Choose a password for your account");
        String regPass = in.nextLine();
        System.out.println("Type your password again to confirm");
        if (in.nextLine().equals(regPass))
        {
            users.add(new User(regUser, regPass));
        }
    }
    public User getCurrentUser()
    {
        return currentUser;
        
    }
}