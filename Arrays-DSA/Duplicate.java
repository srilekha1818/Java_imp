import java.util.HashSet;

public class Duplicate {
    static int duplicates(int[] nums) {
        HashSet<Integer> s11 = new HashSet<Integer>();
        for(int num: nums){
            if(s11.contains(num)){
            return num;
            }
            else
            s11.add(num);

   

        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums={1,1,2,3,4};
        System.out.println("duplicate number: "+duplicates(nums));
        
    }
}
