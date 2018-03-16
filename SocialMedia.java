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
    User currentUser = null;
    public void action(){
        // Keith's Code
        ArrayList<String> Stringlist = new ArrayList<String>();
        Stringlist.add("quit");
        Stringlist.add("bye");
        Stringlist.add("close"); 
        System.out.println("Type: 'quit' , 'bye', or 'close' to close the application");      
        
        // Rishi's Code
        User currentUser = ChangeUser.getCurrentUser();
        
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
        
        System.out.println("What would you like to do?");
        response = sc.getString();
        if(AddResponses.indexOf(response) > -1){
          addPost();
        }
        else if(PrintResponses.indexOf(response) > -1){
          printPost(currentUser.posts);
        }
        
        else if(RemoveResponses.indexOf(response) > -1){
            printPost(currentUser.posts);
            removePost();
        }
        else if(Stringlist.indexOf(response) > -1){ // Keith's Code
            System.exit(0);
        }
    }
    public void addPost(){        
           System.out.println("What would you like to post?");
           response = sc.getLine();
           currentUser.addPost(response);
    }  
    public void removePost(){
        System.out.print("Which post do you want to remove?");
        int x = sc.getInt();
        currentUser.posts.remove(currentUser.posts.get(x - 1));
    }
    public  void printPost(ArrayList<String> list){
        printList.printArray(list);
    }
}
