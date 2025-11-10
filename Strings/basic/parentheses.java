package Strings.basic;

public class parentheses {
    public static String removeParantheses(String s){
        StringBuilder result=new StringBuilder();
        int depth=0
        for (char ch:s.toCharArray()){
            if(ch=="("){
                if(depth>0){
                    result.append(ch);
                }
                depth++;
            }else if (ch==")"){
                depth--;
                if(depth>0){
                    result.append(ch);
                }
            }
        }
    }
}
