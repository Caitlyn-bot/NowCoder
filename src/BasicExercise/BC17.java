package BasicExercise;

/**
 * 题目描述
 * 1
 *
 * 请计算表达式“(-8+22)×a-10+c÷2”，其中，a = 40，c = 212。
 *
 * 输入描述:
 *
 * 无。
 *
 * 输出描述:
 *
 * (-8+22)×a-10+c÷2计算之后的结果，为一个整数。
 */
public class BC17 {
    public static void main(String[] args){
        int a = 40;
        int c = 212;
        int result = ((-8) + 22) * a - 10 + c /2;
        System.out.print(result);
    }
}
