package BasicExercise;

/**
 * 描述
 *
 * 变种水仙花数 - Lily Number：把任意的数字，从中间拆分成两个数字，比如1461 可以拆分成（1和461）,（14和61）,（146和1),如果所有拆分后的乘积之和等于自身，则是一个Lily Number。
 *
 * 例如：
 *
 * 655 = 6 * 55 + 65 * 5
 *
 * 1461 = 1*461 + 14*61 + 146*1
 *
 * 求出 5位数中的所有 Lily Number。
 * 输入描述：
 * 无
 * 输出描述：
 * 一行，5位数中的所有 Lily Number，每两个数之间间隔一个空格。
 */
public class BC38 {
    public static void main(String[] args){
        int num = 10000;
        int a;
        int b;
        while (num < 99999){
            int sum = 0;
            for (int i = 0; i < 4; i++){
                // 先转换成字符串，再分别分割求和
                a = Integer.parseInt(String.valueOf(num).substring(0, 4 - i));
                b = Integer.parseInt(String.valueOf(num).substring(4 - i));
                sum += a * b;
            }
            if (sum == num){
                System.out.print(num + " ");
            }
            num++;
        }
    }
}
