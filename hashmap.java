import java.util.HashMap;
public class hashmap {
    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap<>();

        map.put("india", 120);
        map.put("US", 230);
        map.put("china", 333);

        if(map.containsKey("china")){
            System.out.println("key is there");

        }else{
            System.out.println("key is not there");
        }
        System.out.println(map);
    }
    
}
