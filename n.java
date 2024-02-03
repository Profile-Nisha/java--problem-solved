public class n {
    public static void rightstar(int k){
    
        for(int i = 1;i<=k;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String args[]){
        int k=5;
        rightstar(k);
    }
    
}
