public class triPatter {

    public static void main(String[] args) {
      /*  for(int line = 1; line<=4; line++ ){ //line total
        for(int star = 1; star<=line;star++){ //stars on that line
            System.out.print("*");
        }
        System.out.println();
       }*/

       for(int line = 1; line<=4; line++ ){ //line total
        for(int star = 1; star<=4-line+1;star++){ //stars on that line
            System.out.print("*");
        }
        System.out.println();
       }


    }
    
}