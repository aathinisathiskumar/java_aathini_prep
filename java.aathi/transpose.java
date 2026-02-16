import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("enter row size: ");
        int r = scan.nextInt();

        System.out.print("enter column size: ");
        int c = scan.nextInt();

        int[][] a = new int[r][c];

        System.out.println("enter array elements:");

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = scan.nextInt();
            }
        }

        int[][] t = new int[c][r];

        // transpose logic
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                t[j][i] = a[i][j];
            }
        }

        // print transpose
        System.out.println("Transpose matrix:");

        for(int i = 0; i < t.length; i++){
            for(int j = 0; j < t[i].length; j++){
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }
}



    

















            

         

        

    

