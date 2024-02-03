public class avg {
    public static int averageofnumber(int a , int b , int c){
        int average =(a + b + c )/ 3;
        return average;
    }
    public static void main(String args[]){
        int a = 10;
        int b = 10;
        int c = 10;
        int average = averageofnumber(a, b, c);
        System.out.println(average);
    }
    
}
