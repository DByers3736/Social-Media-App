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
    }

    public  void addPost(){        
           System.out.println("What would you like to post?");
           response = sc.getLine();
           posts.add(response);
    }        

    public  void printPost(ArrayList<String> list){

        for(int i = 0; i < list.size(); i++){
            int num = i + 1;
            System.out.println(num + ". " + list.get(i));
        }
    }

}
