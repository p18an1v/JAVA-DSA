public class abstractRectangle extends abstractShape  {
    
    @Override
    void shape() {
       System.out.println(" Rectange is a shape");
    }
    public static void main(String[] args) {
        abstractShape c = new abstractRectangle();
        abstractShape r = new abstractCicle();

        c.shape();
        r.shape();
    }
}
