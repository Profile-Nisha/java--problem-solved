public class hollow {
    public static void hollow_rectangle(int totRows, int totCols){
        for(int i=1;i<=totRows;i++){
            for(int j =1;j<=totCols;j++){
                if(i==1 || i==totRows||j==1|| j==totCols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void Rotated_half(int n){
        for(int i=1;i<=4;i++){
            for(int j =1;j<=n-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
            
    }
    public static void inverted_half(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void floyds(int n){
        int counter = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }
    public static void nisha(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            
        
                }
                System.out.println();
        }
            }
            
        

    public static void main(String args[]){
       // Rotated_half(4);
      // inverted_half(5);
      //floyds(5);
      nisha(5);

    }
    
}
