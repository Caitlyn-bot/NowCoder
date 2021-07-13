package BasicExercise;

import java.util.Scanner;

/**
 * 描述
 *
 *  问题：一年约有3.156×107s，要求输入您的年龄，显示该年龄合多少秒。
 *
 *
 * 输入描述：
 * 一行，包括一个整数age(0<age<=200)。
 * 输出描述：
 * 一行，包含一个整数，输出年龄对应的秒数。
 * 示例1
 * 输入：
 *
 * 20
 *
 * 输出：
 *
 * 631200000
 */
public class BC22 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //定义变量存储年龄
        long age = scanner.nextLong();
        long result = age * 31560000;
        System.out.print(result);
    }
}
