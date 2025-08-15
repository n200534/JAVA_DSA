package Arrays.Basics;

public class checksort {
    public static void main(String[]args){
        //To check the array is sorted or not 
        int arr[]={1,2,3,4,5};

        for(int i =0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("Not sorted ");
                break;
            }
            else{
                System.out.println("sorted");
                
            }
        }
    }
}
