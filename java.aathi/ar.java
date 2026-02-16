public class ar {
    public static void main(String[] args){
        int[][] a={{1,2,3},{4,5,6}};

        int[][]b={{1,2},{3,4},{5,6}};


        int r1=a.length;
        int c1=a[0].length;

        int r2=b.length;

        int c2=b[0].length;

        int[][] result=new int[r1][c2];

        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    result[i][j] = result[i][j]+ a[i][j]+b[i][j];

                }
            }
        }
        
         for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){

                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
    
}
