class main{
    public static void main(String[] args)
    {
        int[] a = {16,17,4,3,5,2};

        for(int i = 0; i < a.length; i++){

            boolean isLeader = true;   // assume it is leader

            for(int j = i + 1; j < a.length; j++){

                if(a[i] <= a[j]){
                    isLeader = false;   // not a leader
                    break;
                }
            }

            if(isLeader){
                System.out.print(a[i] + " ");
            }
        }
    }
}
