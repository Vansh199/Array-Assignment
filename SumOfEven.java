// time complexity=O(n)
// space complexity=O(1)


public class SumOfEven{
    public static void main(String[] args) {
    //     //Question->1
        
    //     // print sum of elements that present at even indexes
    //    // take an array
    //    int[] arr={3,20,4,6,9};
    //    // store length of array in n variable
    //    int n=arr.length;
    //    // take sum variable which is zero
    //    int sum=0;
    //    // traverse in array till n where n is 5
    //    for(int i=0;i<n;i++){
    //     // if remainder is zero by dividing i by 2 means it is even index 
    //     if(i%2==0){
    //         // sum of elements that present at even indexes
    //         sum+=arr[i];
    //     }
    //    }
    //    System.out.println("Sum of elements that present at even indexes: " + sum);



        //Question->2
        
        // print sum of elements that present at even indexes
       // take an array
       int[] arr={4,3,6,7,1};
       // store length of array in n variable
       int n=arr.length;
       // take sum variable which is zero
       int sum=0;
       // traverse in array till n where n is 5
       for(int i=0;i<n;i++){
        // if remainder is zero by dividing i by 2 means it is even index 
        if(i%2==0){
            // sum of elements that present at even indexes
            sum+=arr[i];
        }
       }
       System.out.println("Sum of elements that present at even indexes: " + sum);

    }
}