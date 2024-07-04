package Recurrsion;

public class removeDuplicate {
    
    static void remove(int idx, String str, StringBuilder newString, boolean map[]){
        // map is used to store the data int the array
        //base case
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        //kaam 
        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
            //dublicate asel tar i++ aur call the function without adding to the newString
            remove(idx+1,str,newString,map); 
        }else{
            map[currChar-'a']=true;
             //dublicate nasel tar i++ and call the function to adding into the newString
            remove(idx+1, str, newString.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        
        String str  = "appnacollege";
        remove(0, str, new StringBuilder(""), new boolean[26]);
    }
}
