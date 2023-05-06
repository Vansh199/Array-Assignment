// time complexity=O(n)
// space complexity=O(1)


public class PeakElement {
    public static void main(String[] args) {
    //    //Question->1
    //    // find first peak element in array
    //    // peak element means the element is greater than its just left and just right neighbor   
       
    //    // take an array
    //    int[] arr={1,3,2,6,5};
    //    // output should be 3 because 3 is greater than its left and right element

    //    // store length of array in n variable
    //    int n=arr.length;
    //    // traverse in array till n from 1
    //    for(int i=1;i<n;i++){
    //     // if the element at 0 index is smaller than element at 1 and element at 1 index is greater than element at 2 means it is peak element otherwise i is increment
    //     if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
    //         System.out.println("First Peak Element in Array is: " + arr[i]);
    //         // we use break because we are finding only first peak element after getting the element we exit the loop
    //         break;
    //     }
    //    }



      //Question->2
       // find first peak element in array
       // peak element means the element is greater than its just left and just right neighbor   
       
       // take an array
       int[] arr={1,4,7,3,2,6,5};
       // output should be 7 because 7 is greater than its left and right element

       // store length of array in n variable
       int n=arr.length;
       // traverse in array till n from 1
       for(int i=1;i<n;i++){
        // if the element at 0 index is smaller than element at 1 and element at 1 index is greater than element at 2 means it is peak element otherwise i is increment
        if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
            System.out.println("First Peak Element in Array is: " + arr[i]);
            // we use break because we are finding only first peak element after getting the element we exit the loop
            break;
        }
       }
    }
}
