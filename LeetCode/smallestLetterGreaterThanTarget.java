package LeetCode;

class smallestLetterGreaterThanTarget{

    //own solution
    public static char check(char letters[], char target){

        int minVal = Integer.MAX_VALUE;
        for(int i = 0;i<letters.length;i++){
            int a = letters[i];
            if(a!=target && a>target){
            minVal = Math.min(minVal, a);
            }
        }
        if(minVal == Integer.MAX_VALUE){
            System.out.println(letters[0]);
            return letters[0];
        }
        char c = (char)minVal;
        System.out.println(c);
         return c;
    }

    //optimal solution
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i = 0;i<letters.length;i++){
         if(target<letters[i]){
             return letters[i];
         }
        }
        return letters[0];
     }

    public static void print(char letters[]){
        for(int i = 0;i<letters.length;i++){
            int a = letters[i];
            System.out.print(a+" ");
        }
    }

   
    public static void main(String[] args) {
        //char letters[] = {'c','f','j'};
        char letters[] = {'x','x','y','y'};
        char target = 'z';

        print(letters);
        System.out.println();
        System.out.println((int)target);
        check(letters, target);
       
    }
}