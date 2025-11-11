package Strings.basic;

public class rotationstr {
    //Check if one string is rotation of another
    public static boolean isRotation(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        String temp=s1+s1;
        return temp.contains(s2);
    }
}
