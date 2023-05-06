import java.util.Scanner;

//time complexity=O(m*n)
//space complexity=O(1)

public class BothDiagonalBruteForce {
    public static void main(String[] args) {
        
        //take input by user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows:");
        int m=sc.nextInt();
        System.out.println("Enter Number of columns:");
        int n =sc.nextInt();
        //create 2D array
        int[][] arr=new int[m][n];
        System.out.println("Enter "+m*n+" Elements:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Elements of both diagonals:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i+j==m-1){
                    System.out.print(arr[i][j]+" ");
                }
                else if(i==j){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
