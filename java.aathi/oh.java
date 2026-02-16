class oh{
    public static void main(String args[])
    {
        int[] a={16,17,4,3,5,2};
       

        for(int i=0;i<a.length;i++){
             boolean isLeader=true;
            for(int j=i+1;j<a.length;j++){
                if(a[i]<=a[j]){
                    isLeader=false;
                    break;
                }
               
                }
                 if(isLeader){
                    System.out.println(a[i]);
            }
        }
    }
}