import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author cangyulin
 */
public class Exam5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        int quantity=s.nextInt();
        
        
        List<Integer> list;
        list = new ArrayList<Integer>();
        List<Integer> list1 = new ArrayList<Integer>(list);
        for(int i =1;i<=quantity;i++){
            Scanner s1=new Scanner(System.in);
        String input = s1.nextLine();
        String[] group = input.split("\\s+");
        int[] NumGroup =StringArrToIntArr(group);
        list.add(NumGroup[0]);
        list.add(NumGroup[1]);
        }
        int size =list1.size();
       int covered_Area=(Collections.max(list)-Collections.min(list));
        Arrays.sort(list.toArray());
        int intil_Sum=0;
        for(int j=0;j<size;j++){
            
            if(list.get(j+1)-list.get(j)==0){
            }
            else{
            covered_Area-=(list.get(j+1)-list.get(j));
            }
            
    }
    System.out.println(covered_Area);
    }
         public static int getArrayIndex(int[] arr,int value) {

        int k=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==value){
                k=i;
                break;
            }
        }
    return k;
}
               public static int[] StringArrToIntArr(String[] s) {
   int[] result = new int[s.length];
   for (int i = 0; i < s.length; i++) {
      result[i] = Integer.parseInt(s[i]);
   }
   return result;
}
    
}
