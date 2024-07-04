public class parametricConstructor {
    int id;
    String name;
    parametricConstructor(int i,String s){
        id = i;
        name = s;
    }
  void  display(){
         System.out.println("id : "+ id + " name : "+name);
    }

    public static void main(String[] args) {
        
        parametricConstructor  pc1= new parametricConstructor(1,"pranav");
        parametricConstructor  pc2 = new parametricConstructor(2,"sejal");
        pc1.display();
        pc2.display();
    }
}
