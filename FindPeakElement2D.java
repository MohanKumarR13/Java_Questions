public class FindPeakElement2D {
    public static void main(String[] args) {
        int[][] a = {
            {10, 20, 15},
            {21, 30, 14},
            {7, 16, 25}
        };

        int rows = a.length;
        int cols = a[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i == 0 || a[i][j] >= a[i - 1][j]) &&
                    (i == rows - 1 || a[i][j] >= a[i + 1][j]) &&
                    (j == 0 || a[i][j] >= a[i][j - 1]) &&
                    (j == cols - 1 || a[i][j] >= a[i][j + 1])) {

                    System.out.println("Peak element: " + a[i][j]);
                    System.out.println("Row: " + i);
                    System.out.println("Column: " + j);
                    return;
                }
            }
        }

        System.out.println("No peak element found");
    }
}
