import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class SocialMedia here.
 * 
 * @author Rishi Duggal
 * @version v2
 */
public class SocialMedia{
    Input sc = new Input();
    String response;
    User curUser = null;
    public void action(){
        // Keith's Code
        ArrayList<String> Stringlist = new ArrayList<String>();
        Stringlist.add("quit");
        Stringlist.add("bye");
        Stringlist.add("close");    

        // Rishi's Code
        User curUser = ChangeUser.getCurrentUser();

        ArrayList<String> AddResponses = new ArrayList<String>();
        AddResponses.add("Post");
        AddResponses.add("Add");
        AddResponses.add("post");
        AddResponses.add("add");

        ArrayList<String> RemoveResponses = new ArrayList<String>();
        RemoveResponses.add("Delete");
        RemoveResponses.add("Remove");
        RemoveResponses.add("delete");
        RemoveResponses.add("remove");

        ArrayList<String> PrintResponses = new ArrayList<String>();
        PrintResponses.add("Show");
        PrintResponses.add("Print");
        PrintResponses.add("show");
        PrintResponses.add("print");

        ArrayList<String> UserResponses = new ArrayList<String>();
        UserResponses.add("SignIn");
        UserResponses.add("signin");
        UserResponses.add("Signin");
        UserResponses.add("signIn");
        UserResponses.add("register");
        UserResponses.add("Register");

        System.out.println("What would you like to do?");
        System.out.println("You can post, delete, print, quit, or sign in/register (put signin together because java has issues)");
        response = sc.getString();
        if(AddResponses.indexOf(response) > -1){
            addPost();
        }
        else if(PrintResponses.indexOf(response) > -1){
            printPost(curUser.posts);
        }

        else if(RemoveResponses.indexOf(response) > -1){
            printPost(curUser.posts);
            removePost();
        }
        else if(Stringlist.indexOf(response) > -1){ // Keith's Code
            System.exit(0);
        }
        else if(UserResponses.indexOf(response) > -1)
        {
            ChangeUser.runUser();
        }
    }
    public void addPost(){        
        System.out.println("What would you like to post?");
        response = sc.getLine();
        try
        {
            curUser.Post(response);
        }
        catch (NullPointerException e)
        {
           System.out.println("You need to sign in first");
        }
    }  
    public void removePost(){
        System.out.print("Which post do you want to remove?");
        int x = sc.getInt();
        try
        {
            curUser.posts.remove(curUser.posts.get(x - 1));
        }
        catch (NullPointerException e)
        {
            System.out.println("You need to sign in first");
        }
    }
    public  void printPost(ArrayList<String> list){
        printList.printArray(list);
    }
}
