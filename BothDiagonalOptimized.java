import java.util.Scanner;

//time complexity=O(n)
//space complexity=O(1)
public class BothDiagonalOptimized {
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
// As we have a square matrix, and we know this special property of Diagnol element, then for one diagonal both indices are same and for other the sum of both = m-1. 
// So we will optimise our solution by just traversing one time and getitng both the values. To skip middle element twice we will add an check extra i.e. i!= m-1-i
            System.out.println("Elements of both diagonals:");
            for(int i=0;i<m;i++){
                System.out.print(arr[i][i] + "  ");

                if(i != m-1-i){
                    System.out.print(arr[i][m-1-i] + "  ");
                } 
            }
   }
}
