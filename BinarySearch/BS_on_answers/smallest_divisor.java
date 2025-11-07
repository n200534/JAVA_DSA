package BinarySearch.BS_on_answers;

public class smallest_divisor {
     //Brute force approach
     public static int smallestDivisor(int[] arr,int limit){
        int n=arr.length;
        int maxi=Integer.MIN_VALUE;
        //find the maximum element in the array
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,arr[i]);
        }

        //find the smallest divisor from 1 to maxi
        for(int divisor =1;divisor<=maxi;divisor++){
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=Math.ceil((double)(arr[i])/(double)(d));
            }
            if(sum<=limit){
                return divisor;
            }
        }
        return -1; //if no divisor found
     }
        //Optimal approach using binary search
        public static int smallestDivisorOptimal(int[] arr,int limit){
            int n=arr.length;
            int low=1,high=Integer.MIN_VALUE;
            //find the maximum element in the array
            for(int i=0;i<n;i++){
                high=Math.max(high,arr[i]);
                }

            //apply binary search

            while(low<=high){
                int mid=low+(high-low/2);
                if(sumByDivisor(arr,mid)<=limit){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            return low ; //low will be the smallest divisor

        }
        pubic static int sumByDivisor(int[] arr,int divisor){
            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum+=Math.ceil((double)(arr[i])/(double)(divisor));
            }
            return sum;
        }

}
