import java.util.Scanner;
class UserDefineMethode{
    // with static method

    public static void findEven(int a){
        if(a%2==0){
            System.out.println(a+" is Even number");
        }else{
            System.out.println(a+" not a Even number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        findEven(a);
    }
}