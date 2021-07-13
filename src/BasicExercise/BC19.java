package BasicExercise;

import java.util.Scanner;

/**
 * 描述
 *
 * 将一个四位数，反向输出。
 *
 *
 * 输入描述：
 * 一行，输入一个整数n（1000 <= n <= 9999）。
 * 输出描述：
 * 针对每组输入，反向输出对应四位数。
 * 示例1
 * 输入：
 *
 * 1234
 *
 * 输出：
 *
 * 4321
 */
public class BC19 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //定义n接收变量
        int n = scanner.nextInt();
        //分别得到各个位的数
        int a = n / 1000;
        int b = (n % 1000) / 100;
        int c = (n % 100) / 10;
        int d = n % 10;
        //求出反向后的四位数,这里要注意，当bcd为0时，所以要转为字符串
        String res =""+ d +  c + b +  a;
        System.out.print(res);
    }
}
