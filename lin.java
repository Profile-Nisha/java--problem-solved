public class lin {
    public static int linearsearch(int number[], int key){
        for(int i =0;i<=number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int number[] = {2,4,6,8,10,12,14,16,18,20};
        int key = 20;
       System.out.println(linearsearch(number, key));
    }
    
}
