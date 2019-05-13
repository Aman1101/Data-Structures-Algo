package crakingthecodinginterview;

public class ZeroMatrix {

    int[][] setZeros(int [] [] matrix){
        boolean [] row = new boolean[matrix.length];
        boolean [] column = new boolean[matrix[0].length];

        for (int i =0; i < matrix.length; i++){
            for (int j=0; j < matrix[0].length; j++){
                if (matrix[i][j] == 0){
                    row [i] = true;
                    column [j] = true;
                }
            }
        }

        for (int i = 0; i<row.length; i++){
            if (row[i]) setRowZero (matrix, i);
        }

        for (int j =0; j<column.length; j++){
            if (column[j]) setColumnZero (matrix, j);
        }
        return matrix;
    }

    void setRowZero (int [][] matrix, int row){
        for (int j=0; j<matrix[0].length; j++){
            matrix[row][j] = 0;
        }
    }

    void setColumnZero (int [][] matrix, int column){
        for (int i=0; i<matrix.length; i++){
            matrix[i][column] = 0;
        }
    }

    public static void main(String[] args) {
        int [][] matrix = {{1, 0, 3}, {4, 2, 6}, {0, 8, 9}};

        for (int i =0; i < matrix.length; i++){
            for (int j =0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        ZeroMatrix zeroMatrix = new ZeroMatrix();
        int [][] newMatrix = zeroMatrix.setZeros(matrix);
        for (int i =0; i < newMatrix.length; i++){
            for (int j =0; j < newMatrix[0].length; j++){
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
