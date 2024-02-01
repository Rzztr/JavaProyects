package com.mycompany.operacionesobjetos;

public class Matricez {
    public static void main(String[] args) {
        double[][] matrix = {{3, 3, 1, -18}, {6, 6, 1, -72}, {10, -4, 1, -116}};

        System.out.println("Matriz original:");
        printMatrix(matrix);

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Paso 1: Escalón hacia adelante
        for (int i = 0; i < rows; i++) {
            // Paso 1.1: Pivoteo parcial
            int maxRowIndex = i;
            double maxValue = Math.abs(matrix[i][i]);
            for (int j = i + 1; j < rows; j++) {
                if (Math.abs(matrix[j][i]) > maxValue) {
                    maxValue = Math.abs(matrix[j][i]);
                    maxRowIndex = j;
                }
            }
            swapRows(matrix, i, maxRowIndex);

            // Paso 1.2: Dividir la fila por el pivote
            double pivot = matrix[i][i];
            for (int j = i; j < cols; j++) {
                matrix[i][j] /= pivot;
            }

            // Paso 1.3: Eliminación hacia adelante
            for (int j = 0; j < rows; j++) {
                if (j != i) {
                    double factor = matrix[j][i];
                    for (int k = i; k < cols; k++) {
                        matrix[j][k] -= factor * matrix[i][k];
                    }
                }
            }

            System.out.println("Paso " + (i + 1) + ":");
            printMatrix(matrix);
        }

        System.out.println("Soluciones:");
        for (int i = 0; i < rows; i++) {
            System.out.println("x" + (i + 1) + " = " + matrix[i][cols - 1]);
        }
    }

    private static void swapRows(double[][] matrix, int row1, int row2) {
        double[] temp = matrix[row1];
        matrix[row1] = matrix[row2];
        matrix[row2] = temp;
    }

    private static void printMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}