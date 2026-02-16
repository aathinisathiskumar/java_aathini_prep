import java.util.Scanner;
public class diagonal {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.print("enter the row size:");
        int r=scan.nextInt();

        System.out.print("enter the column size:");
        int c=scan.nextInt();

        int [][]a=new int[r][c];

        System.out.print("enter the array elements:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=scan.nextInt();
            }
        }

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(i>j){
                    a[i][j]=0;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]);
            }
        }
        System.out.println();
        

        
    }
    
}
