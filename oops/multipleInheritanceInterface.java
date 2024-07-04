public class multipleInheritanceInterface implements multipleInterface,multipleInterfaceTwo {
    public void print(){
        System.out.println("hello1");
    }
    public void show(){
         System.out.println("hello2");
    }
    public static void main(String[] args) {
        multipleInheritanceInterface mii = new multipleInheritanceInterface();
        mii.print();
        mii.show();
    }
}
