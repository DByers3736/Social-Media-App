import java.util.Scanner;
/**
 * Write a description of class Input here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Input
{
    public int getInt(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    
    public String getString(){
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    public String getLine(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
