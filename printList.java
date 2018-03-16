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
        for(int i = 0; i < list.size(); i++){
            int num = i + 1;
            System.out.println(num + ". " + list.get(i));
        }
    }
}
