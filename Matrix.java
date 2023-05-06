import java.util.Scanner;

//time complexity=O(m*n)
//space complexity=O(1)

public class Matrix{
    public static void main(String[] args) {
       //take input by user
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Number of Rows:");
       int m=sc.nextInt();
       System.out.println("Enter Number of columns:");
       int n =sc.nextInt();
       //create 2D array
       int[][] arr=new int[m][n];
       int positive=0,negative=0,zero=0,even=0,odd=0;
        System.out.println("Enter " +m*n+" Elements");
        //traverse in array
        //outer loop is running for rows
        //inner loop is running for columns
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              arr[i][j]=sc.nextInt();
              sc.close();
               //check conditions
               if(arr[i][j]>0){
                positive++;
               }
               if(arr[i][j]<0){
                negative++;
               }
               if(arr[i][j]==0){
                zero++;
               }
               if(arr[i][j]%2==0){
                even++;
               }
               if(arr[i][j]%2!=0){
                odd++;
               }
            }
        }
        System.out.println("Number of Positive elements: " + positive);      
        System.out.println("Number of Negative elements: " + negative);
        System.out.println("Number of Zeroes: " + zero); 
        System.out.println("Number of Even elements: " + even);
        System.out.println("Number of odd elements: " + odd);    
    }
}