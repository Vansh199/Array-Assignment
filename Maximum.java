// time complexity=O(n)
// space complexity=O(1)


public class Maximum {
    public static void main(String[] args) {
    //    //Question->1
    //    // find maximum element in array
       
    //    // take an array
    //    int[] arr={34,21,54,65,43};
    //    // output should be 65 because maximum element is 65

    //    // store length of array in n variable
    //    int n=arr.length;
    //    // take maximum variable and we say that by default maximum element is at index 1
    //    int maximum=arr[0];
    //    // traverse in array till n
    //    for(int i=0;i<n;i++){
    //        // if element is bigger than maximum then we update the maximum
    //        if(arr[i]>maximum){
    //         // now the largest element in array is store in maximum
    //         maximum=arr[i];
    //        }
    //    }
    //    System.out.println("Maximum Element in Array is: " + maximum);




       //Question->2
       // find maximum element in array
       
       // take an array
       int[] arr={4,3,6,7,1};
       // output should be 7 because maximum element is 7

       // store length of array in n variable
       int n=arr.length;
       // take maximum variable and we say that by default maximum element is at index 1
       int maximum=arr[0];
       // traverse in array till n
       for(int i=0;i<n;i++){
           // if element is bigger than maximum then we update the maximum
           if(arr[i]>maximum){
            // now the largest element in array is store in maximum
            maximum=arr[i];
           }
       }
       System.out.println("Maximum Element in Array is: " + maximum);
    }
}
