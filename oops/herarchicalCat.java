public class herarchicalCat extends herarchicalAniaml {
    public void cat(){
        System.out.println("Cat mow mow...");
    }

    public static void main(String[] args) {
        herarchicalCat c = new herarchicalCat();
        c.Animal();
        c.cat();
    }
}
