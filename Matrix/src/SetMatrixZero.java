
public class SetMatrixZero {

    public static void func(int[][] mat ){

        int m = mat.length;
        int n = mat[0].length;

        boolean row = false;
        boolean col = false;

        for (int i = 0;i< m ;i++) {
            if (mat[i][0] == 0) {
                row = true;
            }
        }

        for (int j = 0;j< n ;j++) {
            if (mat[0][j] == 0) {
                col = true;
            }
        }


        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){

                if(mat[i][0] == 0 || mat[0][j] == 0){
                    mat[i][j] = 0;
                }

            }
        }

        for (int i = 0;i< m ;i++) {
            if (row) mat[i][0] = 0;
        }

        for (int j = 0; j< n ;j++) {
            if (row) mat[0][j] = 0;
        }
    }

    public static void main(String[] args) {


    }
}