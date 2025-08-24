public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] trans = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                trans[j][i] = a[i][j];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
