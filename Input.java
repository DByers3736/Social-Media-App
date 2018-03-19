import java.util.Scanner;
/**
 * Write a description of class Input here.
 * 
 * @author Rishi Duggal
 * @version v1
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