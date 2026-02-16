public class welcome {
        public static void main(String[] args){

        int[] a={16,7,5,4,2,3};

        for(int i=0;i<a.length;i++){
            boolean isleader=true;

            for(int j=0;j<a.length;j++){

                if(a[i]<=a[j]){
                     isleader=false;
                    break;
                }
            }
            if(isleader){
                System.out.print(a[i]);
            }
        }
    }
    
}
