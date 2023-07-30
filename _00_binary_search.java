package binary_search;

public class _00_binary_search {
    public static void main(String args[]){
        int[] arr = {-18,-12, 0,2,3,4,6,78,98};
        int target = 0;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

    }
    // return the index
    //return -1 if it does not exist
    static int binarySearch(int[] arr , int target){
        int start = 0 ; 
        int end =  arr.length-1;
        while(start <= end){
            // find middle 
           // int mid = (start + end)/2; // might we possible that(start + end) exceed the range in java
            int mid = start  + (end-start)/2;
            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1; // only executed when nothing is executed
    }
}
