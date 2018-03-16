import java.util.ArrayList;
/**
 * Write a description of class printList here.
 *
 * @author (Matthew Biegenwald)
 * @version (3.15.2018)
 */
public class printList
{
    public static void printArray(ArrayList<String> list){
        //print each individual object in the array on a seperate line.
        for(int i = 0; i < list.size(); i++){
            //show each post's number starting at 1 instead of 0 (length 0 in the array).
            int num = i + 1;
            //prints out the number position in the list from the variable above plus the post itself.
            System.out.println(num + ". " + list.get(i));
        }
    }
}
