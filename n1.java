public class n1 {
    public static void leftstar(int n){
    for(int i = 1;i<=n;i++){
        for( int j = 1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        
        System.out.println();
       
        
    
    }
    
}

    public static void main(String args[]){
        //int n = 5;
        leftstar(5);
    }
    
}
