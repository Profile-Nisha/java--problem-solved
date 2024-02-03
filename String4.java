public class String4 {
    public static String getsubstring( String str, int si, int ei){
        String substr  = "";
        for(int i =si; i<ei;i++){
            substr += str.charAt(i);

        }
        return substr;
    }
    public static void main(String args[]){
        String str = "helloWorld";
        //System.out.println(str.substring(0, 4));
        System.out.println(getsubstring(str, 0, 4));
    }
    
}
