import java.util.ArrayList;
public class maxlist {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int largest = Integer.MIN_VALUE;

        for(int i = 0 ; i<list.size(); i++){
            if(largest < list.get(i)){
               largest = list.get(i);
            }
    
        }
        System.out.println(largest);
    }
    
}
