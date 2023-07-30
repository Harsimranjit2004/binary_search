package binary_search;

import java.util.Scanner;

public class _05_first_last_index {
    public static void main(String args[]){
        int[] arr = {-18,-12, 0,2,3,4,6,78,98};
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        int[] ans = first_last_index(arr, target);
        System.out.println(ans);
    }
    public static int[] first_last_index(int[] arr , int target){
        int[] ans = { -1,-1};
       int start = search(arr,target,true);
       int end = search(arr, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    static int search(int[] nums, int target , boolean findStartIndex){
        int start = 0;
        int ans = -1;
        int end = nums.length-1;
        

        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid < target){
                end= mid-1;
            }
            else if(mid > target){
                start = mid+1;
            }
            else{
                // possible ans may found
                ans = mid;
                if(findStartIndex == true){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
