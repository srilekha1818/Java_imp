public class RichestSum {
    static int maxSum(int[][] ar){
        int Summax=0;
        for(int[] account:ar){
            int currentSum=0;
            for(int money:account){
            currentSum+=money;
            } 
            Summax=Math.max(Summax,currentSum);
        }
        return Summax;
    }
    public static void main(String[] args){
        int[][] ar={{1,2,3},{4,5,6}};
        System.out.println("richest array sum is: "+maxSum(ar));


    }
}
