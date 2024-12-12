package LeetCode;
import java.util.ArrayList;
public class unionOfArray {



    public static ArrayList<Integer> union(int arr1[], int arr2[]){

        int len1 = arr1.length;
        int len2 = arr2.length;
        int i= 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();


        while (i < len1 && j < len2) {
            
           if(arr1[i]<=arr2[j]){

            if(list.size()==0 || list.get(list.size()-1)!=arr1[i]){
                list.add(arr1[i]);
             }
             i++;
           }else{

            if(list.size()==0 || list.get(list.size()-1)!=arr2[j]){
                list.add(arr2[j]);
             }
             j++;
           }
        }

        while(i<len1){
            if(list.size()==0 || list.get(list.size()-1)!=arr1[i]){
                list.add(arr1[i]);
             }
             i++;
        }

        while(j<len2){
            if(list.size()==0 || list.get(list.size()-1)!=arr2[j]){
                list.add(arr2[j]);
             }
             j++;
        }

        return list;
    }
    
    public static void main(String args[]){

        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {1, 2, 3, 6, 7};

        System.out.println(union(arr1, arr2));

    }
}
