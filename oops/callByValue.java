

public class callByValue {

    int data=50;  
  
 void change(int data){  
 data=data+100;//changes will be in the local variable only  
 }  
     
 public static void main(String args[]){  
     callByValue op= new callByValue();
  
   System.out.println("before change "+op.data);  
   System.out.println("after change "+op.data);  
  
 }  
    
}