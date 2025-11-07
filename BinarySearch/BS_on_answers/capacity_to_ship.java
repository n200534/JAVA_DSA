package BinarySearch.BS_on_answers;

public class capacity_to_ship {
    // brute force approach
    //first lets write function for find the no.of days required to ship the packages with given capacity
    public static int daysRequired(int[]weight,int capacity){
        int days=1; //at least one day is required
        int currentLoad=0;
        for(int w:weight){
            if(currentLoad+w<=capacity){
                currentLoad+=w;
            }else{
                days++;
                currentLoad=w; //start new day with current package
            }
        }
        return days;
    }
    //shipwithin days brute 
    public static int shipWithinDaysBrute(int[] weights, int days) {
        int maxWeight=0;
        int sumWeight=0;
        //find the maximum weight and sum of weights
        for(int w:weights){
            maxWeight=Math.max(maxWeight,w);
            sumWeight+=w;
        }

        //try all capacities from maxWeight to sumWeight
        for(int capacity=maxWeight;capacity<=sumWeight;capacity++){
            int requiredDays=daysRequired(weights,capacity);
            if(requiredDays<=days){
                return capacity; //return the first capacity that can ship within given days
            }
        }
        return -1; //if no capacity found
    }
    public static int shipWithinDays(int[] weights, int days) {
        int low=0,high=0;
        //find the maximum weight and sum of weights
        for(int w:weights){
            low=Math.max(low,w); //minimum capacity should be at least the maximum weight
            high+=w; //maximum capacity can be sum of all weights
        }

        //apply binary search
        while(low<=high){
            int mid=low+(high-low)/2; //mid is the current capacity we are testing
            int requiredDays=daysRequired(weights,mid);
            if(requiredDays>days){
                //if more days are required, increase the capacity
                low=mid+1;
            }else{
                //if less or equal days are required, try to find a smaller capacity
                high=mid-1;
            }
        }
        return low; //low will be the minimum capacity required to ship within given days
    }
}
