package BasicExercise;

import java.util.Scanner;

/**
 * 题目描述
 * 输入一个字符，用它构造一个三角形金字塔。
 * 输入描述:
 *
 * 输入只有一行，一个字符。
 *
 * 输出描述:
 *
 * 该字符构成的三角形金字塔。
 *
 * 示例1
 * 输入
 * 复制
 *
 * 1
 *
 * 输出
 * 复制
 *
 *     1
 *    1 1
 *   1 1 1
 *  1 1 1 1
 * 1 1 1 1 1
 */
public class BC12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i = 1 ; i <= 5;i++){
            //打印左边的空格
            for(int j = 5 - i ; j > 0;j--){
                System.out.print(" ");
            }
            //打印中间的数+空格
            for(int k = 0;k < i;k++){
                System.out.print(a + " ");
            }
            //进行换行
            System.out.println();
        }
    }
}
