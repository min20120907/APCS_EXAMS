/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author min20120907
 */
public class Exam4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String[] group = input.split("\\s+");
        int[] NumGroup =StringArrToIntArr(group);
        int a = NumGroup[0];
        int b = NumGroup[1];
        int c = NumGroup[2];
        int as = NumGroup[0];
        int bs = NumGroup[1]*NumGroup[1];
        int cs = NumGroup[2]*NumGroup[2];
        if(as+bs==cs){
            System.out.println(input);
            System.out.println("Right");
        }else if(as+bs<cs){
            System.out.println(input);
            System.out.println("Obtuse");
        }else if(as+bs>cs){
            System.out.println(input);
            System.out.println("Acute");
        }else if(a+b<=c){
            System.out.println(input);
            System.out.println("No");
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
