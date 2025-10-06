public class MatrixMultiplication {
    public static void main(String[] args){
        int[][] matrixOne = { //replacable with other integers
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrixTwo = { //replacable with other integers
            {7, 10},
            {8, 11},
            {9, 12}
        };

        int[][] result = multiplyMatrix(matrixOne, matrixTwo);

        System.out.println("Product of the two matrices:");
        for (int[] row : result) {
            for int value : row) {
                System.out.println(value + ", ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrix(int[][] matrixOne, int[][] matrixTwo) {
        int rowOne = matrixOne.length;
        int columnOne = matrixOne[0].length;
        int rowTwo = matrixTwo.length;
        int columnTwo = matrixTwo[0].length;

        int[][] product = new int[rowOne][columnTwo]; 

        for (int i = 0; i < rowOne; i++) {
            for (int j = 0; j < columnTwo; j++) {
                for (int k = 0; k < columnOne; k++) {
                    product[i][j] += matrixOne[i][k] * matrixTwo[k][j];
                }
            }
        }

        return product;       
    }
}
