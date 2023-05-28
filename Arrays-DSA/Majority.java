import java.util.HashMap;

public class Majority {
   
         static int majorityElement(int[] nums) {
            HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
            int res=0;
            for(int num:nums){
                if(!map.containsKey(num))
                map.put(num, 1);
                else
                map.put(num, map.get(num)+1);
                if(map.get(num)>nums.length/2){
                    res=num;
                    break;
                }
            }
            return res;

            }
           
       /* public static int majorityElement(int[] nums) {
            int ele=0;
            int count = 0;
    
            for(int i =0 ; i<nums.length; ++i){
                if(count == 0)
                    ele = nums[i];
                if(ele == nums[i])
                    count++;
                else
                    count--;
            }
    
            return ele;
        }*/
    
    public static void main(String[] args){
        int[] nums={1,1,1,2,3};
        System.out.println("frequently occured number: "+majorityElement(nums));


    }
}
