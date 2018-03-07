import java.util.Arrays;

public class Matrix implements IMatrix {
    private int he;

    private double[][] Mat;

    Matrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Mat[i][j] = 0;
            }
        }
       this.he=n;
    }

    @Override
    public double getElem(int i, int j) {
        return Mat[i][j];
    }

    @Override
    public void changeElem(int i, int j, double a) {
        Mat[i][j] = a;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Matrix matrix = (Matrix) o;

        return Arrays.deepEquals(Mat, matrix.Mat);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(Mat);
    }



    @Override
    public double deterMatr(Matrix Mat) {
double det=1;
        for(int i = 0; i < he-1;i++){
        int k;
            for(int j=i;j<he;i++){
                k=i+1;
                Mat.changeElem(i,j, Mat.getElem(i,j)/ Mat.getElem(j,j)) ;
                Mat.changeElem(k,j,Mat.getElem(k,j)-Mat.getElem(i,j));
            }


                   }
        for(int i = 0; i < he;i++ ){

           det*=Mat.getElem(i,i);
        }
    return det;}
}
