public class callByValue1 {

    static void OuterMethod(int a){ // copy is send to this function  
        a = 10; //modefication happens will hapen in this method not out side this method
    };
    
    public static void main(String[] args) {
        
        int a = 5; // no change value
        OuterMethod(a);
        System.out.println(a); // value will not change 

    }
}
