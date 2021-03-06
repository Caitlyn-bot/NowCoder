package BasicExercise;

import java.util.Scanner;

/**
 * 描述
 * KiKi想知道一个整数的奇偶性，请帮他判断。从键盘任意输入一个整数（范围-231~231-1），编程判断它的奇偶性。
 * 输入描述：
 * 多组输入，每行输入包括一个整数。
 * 输出描述：
 * 针对每行输入，输出该数是奇数（Odd）还是偶数（Even）。
 * 示例1
 * 输入：
 *
 * 4
 * 7
 *
 * 输出：
 *
 * Even
 * Odd
 */
public class BC44 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            if(num % 2 == 0){
                System.out.println("Even");
            }else{
                System.out.println("Odd");
            }
        }
    }
}
