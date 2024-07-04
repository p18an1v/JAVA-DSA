package String;

public class LargestString {
    //lexical graphical comparison
    public static void main(String[] args) {
        String str[] = {"apple","mango","banana"};

        String bigger = str[0];
        for(int i=0;i<str.length;i++){
            if(bigger.compareToIgnoreCase(str[i])<0){

                bigger = str[i];
            }
        }
        System.out.println(bigger);
    }
}
