package Basics;
public class recursion {

    // Print numbers from 1 to n using recursion
    public static void printFrom1ToN(int n) {
        if (n == 0) return; // Base case

        printFrom1ToN(n - 1); // Recursive call
        System.out.println(n); // Work after recursion
    }

    //Factorial using the recursion
    public static int Factorial(int n){
        if(n==0||n==1) return 1;
        return n * Factorial(n - 1); 
    }

    //sum of first n number
    public static int Sum(int n){
        if (n==0) return 0;
        return n + Sum(n-1);
    }

    //reverse an array using the recursion 

    public static void reverseArray(int arr[]){
        int start=0;
        int end=arr.length-1;

        if (start>=end) return;
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        reverseArray(arr);

    }

    public static void main(String[] args) {
        printFrom1ToN(5);
        System.out.println(Factorial(5));
        System.out.println(Sum(5));

        int arr[]={10,20,30,40};
        reverseArray(arr);
        System.out.println(arr);
    }
}
