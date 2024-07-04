package RecursionBasicQuestion;

public class numToString {

    static void convertTOString(int num){
        //base condition
        if(num == 0){
            return;
        }
        String arr[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

        int lastDigit = num%10; //take last digit
        convertTOString(num/10);
        System.out.print(arr[lastDigit]+" ");
    }
   
    
    public static void main(String[] args) {
        int num = 2019;
        convertTOString(num);
    }
}
