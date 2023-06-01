public class DupSum2D{
    public static int diagonalSum(int[][] matrix){
int ans=0;
int n=matrix.length;
for(int i=0;i<n;i++){
    ans+=matrix[i][i];
    ans +=matrix[n-1-i][i];
}
if(n%2==1){
    ans -= matrix[n / 2][n / 2];
}
return ans;
    }

    public static void main(String[] args){
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
System.out.println("diagonal sum is:" +diagonalSum(matrix));
    }
}