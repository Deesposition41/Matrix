import Matrix.Matrix;
import SquareMatrix.SquareMatrix;
import View.View;
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        View view = new View();
        SquareMatrix squarematrix = new SquareMatrix(2);
        Matrix matr = new Matrix(2, 2);
        Matrix matr1 = new Matrix(2, 2);
        Matrix matr2 = new Matrix(2, 2);
        view.matrix1(matr1);
        view.matrix1(matr2);
        System.out.println(Arrays.deepToString(matr.sum(matr1, matr2).u));
        new Thread(squarematrix).start();
        }
}

