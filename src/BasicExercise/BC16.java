package BasicExercise;

import java.util.Scanner;

/**
 * 题目描述
 * BoBo教KiKi字符常量或字符变量表示的字符在内存中以ASCII码形式存储。BoBo出了一个问题给KiKi，输入一个字符，输出该字符相应的ASCII码。
 * 输入描述:
 *
 * 一行，一个字符。
 *
 * 输出描述:
 *
 * 一行，输出输入字符对应的ASCII码。
 *
 * 示例1
 * 输入
 * 复制
 *
 * c
 *
 * 输出
 * 复制
 *
 * 99
 */
public class BC16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char res = sc.next().charAt(0);
        System.out.print((int)res);
    }
}
