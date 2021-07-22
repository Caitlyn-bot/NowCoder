package BasicExercise;

import java.util.Scanner;

/**
 * 描述
 *
 * 从键盘输入5个学生的成绩（整数），求他们的平均成绩（浮点数，保留一位小数）。
 * 输入描述：
 * 一行，连续输入5个整数（范围0~100），用空格分隔。
 * 输出描述：
 * 一行，输出5个数的平均数（保留一位小数）。
 * 示例1
 * 输入：
 *
 * 75 80 43 67 96
 *
 * 输出：
 *
 * 72.2
 */
public class BC33 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        System.out.print((a+b+c+d+e)/5.0);
    }
}
