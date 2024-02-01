package javaprogram;

public class ThreeDimensionalMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] matrixA = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
        int[][][] matrixB = {{{9, 10}, {11, 12}}, {{13, 14}, {15, 16}}};
        int[][][] resultMatrix = multiplyMatrices(matrixA, matrixB);

        // Print the result matrix
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[0].length; j++) {
                for (int k = 0; k < resultMatrix[0][0].length; k++) {
                    System.out.print(resultMatrix[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static int[][][] multiplyMatrices(int[][][] matrixA, int[][][] matrixB) {
        int aRows = matrixA.length;
        int aCols = matrixA[0].length;
        int bCols = matrixB[0][0].length;

        int[][][] result = new int[aRows][aCols][bCols];

        for (int i = 0; i < aRows; i++) {
            for (int j = 0; j < aCols; j++) {
                for (int k = 0; k < bCols; k++) {
                    for (int l = 0; l < matrixA[0][0].length; l++) {
                        result[i][j][k] += matrixA[i][j][l] * matrixB[l][j][k];
                    }
                }
            }
        }

        return result;
    

	}

}
