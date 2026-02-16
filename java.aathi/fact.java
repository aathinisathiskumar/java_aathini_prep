import java.util.Scanner;
public class fact {

    public static void main(String[] args){
        int i,n,fact=1;
        Scanner scan=new Scanner(System.in);

        System.out.println("enter the no:");
          n=scan.nextInt();

          for(i=1;i<=n;i++){
            fact=fact*i;
          
        }
        System.out.print(fact);
        scan.close();

          }
        


    }
    

