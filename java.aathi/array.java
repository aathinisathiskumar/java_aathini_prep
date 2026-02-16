import java.util.Scanner;

public class array {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int r=scan.nextInt();
        int c=scan.nextInt();


        int[] [] a=new int[r][c];
           int[] [] b=new int[r][c];
            int[] [] sum=new int[r][c];


            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    a[i][j]=scan.nextInt();
                }
            }
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    b[i][j]=scan.nextInt();
                }
            }

               for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++){
                   sum[i][j]=a[i][j]+b[i][j];
                }
               }
                for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    System.out.println(sum[i][j]);
                }
                System.out.println();
            }
            scan.close();
       
        }
       
    }


       