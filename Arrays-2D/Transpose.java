public class Transpose {
    public static int[][] tranpose(int[][] ar){
        int m=ar.length;
        int n=ar[0].length;
        int [][] ans=new int[n][m];
        
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                ans[j][i]+=ar[i][j];
            }
        }
        return ans;

    }
    public static void  main(String[] args){
        int[][] ar={{1,2,3},{4,5,6},{7,8,9}};
       int[][] ans= tranpose(ar);
       System.out.println("matrix before transpose: ");
       for(int i=0;i<ar.length;i++){
        for(int j=0;j<ar[0].length;j++){
            System.out.print(ar[i][j]+" ");
           
        }
        System.out.println();
    }
    System.out.println("matrix after transpose: ");
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
               
            }
            System.out.println();
        }
        

    }
   
}
