package SquareMatrix;

import Matrix.Matrix;
import View.View;

import java.io.IOException;

public class SquareMatrix extends Matrix implements Runnable {

    public SquareMatrix(int n) {
        super(n, n);
    }

    public static double Determinant(SquareMatrix h) {
        double calcResult = 0;
        if (h.n == 1) {
            return h.u[0][0] * h.u[0][1];
        } else if (h.n == 2) {
            return h.u[0][0] * h.u[1][1] - h.u[1][0] * h.u[0][1];
        } else if (h.n > 2) {
            int koeff = 1;
            for (int i = 0; i < h.u.length; i++) {
                if (i % 2 == 1) {
                    koeff = -1;
                } else {
                    koeff = 1;
                }
                calcResult += koeff * h.u[0][i] * Determinant(Minor(h, 0, i));
            }
        }
        return calcResult;
    }

    public static SquareMatrix Minor(SquareMatrix e, int a, int b) {
        int di = 0;
        int dj = 0;
        int u = e.u.length - 1;
        SquareMatrix minor = new SquareMatrix(u);
        for (int i = 0; i < e.n; i++) {
            for (int j = 0; j < e.n; j++) {
                if (i == a) {
                    di = 1;
                }
                if (j == b) {
                    dj = 1;
                }
                minor.u[i][j] = e.u[i - di][j - dj];
            }
        }
        return minor;
    }

    @Override
    public void run() {
        View view=new View();
        SquareMatrix p = new SquareMatrix(this.n);
        try {
            view.matrix1(p);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Это лажа");
        }
        double f = Determinant(p);
        System.out.println(f);
    }



}

