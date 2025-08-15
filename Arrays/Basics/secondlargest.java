package Arrays.Basics;

public class secondlargest {
    public static void main(String[]args){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        
        int largest=arr[0];
        int num2;
        for(int i:arr){
            if(i>largest){
                num2=largest;
                largest=i;
                
            }
        }
        System.out.println(num2);
    }
}
