package TwoDArray;

class SpiralMatrix {
    public static void printSpiral(int mat[][], int m, int n) {
        int rowstart = 0;
        int colstart = 0;
        int rowend = m - 1;
        int colend = n - 1;

        while (rowstart <= rowend && colstart <= colend) {
            for (int i = colstart; i <= colend; i++) {
                System.out.print(mat[rowstart][i] + " ");
            }
            rowstart++;

            for (int i = rowstart; i <= rowend; i++) {
                System.out.print(mat[i][colend] + " ");
            }
            colend--;

            if (rowstart <= rowend) {
                for (int i = colend; i >= colstart; i--) {
                    System.out.print(mat[rowend][i] + " ");
                }
                rowend--;
            }

            if (colstart <= colend) {
                for (int i = rowend; i >= rowstart; i--) {
                    System.out.print(mat[i][colstart] + " ");
                }
                colstart++;
            }
        }
    }

    public static void main(String args[]) {
        int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        printSpiral(mat, 3, 4);
    }
}
