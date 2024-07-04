package String;
public class CompressString {

    static String compress(String str){ //O(n)
        String newStr = " ";
        for(int i =0; i< str.length();i++){
            Integer count=1;
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count>1){
                newStr += count.toString(); // convert integer to string using tostring method
            }
        }
        return newStr;
    }

     public static void main(String[] args) {
        String str = "aaabbccc";
        System.out.println(compress(str));
     }

}