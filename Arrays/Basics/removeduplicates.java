package Arrays.Basics;

import java.util.HashSet;
import java.util.Set;

class brute{
        public static void main(String[]args){
            // // we use the set datastructure
            int arr[]={1,2,2,2,4,5,6,6,6,7};
            Set<Integer> set=new HashSet<>();

            for(int num:arr){
                set.add(num);
            }



        }
    }
        
class better{
    public static int main(String[]args){
    //we use the extra array 
        int nums[]={1,1,2,2,2,3,3,4,5,5,6};
        if (nums.length == 0) return 0;

    int i = 0;
    for (int j = 1; j < nums.length; j++) {
        if (nums[j] != nums[i]) {
            i++;
            nums[i] = nums[j];
        }
    }

    return i + 1;  // new length of array

    }
}



public class removeduplicates {
    //To remove the duplicates from an array 
    

    public static void main(String[]args){
        //using the 2 pointers 
        int nums[]={1,1,2,2,2,3,3,4,5,5,6};
        if(nums.length==0) return 0;
        int i =0;
        

        
    }
}
