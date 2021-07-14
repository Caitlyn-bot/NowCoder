package BasicExercise;

import java.util.Scanner;

/**
 * 描述
 *
 * 给定秒数seconds (0< seconds < 100,000,000)，把秒转化成小时、分钟和秒。
 * 输入描述：
 * 一行，包括一个整数，即给定的秒数。
 * 输出描述：
 * 一行，包含三个整数，依次为输入整数对应的小时数、分钟数和秒数（可能为零），中间用一个空格隔开。
 * 示例1
 * 输入：
 *
 * 3661
 *
 * 输出：
 *
 * 1 1 1
 */
public class BC23 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //定义变量存储给定的总时间
        long count = scanner.nextLong();
        //h表示小时，m表示分钟，s表示秒
        long h = count / 3600;
        long m = (count % 3600)/60;
        long s = count % 60;
        System.out.print(h + " " + m + " " + s);
    }
}
