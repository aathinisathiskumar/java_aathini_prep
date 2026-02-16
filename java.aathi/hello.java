class hello{
    public static void main(String args[])
    {
        int[] arr={2,4,5,7,9,76};
        int evencount=0;
        int oddcount=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
             
           
}
 System.out.print("evencount:"+evencount);
            System.out.print("oddcount:"+oddcount);


}
}
