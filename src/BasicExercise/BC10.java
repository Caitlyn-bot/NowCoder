package BasicExercise;

import java.util.Scanner;

/**
 * 题目描述
 * 输入3科成绩，然后把三科成绩输出，成绩为整数形式。
 * 输入描述:
 *
 * 一行，3科成绩，用空格分隔，范围（0~100）。
 *
 * 输出描述:
 *
 * 一行，把3科成绩显示出来，输出格式详见输出样例。
 *
 * 示例1
 * 输入
 * 复制
 *
 * 60 80 90
 *
 * 输出
 * 复制
 *
 * score1=60,score2=80,score3=90
 */
public class BC10 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int score1 = myScanner.nextInt();
        int score2 = myScanner.nextInt();
        int score3 = myScanner.nextInt();
        System.out.printf("score1=%d,score2=%d,score3=%d",score1,score2,score3);
    }
}
