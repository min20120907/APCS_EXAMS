/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2;

import java.util.Scanner;

/**
 *
 * @author min20120907
 */
public class Exam2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int Secrect_Num = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("請輸入你想尋找祕密差的數字:");
        String input = s.nextLine();

        if (input.length() == 3) {
            char ac = input.charAt(0);
            int a = Integer.parseInt(String.valueOf(ac));
            char cc = input.charAt(2);
            int c = Integer.parseInt(String.valueOf(cc));

            int b = 0;

            char bc = input.charAt(1);
            b = Integer.parseInt(String.valueOf(bc));

            a += c;

            Secrect_Num = Math.abs(a - b);
        } else if (input.length() == 2) {
            char ac = input.charAt(0);
            int a = Integer.parseInt(String.valueOf(ac));
            int b = 0;
            char bc = input.charAt(1);
            b = Integer.parseInt(String.valueOf(bc));
            Secrect_Num = Math.abs(a - b);
        } else if (input.length() == 1) {
            char ac = input.charAt(0);
            int a = Integer.parseInt(String.valueOf(ac));
            Secrect_Num = Math.abs(a);
        } else {
            int a = 0,b =0;
            
            for (int h = 1; h < input.length()-2; h+=2) {
                
                char bc = input.charAt(h);
                b = Integer.parseInt(String.valueOf(bc));
char bb = input.charAt(h+2);
                b += Integer.parseInt(String.valueOf(bb));
            }
            for (int i = 0; i < input.length(); i += 2) {
                
                    char ab = input.charAt(i);
                 a += Integer.parseInt(String.valueOf(ab));
                 
                 
                
                Secrect_Num = Math.abs(a - b);
            }
        }

        System.out.println("結果出爐！");
        System.out.println("您的祕密差爲: " + Secrect_Num);
        
    }

}
