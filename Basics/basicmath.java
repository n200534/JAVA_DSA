package Basics;

public class basicmath {
    public static void main(String[] args){
        /*
         * 
         * Extraction of digits 
         * 
         *  % - Gives last number 
         * 
         *  // - gives the integer part 
         * 
         *  / - gives the whole division 
         */

        System.out.println("From the main");


    }
}

class CountDigits {

    public static void main(String[] args){
        int n=10000;
        int count=0;
        while(n!=0){
            count++;
            n=n/10;

        }

        System.out.println(count);
    }
}

class ReverseNumber{
    public static void main(String[]args){
        int n=1234;
        int ReverseNumber=0;

        while (n>0){
            int lastdigit=n%10;
            n/=10;
            ReverseNumber=(ReverseNumber*10)+lastdigit;
        }

        System.out.println(ReverseNumber);
    }
}

class CheckPalindrome{
    public static void main(String[]args){

        int n=121;
        int original=n;
        int rev_num=0;

        while (n>0){
            int lastdigit=n%10;

            n/=10;
            rev_num=(rev_num*10)+lastdigit;
        }

        if (original==rev_num){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}

class ArmstrongNumber{
    public static void main(String[] args){
        int n=371;
        int sum=0;
        int digits=String.valueOf(n).length();
        while (n>0){
            int lastdigit=n%10;

            sum+=(Math.pow(lastdigit, digits));
        }

        if(n==sum){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not an Armstrong");
        }
    }
}

class Divisors {
    public static void main(String[] args) {
        int n = 36;
        System.out.println("Divisors of " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
class PrimeCheck {
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
}
}

