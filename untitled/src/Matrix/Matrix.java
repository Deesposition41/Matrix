package Matrix;

public class Matrix {
    public int n;
    public int m;
    public double[][] u;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.u = new double[n][m];
    }


    public Matrix sum(Matrix q, Matrix w) {
        Matrix r = new Matrix(q.n, q.m);
        if (q.n == w.n && q.m == w.m) {
            for (int i = 0; i < r.n; i++) {
                for (int j = 0; j < r.m; j++) {
                    r.u[i][j] = q.u[i][j] + w.u[i][j];
                }
            }
        }
        return r;
    }

    public Matrix raz(Matrix q, Matrix w) {
        Matrix r = new Matrix(q.n, q.m);
        if (q.n == w.n && q.m == w.m) {
            for (int i = 0; i < r.n; i++) {
                for (int j = 0; j < r.m; j++) {
                    r.u[i][j] = q.u[i][j] - w.u[i][j];
                }
            }
        }
        return r;
    }

    public Matrix mul(Matrix q, Matrix w) throws Exception {
        Matrix r = new Matrix(q.n, w.m);
        if (q.m != w.n) {
            throw new Exception("Это лажа");
        }
        for (int i = 0; i < r.n; i++) {
            for (int j = 0; j < r.m; j++) {
                for (int k = 0; k < r.n; k++) {
                    r.u[i][j] += q.u[i][k] * w.u[k][i];
                }
            }
        }
        return r;
    }

    public Matrix scal(Matrix q, double t) {
        Matrix r = new Matrix(q.n, q.m);
        for (int i = 0; i < r.n; i++) {
            for (int j = 0; j < r.m; j++) {
                r.u[i][j] = q.u[i][j] * t;
            }
        }
        return r;
    }


}
