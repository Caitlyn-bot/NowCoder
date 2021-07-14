package BasicExercise;

import java.util.Scanner;

/**
 * 描述
 * 根据给出的三角形3条边a, b, c（0 < a, b, c < 100,000），计算三角形的周长和面积。
 * 输入描述：
 * 一行，三角形3条边（能构成三角形），中间用一个空格隔开。
 * 输出描述：
 * 一行，三角形周长和面积（保留两位小数），中间用一个空格隔开，输出具体格式详见输出样例。
 * 示例1
 * 输入：
 *
 * 3 3 3
 *
 * 输出：
 *
 * circumference=9.00 area=3.90
 */
public class BC26 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();
        //计算面积使用海伦公式，p=(a+b+c)/2,S=根号下p*(p-a)*(p-b)*(p-c)
        double circumference = a + b + c;
        double p = (a + b + c)/2;
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.printf("circumference=%.2f area=%.2f",circumference,area);
    }
}
