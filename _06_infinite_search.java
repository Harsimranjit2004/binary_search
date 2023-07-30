package binary_search;

import java.util.Scanner;

public class _06_infinite_search {
    public static void main(String args[]){
        int[] arr = {-18,-12, 0,2,3,4,6,78,98};
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        int ans = findingRange(arr, target);
        System.out.println(ans);
    
    } 
    static int findingRange(int[] arr, int target){
        // first find the range 
        // start with box of 2
        int start = 0  ; 
        int end = 1;
        // condition for the target to lie in range
        while(target > arr[end]){
            int newStart  = end+1;
            // double box value
            // end = previous + 2* size of window
            end = end + (end-start+1) *2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
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
}
