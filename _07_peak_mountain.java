package binary_search;

import java.util.Scanner;

public class _07_peak_mountain {
    public static void main(String args[]){
        int[] arr = {-18,-12, 0,2,3,4,6,78,98};
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        int ans = peakMountainArray(arr);
        System.out.println(ans);
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
    
}
