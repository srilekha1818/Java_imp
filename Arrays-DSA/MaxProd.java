/*Q3. Given an integer array nums, find a subarray that has the largest product, 
and return the product. */
public class MaxProd {
    static int maxprod(int[] ar){
        if(ar.length==0) return 0;
        int min_till=ar[0];
        int max_till=ar[0];
        int result=max_till;
        for(int i=0;i<ar.length;i++){
            int curr=ar[i];
            int max_temp=Math.max(curr,Math.max(max_till*curr, min_till*curr));
            min_till=Math.min(curr,Math.min(max_till*curr, min_till*curr));
            max_till=max_temp;
       result=Math.max(max_till,result);

        }
        return result;

    }
    public static void main(String[] args){
        int ar[]={1,-2,4,-3};
        maxprod(ar);
    }
    
}
