package BasicExercise;

/**
 * 题目描述
 * KiKi学会了printf在屏幕输出信息，他想输出一架小飞机。请帮他编写程序输出这架小飞机。
 * 输入描述:
 *
 * 无
 */
public class BC4 {
    public static void main(String[] args) {
        for(int i = 1; i <= 2;i++){
            System.out.print("     ");
            System.out.print("**");
            System.out.print("\n");
        }
        for(int j = 1 ;j <= 2;j++){
            for(int k = 1;k <= 12;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int l = 1; l <= 2;l++){
            System.out.print("    ");
            System.out.print("*  *");
            System.out.print("\n");
        }
    }
}
