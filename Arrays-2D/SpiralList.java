import java.util.ArrayList;
import java.util.List;

public class SpiralList {
     static List<Integer> spiralShow(int[][] matrix) {
        int rows=matrix.length;
        int columns=matrix[0].length;
        int up = 0;
        int down = rows-1 ;
        int left = 0;
        int right = columns-1 ;
       List<Integer> result = new ArrayList<>();
        while (left <= right && up <= down) {
            for (int col = left; col <= right; col++) {
                result.add(matrix[up][col]);
            }
            up++;
            for (int row = up; row <= down; row++) {
                result.add(matrix[row][right]);
            }
            right--;
            if (up<=down) {
                for (int col = right; col >= left; col--) {
                    result.add((matrix[down][col]));
                }
                down--;
            }
            if (left <= right) {
                for (int row = down; row >= up; row--) {
                    result.add(matrix[row][left]);
                }
            }
            left++;
        
          }
            return result;

    }
    
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> res1=spiralShow(matrix);
        System.out.println(res1);
    }


}