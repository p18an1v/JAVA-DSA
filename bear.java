public class bear implements carnivors,harbivors {
    
    public void eat(){
        System.out.println("Can eat both meat and hearbs");
    }

    public static void main(String[] args) {
        bear b = new bear();
        b.eat();
    }
}


