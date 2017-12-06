//USE THIS EDITOR TO CREATE QUICKLY A PROJECT FROM YOUR CODE
// * To do so:
//   * Delete this comment
//   * Write in the first line the language preceded by a double-slash. Example: //java (available languages: c,c++,c#,java,python,php)
//   * Paste or Write your code
//   * Click the START button
// After your project is created click START again to execute it
import java.util.Scanner;

public class Scanner_test {
    public static void main(String[] args) {
        System.out.println("input?");
        int num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        int[] wheel = new int[num1];
        for(int x = 1 ; x <= num1; x+=1){
            wheel[x-1]=x;
        }
        for(int x = 1 ; x <= num1; x+=num2){
            
            wheel = remove(wheel, x);
            
        }
        System.out.println(wheel.length);
    }
  public static int[] remove(int[] numbers, int target) {
        int count = 0;
        
        // loop over array to count number of target values.
        // this required to calculate length of new array
        for (int number: numbers) {
            if (number == target) {
                count++;
            }
        }

        // if original array doesn't contain number to removed
        // return same array
        if (count == 0) {
            return numbers;
        }

        int[] result = new int[numbers.length - count];
        int index = 0;
        for (int value : numbers) {
            if (value != target) {
                result[index] = value;
                index++;
            }
        }
        numbers = null; // make original array eligible for GC     
        return result;


}


}
