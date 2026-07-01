public class MaxFromCards {

    public static void main(String[] args) {
        int[] arr = {6,2,3,4,7,2,1,7,1};
        // now write the logic
           int lSum =0, rSum =0, maxSum=0;
             for(int i=0; i<arr.length; i++)
             {
                lSum+=arr[i];
                int rightIndex = arr.length-1;

                for(int j =arr.length-1; j>=0; j--)
                {
                    lSum -=arr[i];
                    rSum +=arr[rightIndex];
                    rightIndex--;
                }
                maxSum = Math.max(maxSum , lSum+rSum);
             }
    System.out.println(maxSum);
}
}
