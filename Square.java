import java.util.Scanner;

//time complexity=O(n^2)
//space complexity=O(1)

public class Square{
    public static void main(String[] args) {
        
      
        //take input by user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows and columns in odd dimension");
        int n=sc.nextInt();
        //take a 2D array
        int[][] arr=new int[n][n];
        //traverse in array
        //outer loop is running for rows
        //inner loop is running for columns
        System.out.println("Enter "+n*n+ " Elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Middle row and Middle column Elements:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i][n/2]+" ");
            for(int j=0;j<n;j++){
                if(j==n/2){
                    continue;
                }
                System.out.print(arr[n/2][j]+" ");
            }
        }
    }
}