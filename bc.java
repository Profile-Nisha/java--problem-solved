public class bc {
    public static int factorial(int n){
        int f = 1;
        for(int i =1 ; i<=n;i++){
            f = f *i;
        }
        return f;

    }
    public static int binomialcoff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int bincoff = fact_n/(fact_r*fact_nmr);
        return bincoff;
    }
    public static void main(String args[]){
       int bincoff =  binomialcoff(5, 2);
       System.out.println(bincoff);



    }
    
}
