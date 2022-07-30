import java.util.Scanner;

public class conversion {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Lütfen matrisin satır ve sütun sayısını giriniz");
        int x= input.nextInt();
        int y= input.nextInt();


        int [][] matrix  = new int [x][y] ;
        int [][] trp_matrix  = new int [y][x] ;



            for(int i =0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                   matrix[i][j] =input.nextInt();
                }
            }

            for(int j=0; j<matrix[0].length;j++) {
                for(int i=0;i< matrix.length;i++ ){

                    trp_matrix[j][i]=matrix[i][j];
                }
            }

        System.out.println("Matris : ");
        for(int [] row: matrix) {
            for (int column : row) {


                System.out.print(column + "  ");

            }
            System.out.println();
        }

        System.out.println("Transpoze : ");
            for(int [] row: trp_matrix){
                for(int column : row){


                    System.out.print(column + "  ");
                }

                System.out.println();
            }







    }
}