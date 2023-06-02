public class Rotate90 {
    public static void rotate(int[][] ar){
        transpose(ar);
        reverse(ar);
    }
    

    static void transpose(int[][] ar) {
        int m=ar.length;
        
        for(int i=0;i<m;i++){
            for(int j=i+1;j<m;j++){
                int temp=ar[j][i];
                ar[j][i]=ar[i][j];
                ar[i][j]=temp;
            }

        }
        

    }
    
    static void reverse(int[][] ar) {
        int n=ar.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=ar[i][j];
                ar[i][j]=ar[i][n-j-1];
                ar[i][n-j-1]=temp;
            }

        }
    }

    public static void main(String[] args){
        int[][] ar={{1,2,3},{4,5,6},{7,8,9}};
        rotate(ar);
        int n=ar.length;
        int m=ar[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              System.out.print(ar[i][j]+ " ");
            }
            System.out.println();

        }

    }
}
