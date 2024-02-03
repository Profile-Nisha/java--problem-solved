import java.util.ArrayList;
import java.util.Collections;
public class coll {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(6);
        list.add(3);
        list.add(9);
        list.add(2);
        list.add(10);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
    
    
}
