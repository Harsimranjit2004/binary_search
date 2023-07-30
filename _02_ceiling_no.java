package binary_search;

import java.util.Scanner;

public class _02_ceiling_no {
    public static void main(String args[]){
        int[] arr = {-18,-12, 0,2,3,4,6,78,98};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int ans = ceiling(arr, target);
        System.out.println(ans);

    }
    public static int ceiling(int[] arr , int target){
        int start  = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + end-start/2;
            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[start];
    }
    
}
