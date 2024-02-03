import java.util.ArrayList;
public class brute {
    public static boolean sumofpair(ArrayList<Integer>list , int target){
        int sum = 0;
        for(int i =0; i<list.size(); i++){
            for(int j = i+1; j<list.size(); j++){
                if(list.get(i) + list.get(j) == target);
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
       System.out.println(sumofpair(list, target));
    }
    
}
