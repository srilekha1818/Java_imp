public class PalindromeArray {

static int palindromeArray(int[] ar,int n){
    int cnt=0;
   
    for(int i=0,j=n-1;i<=j;){
        if(ar[i]==ar[j]){
            i++;
            j--;
        }
        else if(ar[i]>ar[j]){
         ar[j-1]+=ar[j];
         j--;
         cnt++;
        }
        
        else {
            ar[i]+=ar[i+1];
            i++;
            cnt++;
        
        }

    }
    return cnt;
}
  


 public static void main(String[] args){
    int[] nums={1,4,5,9,10,11,1};
    System.out.println("number of minimum operations to be done to make the array palindrome are: "+palindromeArray(nums, 5));

    }
    
}
