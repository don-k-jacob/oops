public class TransposeMatrix {
    public static void main(String[] args) {
        int mat[][]={{1,9,3},{7,1,8},{4,0,4}};
        int transpose[][]= new int[3][3];
        int i,j;
        System.out.println("\nORGINAL MATRIX\n");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(mat[i][j] +"  ");
            }
            System.out.print("\n");
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                transpose[i][j]=mat[j][i];
            }
        }
        System.out.println("\n\n\nTRANSPOSED MATRIX\n");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(transpose[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }
}