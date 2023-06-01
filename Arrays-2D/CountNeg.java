
public class CountNeg {

    public static  int countNegatives(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int res = 0;
        for (int i = 0; i < m; i++) {
            res += findNeg(grid, i, n);
        }
        return res;
    }

     static int findNeg(int[][] grid,int x,int n){
                int l=0,e=n-1;
                while(l<=e){
                    int mid=(l+e)/2;
                    if(grid[x][mid]<0 && (mid-1<0 || grid[x][mid-1]>=0)){
                        return n-mid;
                    }
                    else if(grid[x][mid]<0 && mid-1>=0 && grid[x][mid-1]<0){
                        e=mid-1;
                    }
                    else l=mid+1;
                }
                return 0;
            }
                public static void main(String[] args){
                    int[][] grid={{1,0,-1},{2,1,-1},{1,-1,-2}};
                   System.out.println(countNegatives(grid));
                }
    
}
