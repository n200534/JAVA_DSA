package BinarySearch.BS_1D_array;

public class single_element_sorted_array {
    //finding the single element in the sorted array
    public static int findSingle1(int[] arr){
        //brute force approach 

        for(int i=0;i<arr.length;i++){
            if(i==0 && arr[i]!=arr[i+1]) return arr[i]; // first element
            if(i==arr.length-1 && arr[i]!=arr[i-1]) return arr[i]; // last element
            if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1]) return arr[i]; // middle element
        }
        return -1; // if no single element found
    }
    public static int findSingle(int[]arr){
        //optimal approach using binary search
        int n=arr.length;
        if(n==1) return arr[0]; // if only one element 
        if(arr[0]!=arr[1]) return arr[0];// first element
        if(arr[n-1]!=arr[n-2]) return arr[n-1]; // last element
        int low=1,high=n-2; // search in the middle part
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1])
                return arr[mid]; // found single element
            if((mid%2==0 && arr[mid]==arr[mid+1]) || (mid%2==1 && arr[mid]==arr[mid-1])){
                low=mid+1; // search in the right part
            } else {
                high=mid-1; // search in the left part  
            }
        }

        return -1;
    }

}
