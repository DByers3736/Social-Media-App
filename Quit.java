import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class Quit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Quit
{
    public static void main(){
        ArrayList<String> Stringlist = new ArrayList<String>();
        Stringlist.add("quit");
        Stringlist.add("bye");
        Stringlist.add("close"); 
         System.out.println("Type: 'quit' , 'bye', or 'close' to close the application");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
 
        
        if(Stringlist.indexOf(word) > -1){
        quitApp();
    }
    }


    public static String quitApp(){
       // Scanner sc = new Scanner(System.in);
       // String word = sc.nextline();
       System.exit(0);
     return "" ;
     

    }
}
