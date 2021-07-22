package BasicExercise;

import java.util.Scanner;

/**
 * 描述
 * 输入一个十六进制数a，和一个八进制数b，输出a+b的十进制结果（范围-231~231-1）。
 * 输入描述：
 * 一行，一个十六进制数a，和一个八进制数b，中间间隔一个空格。
 * 输出描述：
 * 一行，a+b的十进制结果。
 * 示例1
 * 输入：
 *
 * 0x12 05
 *
 * 输出：
 *
 * 23
 *
 * 备注：
 *
 * 十六进制Hexadecimal一般以0x开头，例如0xFF。八进制Octal，一般以0开头，例如07。
 */
public class BC34 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        String num1=str1.substring(2,str1.length());
        String num2=str2.substring(1,str2.length());

        int a=Integer.valueOf(num1,16);
        int b=Integer.valueOf(num2,8);
        System.out.println(a+b);
    }
}
