import java.util.*;
public class restro {
    public static String restaurant(String menu[],String key){
        
        for(int i =0;i<menu.length;i++){
            if(menu[i]==key){
                return "i";
            }
        }
        return "no ";
    }
    public static void main(String args[]){
        String menu[]={"dosa","samosa","idli","momos","burger","chowmin"};
        String key = "momos";
       String foody= restaurant(menu, key);
       System.out.println("index of String:="+ foody);
    }
    
}
