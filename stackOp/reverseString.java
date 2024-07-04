package stackOp;

import java.util.Stack;

public class reverseString {
    
    public static String reverse(String str){
        Stack<Character> s = new Stack<>();
        int idx =0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
            char curr = s.pop();
            sb.append(curr);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "abc";
        String result  = reverse(str);
        System.out.println(result);

    }
}
