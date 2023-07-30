package binary_search;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class _03_floorNo {
    public static void main(String args[]){
        int[] arr = {-18,-12, 0,2,3,4,6,78,98};
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        int ans = floorNo(arr, target);
        System.out.println(ans);
    }
    public static int floorNo(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid < target){
                end= mid-1;
            }
            else if(mid > target){
                start = mid+1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[end];
    }

}
