public class target {
    public static int targetvalue(int nums[] , int target){
        int start = 0;
        int end = nums.length-1;
        while(start > end){
            int mid = (start + end )/2;
            if(mid > target){
                start++;
            }
            if(mid < target){
                end--;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(targetvalue(nums,target));
    }
}
