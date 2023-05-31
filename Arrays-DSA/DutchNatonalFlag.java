public class DutchNatonalFlag {
    //this problem is also called as  dutch national flag problem

    public static void sortColors(int[] nums) {
        int i =0;// Before this  pointer every element should  zero
        int j =0;// Before this point every element should be 1
        int k = nums.length-1; // After this point every element should be 2
        while(i<=k){
            if(nums[i]==0){
                swap(nums,i,j);
                i++;
                j++;
            }
            else if(nums[i]==1){
                i++;
            }
           else  if(nums[i]==2){
                swap(nums,k,i);
                k--;
            }
        }
    }
    public static void  swap(int []nums,int i , int j){
        int temp =  nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args){
        int[] nums={1,0,1,0,2,2};
        int n=nums.length;
sortColors(nums);
for(int i=0;i<n;i++){
    
    System.out.print(nums[i]+" "); 
 }
System.out.println();
    } 
}
