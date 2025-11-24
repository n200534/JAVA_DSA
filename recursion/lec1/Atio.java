package recursion.lec1;

public class Atio {
    //implementing atoi function to convert string to integer using recursion
    public static int atoi(String s){
        s=s.trim();
        if(s.length()==0){
            return 0;
        }
        int sign=1;
        int index=0;
        if(s.charAt(0)=='-'){
            sign=-1;
            index++;
        } else if(s.charAt(0)=='+'){
            index++;
        }
        return sign * atoiHelper(s, index,0);

        
    }
    private static int atoiHelper(String s, int index, int result){
        if(index>=s.length() || !Character.isDigit(s.charAt(index))){
            return result;
        }
        int digit=s.charAt(index)-'0';
        result=result*10+digit;
        return atoiHelper(s,index+1,result);
    }
    public static void main(String[] args) {
        String str="-12345";
        int num=atoi(str);
        System.out.println("The integer value of the string is: "+num);
    }

}
