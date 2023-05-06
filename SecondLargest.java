// time complexity=O(n)
// space complexity=O(1)


public class SecondLargest {
    public static void main(String[] args) {
    //   //Question->1
    //   // find second largest element in array
      
    //   // take an array
    //   int[] arr={34,21,54,65,43};
    //   // store length of array in n variable
    //   int n=arr.length;
    //   // output should be 54 because second largest element is 54
    //   // first we find the largest element in array
    //   // we say that by default largest element in array is at index 1 and second largest element is at index 1
    //   int largest=arr[0];
    //   int second_largest=arr[0];
    //   // now find largest element
    //   // traverse in array till n
    //   for(int i=0;i<n;i++){
    //     // if element of i is bigger than largest then update the largest
    //     if(arr[i]>largest){
    //         largest=arr[i];
    //     }
    //   }
    //   // now find second largest
    //   // traverse in array till n
    //   for(int i=0;i<n;i++){
    //     // if element of i is smaller than largest and element of i is bigger than second largest then update second largest
    //     if(arr[i]<largest && arr[i]>second_largest){
    //         second_largest=arr[i];
    //     }
    //   }
    //      System.out.println("Second largest element in Array is: " + second_largest);



    //Question-> 2
      // find second largest element in array
      
      // take an array
      int[] arr={4,3,6,7,1};
      // store length of array in n variable
      int n=arr.length;
      // output should be 6 because second largest element is 6
      // first we find the largest element in array
      // we say that by default largest element in array is at index 1 and second largest element is at index 1
      int largest=arr[0];
      int second_largest=arr[0];
      // now find largest element
      // traverse in array till n
      for(int i=0;i<n;i++){
        // if element of i is bigger than largest then update the largest
        if(arr[i]>largest){
            largest=arr[i];
        }
      }
      // now find second largest
      // traverse in array till n
      for(int i=0;i<n;i++){
        // if element of i is smaller than largest and element of i is bigger than second largest then update second largest
        if(arr[i]<largest && arr[i]>second_largest){
            second_largest=arr[i];
        }
      }
         System.out.println("Second largest element in Array is: " + second_largest);
    }
}
