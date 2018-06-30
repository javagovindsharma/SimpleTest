package patterns;

/**
 * Created by  Govind on 22/04/2018
 */
public class Pattern_7 {

    public static void printMatrix(int[][] matrix)
    {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void printSpiralPattern(int n)
    {
        int[][] matrix = new int[n][n];
        int top =  n - 1, left = 0;
        int count = 1;

        for (int i = 0; i <= n/2; i++, left++, top-- ) {

//            left to right
            for (int j = left; j <= top; j++, count++) {
                matrix[left][j] = count;
            }
//            top to bottom
            for (int j = left + 1; j <= top; j++, count++) {
                matrix[j][top] = count;
            }
//            right to left
            for (int j = top - 1; j >= left ; j--, count++) {
                matrix[top][j] = count;
            }
//            bottom to top
            for (int j = top - 1; j > left  ; j--, count++) {
                matrix[j][left] = count;
            }

        }

        printMatrix(matrix);

    }

    public static void main(String[] args) {
        printSpiralPattern(10);
    }
}
