package binary_search;

public class _01_order_agnostic {
    public static void main(String args[]){
        int[] arr = {-18,-12, 0,2,3,4,6,78,98};
        int target = 0;
        int ans =  orderAgnosticBinarySearch(arr, target);
        System.out.println(ans);


    }
    static int orderAgnosticBinarySearch(int[] arr , int target){
        int start = 0 ; 
        int end =  arr.length-1;

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
