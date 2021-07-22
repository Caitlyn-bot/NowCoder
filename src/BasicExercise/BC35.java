package BasicExercise;

import java.util.Scanner;

/**
 * 描述
 * 从键盘任意输入一个字符，编程判断是否是字母（包括大小写）。
 * 输入描述：
 * 多组输入，每行输入包括一个字符。
 * 输出描述：
 * 针对每行输入，输出该字符是字母（YES）或不是（NO）。
 * 示例1
 * 输入：
 *
 * H
 * 9
 *
 * 输出：
 *
 * YES
 * NO
 */
public class BC35 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String str = sc.nextLine();
            // 使用正则表达式来判断是不是字母
            if(str.trim().matches("[a-zA-Z]")){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
