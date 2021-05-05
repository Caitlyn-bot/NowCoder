package BasicExercise;

import java.util.Scanner;

/**
 * 题目描述
 * 依次输入一个学生的学号，以及3科（C语言，数学，英语）成绩，在屏幕上输出该学生的学号，3科成绩。
 * 输入描述:
 *
 * 学号以及3科成绩，学号和成绩之间用英文分号隔开，成绩之间用英文逗号隔开。
 *
 * 输出描述:
 *
 * 学号，3科成绩，输出格式详见输出样例。
 *
 * 示例1
 * 输入
 * 复制
 *
 * 17140216;80.845,90.55,100.00
 *
 * 输出
 * 复制
 *
 * The each subject score of  No. 17140216 is 80.85, 90.55, 100.00.
 */
public class BC11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String ans = scanner.next();
        String[] array = ans.split("[;,]");
        int num = Integer.parseInt(array[0]);
        double score1 = Double.parseDouble(array[1]);
        double score2 = Double.parseDouble(array[2]);
        double score3 = Double.parseDouble(array[3]);
        System.out.printf("The each subject score of  No. %d is %.2f, %.2f, %.2f.",num,score1,score2,score3);
    }
}
