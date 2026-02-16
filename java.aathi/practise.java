class practise {
    static void leftRotation(int[] row, int k)
    {
        int n = row.length;
        k = k % n;   
        int[] temp = new int[k];
        for (int i = 0; i < k; i++)
        {
            temp[i] = row[i];
        }
        for (int i = k; i < n; i++)
        {
            row[i - k] = row[i];
        }
        for (int i = 0; i < k; i++)
        {
            row[n - k + i] = temp[i];
        }
    }
    public static void main(String[] args)
    {
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        int rows = arr.length;
        for(int i = 0; i < rows; i++)
        {
            leftRotation(arr[i], i);
        }
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
