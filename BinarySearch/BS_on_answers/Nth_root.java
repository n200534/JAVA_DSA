package BinarySearch.BS_on_answers;

public class Nth_root {
    public static int mutiply(int x,int n, int m){
        long ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*x;
            if(ans>m) return 2; // to avoid overflow
        }
        return (int)ans;
        
    }
    public static int NthRoot(int n,int m){
        int low=1;int high=m;
        while(low<=high){
            int mid = low + (high - low) / 2;
            // calculate mid^n
            int val=mutiply(mid,n,m);
            if(val==m){
                return mid;
            } else if(val<m){
                low = mid + 1; // search in the right part
            } else {
                high = mid - 1; // search in the left part
            }

        }
        return -1; // if no root found

    }
}
