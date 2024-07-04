package String;

public class stringBuilder {
    
    /* when ever you want to modifiy any existing string then that time its not possible because 
     * In java string are immutable 
     * It will create new copy of exsiting string and add that new changes every time
     * so copying the string will take time and loop is also there so this will make the time complexity O(n*n)
     * 
     * To solve this issue java provides the String builder to performs the opration in string without creating copy
     * 
     * sb.toString()  it can convert any object into string But its condition is it should be Object
     */

     public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder(" ");
        for(char ch = 'a' ; ch<='z';ch++){
            sb.append(ch);
        }

        System.out.println(sb);
     }
}
