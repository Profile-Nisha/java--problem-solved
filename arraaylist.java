import java.util.ArrayList;
public class arraaylist {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.remove(2);
        list.set(2,234);

      // int element = list.get(3);
       //System.out.println(element);

        System.out.println(list);
        System.out.println(list.contains(11));

        System.out.println(list.size());
        for(int i = 0; i <list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    
}
