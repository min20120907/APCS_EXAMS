/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author min20120907
 */
public class Exam1 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        // TODO code application logic here

        int student = 0;
        int i,j;
        int temp;
        int bc = 0,wc = 0;
        boolean best=false,worse=false;
        
        Scanner s1 = new Scanner(System.in);
        System.out.println("請輸入人數:");
        student=s1.nextInt();
        Scanner s2= new Scanner(System.in);
        int[] score = new int[student];
        for(i=0;i<student;i++){
        	System.out.println("請輸入成績:");
        	 int input=s2.nextInt();
        	 score[i]=input;
        }for(i=0;i<student;i++){
        	System.out.print(score[i]+" ");
        }
        for (i=0;i<student;i++) {
            for (j=i+1;j<student;j++) {
                if (score[i]>score[j]) {
                    temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;
                }
            }
        }

        if (score[0]>=60) {
            best = true;
        } else {
            i=0;
            while (i<student) {
                if (score[i]<60) {
                    bc = score[i];
                    i++;
                } else {
                    break;
                }
            }
        }

        if (score[student-1]<60) {
            worse = true;
        } else {
            i = student-1;
            while (i!=-1) {
                if (score[i]>=60) {
                    wc = score[i];
                    i--;
                } else {
                    break;
                }
            }
        }

        for (i=0;i<student;i++) {
            System.out.print(score[i]);
            if (i==student-1) {
                System.out.println("");
            } else {
                System.out.print(" ");
            }
        }

        if (best == true) {
            System.out.println("best case");
        } else {
            System.out.println(bc);
        }

        if (worse == true) {
           System.out.println("worse case");
        } else {
            System.out.println(wc);
        }
        
        return;
    }

    static int[] addElement(int[] a, int e) {
        a  = Arrays.copyOf(a, a.length + 1);
        a[a.length - 1] = e;
        return a;
    }
    
}
