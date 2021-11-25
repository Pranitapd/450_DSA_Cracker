package Matrix;

public class MtrixReshape {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int reshape[][] = new int[r][c];
        int row = 0, col = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                reshape[row][col++] = mat[i][j];
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }
        return reshape;

    }

    public static void main(String args[]){
        MtrixReshape m = new MtrixReshape();
        int[][] mat = {{1,2,3},{3,4}};
        System.out.println(mat[0].length);
    }
}
