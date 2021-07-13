package BasicExercise;

import java.util.Scanner;

/**
 * 描述
 *
 * 给定一个浮点数，要求得到该浮点数的个位数。
 * 输入描述：
 * 一行，包括一个浮点数。
 * 输出描述：
 * 一行，包含一个整数，为输入浮点数对应的个位数。
 * 示例1
 * 输入：
 *
 * 13.141
 *
 * 输出：
 *
 * 3
 */
public class BC21 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //定义变量接收浮点数
        float a = scanner.nextFloat();
        //对10取余，输出时指定格式为整数
        int res =(int)a%10;
        System.out.printf("%d",res);
    }
}
