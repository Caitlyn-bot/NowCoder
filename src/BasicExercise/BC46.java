package BasicExercise;

import java.util.Scanner;

/**
 * 描述
 * KiKi开始学习英文字母，BoBo老师告诉他，有五个字母A(a), E(e), I(i), O(o),U(u)称为元音，其他所有字母称为辅音，请帮他编写程序判断输入的字母是元音（Vowel）还是辅音（Consonant）。
 * 输入描述：
 * 多组输入，每行输入一个字母。
 * 输出描述：
 * 针对每组输入，输出为一行，如果输入字母是元音（包括大小写），输出“Vowel”，如果输入字母是非元音，输出“Consonant”。
 * 示例1
 * 输入：
 *
 * A
 * b
 *
 * 输出：
 *
 * Vowel
 * Consonant
 */
public class BC46 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.next();
            if(s.toLowerCase().equals("a")||s.toLowerCase().equals("e")|| s.toLowerCase().equals("i")|| s.toLowerCase().equals("o")|| s.toLowerCase().equals("u")){
                System.out.println("Vowel");
            }else{
                System.out.println("Consonant");
            }
        }
    }
}
