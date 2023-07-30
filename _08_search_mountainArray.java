package binary_search;

public class _08_search_mountainArray {
    public static void main(String args[]){

    }
    static int search(int[] arr , int target){
        int peak = peakMountainArray(arr);
        int firstTry = orderAgnosticBinarySearch(arr, target,0,peak);
        if(firstTry !=-1){
            return firstTry;
        }// try in second half
        return orderAgnosticBinarySearch(arr, target, peak+1, arr.length-1);
    }
    static int peakMountainArray(int[] arr){
        int start =0 ;
        int end = arr.length-1;
        while(start<end){
            int mid  = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]){
                // you are in decreasing part of array
                //this may be answer but look at left
                end = mid;
            }else{
                // in asc part of array 
                start = mid+1;
            }
            // in end , start== end pointing to largest no
            // start and end always to find max element in above 2 check so if they are pointing to same element therefore that no is the maximum one
            
        }
        return start;

    }
    static int orderAgnosticBinarySearch(int[] arr , int target,int start , int end){
        

        // find array sortd in ascending or descending
        boolean isAsc  = arr[start]<arr[end];
      
        while(start <= end){
            // find middle 
           // int mid = (start + end)/2; // might we possible that(start + end) exceed the range in java
            int mid = start  + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
           
          
        }
        return -1; // only executed when nothing is executed
    
    }
}
