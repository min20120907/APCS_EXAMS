/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam3;


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author min20120907
 */
public class Exam3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int numbering = s.nextInt();
        Scanner s1 = new Scanner(System.in);
        String input = s1.nextLine();
        String[] group = input.split("\\s+");
        int count = 0;
      int count2=0;
      
        int[] NumGroup =StringArrToIntArr(group);
        for (int h = 0; h < numbering ; h++) {
        int find = getArrayIndex(NumGroup,NumGroup[h]);
        int find1= getArrayIndex(NumGroup,h);
if(NumGroup[h]==h){
    count++;
    
}else if(NumGroup[h]==find1&&h!=0){
    

    count2+=1;
}
     
        }
        if(count2>0){
      System.out.println(count+(count2-1));
        }
        else{
            System.out.println(count);
        }
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
