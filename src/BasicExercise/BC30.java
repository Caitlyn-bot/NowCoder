package BasicExercise;

import java.util.Scanner;

/**
 * 描述
 *
 * BoBo买了一箱酸奶，里面有n盒未打开的酸奶，KiKi喜欢喝酸奶，第一时间发现了酸奶。KiKi每h分钟能喝光一盒酸奶，并且KiKi在喝光一盒酸奶之前不会喝另一个，那么经过m分钟后还有多少盒未打开的酸奶？
 * 输入描述：
 * 多组输入，每组输入仅一行，包括n，h和m（均为整数）。输入数据保证m <= n * h。
 * 输出描述：
 * 针对每组输入，输出也仅一行，剩下的未打开的酸奶盒数。
 * 示例1
 * 输入：
 *
 * 8 5 16
 *
 * 输出：
 *
 * 4
 */
public class BC30 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int h = sc.nextInt();
            int m = sc.nextInt();
            int surplus = 0;
            if(m%h == 0){
                surplus = n - m/h;
            }else{
                surplus = n - m/h -1;
            }
            System.out.println(surplus);
        }
    }
}
