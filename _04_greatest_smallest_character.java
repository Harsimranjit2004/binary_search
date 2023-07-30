package binary_search;

import javax.xml.stream.events.StartDocument;

public class _04_greatest_smallest_character {
    public static void main(String args[]){
        char[] arr = {'c','f','j'};
        char target = 0;
        int ans = largestLetter(arr, target);
        System.out.println(ans);

    }
    public static int largestLetter(char[] arr, char target){
        int start =0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(mid>target){
                start = mid+1;

            }else if(mid<target){
                end = mid-1;
            }
        }
        return arr[start% arr.length] ;
    }
}
