package Arrays.Basics;

public class largestinarray {
    public static void main(String[]args){
        int arr[]={1,3,4,2,5,64};

        int largest=arr[0];
        for(int i:arr){
            if (i>largest){
                largest=i;
            }
        }
        System.out.println(largest);
    }
}
