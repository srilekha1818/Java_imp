import java.util.HashSet;

public class Missing{
   
    static int missingNumber(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        int cp = 0;
        for(int i = 0; i<nums.length; i++){
            s.add(nums[i]);
        }
        for(int i = 0; i<=nums.length;i++){
            if(s.contains(i))
                cp++;
            else
                return i;
        }
        return -1;
    }

    public static void main(String[] args){
       int[] nums={0,1,2,4};
       int x=missingNumber(nums);
System.out.println("Missing number is: "+x);
System.out.println(nums.length);
    }



}