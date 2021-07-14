package BasicExercise;

import java.util.Scanner;

/**
 * 描述
 *
 *  问题：计算BMI指数（身体质量指数）。BMI指数（即身体质量指数，简称体质指数又称体重，英文为Body Mass Index，简称BMI），是用体重公斤数除以身高米数平方得出的数字，是目前国际上常用的衡量人体胖瘦程度以及是否健康的一个标准。主要用于统计用途，当我们需要比较及分析一个人的体重对于不同高度的人所带来的健康影响时，BMI值是一个中立而可靠的指标。
 *
 * 输入描述：
 * 一行，两个整数，分别表示体重（公斤），身高（厘米），中间用一个空格分隔。
 * 输出描述：
 * 一行，BMI指数（保留两位小数）。
 * 示例1
 * 输入：
 *
 * 70 170
 *
 * 输出：
 *
 * 24.22
 */
public class BC25 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();
        double height = scanner.nextDouble();
        System.out.printf("%.2f",weight*10000 / (height * height));
    }
}
