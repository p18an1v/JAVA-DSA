public class aggregationCircle {
    
    double pi = 3.14;
    aggregaition square; //aggregation

    public double CircleArea(int r){
         square = new aggregaition();
         int sq = square.square(r);
         return pi*sq;
    }

    public static void main(String[] args) {
        aggregationCircle ac = new aggregationCircle();
         double r = ac.CircleArea(5);
        System.out.println("area of circle is : "+ r);
    }

}
