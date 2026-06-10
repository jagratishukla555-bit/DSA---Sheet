import java.util.Scanner;

 class MatrixMul {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // First Matrix
        System.out.print("Enter rows of matrix 1: ");
        int r1 = sc.nextInt();

        System.out.print("Enter columns of matrix 1: ");
        int c1 = sc.nextInt();

        int[][] a = new int[r1][c1];

        System.out.println("Enter elements of matrix 1:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Second Matrix
        System.out.print("Enter rows of matrix 2: ");
        int r2 = sc.nextInt();

        System.out.print("Enter columns of matrix 2: ");
        int c2 = sc.nextInt();

        int[][] b = new int[r2][c2];

        System.out.println("Enter elements of matrix 2:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Check multiplication condition
        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible");
            return;
        }

        // Result Matrix
        int[][] result = new int[r1][c2];

        // Matrix Multiplication
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {

                for (int k = 0; k < c1; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // Print Result
        System.out.println("Result Matrix:");

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

