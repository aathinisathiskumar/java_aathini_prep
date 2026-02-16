public class large {
    public static void main(String[] args){

        int [][] a={{1,2,3},{4,5,6},{7,8,9}};

        int largest=a[0][0];
        int smallest=a[0][0];


        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]>largest){
                    largest=a[i][j];

                }
                if(a[i][j]<smallest){
                smallest=a[i][j];
            }
        }
       
    }
     System.out.println(largest);
        System.out.println(smallest);
}
}
