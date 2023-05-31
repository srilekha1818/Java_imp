public class RotatedN {
    public static void rotated(int[] nums,int k){
k%=nums.length;
reverse(nums,0,nums.length-1);
reverse(nums,0,k-1);
reverse(nums,k,nums.length-1);

    }
    public static void reverse(int[] nums, int i, int j) {
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        int[] nums={1,2,3,9,8,5};
        int n=nums.length;
        rotated(nums, 3);
        for(int i=0;i<n;i++){
    
            System.out.print(nums[i]+" "); 
         }
        System.out.println();
            } 

    }

