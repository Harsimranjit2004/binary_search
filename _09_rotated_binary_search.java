package binary_search;

public class _09_rotated_binary_search {
    
    public static void main(String args[]){
        int[] arr = {4,5,6,7,0,1,2};
    }
    static int search(int[] nums , int target){
        int pivot = findPivot(nums);
        // if not find a piovt it means array not rotated
        if(pivot == -1){
            // do normal binary search
            return binarySearch(nums, target, 0, nums.length-1);
        }
        // pivot fond find 2 ascending sorted array
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }
        return binarySearch(nums, target, pivot+1, nums.length-1);
    }
    static int binarySearch(int[] arr , int target, int start , int end){
    
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
    // not work for duplicate values
    static int findPivot(int[] arr){
        int start =0 ;
         int end = arr.length-1;
         while(start<=end){
            int mid = start + (end-start)/2;
            // 4 cases over here
            if(mid < end && arr[mid] > arr[mid+1]){ // index out of bound
                return mid;
            }
            if(mid > start && arr[mid]< arr[mid-1]){
                return mid;
            }
            if(arr[mid] <= arr[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
         }
         return -1;
    }
    static int findPivotwithDuplicate(int[] arr){
        int start =0 ;
         int end = arr.length-1;
         while(start<=end){
            int mid = start + (end-start)/2;
            // 4 cases over here
            if(mid < end && arr[mid] > arr[mid+1]){ // index out of bound
                return mid;
            }
            if(mid > start && arr[mid]< arr[mid-1]){
                return mid;
            }
            // if element at middel , start , end are equal skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                // skip duplicate
                
                //Note : if elemet at start and  end are pivot
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                // check end is pivot
                if(arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;

            }
            // left side is sorted , so pivot should be in right

            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid+1;
                 
            }else{
                mid = mid-1;
            }
         }
         return -1;
    }
}
