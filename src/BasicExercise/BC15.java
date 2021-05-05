package BasicExercise;

import java.util.Scanner;

/**
 * 题目描述
 *
 *
 * 输入两个整数，范围-231~231-1，交换两个数并输出。
 * 输入描述:
 *
 * 输入只有一行，按照格式输入两个整数，范围，中间用“,”分隔。
 *
 * 输出描述:
 *
 * 把两个整数按格式输出，中间用“,”分隔。
 *
 * 示例1
 * 输入
 * 复制
 *
 * a=1,b=2
 *
 * 输出
 * 复制
 *
 * a=2,b=1
 *
 * 备注:
 *
 * 如果格式控制串中有非格式字符则输入时也要输入该非格式字符。
 */
public class BC15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.next().split("[=,]");
        System.out.print(arr[0] + "=" + arr[3] + "," + arr[2] + "=" + arr[1] );
    }
}
