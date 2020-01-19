package View;

import Matrix.Matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class View {



    public void matrix1(Matrix matrix) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < matrix.n; i++) {
            String[] s = new String[matrix.n];
            s = reader.readLine().split(" ");
            for (int j = 0; j < matrix.m; j++) {
                matrix.u[i][j] =Double.parseDouble(s[j]);
            }
        }
    }


}
