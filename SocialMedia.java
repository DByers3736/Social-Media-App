import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class SocialMedia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SocialMedia{
    ArrayList<String> posts = new ArrayList<String>();
    Input sc = new Input();
    String response;
    public void action(){

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
          printPost(posts);
        }
        
        else if(RemoveResponses.indexOf(response) > - 1){
            printPost(posts);
            removePost();
        }
    }

    public  void addPost(){        
           System.out.println("What would you like to post?");
           response = sc.getLine();
           posts.add(response);
    }  
    
    public void removePost(){
        System.out.print("Which post do you want to remove?");
        int x = sc.getInt();
        posts.remove(posts.get(x - 1));
    }

    public  void printPost(ArrayList<String> list){
        printList.printArray(list);
    }

}
