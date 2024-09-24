package Stack;

import java.util.*;
public class revStringWithStack {

    public static String revString( String str){

        Stack<Character> s = new Stack<>();
        int i = 0; 
        while(i<str.length()){
            s.push(str.charAt(i));
            i++;
        }

        StringBuilder sb = new StringBuilder(" ");
        while(!s.isEmpty()){
            char c = s.pop();
            sb.append(c);
        }

          return sb.toString();
    }

    public static void main(String[] args) {
        
        String  str ="abc";
        System.out.println(str);
        revString(str);
        System.out.println(revString(str));
    }
}
