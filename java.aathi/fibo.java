public class fibo {
    public static void main(String[] args) {

      int[] a={10,5,20,8,15};
      int largest=a[0];
      int secondlargest=0;


      for(int i=1;i<a.length;i++){

        if(a[i]>largest){

            secondlargest=largest;
            largest=a[i];
        }

        else if(a[i]>secondlargest && a[i]!=secondlargest){
            secondlargest=a[i];
        }
        
      }
    System.out.print(secondlargest);
            }
        }

    

