import java.util.ArrayList;
/**
 * Write a description of class User here.
 *
 * @author Dominic Byers
 * @version v1
 */
public class User
{
    String username, password;
    ArrayList<String> posts = new ArrayList<String>();
    public User(String user, String pass)
    {
        username = user;
        password = pass;
    }
    public String getUsername()
    {
        return username;
    }
    public String getPassword()
    {
        return password;
    }
    public void Post(String s)
    {
        posts.add(s);
    }
}