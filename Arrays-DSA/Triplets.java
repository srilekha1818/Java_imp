/*Q4. Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 */
import java.util.*;
public class Triplets {

    
    
        static List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            
            if (nums == null || nums.length < 3) {
                return ans;
            }
            
            Arrays.sort(nums);
            
            int len = nums.length;
            
            for (int i = 0; i < len - 2; i++) {
                int cur = nums[i];
                
                if (i > 0 && cur == nums[i - 1]) {
                    continue;
                }
                
                int left = i + 1;
                int right = len - 1;
                
                while (left < right) {
                    int tempSum = nums[i] + nums[left] + nums[right];
                    
                    if (tempSum == 0) {
                        ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        left++;
                        
                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        } 
                    }
                    else if (tempSum < 0) {
                        left++;
                    }
                    else {
                        right--;
                    }
                }
            }
            
            return ans;
        }
        public static void main(String[] args){
            int[] nums = {-1, 0, 1, 2, -1, -4};
            System.out.println(threeSum(nums));
           // List<List<Integer>> res=threeSum(nums);
           // System.out.println(res);
           
        }
    
    
}
