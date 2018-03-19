
/**
 * Write a description of class Runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Runner
{
    public static void main()
    {
        System.out.println("Type what action you would like to occur");
        System.out.println("Type: 'quit' , 'bye', or 'close' to close the application");
        
        SocialMedia sm = new SocialMedia();
        
        while (true)
        {
            sm.action();
        }
    }
}