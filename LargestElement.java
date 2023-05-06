//time complexity=O(m*n)
//space complexity=O(1)



public class LargestElement {
    public static void main(String[] args) {
     
        //take 2D array
        //find largest element 
        int[][] arr={{1,2,4,0},
                     {2,5,7,-1},
                     {4,2,6,9}};
        
        //store length of rows in m variable
        int m=arr.length;
        //store length of columns in n variable
        int n=arr[0].length;
        //by default we say that element at 0 row 0 column is largest
        int largest=arr[0][0];
        //traverse in array
        //outer loop is running for rows
        //inner loop is running for columns
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                //check the condition if element at i and j index is bigger than element at 0 row and 0 column then update the largest
                if(arr[i][j]>largest){
                    largest=arr[i][j];
                }
            }
        }

        System.out.println("Largest Element in Matrix: " + largest);

    }
}
