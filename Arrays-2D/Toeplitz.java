public class Toeplitz { 
    static boolean toeplitz(int[][] ar){
    int r=ar.length;
    int c=ar[0].length;
    for(int i=0;i<r;++i){
        for(int j=0;j<c;++j){
            if(r<0 && c<0 && ar[r-1][c-1]!=ar[r][c])
            return false;
        }
       
    }
    return true;
        }
    
    public static void main(String[] args){
        int ar[][]={{2,6,7},{3,2,6},{8,3,2}};
       System.out.println(toeplitz(ar));
}
}
