package BasicExercise;

import java.util.Scanner;

/**
 * 描述
 * KiKi想完成字母大小写转换，有一个字符，判断它是否为大写字母，如果是，将它转换成小写字母；反之则转换为大写字母。
 * 输入描述：
 * 多组输入，每一行输入一个字母。
 * 输出描述：
 * 针对每组输入，输出单独占一行，输出字母的对应形式。
 * 示例1
 * 输入：
 *
 * a
 * A
 * Z
 *
 * 输出：
 *
 * A
 * a
 * z
 */
public class BC48 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String rexUpper = "[A-Z]";
        String rexLower = "[a-z]";

        while(scan.hasNext()){
            String dada = scan.next();
            if(dada.matches(rexUpper)){
                System.out.println(dada.toLowerCase());
            }else if(dada.matches(rexLower)){
                System.out.println(dada.toUpperCase());
            }
        }
    }
}
