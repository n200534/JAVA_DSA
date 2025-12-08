package bit manipulation.lec1;

public class conversion {
    //convert to binary 
    public static String tobinary(int n){
        if(n==0){
            return "0";
        }
        StringBuilder sb=new StringBuilder();
        while(n>0){
            sb.append(n%2);
            n=n/2;
        }
        return sb.reverse().toString();
    }
    //convert to decimal
    public static int todecimal(String s){
        int result=0;
        int power=1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                result+=power;
            }
            power=power*2;
        }
        return result;
    }
}
