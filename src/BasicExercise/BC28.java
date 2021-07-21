package BasicExercise;

import java.util.Scanner;

/**
 * 描述
 * 实现字母的大小写转换。多组输入输出。
 * 输入描述：
 * 多组输入，每一行输入大写字母。
 * 输出描述：
 * 针对每组输入输出对应的小写字母。
 * 示例1
 * 输入：
 *
 * A
 * B
 *
 * 输出：
 *
 * a
 * b
 */
public class BC28 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //toLowerCase() 方法用于把字符串转换为小写
        //toUpperCase() 方法用于把字符串转换为大写
        while(sc.hasNext()) {
            String str = sc.next();
            System.out.println(str.toLowerCase().charAt(0));
        }
    }
}
